package taskmanager

class ProductController {

    def index() {
        def products = Product.findAll()
        [products: products]  
    }

    def create() { }

    def save() {
        def product = new Product(params)
        if(product.save(flush: true)) {
            flash.message = "User Added!"
            redirect(action: "index")
        } else{
            flash.message = "User adding failed!"
            redirect(action: "create")
        }
    }

      def delete(Long id) {
        def product = Product.get(id)
        // if (!product) {
        //     flash.message = "Product not found!"
        //     redirect(action: "index")
        //     return
        // }
        // [product: product] // Pass product to delete.gsp
        if (product) {
            product.delete(flush: true)
            flash.message = "Product deleted successfully!"
        } else {
            flash.message = "Product not found!"
        }
        redirect(action: "index")
    }

    def confirmDelete() {
        def product = Product.get(params.id)
        if (product) {
            product.delete(flush: true)
            flash.message = "Product deleted successfully!"
        } else {
            flash.message = "Product not found!"
        }
        redirect(action: "index")
    }

}

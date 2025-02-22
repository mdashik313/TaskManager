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

        if (product) {
            product.delete(flush: true)
            flash.message = "Product deleted successfully!"
        } else {
            flash.message = "Product not found!"
        }
        redirect(action: "index")
    }

    def edit(Long id) {
        def product = Product.get(id)
        // or Product.get(params.id)
        [product:product]
    }

    def update(Long id) {
        def product = Product.get(id)

        if (product) {
            product.name = params.name
            product.code = params.code
            product.price = params.price?.toInteger()

            product.save(flush: true)
            flash.message = "Product updated successfully!"
        } else {
            flash.message = "Product not found!"
        }
        redirect(action: "index")
    }

}

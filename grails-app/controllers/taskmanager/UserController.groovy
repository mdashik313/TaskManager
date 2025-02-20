package taskmanager

class UserController {

    def index() {
        def users = User.findAll()
        [users: users]    
    }

    def create() { }

    def save() {
        def user = new User(params)
        if(user.save(flush: true)) {
            flash.message = "User Added!"
            redirect(action: "index")
        } else{
            flash.message = "User adding failed!"
            redirect(action: "create")
        }
    }


}

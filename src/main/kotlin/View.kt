class View : ViewModel() {
    fun drawMenu(user : User) {
        println("${user.name} ${user.count}")
        println("Щоб збільшити число нажміть 1\n" +
                "Щоб зменшити число нажміть 2 ")
        changeCount(user)
        drawMenu(user)
    }
}
fun main() {
    val user = User()
    val menu = View()
    menu.drawMenu(user)
}

open class ViewModel {
    fun changeCount(user: User) {
        val userInput = readLine()
        when (userInput) {
            "1" -> user.count++

            "2" -> user.count--

            else -> println("Ви ввели некоректне значення, спробуйте ще раз")
        }
    }
}


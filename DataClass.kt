data class User(val name: String, val od: Int)

fun getUser(): User {
	return User("Alex", 1)
}

fun main(args: Array<String>) {
	val user = getUser()
	println(user)
}
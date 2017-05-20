fun main(args: Array<String>) {
	val language = if (args.size == 0) "EN" else args[0]
	println(when (language) {
		"EN" -> "Hello!"
		"FR" -> "Salut!"
		"IT" -> "Ciao!"
		else -> "Not available"
	})
}
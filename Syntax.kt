fun main(args: Array<String>) {
	// If expression
	println(max(4, 5))

	// Nullable reference
	val x = parseInt(args[0])
	val y = parseInt(args[1])
	if (x != null && y != null) {
		println(x * y)
	} else {
		println("Null was returned from fns")
	}

	// Is operator
	println(getStringLength("sss"))
	println(getStringLength(1))

	// While loop
	var i = 0
	while (i++ < args.size)
		println("While loop iteration")

	// For loop iterates through any iterator
	for (arg in args)
		println("For loop: $arg")

	// Gives indices -> 0, 1, 2
	for (arg in args.indices)
		println("For loop: $arg")
}

// If expression, function with Int return type
fun max(a: Int, b: Int): Int = if (a > b) a else b

// Nullable reference using '?'
fun parseInt(str: String): Int? {
	try {
		return str.toInt()
	} catch (e: NumberFormatException) {
		println("Arg is not Int")
	}
	return null
}

// Is operator
fun getStringLength(obj: Any): Int? {
	if (obj is String)
		return obj.length
	return null
}
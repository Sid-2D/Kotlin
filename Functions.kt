// Lambda
val hello = {
	println("hello")
}

// Parameters
val greet = { greeting: String, name: String -> 
	println("$greeting $name")
}

val fun1: (Int, Int) -> Int = { c, v -> Math.max(c, v) }

val returnAnonymous = lambda@{ stopEarly: Boolean ->
    println("line 1")
    if (stopEarly) 
    	return@lambda
    println("line 2")
}

// Higher order fn
val addNumToFun: (Int, (Int) -> Int) -> Int = { num, fn ->
	num + fn(num)
}

fun main(args: Array<String>) {
    hello()
    hello.invoke()

    greet("Welcome", "Sid")

    println(fun1(1, 2))

    var sum = 0
    (1..10).forEach { sum += it }
    println(sum)

	returnAnonymous(true)
	returnAnonymous(false)

	println(addNumToFun(9, fun(x): Int { return x + 1 }))
	println(addNumToFun(9, { x: Int -> x + 1 }))
}
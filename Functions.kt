// Lambda
val hello = {
	println("hello")
}

// Parameters
val greet = { greeting: String, name: String -> 
	println("$greeting $name")
}

val fun1: (Int, Int) -> Int = { c, v -> Math.max(c, v) }

fun main(args: Array<String>) {
    hello()
    hello.invoke()

    greet("Welcome", "Sid")

    println(fun1(1, 2))

    var sum = 0
    (1..10).forEach { sum += it }
    println(sum)
}
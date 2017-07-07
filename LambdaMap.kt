fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
	val result = arrayListOf<R>()
	for (item in this)
		result.add(transform(item))
	return result
}

fun main(args: Array<String>) {
	val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
	val readOnlyView: List<Int> = numbers
	val doubled = numbers.map { value -> value * 2 }
	println(doubled)
}
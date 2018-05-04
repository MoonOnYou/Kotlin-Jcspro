fun main(args: Array<String>) {
    val items = listOf("사과", "바나나", "키위")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println()

    index = 0
    do {
        println("item at $index is ${items[index]}")
        index++
    } while (index < items.size)
}

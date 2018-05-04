fun main(args: Array<String>) {
    val item = listOf("사과", "바나나", "키위")
    var index = 0
    while (index < item.size) {
        println("item at $index is ${item[index]}")
        index++
    }

    index = 0
    do {
        println("item at $index is ${item[index]}")
    } while (index < item.size)
}

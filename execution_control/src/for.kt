fun main(args: Array<String>) {
    val item1 = listOf ("사과", "바나나", "키위")
    for (item in item1){
        println(item)
    }

    val item2 = listOf ("딸기", "오렌지", "맛소금")
    for (index in item2.indices){
        println("item at $index is ${item2[index]}")
    }

    val item3 = arrayOf ("물", "사이다", "마우스")
    for (index in item3.indices){
        println("item at $index is ${item3[index]}")
    }
    test()
}
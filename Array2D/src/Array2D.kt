fun main(args: Array<String>) {
    val result = createArray(5,9)
    printArray(result)
}

fun createArray (row: Int, col: Int): Array<Array<Int>>{
    val newArray = Array(row, { Array(col, { i -> 0 })})

    var rowValue = 1
    end@ for (x in 0 .. row - 1) {
        for(y in 0 .. col - 1) {

            if(rowValue >= 40)
                break@end

            newArray[x][y] = rowValue + y

            if ((rowValue + y) % 2 != 0)            //2. if문이 ture일 경우
                continue                            //1. continue가 있으므로
            newArray[x][y] *= 10                    //3. 이 문장을 실행하지않고 다음 for문을 실행

        }
        rowValue += 10
    }
    return newArray
}

fun printArray(arr: Array<Array<Int>>){
    for(x in 0 ..  arr.size - 1) {
        for(y in 0 .. arr[x].size - 1) {
            print("${arr[x][y]} ")
        }
        println()
    }
}

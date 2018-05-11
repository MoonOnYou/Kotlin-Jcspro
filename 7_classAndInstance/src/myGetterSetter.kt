fun main(args: Array<String>) {
    val f1 = MyFriend()                                 // #1
    println("${f1.name}, ${f1.tel}, ${f1.type}")        // #2

    f1.name = "홍길동"                                   // #3
    f1.tel = "010-1234-2234"                            // #4
    f1.type = 2                                         // #5
    println("${f1.name}, ${f1.tel}, ${f1.type}")        // #6
}

/// 이거 어떻게 자기의 게터세터를 알아보는거지?

class MyFriend {
    var name: String = "??"
    get() {
        println("name 속성의 게터가 호출됨")
        if (field != "??") return field
        else return "이름없음"
    }
    set(value) {
        println("name 속성의 세터가 호출됨")
        field = value
    }
    var tel: String = "??"
    get() {
        println("tel 속성의 게터가 호출됨")
        if (field != "??") return field
        else return "전화번호 없음"
    }
    set(value) {
        println("tel속성의 세터가 호출됨")
        field = value
    }

    var type: Int = 4                                       // 1:학교, 2:회사, 3:sns, 4.기타
    get() {
        println("type 속성의 게터가 호출됨")
        return field
    }
    set(value) {
        println("type 속성의 세터가 호출됨")
        if (value < 4) field = value
        else field = 4
    }

}

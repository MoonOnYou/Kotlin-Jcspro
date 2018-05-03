fun main(args: Array<String>) {
    val x = B()
    if (x is A){
        println("A타입임")
    }else{
        println("A타입이 아님")
    }
    if (x is B){
        println("B타입임")
    }else{
        println("B타입이 아님")
    }
}

open class A {}
class B : A() {}
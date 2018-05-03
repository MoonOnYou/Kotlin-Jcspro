import java.time.LocalDate

fun main(args: Array<String>) {
    val p1 = Customer("홍길동", "010-1234-5678")
    val p2 = Customer("김선달", "010-5678-1234")
    println(p1 < p2)
    println(p1 > p2)
    println()

    val start = LocalDate.now()
    val end = start..start.plusDays(15)
    println(start.plusWeeks(1) in end)
    println(end)
    println()

    val instance = InvokeOperator("코틀린을")
    instance("배우자")
}

class Customer(val name: String, val phone: String) : Comparable<Customer> {
    override fun compareTo(other: Customer): Int {
        return compareValuesBy(this, other, Customer::name, Customer::phone)
    }
}

class InvokeOperator(val makeMessage1: String){
    operator fun invoke(makeMessage2: String){
        println("$makeMessage1 $makeMessage2")
    }
}

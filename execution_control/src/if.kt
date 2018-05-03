fun main(args: Array<String>) {
    var x = 100

    if (x == 100)
        println("x = $x")

    if (x == 100) {
        x++
        println("x = $x")
    }

    if (x == 100)
        println("x는 100")
    else
        println("x는 100이 아님")

    if (x < 50)
        println("x는 50미만")
    else if ((x >= 50) and (x < 70))
        println("x는 50 ~ 69")
    else if ((x >= 70) and (x < 90))
        println("x는 70 ~ 89")
    else
        println("x는 90이상")
}



fun main(args: Array<String>) {
    val m1 = Score(100, 200)
    val m2 = Score(300, 400)
    println(m1 + m2)
    println(m1 * m2)
    println()

    val m3 = Score(300, 400)
    println(m2 == m2)
    println(m2 === m3)
    println(m2.equals(m3))
}

data class Score(val a: Int, val b: Int) {
    operator fun plus(other: Score): Score {
        return Score(a + other.a, b + other.b)
    }
}

operator fun Score.times(other: Score): Score {
    return Score(a * other.a, b * other.b )
}
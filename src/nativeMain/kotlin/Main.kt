import number.FizzBuzz
import number.Num
import number.Sum
import number.evalWithLogging
import person.Person

fun main() {
    println("Hello, Kotlin/Native!")
    val person = Person("green")
    println(person.name)
    println(evalWithLogging(Sum(Sum(Num(1), Num(5)), Num(4))))
    for (i in 0..100 step 2) {
        println(FizzBuzz(i))
    }

    val binaryRepsMutable: MutableMap<Char, String> = mutableMapOf()
    for (character in 'A'..'F') {
        val bin = character.code.toString(2)
        println("$character : ${character.code}")
        binaryRepsMutable[character] = bin
    }
    for ((letter, binary) in binaryRepsMutable) {
        println("$letter : $binary")
    }
}

fun max(a: Int, b: Int): Int = if (a > b) a else b
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in ('0'..'9')
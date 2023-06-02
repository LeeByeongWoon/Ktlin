import person.Person
import shape.Rectangle
import shape.createRandomRectangle

fun main() {
    println("Hello, Kotlin/Native!")
    val person = Person("green")
    println(person.name)
    val rectangle = Rectangle(100,200)
    for (i in 1..100){
        println(createRandomRectangle().isSquare)
    }
}

fun max(a: Int, b: Int): Int = if (a > b) a else b
val message: String = ""
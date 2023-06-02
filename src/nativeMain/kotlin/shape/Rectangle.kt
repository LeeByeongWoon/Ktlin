package shape

import kotlin.random.Random


class Rectangle(private val height:Int, private val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle():Rectangle{
    val random = Random
    return Rectangle(random.nextInt(0,10),random.nextInt(0,10))
}
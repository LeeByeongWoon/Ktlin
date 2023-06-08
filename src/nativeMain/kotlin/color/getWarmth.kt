package color

import color.Color.*

fun getWarmth(color: Color) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "natual"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("dirty color")
}

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == VIOLET && c2 == BLUE) || (c1 == BLUE && c2 == VIOLET) -> INDIGO
        else -> throw Exception("bad combination")
    }
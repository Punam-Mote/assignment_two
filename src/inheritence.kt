open class Phone(color: String, memory: Int) {
    init {
        println("Color is: $color.")
        println("mmeory is: $memory GB")
    }
}

class Note9(color: String, memory: Int): Phone(color, memory) {

    fun Samsung() {
        println("Note9 is Samsung Phone.")
    }
}

class redmi10(color: String, memory: Int): Phone(color, memory) {

    fun redmi() {
        println("redmi10 is redmi phone.")
    }
}

class oppo17(color: String, memory: Int): Phone(color, memory) {

    fun oppo() {
        println("oppo17 is oppo phone.")
    }
}

fun main(args: Array<String>) {
    val n = Note9("Black",128)
    n.Samsung()
    val r= redmi10("Blue", 16)
    r.redmi()
    val o = oppo17("Silver", 32)
    o.oppo()
}
class object_oriented_programming {

    // data member
    private var number: Int = 7

    // member function
    fun calculateSquare(): Int {
        return number*number
    }
}

fun main(args: Array<String>) {

    // create obj object of Example class
    val obj = object_oriented_programming()
    println("${obj.calculateSquare()}")
}
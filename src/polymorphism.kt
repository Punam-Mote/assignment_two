fun sum(numbers : List<Number>) : Number {
    return numbers.sumByDouble { it.toDouble() }
}

fun main(args : Array<String>){
    println("Enter first number")
    val a : Number = readLine()!!.toInt()

    println("Enter second number")
    val b = readLine()!!.toInt()

    println("Enter third number")
    val c = readLine()!!.toInt()

    //Using runtime polymorphism
    println("Summing all numbers")
    println(sum(listOf(a, b, c)))
}
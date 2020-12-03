abstract class abstract_class(name: String, salary: Int) {

    init {
        println("Employee name is: $name")
        println("Employee salary is: $$salary")
    }


    fun abs() {
        println("Salary description of an Employee.")
    }


    abstract fun func(message: String)
}

class Office(name: String, salary: Int): abstract_class(name, salary) {

    override fun func(message: String) {
        println(message)
    }
}

fun main(args: Array<String>) {
    val obj = Office("Poonam", 81000)
    obj.func("I am a Programmer")
    obj.abs()
}
interface myinterface{
    var str: String

    fun inter()

    fun func(){
        println("This is interface")
    }
}

class newClass: myinterface{
    override var str: String = "nodejs.org"
    override fun inter() {
        println("Interface function")
    }
}
fun main(args: Array<String>) {
    val obj = newClass()
    obj.inter()
    obj.func()
    println(obj.str)

}
import cls.sample.Student

/**
 * Created by HaohaoChang on 2017/5/22.
 */
fun main(args: Array<String>) {
    var list = arrayOf("java", "c++", "Android", "Kotlin", "iOS")
    list.map {
        "Hello $it"
    }.filter {
        !it.contains("c")
    }.forEach {
        println(it)
    }

    //var p = Person("nannan", 18, "China")
    var p = Person()
    var flag: Boolean? = true
    flag?.let {
        p.sayHello()
    }

    var s = Student("zstu", "haohao")
    s.sayHello()

    var shape = Shape(Drawer("react"))
    shape.drawShape()

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    map.forEach { (t, u) ->
        println("$t, $u")
    }

    for ((key, value) in map) {
        println("$key, $value")
    }
}

//class Person(var name: String, var age: Int = 18) {
//
//    private var address: String? = null
//
//    init {
//        name = "haohao"
//    }
//
//    constructor(name: String, age: Int, address: String) : this(name, age){
//        this.address = address
//    }
//
//    internal fun sayHello() {
//        println("Hello! I am $name, $age, from $address")
//    }
//}

class Person public constructor() {
    private var name: String? = null
    private var age: Int = 25

    constructor (name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }

    internal fun sayHello() {
        println("Hello! I am $name, $age.")
    }
}

class Shape (private var drawer: Drawer?){

    fun drawShape(){
        drawer?.draw()
    }

}

open class Drawer constructor(var name: String?){

    fun draw(){
        println("Draw $name")
    }

}


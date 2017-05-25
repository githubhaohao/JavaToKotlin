package cls.sample

/**
 * Created by HaohaoChang on 2017/5/22.
 */
open class Person(private var name: String) : HighLevelAnimal() {
    open fun sayHello() =  println("Hello! I am $name")

    fun say(){

    }
}
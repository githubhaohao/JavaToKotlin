package cls.sample

/**
 * Created by HaohaoChang on 2017/5/22.
 */
class Student(private var school: String?, name: String): Person(name){
    override fun sayHello() {
        super.sayHello()
        println("I am from $school")
    }



    //如果父类函数没有标注 open 如 Person.say()，则子类中不允许定义同名的函数, 不论加不加 override 。
//    fun say(){
//
//    }
}
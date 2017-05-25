package obj.sample

/**
 * Created by HaohaoChang on 2017/5/24.
 */
interface OnClickListener {
    fun onClick()
}

class View(){
    var listener: OnClickListener? = null
    fun setOnClickListener(listener: OnClickListener) {
        this.listener = listener
    }
}


//对象声明
object SingletonManager {
    private var singletonContainer = HashMap<String, Any>()

    fun registerSingleton(key: String, value: Any) {
        singletonContainer.set(key, value)
    }

    fun getSingleton(key: String): Any? = singletonContainer.get(key)
}

//伴生对象
interface Factory<T>{
    fun create(): T
}

class Fragment {
    companion object : Factory<Fragment> {
        override fun create(): Fragment = Fragment()
        fun getTag(): String = Fragment.toString()
    }
}

fun main(args: Array<String>) {
    val view = View()
    //对象表达式
    view.setOnClickListener(object : OnClickListener{
        override fun onClick() {
            TODO("not implemented")
        }

    })

    val person = object {
        var name: String? = null
        var age: Int = 0
        override fun toString(): String = "name = ${name}, age = ${age}"
    }

    person.name = "haohao"
    person.age = 18
    println("name = ${person.name}, age = ${person.age}")

    //对象声明
    SingletonManager.registerSingleton("view", view)
    SingletonManager.registerSingleton("person", person)

    println(SingletonManager.getSingleton("person"))

    //伴生对象
    //一个类只能有一个伴生对象
    val instance = Fragment.create()
    println(Fragment.getTag())


}
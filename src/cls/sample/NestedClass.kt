


package cls.sample

import obj.sample.OnClickListener
import obj.sample.View

/**
 * Created by HaohaoChang on 2017/5/25.
 */


class Outer {
    private val bar: Int = 12

    // 嵌套类
    class Nested {
        // 不能访问外部类成员
        fun foo() = "hello"
    }

    // 内部类
    inner public final class Inner {
        // 可以访问外部类成员
        fun foo() = bar
    }
}

val view = View()


fun main(args: Array<String>) {

    println(Outer.Nested().foo())
    println(Outer().Inner().foo())

    // 使用对象表达式创建匿名内部类
    view.setOnClickListener(object : OnClickListener{
        override fun onClick() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    })

}
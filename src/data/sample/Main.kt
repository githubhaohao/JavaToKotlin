package data.sample

/**
 * Created by HaohaoChang on 2017/5/24.
 */
fun main(args: Array<String>) {
    val haohao = User("haohao", 18)
    val zuozuo = haohao.copy("zuozuo",1)
    println(zuozuo.toString())

    //解构赋值
    val (name, age) = zuozuo
    println("$name, $age years old of age.")
//    val maps = mapOf(1 to "one", 2 to "two",3 to "three")
//    for ((key, value) in maps) {
//        println("key = $key, value = $value")
//    }

}
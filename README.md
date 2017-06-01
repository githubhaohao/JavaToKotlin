## Java to Kotlin 语法清单

<p align="center"><img src="http://i1.piimg.com/588795/9c8514f7c56bb889.jpg"/></p>
<p align="center">时刻对新事物保持好奇心</p>

> Google IO 2017 宣布在 Android Studio 3.0 将默认支持 Kotlin 用于 Android . 请注意 Google 只是宣布 Kotlin 作为 Android 开发的一级语言，并没有说要用其取代 Java ，这里很多无脑媒体进行了过度解读。作为一名合格的程序员，首先要理性看待技术迭代更新，同时要对新事物保持强烈的好奇心。

## Kotlin 简介
Kotlin 来自于捷克一家牛逼软件研发公司 JetBrains ，很多优秀的 IDE，如 IntelliJ IDEA、PyCharm、WebStorm 等都是它的杰作，包括 Google 官方的 Android 开发 IDE -- Android Studio ，也是 IntelliJ IDEA 的插件版。

Kotlin 源于 JetBrains 的圣彼得堡团队，名称取自圣彼得堡附近的一个小岛 ( Kotlin Island ) 。JetBrains 在 2010 年首次推出 Kotlin 编程语言，并在次年将之开源。

## Kotlin 的特点
Kotlin 是一个基于 JVM 的编程语言，与 Java 有很深的渊源。它能与 Java 100% 互通，具备诸多 Java 尚不支持的新特性。Kotlin 可以编译成 Java 字节码，也可以编译成 JavaScript ，方便在没有 JVM 的设备上运行，可用于移动端以及 Web 开发，是一种全栈式开发语言。

## Java to Kotlin
下面是 Java to Kotlin 主要语法，以便于你快速认识 Kotlin 这门语言。

### 变量
**Java**
```java
String lan = "Hello Kotlin";

final String lan = "Hello Kotlin";
```
**Kotlin**
```kotlin
var lan = "Hello Kotlin"

val lan = "Hello Kotlin"
```
---

### 打印字符串
**Java**
```java
System.out.print("Hello Kotlin");

System.out.println("Hello Kotlin");
```
**Kotlin**
```kotlin
print("Hello Kotlin");

println("Hello Kotlin");
```
---
### 字符串模板
**Java**
```java
String name = "haohao";

int age = 25;

String msg = "I am " + name + ", " + age + " years old.";

String text = "Hello Kotlin\n" +
              "Hello Android\n" +
              "Hello TensorFlow";
```
**Kotlin**
```kotlin
var name = "haohao";

var age = 25;

var msg = "I am $name , $age years old.";

var text = """
    |Hello Kotlin    
    |Hello Android
    |Hello TensorFlow
    """.trimMargin()
// trimMargin() 去除连接符 `|`

```
---
### 空声明
**Java**
```java
String name = null;
```
**Kotlin**
```kotlin
var name: String? = null // `?` 声明变量可为 null 
```
---
### 判空
**Java**
```java
if (name != null) {

    int len = name.length;
}

```
**Kotlin**
```kotlin
name?.let{

    val len = name.length
}
```
---
### 逻辑表达式
**Java**
```java
String y = x > 6 ? "x > 6" : "x <= 6";
```
**Kotlin**
```kotlin
var y = if (x > 6)
            "x > 6"
        else "x <= 6"
```
---
### 类型判断及转换
**Java**
```java
if (obj instanceof Person) {

    Person p = (Person) obj;
}
```
**Kotlin**
```kotlin
if (obj is Person) {

    var p = obj //智能转换
}
```
---
### 区间
**Java**
```java
if (value >= 0 && value <= 100) {
}

for (int i = 1; i <= 100 ; i++) {}

for (int i = 1; i < 100 ; i++) {}

for (int i = 100; i >= 0 ; i--) {}

for (int i = 1; i <= 100 ; i+=2) {}

for (int i = 100; i >= 0 ; i-=2) {}

```
**Kotlin**
```kotlin
if (value is 0..100) {
}

for (i in 1..100 ) {}

for (i in 1 until 100) {} // 半开区间：不包含 100

for (i in 100 downTo 0) {}

for (i in 1..100 step 2) {}

for (i in 100 donwTo 1 step 2) {}
```
---
### list 和 map ( 针对 Java 8 之前版本 )
**Java**
```java
List<Integer> list = Arrays.asList(1, 2, 3, 4);

for(Integer value : list) {

   System.out.println(value);
}

Map<Integer, String> map = new HashMap<>();

map.put(1, "Java");

map.put(2, "Kotlin");

map.put(3, "iOS");

map.put(4, "React Native");


Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

while (iterator.hasNext()) {

    Map.Entry<Integer, String> entry = iterator.next();

    System.out.println(entry.getKey() + " , " + entry.getValue());
}


```
**Kotlin**
```kotlin
var list = listOf(1, 2, 3, 4);

list.forEach {

   println(it)
}

var map = mapOf(1 to "Java", 2 to "Kotlin", 3 to "iOS", 4 to "React Native")

map.forEach { key, value ->

    println("$key, $value")
}

// 或者

for ((key, value) in map) {

    println("$key, $value")
}

```
---
### 开关语句
**Java**
```java
int score = // some score;
String result;
switch (score) {
	case 10:
	case 9:
		grade = "Excellent";
		break;
	case 8:
	case 7:
	case 6:
		grade = "Good";
		break;
	case 5:
	case 4:
		grade = "Ok";
		break;
	case 3:
	case 2:
	case 1:
		grade = "Fail";
		break;
	default:
	    grade = "Fail";				
}
```
**Kotlin**
```kotlin
var score = // some score
var grade = when (score) {

	9, 10 -> "Excellent" 

	in 6..8 -> "Good"

	4, 5 -> "Ok"

	in 1..3 -> "Fail"

	else -> "Fail"
}
```
---
### 流水线
**Java**
```java
List<String> list = Arrays.asList("java", "c++", "Android", "Kotlin", "iOS");

for(int i = 0; i < list.size(); i++ ) {

    list.set(i, "Hello " + list.get(i));

    if (!list.get(i).contains("c")) {

        System.out.println(list.get(i));
    }
}

//输出：
//    Hello java
//    Hello Android
//    Hello Kotlin
//    Hello iOS
```
**Kotlin**
```kotlin
var list = arrayOf("java", "c++", "Android", "Kotlin", "iOS")

list.map {

    "Hello $it"

}.filter {

    !it.contains("c")

}.forEach {

    println(it)

}

//输出：
//    Hello java
//    Hello Android
//    Hello Kotlin
//    Hello iOS
```
---
### 函数
**Java**
```java
public final void func() {}

public final int func(int value) {

    return 1 * value;
}

```
**Kotlin**
```kotlin
fun func() {}

fun func(value: Int): Int {

    return 1 * value
}

// 或者

fun func(value: Int): Int = 1 * value
```
---
### 类
**Java**
```java
public final class Person {

    private String name = null;

    private int age = 25;

    private Person() {
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }
}

```
**Kotlin**
```kotlin
class Person private constructor() {

    private var name: String? = null

    private var age: Int = 25
    
    constructor (name: String, age: Int): this() {

        this.name = name
        this.age = age
    }
}
```
---
### 静态方法（ 伴生对象 ）
**Java**
```java
public final class Manager {

    private Manager() {}

    public static Manager getInstance () {

        return new Manager();
    }
}

```
**Kotlin**
```kotlin
class Manager private constructor() {

    companion object {

        fun getInstance(): Manager = Manager()
    }
}

```
---
### 实体类
**Java**
```java
public class Person {

    public String name;

    public age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

```
**Kotlin**
```kotlin
data class Person(var name: String, var age: Int)

```

---
### 解构
**Java**
```java
Person p = new Person("haohao", 25);

String name = p.getName();

String age = p.getAge();
```
**Kotlin**
```kotlin
var p = Person("name", 25)

var (name, age) = p
```
---
### 接口
**Java**

```java
interface Readable {

    String getContent();
}
```

```java
public final class Book implements Readable {

    @override
    public String getContent() {

        return "Hello";
    }
} 
```
**Kotlin**
```kotlin

// Kotlin 接口中可以设置抽象和非抽象方法,可以有属性但必须声明为抽象或提供访问器实现。
interface Readable {

   fun getContent(): String

   fun getVersion(): Int = 0 
   
}
```

```kotlin
class Book(): Readable {

   override fun getContent(): String = "Hello"
   
   override fun getVersion(): Int {

       return super.getVersion()
   }
}
```
---
### 继承
**Java**

```java
public class Person {
 
    private String name = null;

    public Person(String name) {
        this.name = name;
       
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public final void sayGood() {
        System.out.println("Good");
    }

}
```

```java
public final class Student extends Person {

    private String school = null;

    public Student(String name, String school) {
        this.school = school;
        super(name);
    }

    @override
    public void sayHello() {
        super.sayHello();
        System.out.println("Hello Student");
    }


}
```
**Kotlin**
```kotlin
open class Person(private var name: String? = null) {

    open fun sayHello() = println("Hello")

    fun sayGood() = println("Good")

}
```

```kotlin
class Student(private var school: String? = null, name: String): Person(name) {
    
   override fun sayHello() {
       super.sayHello()
       println("Hello Student")
   }
    
} 
```
---
### 静态与非静态内部类
**Java**

```java
public final class Outer {

    private int bar = 100;
    
    public static class Nester {
         
        public final String foo() {
            return "Hello Kotlin!";
        }
    }

    public final class Inner {
    
        public final int foo() {
            return bar; // 可以访问外部类成员
        }
        
    }
    
}


System.out.println(new Outer.Nester().foo()); 

// System.out.println(new Outer().Inner().foo()); 不能在其他类中实例化非静态内部类

```

**Kotlin**
```kotlin
class Outer {
    private var bar: Int = 100

    // 嵌套类
    class Nester {
        // 不能访问外部类成员
        fun foo() = "Hello Kotlin!"
    }

    // 内部类
    inner class Inner {
        // 可以访问外部类成员
        fun foo() = bar
    }
}



println(Outer.Nested().foo())

println(Outer().Inner().foo())

```
---
### 匿名内部类
**Java**
```java
view.setOnClickListener(new OnClickListener() {
   
    @override
    onClick(View view){
        // to do something.
    }
 
});
```
**Kotlin**
```kotlin
interface OnClickListener {
    fun onClick()
}

class View(){
    var listener: OnClickListener? = null

    fun setOnClickListener(listener: OnClickListener) {
        this.listener = listener
    }
}

view.setOnClickListener(object : OnClickListener{
    override fun onClick() {
        TODO("not implemented")
    }
})

```
---
### 扩展
**Java**
```java
// Java 类不能直接进行扩展
```
**Kotlin**

```kotlin
// 一般扩展
class MyClass {
   fun foo() = println("member")
}

fun MyClass.bar() = println("extension")

MyClass().bar()

//输出： extension

```

```kotlin
// 扩展函数与成员函数相同
class MyClass {

   fun foo() = println("member")
}

fun MyClass.foo() = println("extension") // 扩展函数与成员函数相同时, 成员函数优先

fun MyClass.foo(para: Int) = println("extension")

MyClass().foo()

MyClass().foo(0)

//输出： 
//     member
//     extension
      
```
---
### Kotlin Call Java
**Java**
```java
public class Person {
    private String name = null;
    private int age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "name : " + name + ", age : " + age;
    }
}

```
**Kotlin**

```kotlin
var p = Person()
p.name = "haohao"
p.age = 25

println(p.toString())

// name : haohao, age : 25

```
---
### Java Call Kotlin

**Kotlin**

```kotlin
// Example.kt
package demo

class MyClass

fun func() {

}

```

**Java**
```java
new demo.MyClass();

demo.ExampleKt.func();
```
---
### 泛型
**Java**
```java
public final class Wrapper<T> {
    private T item;
    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

Wrapper<String> wrapper = new Wrapper<>("Hello Kotlin");
System.out.println(wrapper.getItem());

```
**Kotlin**
```kotlin
class Wrapper<T>(val item: T)

var wrapper = Wrapper("Hello Kotlin")
println(wrapper.item)

```
---
### 匿名函数 ( Lambda 表达式 )
**Java (Java 8)**
```java
new Thread(() -> {

    System.out.println("Hello Kotlin");
    
}).start();

// 同下

new Thread(new Runnable() {

    @Override
    public void run() {
    
        System.out.println("Hello Kotlin");
	
    }
   
}).start();

```
**Kotlin**
```kotlin
Thread(Runnable {

    println("Hello Kotlin")
    
}).start()

// Kotlin Lambda 表达式语法

val sum = {x: Int, y: Int -> x + y }

val sum1: (Int, Int) -> Int = {x, y -> x + y }

val sum2 = fun(x: Int, y: Int): Int {
    return x + y
}

println(sum(2,8))

println(sum1(2,8))

println(sum2(2,8))

//输出：
//    10
//    10
//    10
//    Hello Kotlin
```
---
### Kotlin 高阶函数
**Java**
```java
// Java 不能直接实现高阶函数
```
**Kotlin**
```kotlin
// 高阶函数，即一个函数可作为高阶函数的参数
fun superFunc(desc: String?, method: () -> String) {
    println(desc)
    println(method())
}


fun argFun() = "我是高阶函数的参数"

//使用高阶函数

superFunc("这是一个高阶函数 ", ::argFun)

superFunc("这是一个高阶函数 ", { argFun() })

superFunc("这是一个高阶函数 ") { argFun() }


//输出：
//    这是一个高阶函数 我是高阶函数的参数
//    这是一个高阶函数 我是高阶函数的参数
//    这是一个高阶函数 我是高阶函数的参数

```
---
## 持续更新中。。。

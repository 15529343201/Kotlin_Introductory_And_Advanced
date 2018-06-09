package net.println.kotlin.chapter3

const val FINAL_HELLO_WORLD: String = "HelloWorld"
var helloWorld: String = FINAL_HELLO_WORLD

val FINAL_HELLO_CHINA = "HelloChina"

fun main(args: Array<String>) { // (Array<String>) -> Unit main默认返回Unit
//   println(FINAL_HELLO_CHINA)
//   println(helloWorld)
//   println("hello ${args[0]}")

//   checkArgs(args)
//    val arg1 = args[0].toInt()
//    val arg2 = args[1].toInt()
//    println("$arg1 + $arg2 = ${sum(arg1, arg2)}")

    println(int2Long(3))
    println(sum(1, 3))
    println(sum.invoke(1, 3))

//    args.forEach ForEach@{
//        if(it == "q") return@ForEach
//        println(it)
//    }
//
//    println("The End")

    println(sum)
    println(int2Long)
    println(::printUsage is ()-> Unit)
}

fun checkArgs(args: Array<String>) {
    if (args.size != 2) {
        printUsage()
        System.exit(-1) //终止程序运行
    }
}

fun printUsage() {
    println("请传入两个整型参数，例如 1 2") // (Any?) -> Unit
} // ()->Unit

//lambda表达式
val sum = { arg1: Int, arg2: Int ->
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2
}
// (Int, Int) -> Int

//lambda表达式
val printlnHello = {
    println("Hello")
}
// ()-> Unit

val int2Long = fun(x: Int): Long {
    return x.toLong()
}

//Int Long String  ABC

// (Int) -> Long


/**
"C:\Program Files\Java\jdk1.8.0_144\bin\java" "-javaagent:D:\IntelliJ IDEA 2017.2.6\lib\idea_rt.jar=3059:D:\IntelliJ IDEA 2017.2.6\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Users\Administrator\git\Kotlin_Introductory_And_Advanced\chapter3\out\production\classes;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre8\1.1.4-3\3a4fbf3d403d15b42df34c00d36276f360e39040\kotlin-stdlib-jre8-1.1.4-3.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.1.4-3\7f07ece855a7d40d5ef430218593e92282ae2a74\kotlin-stdlib-1.1.4-3.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre7\1.1.4-3\e8c9cbfa33a3015fcc7581fe6a60a355bf7cd92c\kotlin-stdlib-jre7-1.1.4-3.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\13.0\919f0dfe192fb4e063e7dacadee7f8bb9a2672a9\annotations-13.0.jar" net.println.kotlin.chapter3.MainKt
3
4
1 + 3 = 4
4
Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer>
Function1<java.lang.Integer, java.lang.Long>
true

Process finished with exit code 0
**/
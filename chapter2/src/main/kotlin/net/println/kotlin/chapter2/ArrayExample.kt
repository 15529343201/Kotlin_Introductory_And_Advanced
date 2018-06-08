package net.println.kotlin.chapter2

import net.println.kotlin.chapter2.市委书记.北京.市委书记

/**
 * Created by benny on 2/26/17.
 */
val arrayOfInt: IntArray = intArrayOf(1,3,5,7)
val arrayOfChar: CharArray = charArrayOf('H', 'e','l','l','o','W','o','r','l','d')
val arrayOfString: Array<String> = arrayOf("我", "是", "码农")
val arrayOf书记: Array<市委书记> = arrayOf(市委书记("章"), 市委书记("赵"), 市委书记("黄"))

fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for(int in arrayOfInt){
        println(int)
    }

    println(arrayOf书记[1])
    arrayOf书记[1] = 市委书记("方")
    println(arrayOf书记[1])

    println(arrayOfChar.joinToString())
    println(arrayOfInt.slice(1..2))
}
/**
"C:\Program Files\Java\jdk1.8.0_144\bin\java" "-javaagent:D:\IntelliJ IDEA 2017.2.6\lib\idea_rt.jar=2869:D:\IntelliJ IDEA 2017.2.6\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Users\Administrator\git\Kotlin_Introductory_And_Advanced\chapter2\out\production\classes;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre8\1.1.2\cd6d8b7a32971564fab0846009593f3bfabdcac1\kotlin-stdlib-jre8-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre7\1.1.2\8fe14858be2d85bb2c8ad1e060f6dafbd45f48f4\kotlin-stdlib-jre7-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.1.2\109c63008b2d569e38696a3178ee2493b0f6c776\kotlin-stdlib-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\13.0\919f0dfe192fb4e063e7dacadee7f8bb9a2672a9\annotations-13.0.jar" net.println.kotlin.chapter2.ArrayExampleKt
4
1
3
5
7
赵书记
方书记
H, e, l, l, o, W, o, r, l, d
[3, 5]

Process finished with exit code 0
**/
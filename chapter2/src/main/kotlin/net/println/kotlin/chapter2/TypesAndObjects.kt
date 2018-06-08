package net.println.kotlin.chapter2


/**
class 妹子(val 性格:String,val 长相:String,val 声音:String){
    init{
        println("new了一个妹子,她性格$性格 长相$长相 声音$声音")
    }
}
fun main(args: Array<String>){
    val 我喜欢的妹子:妹子=妹子("温柔","甜美","动人")
}
new了一个妹子,她性格温柔 长相甜美 声音动人
**/


class 妹子(性格: String, 长相: String, 声音: String): 人(性格, 长相, 声音)//继承
class 帅哥(性格: String, 长相: String, 声音: String): 人(性格, 长相, 声音)//继承

open class 人(var 性格: String, var 长相: String, var 声音: String){
    init {
        println("new 了一个${this.javaClass.simpleName}, ta性格:$性格, 长相:$长相, 声音:$声音")
    }
}



fun main(args: Array<String>) {
    val 我喜欢的妹子: 妹子 = 妹子("温柔", "甜美", "动人")
    val 我膜拜的帅哥: 帅哥 = 帅哥("彪悍", "帅气", "浑厚")
    println(我喜欢的妹子 is 人)
}
/**
"C:\Program Files\Java\jdk1.8.0_144\bin\java" "-javaagent:D:\IntelliJ IDEA 2017.2.6\lib\idea_rt.jar=2616:D:\IntelliJ IDEA 2017.2.6\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Users\Administrator\git\Kotlin_Introductory_And_Advanced\chapter2\out\production\classes;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre8\1.1.2\cd6d8b7a32971564fab0846009593f3bfabdcac1\kotlin-stdlib-jre8-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre7\1.1.2\8fe14858be2d85bb2c8ad1e060f6dafbd45f48f4\kotlin-stdlib-jre7-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.1.2\109c63008b2d569e38696a3178ee2493b0f6c776\kotlin-stdlib-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\13.0\919f0dfe192fb4e063e7dacadee7f8bb9a2672a9\annotations-13.0.jar" net.println.kotlin.chapter2.TypesAndObjectsKt
new 了一个妹子, ta性格:温柔, 长相:甜美, 声音:动人
new 了一个帅哥, ta性格:彪悍, 长相:帅气, 声音:浑厚
true

Process finished with exit code 0
**/
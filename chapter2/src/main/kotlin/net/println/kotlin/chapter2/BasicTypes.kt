package net.println.kotlin.chapter2


val aBoolean: Boolean = true
val anotherBoolean: Boolean = false

val anInt: Int = 8
val anotherInt: Int = 0xFF
val moreInt: Int = 0b00000011
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE

val aLong: Long = 12368172397127391
val another: Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE

val aFloat: Float = 2.0F
val anotherFloat: Float = 1E3f
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = -Float.MAX_VALUE

val aDouble: Double = 3.0
val anotherDouble: Double = 3.1415926
val maxDouble: Double= Double.MAX_VALUE
val minDouble: Double= -Double.MAX_VALUE

val aShort: Short = 127
val maxShort: Short = Short.MAX_VALUE
val minShort: Short = Short.MIN_VALUE

val maxByte: Byte = Byte.MAX_VALUE
val minByte: Byte = Byte.MIN_VALUE

fun main(args: Array<String>) {
    println(anotherInt)
    println(moreInt)

    println(maxInt)
    println(Math.pow(2.0, 31.0) - 1)
    println(minInt)
    println( - Math.pow(2.0, 31.0))

    println(maxLong)
    println(Math.pow(2.0, 63.0) - 1)
    println(minLong)
    println(- Math.pow(2.0, 63.0))

    println(aFloat)
    println(anotherFloat)
    println(maxFloat)
    println(minFloat)

    println(maxDouble)
    println(minDouble)

    println(maxShort)
    println(minShort)

    println(maxByte)
    println(minByte)
}
/**
"C:\Program Files\Java\jdk1.8.0_144\bin\java" "-javaagent:D:\IntelliJ IDEA 2017.2.6\lib\idea_rt.jar=2192:D:\IntelliJ IDEA 2017.2.6\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Users\Administrator\git\Kotlin_Introductory_And_Advanced\chapter2\out\production\classes;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre8\1.1.2\cd6d8b7a32971564fab0846009593f3bfabdcac1\kotlin-stdlib-jre8-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre7\1.1.2\8fe14858be2d85bb2c8ad1e060f6dafbd45f48f4\kotlin-stdlib-jre7-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.1.2\109c63008b2d569e38696a3178ee2493b0f6c776\kotlin-stdlib-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\13.0\919f0dfe192fb4e063e7dacadee7f8bb9a2672a9\annotations-13.0.jar" net.println.kotlin.chapter2.BasicTypesKt
255
3
2147483647
2.147483647E9
-2147483648
-2.147483648E9
9223372036854775807
9.223372036854776E18
-9223372036854775808
-9.223372036854776E18
2.0
1000.0
3.4028235E38
-3.4028235E38
1.7976931348623157E308
-1.7976931348623157E308
32767
-32768
127
-128

Process finished with exit code 0
**/
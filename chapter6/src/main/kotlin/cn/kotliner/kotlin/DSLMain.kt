package cn.kotliner.kotlin


fun main(args: Array<String>) {
    html {
        "id"("HtmlId")
        "head"{
            "id"("headId")
        }
        body {
            id="bodyId"
            `class` = "bodyClass"

            "a"{
                "href"("https://www.kotliner.cn")
                +"Kotlin 中文博客"
            }
        }

        "div"{

        }


    }.render().let(::println)
}

/**
"C:\Program Files\Java\jdk1.8.0_144\bin\java" "-javaagent:D:\IntelliJ IDEA 2017.2.6\lib\idea_rt.jar=5089:D:\IntelliJ IDEA 2017.2.6\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Users\Administrator\git\Kotlin_Introductory_And_Advanced\chapter6\out\production\classes;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre8\1.1.2\cd6d8b7a32971564fab0846009593f3bfabdcac1\kotlin-stdlib-jre8-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jre7\1.1.2\8fe14858be2d85bb2c8ad1e060f6dafbd45f48f4\kotlin-stdlib-jre7-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.1.2\109c63008b2d569e38696a3178ee2493b0f6c776\kotlin-stdlib-1.1.2.jar;C:\Users\Administrator\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\13.0\919f0dfe192fb4e063e7dacadee7f8bb9a2672a9\annotations-13.0.jar" cn.kotliner.kotlin.DSLMainKt
<html id="HtmlId" ><head id="headId" ></head><body id="bodyId" class="bodyClass" ><a href="https://www.kotliner.cn" >Kotlin 中文博客</a></body><div></div></html>

Process finished with exit code 0
**/
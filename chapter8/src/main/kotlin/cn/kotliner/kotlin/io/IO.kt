package cn.kotliner.kotlin.io

import java.io.*


fun main(args: Array<String>) {
    val file = File("build.gradle")
    val bufferedReader = BufferedReader(FileReader(file))
    var line: String

    while(true){
        line = bufferedReader.readLine()?:break
        println(line)
    }
    bufferedReader.close()
}
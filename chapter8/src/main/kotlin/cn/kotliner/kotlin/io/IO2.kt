package cn.kotliner.kotlin.io

import java.io.*


fun main(args: Array<String>) {
    val file = File("build.gradle")
    BufferedReader(FileReader(file)).use {
        var line: String
        while(true){
            line = it.readLine()?:break
            println(line)
        }
    }
}
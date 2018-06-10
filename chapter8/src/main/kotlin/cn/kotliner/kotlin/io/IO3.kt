package cn.kotliner.kotlin.io

import java.io.*


fun main(args: Array<String>) {
    File("build.gradle").readLines().forEach(::println)
}
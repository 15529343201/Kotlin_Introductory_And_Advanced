import java.io.File

println("HelloWorld")

File(".").list().forEach(::println)

/**
C:\Users\Administrator\git\Kotlin_Introductory_And_Advanced\chapter9\Kotlin-Script>kotlinc -script HelloWorld.kts
HelloWorld
build.gradle
HelloWorld.kts
KotlinScript.iml
**/
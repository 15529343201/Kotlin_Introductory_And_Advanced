package net.println.kotlin.chapter5.builtins

import java.io.BufferedReader
import java.io.FileReader

/**
fun main(args:Array<String>){
val list=listOf(1,3,4,5,10,8,2)


val newList=list.map{
it*2+3
}
val newList2=list.map(Int::toDouble)
//val newList=ArrayList<Int>()
//list.forEach{
//    val newElement=it*2+3
//    newList.add(newElement)
//}
newList.forEach(::println)
newList2.forEach(::println)
list.map(::println)
}
 **/
/**
fun main(args: Array<String>) {
    val list = listOf(
            1..20,
            2..5,
            100..322
    )
    //val flatList = list.flatMap {intRange->
    //    intRange.map { intElement ->
    //        "No.$intElement"
    //    }
    //}
    val flatList = list.flatMap { it }
    flatList.forEach(::println)
    println(flatList.reduce { acc, i -> acc + i }) //47277

    (0..6).map(::factorial).forEach(::println) //1 1 2 6 24 120 720
    println((0..6).map(::factorial).fold(StringBuilder()) { acc, i ->
        acc.append(i).append(",")
    })//1,1,2,6,24,120,720,
    println((0..6).joinToString(","))//0,1,2,3,4,5,6
    println((0..6).map(::factorial).foldRight(StringBuilder()){i,acc->
        acc.append(i).append(",")
    })//720,120,24,6,2,1,1,

    println((0..6).map(::factorial).filter { it % 2 ==1 }) //[1, 1]
    println((0..6).map(::factorial).filterIndexed{index,i->index%2==1})//[1, 6, 120]
    println((0..6).map(::factorial).takeWhile { it % 2 == 1 })//[1, 1]
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}
**/

data class Person(val name:String,val age:Int){
    fun work(){
        println("$name is working!!!")
    }
}

fun main(args:Array<String>){
    //findPerson()?.let{(name,age)->
    //    println(name)
    //    println(age)
    //}
    //findPerson()?.let{person ->
    //    person.work()
    //    println(person.age)
    //}
    //findPerson()?.apply {
    //    work()
    //    println(age)
    //}

    // val br = BufferedReader(FileReader("hello.txt")).readText()

    //val br = BufferedReader(FileReader("hello.txt"))
    //with(br){
    //    var line:String?
    //    while(true){
    //        line=readLine()?:break
    //        println(line)
    //    }
    //    close()
    //}
    BufferedReader(FileReader("hello.txt")).use{
        var line:String?
        while(true){
            line= it.readLine()?:break
            println(line)
        }
    }
}

fun findPerson():Person?{
    return null
}

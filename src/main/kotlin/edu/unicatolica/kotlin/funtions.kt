package edu.unicatolica.kotlin

import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max

fun section(title: String){
    println("\n" + "=".repeat(75))
    println(title)
    println("=".repeat(75))
}

fun variableAndTypes(){

    section("1)Variable and Types")

    val lang: String = "Kotlin"
    var counter = 0

    println("val lang = $lang")
    println("var counter = $counter")
    counter += 3
    println("counter after += 3 => $counter")
}

fun conditionalsAsExpressions(n: Int){

    section("2) Conditional as Expressions & when")

    val parity = if(n % 2 == 0)"Even" else "Odd"

    println("n = $n is $parity")

    val descrption = when{
        n == 0 -> "Zero"
        n in 1 .. 9 -> "one digit positive"
        n < 0 -> "negative"
        else -> "positive (>= 10)"
    }
    println ("Description: $descrption")

}

fun loopsDemo(){
    section("3) Loops: for / while / do-while")
    //Always use when you know the range of the elements

    print("for 1 to 5: ")
    for(i in 1..5) print("$i ")
    println()


    val list = listOf("a", "b", "c")
    print("for over list: ")
    for(x in list) print("$x ")
    println()

    /*
    Use when you don't know the range of elements
    but you know a stop condition
     */

    var x = 3
    print("while x>0: ")
    while(x > 0){
        print("$x ")
        x--
    }
    println()

    //runs at least once
    var y = 0
    print("do-while y<1: ")
    do{
        print("$y ")
        y++
    } while (y < 1)
    println()
}


fun main(){

    variableAndTypes()
    conditionalsAsExpressions(15)
    loopsDemo()

}
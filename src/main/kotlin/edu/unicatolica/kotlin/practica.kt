package edu.unicatolica.kotlin

fun iseven (n: Int): Boolean{
    return n % 2 == 0
}

fun main (){
    val numeros = listOf(1,2,4,7,13,9,23)

    println("numeros: "+ numeros.joinToString(","))
    println("valores: "+ numeros.joinToString(",") {iseven(it).toString()})
}
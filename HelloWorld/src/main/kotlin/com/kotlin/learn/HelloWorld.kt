package com.kotlin.learn

fun main(args: Array<String>) {
    println("Hello, World!")

    val hello1 = "Hello"
    val hello2 = "Hello"

    println(hello1 === hello2)
    println(hello1 == hello2)
    println(hello1.plus(hello2))

    var num = 2988

    val any: Any = "The Any type is the root of Kotlin class hierarchy"
    if (any is String) {
        println(any.uppercase())
    }

    println(""" 1   1
                1  11
                1 111
                11111
    """.trimMargin("1"))
}
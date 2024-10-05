package org.losewmac.kotlincourse.lesson9

/*
🎇 код - \uD83C\uDF87 - бенгальский огонь
 */

fun main(){
    val greeting = "С днем рождения, Александр!"
    val emoji = "\uD83C\uDF87"
    val border = emoji.repeat(greeting.length / 2)
    println(border)
    println()
    println(greeting)
    println()
    println(border)
}
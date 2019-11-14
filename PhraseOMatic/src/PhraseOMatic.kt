//
//  PhraseOMatic.kt
//  PhraseOMatic
//
//  Created by Ruslan Remenkov on 13.11.19.
//  Copyright © 2019 Ruslan Remenkov. All rights reserved.
//

fun main(args: Array<String>) {
    val prefixArr = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val infixArr = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val postfixArr = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val prefixArrSize = prefixArr.size
    val infixArrSize = infixArr.size
    val postfixArrSize = postfixArr.size

    val prefixRandomIndex = (Math.random() * prefixArrSize).toInt()
    val infixRandomIndex = (Math.random() * infixArrSize).toInt()
    val postfixRandomIndex = (Math.random() * postfixArrSize).toInt()

    val phrase = "${prefixArr[prefixRandomIndex]} ${infixArr[infixRandomIndex]} ${postfixArr[postfixRandomIndex]}"

    println(phrase)
}

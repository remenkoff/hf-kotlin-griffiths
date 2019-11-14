//
//  PhraseOMatic.kt
//  PhraseOMatic
//
//  Created by Ruslan Remenkov on 13.11.19.
//  Copyright © 2019 Ruslan Remenkov. All rights reserved.
//

//  
//  Bullet points:
//    - In order to create a variable, the compiler needs to know its name, its type, and whether it can be reused.
//    - If the variable’s type isn’t explicitly defined, the compiler infers it from its value.
//    - A variable holds a reference to an object.
//    - An object has state and behavior. Its behavior is exposed through its functions.
//    - Defining the variable with var means the variable’s object reference can be replaced. Defining the variable with val means the variable holds a reference to the same object forever.
//    - Kotlin has a number of basic types: Byte, Short, Int, Long, Float, Double, Boolean, Char and String.
//    - Explicitly define a variable’s type by putting a colon after the variable’s name, followed by the type: var tinyNum: Byte
//    - You can only assign a value to a variable that has a compatible type.
//    - You can convert one numeric type to another. If the value won’t fit into the new type, some precision is lost.
//    - Create an array using the arrayOf function: var myArray = arrayOf(1, 2, 3)
//    - Access an array’s items using, for example, myArray[0]. The first item in an array has an index of 0.
//    - Get an array’s size using myArray.size.
//    - The compiler infers the array’s type from its items. You can explicitly define an array’s type like this: var myArray: Array<Byte>
//    - If you define an array using val, you can still update the items in the array.
//    - String templates provide a quick and easy way of referring to a variable or evaluating an expression from inside a String.
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

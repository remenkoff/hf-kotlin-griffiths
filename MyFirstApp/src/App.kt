//
//  App.kt
//  MyFirstApp
//
//  Created by Ruslan Remenkov on 13.11.19.
//  Copyright © 2019 Ruslan Remenkov. All rights reserved.
//

//  
//  Bullet points:
//    - Use fun to define a function.
//    - Every application needs a function named main.
//    - Use // to denote a single-lined comment.
//    - A String is a string of characters. You denote a String value by enclosing its characters in double quotes.
//    - Code blocks are defined by a pair of curly braces { }.
//    - The assignment operator is one equals sign =.
//    - The equals operator uses two equals signs ==.
//    - Use var to define a variable whose value may change.
//    - Use val to define a value whose value will stay the same.
//    - A while loop runs everything within its block so long as the conditional test is true.
//    - If the conditional test is false, the while loop code block won’t run, and execution will move down to the code immediately after the loop block.
//    - Put a conditional test inside parentheses ( ).
//    - Add conditional branches to your code using if and else. The else clause is optional.
//    - You can use if as an expression so that it returns a value. In this case, the else clause is mandatory.
//

fun main(args: Array<String>) {
    val x = 3
    val y = 1

    println(if (x > y) "$x greater than $y" else "$x is not greater than $y")
    println("This line runs no matter what.")
}

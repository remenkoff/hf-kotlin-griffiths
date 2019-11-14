//
//  Game.kt
//  RockPaperScissors
//
//  Created by Ruslan Remenkov on 13.11.19.
//  Copyright © 2019 Ruslan Remenkov. All rights reserved.
//

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice, options)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please enter on of the following:")
        for (item in optionsParam) print(" $item")
        println(".")

        val userInput = readLine()

        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }

        if (!isValidChoice) println("You must enter a valid choice.")
    }

    return userChoice
}

fun printResult(uc: String, gc: String, opts: Array<String>) {
    val result: String

    if (uc == gc)
        result = "Tie!"
    else if ((uc == opts[0] && gc == opts[2]) || (uc == opts[1] && gc == opts[0]) || (uc == opts[2] && gc == opts[1]))
        result = "You win!"
    else
        result = "You lose!"

    println("You chose $uc. I chose $gc. $result.")
}

package com.nikolovfactory.rockpaperscissors

fun main () {
    var computerChoice = ""
    var playerChoice: String

    println("Rock, Paper or Scissors? Enter you choice!")

    playerChoice = readln()
    println("Player choose : " + playerChoice)
    // here we create a computer logic
    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
            //println("Rock")
        }
        2 -> {
            computerChoice = "Paper"
            //println("Paper")
        }
        3 -> {
            computerChoice = "Scissors"
            // println("Scissors")
        }
    }
    println("Computer choose : " + computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if (winner == "Tie") {
        println("Tie, no winner!")
    } else {
        println("$winner won!")
    }


}
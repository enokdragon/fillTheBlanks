fun main() {
    var count = 0

    println("Welcome to Dragon's Trivia Night!")
    println("Do your best and type your answer with no space next to the questions")
    println("Fill in the blank")
    println("Good luck")

    println("*blank* is the band that sings the song Teenage Dirtbag.")
    var ans1 = readln().toString()
        if(ans1.contains("wheatus", ignoreCase = true)){
            println("Good work you got one!")
            count++
        }
        else{
            println("Sorry that's incorrect")
        }

    println("2024 is the year of the *blank*.")
    var ans2 = readln().toString()
    if(ans2.contains("dragon", ignoreCase = true)){
        println("Good work you got one!")
        count++
    }
    else{
        println("Sorry that's incorrect")
    }

    println("A tomato is a *blank*")
    var ans3 = readln().toString()
    if(ans3.contains("fruit", ignoreCase = true)){
        println("Good work you got one!")
        count++
    }
    else{
        println("Sorry that's incorrect")
    }

    println("This program was written in the month of *blank*")
    var ans4 = readln().toString()
    if(ans4.contains("february", ignoreCase = true)){
        println("Good work you got one!")
        count++
    }
    else{
        println("Sorry that's incorrect")
    }

    println("People usually wear shoes on their *blank*")
    var ans5 = readln().toString()
    if(ans5.contains("feet", ignoreCase = true)){
        println("Good work you got one!")
        count++
    }
    else{
        println("Sorry that's incorrect")
    }

    println("Congrats, you got $count answers right")
}
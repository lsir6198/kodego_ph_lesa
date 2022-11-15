//Activity 03 - A
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F

fun main(){

    print("Enter a word: ")
    var word = readln().lowercase()

    try {
        if (word.isEmpty()){
            throw Exception()
        }
    }catch (e:Exception){
        println(e)
        println("Invalid Input")
    }

    print("Next step is to check if word is Palindrome, Do you want to proceed? ")
    var answer = readln().lowercase()

    try {
        if (answer.isEmpty()){
            throw Exception()
        }
    }catch (e:Exception){
        println(e)
        println("Invalid Input")
    }

    if (answer == "yes")
    {
        println("Checking the word......$word ")
        print("If reversed : ")
        println(word.reversed())
        print("word length is ")
        println(word.length)
        if (word == word.reversed())
        {
            println("Word is Palindrome.")
        }
        else //if (word != word.reversed())
        {
            println("Word is not Palindrome.")
        }
    }
}

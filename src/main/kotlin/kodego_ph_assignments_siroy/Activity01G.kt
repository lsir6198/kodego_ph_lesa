fun main() {
// Create an application that will accept 1 string.
// Your application will print “Palindrome” if the string is a palindrome.

    print("Enter a word: ")
    var word = readln().lowercase()

    print("Next step is to check if word is Palindrome, Do you want to proceed? ")
    var answer = readln().lowercase()

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
        } else //if (word != word.reversed())
        {
            println("Word is not Palindrome.")
        }
    }
}

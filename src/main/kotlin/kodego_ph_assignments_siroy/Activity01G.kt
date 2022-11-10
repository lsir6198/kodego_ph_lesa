//Create an application that will accept 2 Integers.
// It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting from the lower number upto the largest number.

fun main(){

    var primenumbers = setOf<Int>(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)

    print("Choose a Prime Number from 1 to 100: ")
    var number1:Int = readln().toInt()

    println("=======================")
    print("Enter your second number: ")
    var number2 : Int = readln().toInt()

    if (number1 < number2){
        println("============================================================")
        println("$number2 is the bigger value and $number1 is the lower value")
    }
    else {
        println("============================================================")
        println("$number1 is the bigger value and $number2 is the lower value")
    }
    println("=====================================================")
    println("Examples of Prime Numbers from 1 to 100 $primenumbers")
    println("=====================================================")
    print("End of code")
}
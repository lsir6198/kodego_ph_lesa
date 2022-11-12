//Create an application that will accept 2 Integers.
// It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting from the lower number upto the largest number.

fun main(){

    var primeNumbers = setOf<Int>(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)

    println("=====================================================")
    println("Examples of Prime Numbers from 1 to 100 $primeNumbers")
    println("=====================================================")
    print("Pick a prime Number: ")
    var number1:Int = readln().toInt()

    print("Pick another prime number: ")
    var number2:Int = readln().toInt()

    println("Input numbers are $number1 and $number2")
    print("$number1 = ")
    for (i in 1 until  number1){
        print(" $i ")
    }
    println()
    print("$number2 = ")
    for (i in 1 until  number2){
        print(" $i ")
    }
    println()
    if (number1 < number2){
        println("============================================================")
        print("$number2 is the bigger value and $number1 is the lower value")
    }
    else {
        println("============================================================")
        print("$number1 is the bigger value and $number2 is the lower value: ")
    }
}
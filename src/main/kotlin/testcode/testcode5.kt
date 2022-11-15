//Activity 03 - A
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F
package Exercises

//Activity 01-d
fun main() {

    var amount1: Double = 0.00
    var sum = 0.00

    try {
        print("Enter Amount:")
        var amount: Double = readln().toDouble()
        amount1 = amount
        println("Amount is $amount")

    }catch (e:NumberFormatException){
        println(e)
        println("Input digit only")
    }

    do {
        println("Do you want to add another amount?")
        var answer = readln().lowercase()

        if (answer == "yes"){
            try {
                print("Enter another Amount:")
                var amount2: Double = readln().toDouble()

                amount1 = amount1 + amount2
                sum = amount1
                println("Total amount is : $amount1")
            }catch (e:NumberFormatException){
                println(e)
                println("Input digit only")
            }
        }
    } while (answer == "Yes")

    try {
        print("Divided the value by how many?")
        var valueamount: Int = readln().toInt()

        print("Divided Total Amount is ")
        println(sum / valueamount)
    }catch (e:NumberFormatException){
        println(e)
        println("Invalid Input")
    }

}

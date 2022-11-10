/*
Create an application that will accept 5 monetary amounts.
After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
The total of the 5  input will be divided by the answer in the second question input.
Note: Error checking must be done.
*/

fun main() {

    var quotient: Double = 0.00



    print("Enter Amount:")
    var amount1: Double = readln().toDouble()

    do {
        println("Do you want to add another amount?")
        var answer = readln().lowercase()

        if (answer == "yes") {
            print("Enter another Amount:")
            var amount2: Double = readln().toDouble()
            var amount1 = amount1 + amount2
            var totalamount = amount1
            quotient = totalamount
            println("Total amount is : $totalamount")
        }


    } while (answer == "Yes")

    print("Divided the value by how many?")
    var valueamount: Int = readln().toInt()

    print("Divided Total Amount is ")
    println(quotient / valueamount)
}
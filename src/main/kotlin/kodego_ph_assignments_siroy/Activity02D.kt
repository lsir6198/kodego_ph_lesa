//Activity 02 - D
//Implement Activity 01 - D using data structure.
fun main(){

    var sum: Double = 0.00
    var amount1 = 0.00

    print("Enter Amount:")
    var amount: Double = readln().toDouble()
    amount1 = amount
    println("Amount is $amount")

    println("Do you want to add another amount?")
    var answer = readln().lowercase()
    var ctr = 1

    if (answer == "yes") {
        while (ctr <= 5) {
            print("Enter another Amount:")
            var amount2: Double = readln().toDouble()

            amount1 = amount1 + amount2
            sum = amount1
            println("Total amount is : $amount1")
            ctr++
        }

    }

    print("Divided the value by how many?")
    var valueAmount: Int = readln().toInt()

    print("Divided Total Amount is ")
    println(sum / valueAmount)
}
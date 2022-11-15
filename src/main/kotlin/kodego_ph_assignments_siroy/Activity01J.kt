//Using Activity 01 - C and implement a process where items are added to the grocery.
/*User : Cashier
Goal : List of Items bought, how many items were bought and total cost.
Scope :Data Structures*/

fun main() {


    var items = arrayListOf("1. Produce Items", "2. Pantry and Dairy Items", "3. Meat", "4. Spices")
    var produceItems = arrayListOf("potatoes", "celery", "carrots", "lettuce", "apples", "oranges", "bananas", "grapes")
    var pantryDairyItems = arrayListOf("canned goods","bread","cereals","cheese","peanut","eggs","yogurt","juice","sugar","coffee","milk")
    var meat = arrayListOf("pork, beef, chicken, lamb")
    var spices = arrayListOf("pepper", "salt", "garlic", "onion", "cinnamon", "cloves", "ginger", "vinegar", "cooking oil")

    var produceItemPrice: Double = 15.00
    var pantryDairyItemsPrice: Double = 20.00
    var meatPrice: Double = 250.00
    var spicesPrice: Double = 10.00

    var user = "Cashier"
    var userPassword = "cashier123"

    println("LOGIN")
    println("============")
    print("Username: ")
    var userName: String = readln().uppercase()
    userName = user

    print("Password: ")
    var password: String = readln().lowercase()
    //password = userPassword

    if ((userName == user) && (password == userPassword)) {


        println("Below are the list of available items")
        println("List of Items:")
        println("$items")
        println()

        print("To View Stocks. Select an Item(from 1 to 4): ")
        var itemsNumber: Int = readln().toInt()

        println()
        when (itemsNumber) {
            1 -> println("Produce Items available stocks: $produceItems")
            2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
            3 -> println("$meat")
            4 -> println("Spices available stocks: $spices")
        }

        //1
        println("=================================")
        println("Do you want to add Item?")
        var answer = readln().lowercase()

        if (answer == "yes") {

            println("Add an Item/s: ")
            var addItem = readln().lowercase()

            println("Added Item: $addItem")
            print("Total Purchased Item: ")
            println(addItem.split("\\s+".toRegex()).size)


            if (itemsNumber == 1) {
                println("Produce Item Price: $produceItemPrice")
                println("Total Price: ${(addItem.split("\\s+".toRegex()).size) * produceItemPrice}")

            } else if (itemsNumber == 2) {
                println("Pantry Dairy Items Price: $pantryDairyItemsPrice")
                println("Total Price: ${(addItem.split("\\s+".toRegex()).size) * pantryDairyItemsPrice}")

            } else if (itemsNumber == 3) {
                println("Meat Price: $meatPrice")
                println("Total Price: ${(addItem.split("\\s+".toRegex()).size) * meatPrice}")

            } else //if 4
            {
                println("Spices Price: $spicesPrice")
                print("Total Price: ${(addItem.split("\\s+".toRegex()).size) * spicesPrice}")

            }
        }
    }else{
        println("Not a valid user!!!")
    }
}


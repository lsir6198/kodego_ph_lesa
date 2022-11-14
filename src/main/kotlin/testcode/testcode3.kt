//Using Activity 01 - C and implement a process where items are added to the grocery.
/*User : Cashier
Goal : List of Items bought, how many items were bought and total cost.
Scope :Data Structures*/

package kodego_ph_assignments_siroy
fun main() {


    var items = arrayListOf("1. Produce Items", "2. Pantry and Dairy Items", "3. Meat", "4. Spices")
    var produceItems = arrayListOf("potatoes", "celery", "carrots", "lettuce", "apples", "oranges", "bananas", "grapes")
    var pantryDairyItems = arrayListOf("canned goods","bread","cereals","cheese","peanut","eggs","yogurt","juice","sugar","coffee","milk")
    var meat = arrayListOf("pork, beef, chicken, lamb")
    var spices = arrayListOf("pepper", "salt", "garlic", "onion", "cinnamon", "cloves", "ginger", "vinegar", "cooking oil")

    var produceItemPrice: Double = 15.00
    var pantryDairyItemsPrice: Double = 20.00
    var meatPrice: Double = 350.00
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
            //   var totalPrice: Double = 0.00
            /*
            var totalPrice2: Double = 0.00
            var totalPrice3: Double = 0.00
            var totalPrice4: Double = 0.00
*/

            if (itemsNumber == 1) {
                println("Produce Item Price: $produceItemPrice")
                println("Total Price: ${(addItem.split("\\s+".toRegex()).size) * produceItemPrice}")
//                var totalPrices1 = (addItem.split("\\s+".toRegex()).size) * produceItemPrice
//                totalPrice = totalPrices1
            } else if (itemsNumber == 2) {
                println("Pantry Dairy Items Price: $pantryDairyItemsPrice")
                println("Total Price: ${(addItem.split("\\s+".toRegex()).size) * pantryDairyItemsPrice}")
//                var totalPrices2 = (addItem.split("\\s+".toRegex()).size) * pantryDairyItemsPrice
//                totalPrice = totalPrices2
            } else if (itemsNumber == 3) {
                println("Meat Price: $meatPrice")
                println("Total Price: ${(addItem.split("\\s+".toRegex()).size) * meatPrice}")
//                var totalPrices3 = (addItem.split("\\s+".toRegex()).size) * meatPrice
//                totalPrice = totalPrices3
            } else //if 4
            {
                println("Spices Price: $spicesPrice")
                print("Total Price: ${(addItem.split("\\s+".toRegex()).size) * spicesPrice}")
//                var totalPrices4 = (addItem.split("\\s+".toRegex()).size) * spicesPrice
//                totalPrice = totalPrices4
            }
        }
    }else{
    println("Not a valid user!!!")
    }
}

//            //2
//            println("Do you want to add another item?")
//            var answer2 = readln().lowercase()
//
//            if (answer2 == "yes") {
//
//                println(items)
//                print("To View Stocks. Select an Item(from 1 to 4): ")
//                var itemsNumber2: Int = readln().toInt()
//
//                println()
//                when (itemsNumber2) {
//                    1 -> println("Produce Items available stocks: $produceItems")
//                    2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
//                    3 -> println("$meat")
//                    4 -> println("Spices available stocks: $spices")
//                }
//
//                println("Add an Item/s: ")
//                var addItem2 = readln().lowercase()
//
//                println("New Added Items: $addItem2")
//                println("Added Items: $addItem")
//                print("Total Purchased Item: ")
//                println((addItem2.split("\\s+".toRegex()).size) + (addItem.split("\\s+".toRegex()).size))
//
//                if (itemsNumber == 1) {
//                    println("Produce Item Price: $produceItemPrice")
//                    println("Total Price: ${(addItem2.split("\\s+".toRegex()).size) * produceItemPrice + totalPrice}")
//                    var totalPrices5 = ((addItem2.split("\\s+".toRegex()).size) * produceItemPrice + totalPrice)
//                    totalPrice2 = totalPrices5
//                }
//                else if (itemsNumber == 2){
//                    println("Pantry Dairy Items: $pantryDairyItems")
//                    println("Total Price: ${(addItem2.split("\\s+".toRegex()).size) * pantryDairyItemsPrice + totalPrice}")
//                    var totalPrices6 = ((addItem2.split("\\s+".toRegex()).size) * pantryDairyItemsPrice + totalPrice)
//                    totalPrice2 = totalPrices6
//                }
//                else if (itemsNumber == 3){
//                    println("Meat Price: $meatPrice")
//                    println("Total Price: ${(addItem2.split("\\s+".toRegex()).size) * meatPrice + totalPrice}")
//                    var totalPrices7 = ((addItem2.split("\\s+".toRegex()).size) * meatPrice + totalPrice)
//                    totalPrice2 = totalPrices7
//                }
//                else //if 4
//                {
//                    println("Spices Price: $spicesPrice")
//                    print("Total Price: ${(addItem2.split("\\s+".toRegex()).size) * spicesPrice + totalPrice}")
//                    var totalPrices8 = ((addItem2.split("\\s+".toRegex()).size) * spicesPrice + totalPrice)
//                    totalPrice2 = totalPrices8
//                }
//
//                readLine()
//
//                //3
//                println("Do you want to add another item?")
//                var answer3 = readln().lowercase()
//
//                if (answer3 == "yes") {
//
//                    println(items)
//                    print("To View Stocks. Select an Item(from 1 to 4): ")
//                    var itemsNumber3: Int = readln().toInt()
//
//                    println()
//                    when (itemsNumber3) {
//                        1 -> println("Produce Items available stocks: $produceItems")
//                        2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
//                        3 -> println("$meat")
//                        4 -> println("Spices available stocks: $spices")
//                    }
//                    println("Add an Item/s: ")
//                    var addItem3 = readln().lowercase()
//
//                    println("New Added Items: $addItem3")
//                    println("Added Items: $addItem2, $addItem")
//                    print("Total Purchased Item: ")
//                    println((addItem3.split("\\s+".toRegex()).size) + (addItem2.split("\\s+".toRegex()).size) + (addItem.split("\\s+".toRegex()).size))
//
//                    if (itemsNumber == 1) {
//                        println("Produce Item Price: $produceItemPrice")
//                        println("Total Price: ${((addItem3.split("\\s+".toRegex()).size) * produceItemPrice) + totalPrice + totalPrice2}")
//                        var totalPrices9 = ((addItem3.split("\\s+".toRegex()).size) * produceItemPrice) + totalPrice + totalPrice2
//                        totalPrice3 = totalPrices9
//                    }
//                    else if (itemsNumber == 2){
//                        println("Pantry Dairy Items Price: $pantryDairyItemsPrice")
//                        println("Total Price: ${((addItem3.split("\\s+".toRegex()).size)* pantryDairyItemsPrice) + totalPrice + totalPrice2}")
//                        var totalPrices10 = ((addItem3.split("\\s+".toRegex()).size)* pantryDairyItemsPrice) + totalPrice + totalPrice2
//                        totalPrice3 = totalPrices10
//                    }
//                    else if (itemsNumber == 3){
//                        println("Meat Price: $meatPrice")
//                        println("Total Price: ${((addItem3.split("\\s+".toRegex()).size)* meatPrice) + totalPrice + totalPrice2}")
//                        var totalPrices11 = ((addItem3.split("\\s+".toRegex()).size)* meatPrice) + totalPrice + totalPrice2
//                        totalPrice3 = totalPrices11
//                    }
//                    else //if 4
//                    {
//                        println("Spices Price: $spicesPrice")
//                        print("Total Price: ${((addItem3.split("\\s+".toRegex()).size)* spicesPrice) + totalPrice + totalPrice2}")
//                        var totalPrices12 = ((addItem3.split("\\s+".toRegex()).size)* spicesPrice) + totalPrice + totalPrice2
//                        totalPrice3 = totalPrices12
//                    }
//
//                    //4
//                    println("Do you want to add another item?")
//                    var answer4 = readln().lowercase()
//
//                    if (answer4 == "yes") {
//
//                        println(items)
//                        print("To View Stocks. Select an Item(from 1 to 4): ")
//                        var itemsNumber4: Int = readln().toInt()
//
//                        println()
//                        when (itemsNumber4) {
//                            1 -> println("Produce Items available stocks: $produceItems")
//                            2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
//                            3 -> println("$meat")
//                            4 -> println("Spices available stocks: $spices")
//                        }
//                        println("Add an Item/s: ")
//                        var addItem4 = readln().lowercase()
//
//                        println("New Added Items: $addItem4")
//                        println("Added Items: $addItem2, $addItem3, $addItem")
//                        print("Total Purchased Item: ")
//                        println((addItem4.split("\\s+".toRegex()).size) + (addItem3.split("\\s+".toRegex()).size) + (addItem2.split("\\s+".toRegex()).size) + (addItem.split("\\s+".toRegex()).size))
//
//                        if (itemsNumber == 1) {
//                            println("Produce Item Price: $produceItemPrice")
//                            println("Total Price: ${((addItem4.split("\\s+".toRegex()).size)* produceItemPrice) + totalPrice3 + totalPrice2 + totalPrice}")
//                            var totalPrices13 = ((addItem4.split("\\s+".toRegex()).size)* produceItemPrice) + totalPrice3 + totalPrice2 + totalPrice
//                            totalPrice4 = totalPrices13
//                        }
//                        else if (itemsNumber == 2){
//                            println("Pantry Dairy Items Price: $pantryDairyItemsPrice")
//                            println("Total Price: ${((addItem4.split("\\s+".toRegex()).size)* pantryDairyItemsPrice) + totalPrice3 + totalPrice2 + totalPrice}")
//                            var totalPrices14 = ((addItem4.split("\\s+".toRegex()).size)* pantryDairyItemsPrice) + totalPrice3 + totalPrice2 + totalPrice
//                            totalPrice4 = totalPrices14
//                        }
//                        else if (itemsNumber == 3){
//                            println("Meat Price: $meatPrice")
//                            println("Total Price: ${((addItem4.split("\\s+".toRegex()).size)* meatPrice) + totalPrice3 + totalPrice2 + totalPrice}")
//                            var totalPrices15 = ((addItem4.split("\\s+".toRegex()).size)* meatPrice) + totalPrice3 + totalPrice2 + totalPrice
//                            totalPrice4 = totalPrices15
//                        }
//                        else //if 4
//                        {
//                            println("Spices Price: $spicesPrice")
//                            print("Total Price: ${((addItem4.split("\\s+".toRegex()).size)* spicesPrice) + + totalPrice3 + totalPrice2 + totalPrice}")
//                            var totalPrices16 = ((addItem4.split("\\s+".toRegex()).size)* spicesPrice) + + totalPrice3 + totalPrice2 + totalPrice
//                                totalPrice4 = totalPrices16
//                        }
//                    }
//                }

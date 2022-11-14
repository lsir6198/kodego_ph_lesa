//Using Activity 01 - C and implement a process where items are added to the grocery.
/*User : Cashier
Goal : List of Items bought, how many items were bought and total cost.
Scope :Data Structures*/

fun main(){


    var items = "1. Produce Items 2. Pantry and Dairy Items 3. Meat 4. Spices"
    var produceItems =
        "potatoes, onions, tomatoes, green peppers, celery, carrots and lettuce. Packaged, chopped lettuces are convenient for salads. \n" +
                "Fruits = apples, oranges, bananas, grapes, raisins and peaches. canned fruits"
    var pantryDairyItems =
        "canned goods, grains, bread, tortilla wraps, rice, hot cereals and cold cereals, macaroni and cheese, spaghetti, peanut , eggs, cheese, yogurt, sour cream, orange juice, butter, jelly, sugar, flour, coffee, milk and tea"
    var meat = "pork, beef, chicken, lamb"
    var spices =
        "black pepper, salt, garlic powder, onion powder and paprika. Basil, oregano, rosemary and thyme, cocoa powder, cinnamon, cloves, ginger and nutmeg, lemon juice, vinegar, cooking oil and vanilla"

    var user = "Cashier"
    var userPassword = "cashier123"

    println("LOGIN")
    println("============")
    print("Username: ")
    var userName: String = readln().uppercase()
    userName = user

    print("Password: ")
    var password:String = readln().lowercase()
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
            readLine()

            //2
            println("Do you want to add another item?")
            var answer2 = readln().lowercase()

            if (answer2 == "yes") {

                println(items)
                print("To View Stocks. Select an Item(from 1 to 4): ")
                var itemsNumber2: Int = readln().toInt()

                println()
                when (itemsNumber2) {
                    1 -> println("Produce Items available stocks: $produceItems")
                    2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
                    3 -> println("$meat")
                    4 -> println("Spices available stocks: $spices")
                }

                println("Add an Item/s: ")
                var addItem2 = readln().lowercase()

                println("New Added Items: $addItem2")
                println("Added Items: $addItem")
                print("Total Purchased Item: ")
                println((addItem2.split("\\s+".toRegex()).size) + (addItem.split("\\s+".toRegex()).size))

                readLine()

                //3
                println("Do you want to add another item?")
                var answer3 = readln().lowercase()

                if (answer3 == "yes") {

                    println(items)
                    print("To View Stocks. Select an Item(from 1 to 4): ")
                    var itemsNumber3: Int = readln().toInt()

                    println()
                    when (itemsNumber3) {
                        1 -> println("Produce Items available stocks: $produceItems")
                        2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
                        3 -> println("$meat")
                        4 -> println("Spices available stocks: $spices")
                    }
                    println("Add an Item/s: ")
                    var addItem3 = readln().lowercase()

                    println("New Added Items: $addItem3")
                    println("Added Items: $addItem2, $addItem")
                    print("Total Purchased Item: ")
                    println((addItem3.split("\\s+".toRegex()).size) + (addItem2.split("\\s+".toRegex()).size) + (addItem.split("\\s+".toRegex()).size))

                    readLine()

                    //4
                    println("Do you want to add another item?")
                    var answer4 = readln().lowercase()

                    if (answer4 == "yes") {

                        println(items)
                        print("To View Stocks. Select an Item(from 1 to 4): ")
                        var itemsNumber4: Int = readln().toInt()

                        println()
                        when (itemsNumber4) {
                            1 -> println("Produce Items available stocks: $produceItems")
                            2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
                            3 -> println("$meat")
                            4 -> println("Spices available stocks: $spices")
                        }
                        println("Add an Item/s: ")
                        var addItem4 = readln().lowercase()

                        println("New Added Items: $addItem4")
                        println("Added Items: $addItem2, $addItem3, $addItem")
                        print("Total Purchased Item: ")
                        println((addItem4.split("\\s+".toRegex()).size) + (addItem3.split("\\s+".toRegex()).size) + (addItem2.split("\\s+".toRegex()).size) + (addItem.split("\\s+".toRegex()).size))

                        readLine()

                    }
                }
            }
        }
    }else{
        println("not a valid user")
    }
}

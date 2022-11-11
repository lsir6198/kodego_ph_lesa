//Using Activity 01 - C and implement a process where items are added to the grocery.

fun main(){


    var items = "Produce Items, Pantry and Dairy Items, Meat and Spices"
    var produceItems =
        "potatoes, onions, tomatoes, green peppers, celery, carrots and lettuce. Packaged, chopped lettuces are convenient for salads. \n" +
                "Fruits = apples, oranges, bananas, grapes, raisins and peaches. canned fruits"
    var pantryDairyItems =
        "canned goods, grains, bread, tortilla wraps, rice, hot cereals and cold cereals, macaroni and cheese, spaghetti, peanut , eggs, cheese, yogurt, sour cream, orange juice, butter, jelly, sugar, flour, coffee, milk and tea"
    var meat = "pork, beef, chicken, lamb"
    var spices =
        "black pepper, salt, garlic powder, onion powder and paprika. Basil, oregano, rosemary and thyme, cocoa powder, cinnamon, cloves, ginger and nutmeg, lemon juice, vinegar, cooking oil and vanilla"


    println("Below are the list of available items")
    println("List of Items:")
    println("$items")
    println()
    print("To View Stocks. Select an Item(from 1 to 3): ")
    var itemsNumber : Int = readln().toInt()
    println()
    when (itemsNumber) {
        1 -> println("Produce Items available stocks: $produceItems")
        2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
        3 -> println("$meat")
        4 -> println("Spices available stocks: $spices")
    }
    println("=================================")
    println("Do you want to add Item?")
    var answer = readln().lowercase()

    if (answer == "yes") {

        print("Add an Item/s: ")
        var addItem = readln().lowercase()
        var addedItem = ArrayList<String>()

        print("Added Item: $addItem")

        for (value in addedItem) {
            print(" $value ")
        }
    }
}
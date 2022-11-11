/*
You are tasked to automate an inventory system for a grocery.
Identify the items that can be bought in a grocery store.
After listing the different items, identify the characteristics of the items.
You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.*/

fun main(){

    var items = "1. Produce Items, 2. Pantry and Dairy Items, 3. Meat and Spices"
    var produceItems = "potatoes, onions, tomatoes, green peppers, celery, carrots and lettuce. Packaged, chopped lettuces are convenient for salads. \n" +
        "Fruits = apples, oranges, bananas, grapes, raisins and peaches. canned fruits"
    var pantryDairyItems = "canned goods, grains, bread, tortilla wraps, rice, hot cereals and cold cereals, macaroni and cheese, spaghetti, peanut , eggs, cheese, yogurt, sour cream, orange juice, butter, jelly, sugar, flour, coffee, milk and tea"
    var meat = "pork, beef, chicken, lamb"
    var spices = "black pepper, salt, garlic powder, onion powder and paprika. Basil, oregano, rosemary and thyme, cocoa powder, cinnamon, cloves, ginger and nutmeg, lemon juice, vinegar, cooking oil and vanilla"


    println("Below are the list of available items")
    println("List of Items:")
    println("$items")
    println("=====================================")
    println("=====================================")
    print("To View Stocks. Select an Item(from 1 to 3): ")
    var itemsNumber : Int = readln().toInt()
    println()
    when(itemsNumber){
    1 -> println("Produce Items available stocks: $produceItems")
    2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
    3 -> println("$meat")
    4 -> println("Spices available stocks: $spices")
    }
}

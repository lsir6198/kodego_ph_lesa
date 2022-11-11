//Activity 02 - F
//Implement Activity 02 - C using Classes.
//Activity 02 - C(Implementation of Activity 01 - C(automate an inventory system for a grocery) using data structure.) using Classes.

fun main() {

    var item1 = GroceryInventory().produceItems
    var item2 = GroceryInventory().pantryDairyItems
    var item3 = GroceryInventory().meat
    var item4 = GroceryInventory().spices

    println("Automated Grocery Inventory System")
    println("Below are the list of available items")
    println("List of Items:")
    GroceryInventory().viewListOfStocks()

    print("To View Stocks per Item. Select an Item(from 1 to 4): ")
    var itemsNumber: Int = readln().toInt()
    when(itemsNumber) {
        1 -> println("Produce Items available stocks: $item1")
        2 -> println("Pantry and Dairy Items available stocks: $item2")
        3 -> println("$item3")
        4 -> println("Spices available stocks: $item4")
    }

    println("=====================================")
    println("Do you want to add Item?")
    var answer = readln().lowercase()
    if (answer == "yes") {
       GroceryInventory().addItem()
    }
}

class GroceryInventory{

    var items = "1. Produce Items, 2. Pantry and Dairy Items, 3. Meat and Spices"
    var produceItems = arrayListOf("1. potatoes","2. onions","3. tomatoes","4. green peppers","5. celery","6. carrots and lettuce")
    var pantryDairyItems = arrayListOf("1. canned goods","2. grains","3. bread","4. tortilla wraps")
    var meat = arrayListOf("1. pork","2. beef","3. chicken","4. lamb")
    var spices = arrayListOf("1. black pepper","2. salt","3. garlic powder","4. onion powder and paprika","5. vinegar","6. vanilla")


    fun viewListOfStocks(){
        println("$items")
        println("=====================================")
        println(produceItems[0])
        println(produceItems[1])
        println(produceItems[2])
        println(produceItems[3])
        println(produceItems[4])
        println(produceItems[5])
        println()
        println(pantryDairyItems[0])
        println(pantryDairyItems[1])
        println(pantryDairyItems[2])
        println(pantryDairyItems[3])
        println()
        println(meat[0])
        println(meat[1])
        println(meat[2])
        println(meat[3])
        println()
        println(spices[0])
        println(spices[1])
        println(spices[2])
        println(spices[3])
        println(spices[4])
        println(spices[5])
        println("====================================================")
    }

    fun addItem(){
        print("Add an Item/s: ")
        var additem = readln().lowercase()
        print("Added Item: $additem")

    }
}

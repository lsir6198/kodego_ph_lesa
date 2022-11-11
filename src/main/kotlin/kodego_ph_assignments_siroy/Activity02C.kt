//Activity 02 - C
//Implement Activity 01 - C(automate an inventory system for a grocery) using data structure.

fun main() {
    var items = "1. Produce Items, 2. Pantry and Dairy Items, 3. Meat and Spices"
    var produceItems = arrayListOf("1. potatoes","2. onions","3. tomatoes","4. green peppers","5. celery","6. carrots and lettuce")
    var pantryDairyItems = arrayListOf("1. canned goods","2. grains","3. bread","4. tortilla wraps")
    var meat = arrayListOf("1. pork","2. beef","3. chicken","4. lamb")
    var spices = arrayListOf("1. black pepper","2. salt","3. garlic powder","4. onion powder and paprika","5. vinegar","6. vanilla")


    println("Below are the list of available items")
    println("List of Items:")
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
    print("To View Stocks per Item. Select an Item(from 1 to 4): ")
    var itemsNumber : Int = readln().toInt()
    println("=====================================")
    when(itemsNumber){
        1 -> println("Produce Items available stocks: $produceItems")
        2 -> println("Pantry and Dairy Items available stocks: $pantryDairyItems")
        3 -> println("$meat")
        4 -> println("Spices available stocks: $spices")
    }

    println("Do you want to add Item?")
    var answer = readln().lowercase()

    if (answer == "yes") {

        print("Add an Item/s: ")
        var additem = readln().lowercase()

        print("Added Item: $additem")

    }
}



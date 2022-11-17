/*
Covered Topic(s) : Functions
Instructions :
1. Create an ArrayList of grocery products with 20 entries.
2. Create a HashMap called Cart.
Hint:  Hashmap<String, Int>
2. Create a function "addToCart" that will accept a String and an Int, it will add the input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.
Hint : you may add a "_01", "_02"
Example Coke_01, Coke_02
3. Create a function "checkOut". This will compute how many items have been checked out.
4. Create a function "removefromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple entries, remove all from the HashMap.*/
fun main(){

    var toDoList = mapOf(1 to "1. VIEW AVAILABLE GROCERY LIST", 2 to "2. ADD TO CART", 3 to "3. CHECKOUT", 4 to "4. REMOVE FROM THE CART")

    println("ADMIN LOGIN. ENTER YOUR CREDENTIALS")
    println("*************************************")
    grocerySystem().loginCredentials()
    print("Press enter to continue")
    readLine()
    println("======================================")
    println(toDoList[1])
    println(toDoList[2])
    println(toDoList[3])
    println(toDoList[4])

    print("Selection option from 1 to 4 to continue:")
    var option: Int = readln().toInt()

    if (option == 1){
        println("GROCERY LIST")
        print(grocerySystem().listOfGroceryInventory)
        return grocerySystem().loginCredentials()
    }
    else if (option == 2){
        grocerySystem().addToCart()
    }
    else if (option == 3){
        grocerySystem().checkOut()
    }
    else if (option == 4){
        grocerySystem().removefromCart()
    }
    else{
        println("not an option")
        println(toDoList)
        return grocerySystem().loginCredentials()
    }
}

class grocerySystem{

    var listOfGroceryInventory = arrayListOf("EGG","BREAD","COOKING OIL","VINEGAR","SALT","BEEF","CHICKEN",
        "PORK",
        "RICE",
        "CEREALS",
        "MILK",
        "APPLE",
        "ORANGE",
        "GRAPES",
        "FISH",
        "TOMATOES",
        "CHIPS",
        "CHOCOLATES",
        "BISCUITS",
        "LAUNDRY DETERGENT"
    )
    var groceryName = ""
    var cart: HashMap<String, Int> = hashMapOf()

    init {
        println("PUBLIC MARKET MONITORING SYSTEM")
        println("===============================")
    }

    fun addToCart() {
        println(listOfGroceryInventory)
        println("Add to Cart:")
        groceryName = readln().lowercase()
        var ctr = 1

        cart.put("${groceryName.plus("_01")}", ctr)
        println(cart)
        ctr++

        println()
        print("Add Another Item? ")
        var answer = readln().lowercase()

        if (answer == "yes"){
            println(listOfGroceryInventory)
            println("Add to Cart:")
            groceryName = readln().lowercase()
            cart.put("${groceryName.plus("_02")}", ctr)
            println(cart)
            ctr++
        }

        println("Total Item/s = ${cart.size}")
    }

    fun checkOut() {
        println("Are you sure you want to Checkout?")
        var answer = readln().lowercase()

        if (answer == "yes") {
            println("Checking Out.......")
            print("Press enter to continue")
            readLine()
            print("Total Items: ")
            println(groceryName.split("\\s+".toRegex()).size)
        } else {
            return loginCredentials()
        }
    }

    fun removefromCart() {
        println("Are you sure you want to Remove the Item/s?")
        var answer = readln().lowercase()

        if (answer == "yes") {
            println("REMOVING.....")
            cart.clear()
            readLine()
            println("CART is EMPTY: " + cart)

        } else {
            return loginCredentials()
        }
    }


    fun loginCredentials() {
        print("Username: ")
        var userName = readln().lowercase()

        if (userName == "cashier") {

            print("Password: ")
            var password = readln().lowercase()

            if (password == "cashier123") {
                println("LIST OF GROCERIES:")
                println(listOfGroceryInventory)
            } else {
                println("Username and Password didn't match!!! Try Again")
                return loginCredentials()
            }
        } else {
            println("Username didn't match our records!!!")
            return loginCredentials()
        }


    }
}
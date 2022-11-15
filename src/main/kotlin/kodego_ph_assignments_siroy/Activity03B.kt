/*
Covered Topic(s) : Functions
Instructions :
1. Create an ArrayList of bookname with 20 entries.
2. Create a function "isBookInRecord" that will accept a String and return true if the book is found, otherwise false.
3. Create a function "addBook" that will accept a String and add it to the ArrayList.
4. Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it exactly matches the book name.
5. Create a function "countBooks" that will return the size of the ArrayList.
6. Create a function "searchBookWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of books that matched if there are.
7. Create a function  "searchBookName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of books that matched if there are.
8.  Create a function "showBooks" that will print all the entries in the ArrayList*/

fun main(){

    var toDoList = mapOf(1 to "1. CHECK BOOK", 2 to "2. ADD BOOK", 3 to "3. REMOVE BOOK", 4 to "4. COUNT BOOK", 5 to "5. SEARCH BOOK NAME", 6 to "6. WILD SEARCH")

    println("ADMIN LOGIN. ENTER YOUR CREDENTIALS")
    println("*************************************")
    librarySystem().loginCredentials()
    print("Press enter to continue")
    readLine()
    println("======================================")
    println(toDoList[1])
    println(toDoList[2])
    println(toDoList[3])
    println(toDoList[4])
    println(toDoList[5])
    println(toDoList[6])

    print("Selection option from 1 to 6 to continue:")
    var option: Int = readln().toInt()

    if (option == 1){
        librarySystem().isBookInRecord()
    }
    else if (option == 2){
        librarySystem().addBook()
    }
    else if (option == 3){
        librarySystem().removeBook()
    }
    else if (option == 4){
        librarySystem().countBooks()
    }
    else if (option == 5){
        librarySystem().searchBookName()
    }
    else if (option == 6){
        librarySystem().searchBookWildSearch()
    }
    else{
        println("not an option")
        println(toDoList)
        librarySystem().loginCredentials()
    }


}

class librarySystem{

    var listOfBooks = arrayListOf("PETER PAN","WANDERLUST","BREAD OF LIFE","SCIENCE AND BEYOND","RAPUNZEL","WIKI ENCYCLOPEDIA","DICTIONARY","HISTORY","SPELLBOOK","MARRIAGE ADVICE","BIBLE","LITTLE MUNCHIES","LIFE OF JOSE RIZAL","HEALTH AND FITNESS","ANIMALS","GEOGRAPHY","VIRAL NEWS","PANDEMIC","MEDICAL BOOK","VITAMINS AND MINERALS")
    var bookName = ""

    init {
        println("SCHOOL LIBRARY MONITORING SYSTEM")
        println("========================")
    }
    fun isBookInRecord(){
        print("BOOK NAME: ")
        bookName = readln().uppercase()
        if (listOfBooks.contains(bookName)){
            println("Book Name found on our record, $listOfBooks")

        }else{
            println("Book is not on the record!!!")
            println("Do you want to add the Book?")
            var answer = readln().lowercase()
            if (answer == "yes"){
                addBook()
            }else{
                return loginCredentials()
            }
        }
    }

    fun addBook(){
        println("ADD BOOK")
        println("============")
        print("BOOK NAME: ")
        var addBook = readln().uppercase()
        listOfBooks.add(addBook)
        println(listOfBooks)
        return loginCredentials()
    }

    fun removeBook(){
        println("REMOVE BOOK")
        println("===============")
        print("BOOK NAME: ")
        var removeBook = readln().uppercase()
        if (listOfBooks.contains(removeBook)){
            listOfBooks.remove(removeBook)
            println(listOfBooks)
            return loginCredentials()
        }else{
            println("BOOK NOT ON OUR RECORD!!!")
            return loginCredentials()
        }

    }

    fun countBooks(){
        println("COUNT NUMBER OF BOOK ON THE LIST")
        println("====================================")
        print("NUMBER OF BOOKS: ")
        println(listOfBooks.size)
        return loginCredentials()
    }

    fun searchBookWildSearch(){
        println("BOOK NAME: ")
        bookName = readln().uppercase()
        if (listOfBooks.contains(bookName)){
            println("FOUND!!!")
            println("BOOK LIST:")
            println(listOfBooks)
        }else{
            println("FAILED")
        }
    }

    fun searchBookName(){
        println("BOOK NAME: ")
        bookName = readln().uppercase()
        if (listOfBooks.contains(bookName)){
            println("Book is on the list, $listOfBooks")
        }else{
            println("No Record Found!!!")

        }
    }

    fun showBooks(){
        println(listOfBooks)
    }

    fun loginCredentials(){
        print("Username: ")
        var userName = readln().lowercase()

        if (userName == "librarian") {

            print("Password: ")
            var password = readln().lowercase()

            if (password == "librarian123") {
                println("LIST OF BOOKS:")
                showBooks()
            }else{
                println("Username and Password didn't match!!! Try Again")
                return loginCredentials()
            }
        }else{
            println("Username didn't match our records!!!")
            return loginCredentials()
        }
    }
}


//You are tasked to automate a school’s library.
//Identify the items that can be borrowed in a Library.
//After listing the different items, identify the characteristics of the items.
//Use the proper data types.

fun main(){
    var items = "Fiction Books, Non-Fiction Books"

    var fictionBooks = "Romeo and Juliet\n" +
            "Peter Pan, untold series\n" +
            "Science and Beyond\n" +
            "Conjuring Series of Stories Second Edition\n" +
            "The Bureau of Magical Things"

    var nonFictionBooks = "Jose Rizal Biography/Autobiography, Memoirs by Elizabeth Gilbert, " +
            "How to Overcome Frustrations, The Power of Prayers, World Encyclopedias, Wiki Dictionary and Terms"

    var fictionBooksDescription = "A fictional book is a text created specifically for a work in an imaginary narrative that is referred to, depicted, " +
            "or excerpted in a story, book, film, or other fictional work, and which exists only in one or more fictional works. " +
            "A fictional book may be created to add realism or depth to a larger fictional work."

    var nonFictionBooksDescription = "Nonfiction books are based on factual information or real-life events. " +
            "It makes the declaration that it is not fiction because the reader should understand that what is contained inside the book is not imagined and has a basis in the real world."

    println("==================================================")
    println("Welcome to Ormoc City Public Library Online System")
    println("==================================================")
    println("VIEW AVAILABLE BOOKS")
    println("BORROW BOOKS")
    println("NOTE: For all return books, Kindly visit the Public Library")
    println("===========================================================")
    println()
    print("SELECT FROM THE OPTIONS: ")
    var option = readln().uppercase()

    if (option == "VIEW AVAILABLE BOOKS"){
        println("===========================================================")
        println("NOTE: YOU ONLY VIEWED THE AVAILABLE BOOKS")
        println()
        println("Types of Books and Descriptions")
        println("$items")
        println("***********************************************************")
        println("***********************************************************")
        println("What is a Fiction Books:")
        println("$fictionBooks")
        println()
        println("***********************************************************")
        println("Types of Fiction Books:")
        println("$fictionBooks")
        println("***********************************************************")
        println("***********************************************************")
        println("What is a Non-Fiction Books:")
        println("$nonFictionBooksDescription")
        println()
        println("***********************************************************")
        println("Types of Non-Fiction Book:")
        println("$nonFictionBooks")

    }
    else if (option == "BORROW BOOKS"){
        println(fictionBooks)
        println(nonFictionBooks)
        println("==============================")
        println("What books do you want to borrow?")
        var borrowbooks = readln().lowercase()

        println("You choose $borrowbooks")
        println("Kindly Type Your Student ID: ")
        var studentID: Int = readln().toInt()

        println("Your student ID is $studentID")
        println("Your First Name: ")
        var firstName = readln().uppercase()

        println("Your Last Name: ")
        var lastName = readln().uppercase()

        println()
        println("Borrower's Details: $firstName $lastName, and Student ID: $studentID")
        println()
        println("You Successfully borrowed book/book's from Public Library")
        println("Borrower's reference ID: 123456. Take note of your reference ID")
        println()
        println("Kindly return the books within 2weeks from Date Borrowed")
        println("REMINDERS: FOR ALL RETURNS BOOKS KINDLY VISIT THE PUBLIC LIBRARY. DON'T FORGET TO BRING YOUR STUDENT ID/ANY VALID ID'S")

    }

    println()
    println("Thank you for visiting Ormoc City Public Library")
}

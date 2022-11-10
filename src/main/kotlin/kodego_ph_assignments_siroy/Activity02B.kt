/*
Activity 02 - B
Implement Activity 01 -  B using data structure.*/

fun main() {

    var Items = "Fiction Books, Non-Fiction Books"

    var fictionbooks = arrayListOf("1. Romeo and Juliet","2. Peter Pan, untold series","3. Science and Beyond","4. Conjuring Series of Stories Second Edition","5. The Bureau of Magical Things")

    var nonfictionbooks = arrayListOf("1. Jose Rizal Biography/Autobiography", "2. Memoirs by Elizabeth Gilbert", "3. How to Overcome Frustrations", "4. The Power of Prayers", "5. World Encyclopedias", "6. Wiki Dictionary and Terms")

    var FictionBooks =
        "A fictional book is a text created specifically for a work in an imaginary narrative that is referred to, depicted, " +
                "or excerpted in a story, book, film, or other fictional work, and which exists only in one or more fictional works. " +
                "A fictional book may be created to add realism or depth to a larger fictional work."

    var NonFictionBooks = "Nonfiction books are based on factual information or real-life events. " +
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

    if (option == "VIEW AVAILABLE BOOKS") {
        println("===========================================================")
        println("NOTE: YOU ONLY VIEWED THE AVAILABLE BOOKS")
        println()
        println("Types of Books and Descriptions")
        println("$Items")
        println("***********************************************************")
        println("***********************************************************")
        println("What is a Fiction Books:")
        println("$FictionBooks")
        println()
        println("***********************************************************")
        println("List of Fiction Books:")
        println(fictionbooks[0])
        println(fictionbooks[1])
        println(fictionbooks[2])
        println(fictionbooks[3])
        println(fictionbooks[4])
        println("***********************************************************")
        println("***********************************************************")
        println("What is a Non-Fiction Books:")
        println("$NonFictionBooks")
        println()
        println("***********************************************************")
        println("List of Non-Fiction Book:")
        println(nonfictionbooks[0])
        println(nonfictionbooks[1])
        println(nonfictionbooks[2])
        println(nonfictionbooks[3])
        println(nonfictionbooks[4])
        println(nonfictionbooks[5])
        readLine()

    } else if (option == "BORROW BOOKS") {
        println(fictionbooks)
        println(nonfictionbooks)
        println("==============================")
        println("What books do you want to borrow?")
        var borrowbooks = readln().uppercase()

        println("You choose $borrowbooks")


            println("Do you want to borrow another book?")
            var answer = readln().lowercase()

            if (answer == "yes") {
                println("====================================")
                println("Available Books for Fiction Section:")
                println(fictionbooks)
                println()
                println("Available Books for NonFiction Section")
                println(nonfictionbooks)
                println()
                println("$borrowbooks NOT AVAILABLE")
                println()
                println("Choose another Book")
                var borrowbooks2 = readln().uppercase()
                if (borrowbooks2 == borrowbooks) {
                    println("You already borrowed this book/Not Available")
                    println("Choose another Book")
                    borrowbooks2 = readln().uppercase()

                }

                    println("You choose $borrowbooks and $borrowbooks2")
                    println()
                    println("NOTE: ONLY TWO BOOKS CAN BE BORROWED")

                }

                println("Kindly Type Your Student ID: ")
                var studentID: Int = readln().toInt()

                println("Your student ID is $studentID")
                println("Your First Name: ")
                var firstname = readln().uppercase()

                println("Your Last Name: ")
                var lastname = readln().uppercase()

                println()
                println("Borrower's Details: $firstname $lastname, and Student ID: $studentID")
                println()
                println("You Successfully borrowed book/book's from Public Library")
                println("Borrower's reference ID: 123456. Take note of your reference ID")
                println()
                println("Kindly return the books within 2weeks from Date Borrowed")
                println("REMINDERS: FOR ALL RETURNS BOOKS KINDLY VISIT THE PUBLIC LIBRARY. DON'T FORGET TO BRING YOUR STUDENT ID/ANY VALID ID'S")

            }

            println()
            println("Thank you for visiting Ormoc City Public Library")
            readLine()
}


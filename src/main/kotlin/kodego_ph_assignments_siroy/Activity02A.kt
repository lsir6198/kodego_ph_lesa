//Activity 02 - A
//Implement Activity 01 -  A (to create a directory of the students taking this course.) using data structure.

fun main() {
    var bscsnames = arrayListOf("1. Lesa Siroy", "2. Asel Omega", "3. Lei Zah")
    var bscenames = arrayListOf("1. Marc Quinn", "2. Lyan Keem", "3. Ryan Neil")
    var bsitnames = arrayListOf("1. Sally Milagrosa", "2. Leonardo Lopez", "3. Anacorita Omega")
    var courses: String = "BSCS, BSCE, BSIT"


    println("ADMIN LOGIN")
    println("============")
    print("Username: ")
    var username: String = readln().uppercase()
    var user = "Sally"
    username = user

    print("Password: ")
    var password:String = readln().lowercase()
    var userpassword = "sally123"
    password = userpassword


    if ((username == user)&&(password == userpassword)) {
        println("==========================================================")
        println("==========================================================")
        println("Directory of Students:")
        println("----------------------------------------------------------")
        println(bscenames[0])
        println("Enrolled SY: 2022-2023, Birthdate: October 11, 1990")
        println("First Grading: 85, Second Grading 86")
        var averagegrade6: Int = 85

        if (averagegrade6 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }
        println()
        println(bscenames[1])
        println("Enrolled SY: 2022-2023, Birthdate: February 19, 1991")
        println("First Grading: 88, Second Grading 90")
        var averagegrade7: Int = 89

        if (averagegrade7 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }
        println()
        println(bscenames[2])
        println("Enrolled SY: 2022-2023, Birthdate: October 21, 1989")
        println("First Grading: 85, Second Grarding: 87")
        var averagegrade8: Int = 86

        if (averagegrade8 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println("==========================================================")
        println(bscsnames[0])
        println("Enrolled SY: 2022-2023, Birthdate: January 3, 1990")
        println("First Grading: 89, Second Grading: 91")
        var averagegrade: Int = 90


        if (averagegrade >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println()
        println(bscsnames[1])
        println("Enrolled SY: 2022-2023, Birthdate: December 25, 1991")
        var averagegrade1: Int = 91
        println("First Grading: 91, Second Grading: 92")

        if (averagegrade1 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println()
        println(bscsnames[2])
        println("Enrolled SY: 2022-2023, Birthdate: September 8, 1988")
        println("First Grading: 89, Second Grading: 95")
        var averagegrade2: Int = 92


        if (averagegrade2 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println("==========================================================")
        println(bsitnames[0])
        println("Enrolled SY: 2022-2023, Birthdate: December 12, 1990")
        println("First Grading: 95, Second Grading: 90")
        var averagegrade3: Int = 92

        if (averagegrade3 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println()
        println(bsitnames[1])
        println("Enrolled SY: 2022-2023, Birthdate: January 3, 1991")
        println("First Grading: 85, Second Grading: 90")
        var averagegrade4: Int = 87


        if (averagegrade4 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println()
        println(bsitnames[2])
        println("Enrolled SY: 2022-2023, Birthdate: October 13, 1994")
        println("First Grading: 88, Second Grading: 89")
        var averagegrade5: Int = 88


        if (averagegrade5 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        readLine()
        println("==========================================================")
        println(courses)
        print("Select Course to check the list of Students Enrolled:")
        var course: String = readln().uppercase()

        if (course == "BSCS") {
            println(bscenames)

        }
        else if (course == "BSCE") {
            println(bscenames)

        }
        else //if (course == "BSIT")
        {
            println(bsitnames)
        }
    }
}

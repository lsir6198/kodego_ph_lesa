//Activity 02 - D
//Implement Activity 02 - A(Implementation of Activity 01 -  A) using Classes.

fun main(){

    var studentCourse = DirectoryofStudents().courses
    var bscsStudents = DirectoryofStudents().bscsNames
    var bsceStudents = DirectoryofStudents().bsceNames
    var bsitStudents = DirectoryofStudents().bsitNames

    println("ADMIN LOGIN")
    println("============")
    print("Username: ")
    var userName: String = readln().uppercase()
    var user = "Sally"
    userName = user

    print("Password: ")
    var password:String = readln().lowercase()
    var userPassword = "sally123"
    password = userPassword

    if ((userName == user)&&(password == userPassword)) {
        DirectoryofStudents().directory()
    }

    println("==========================================================")
    println("Available Courses: $studentCourse")
    print("Select the Course to check the list of Students Enrolled: ")
    var course: String = readln().uppercase()

    if (course == "BSCS") {
        println(bscsStudents)

    }
    else if (course == "BSCE") {
        println(bsceStudents)

    }
    else //if (course == "BSIT")
    {
       println(bsitStudents)
    }
}

class DirectoryofStudents{
    var bscsNames = arrayListOf("1. Lesa Siroy", "2. Asel Omega", "3. Lei Zah")
    var bsceNames = arrayListOf("1. Marc Quinn", "2. Lyan Keem", "3. Ryan Neil")
    var bsitNames = arrayListOf("1. Sally Milagrosa", "2. Leonardo Lopez", "3. Anacorita Omega")
    var courses: String = "BSCS, BSCE, BSIT"

    init {
        println("=============================================")
        println("UNIVERSITY OF SKOLAR STUDENT DIRECTORY SYSTEM")
    }

    fun directory(){
        println("==========================================================")
        println("Directory of Students:")
        println("==========================================================")
        println(bsceNames[0])
        println("Enrolled SY: 2022-2023, Birthdate: October 11, 1990")
        println("First Grading: 85, Second Grading 86")
        var averageGrade6: Int = 85

        if (averageGrade6 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }
        println()
        println(bsceNames[1])
        println("Enrolled SY: 2022-2023, Birthdate: February 19, 1991")
        println("First Grading: 88, Second Grading 90")
        var averageGrade7: Int = 89

        if (averageGrade7 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }
        println()
        println(bsceNames[2])
        println("Enrolled SY: 2022-2023, Birthdate: October 21, 1989")
        println("First Grading: 85, Second Grarding: 87")
        var averageGrade8: Int = 86

        if (averageGrade8 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println("==========================================================")
        println(bscsNames[0])
        println("Enrolled SY: 2022-2023, Birthdate: January 3, 1990")
        println("First Grading: 89, Second Grading: 91")
        var averageGrade: Int = 90


        if (averageGrade >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println()
        println(bscsNames[1])
        println("Enrolled SY: 2022-2023, Birthdate: December 25, 1991")
        println("First Grading: 91, Second Grading: 92")
        var averageGrade1: Int = 91

        if (averageGrade1 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println()
        println(bscsNames[2])
        println("Enrolled SY: 2022-2023, Birthdate: September 8, 1988")
        println("First Grading: 89, Second Grading: 95")
        var averageGrade2: Int = 92


        if (averageGrade2 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println("==========================================================")
        println(bsitNames[0])
        println("Enrolled SY: 2022-2023, Birthdate: December 12, 1990")
        println("First Grading: 95, Second Grading: 90")
        var averageGrade3: Int = 92

        if (averageGrade3 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println()
        println(bsitNames[1])
        println("Enrolled SY: 2022-2023, Birthdate: January 3, 1991")
        println("First Grading: 85, Second Grading: 90")
        var averageGrade4: Int = 87


        if (averageGrade4 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

        println()
        println(bsitNames[2])
        println("Enrolled SY: 2022-2023, Birthdate: October 13, 1994")
        println("First Grading: 88, Second Grading: 89")
        var averageGrade5: Int = 88


        if (averageGrade5 >= 75) {
            println("Passed")
        } else {
            println("Failed")
        }

    }
}

/*
Note: Names are single word with no spaces example, "Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry".
1. Create an ArrayList of names with 20 entries.
2. Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.
3. Create a function "addStudent" that will accept a name and add it to the ArrayList.
4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
5. Create a function "countStudent" that will return the size of the ArrayList.
6. Create a function "searchStudentWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of names that matched if there are.
7. Create a function  "searchStudentName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of names that matched if there are.
8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.
9.  Create a function "showStudents" that will print all the entries in the ArrayList.*/

fun main(){

    var toDoList = mapOf(1 to "1. CHECK STUDENT RECORD", 2 to "2. ADD STUDENT", 3 to "3. REMOVE STUDENT", 4 to "4. COUNT STUDENT", 5 to "5. SEARCH STUDENT")

    println("ADMIN LOGIN. ENTER YOUR CREDENTIALS")
    println("*************************************")
    studentRecordsToDoList().loginCredentials()
    print("Press enter to continue")
    readLine()
    println("======================================")
    println(toDoList[1])
    println(toDoList[2])
    println(toDoList[3])
    println(toDoList[4])
    println(toDoList[5])

    print("Selection option from 1 to 5 to continue:")
    var option: Int = readln().toInt()

    if (option == 1){
        studentRecordsToDoList().isStudentRecord()
    }
    else if (option == 2){
        studentRecordsToDoList().addStudent()
    }
    else if (option == 3){
        studentRecordsToDoList().removeStudent()
    }
    else if (option == 4){
        studentRecordsToDoList().countStudent()
    }
    else if (option == 5){
        studentRecordsToDoList().searchStudent()
    }
    else{
        println("not an option")
        println(toDoList)
        return studentRecordsToDoList().loginCredentials()
    }


}

class studentRecordsToDoList{

    var listOfNames = arrayListOf("REILEIGH","LESA","ASEL","MARC","RYAN","LYAN","LEI","DYLAN","JAMES","RONAN","AZRIEL","KHRYZA","VIA","SALLY","LEONARDO","ROY","RONALYN","JILLIAN","JOEL","RHONJOEL")
    var studentName = ""

    init {
        println("SCHOOL MONITORING SYSTEM")
        println("========================")
    }
    fun isStudentRecord(){
        print("STUDENT NAME: ")
        var studentName = readln().uppercase()
        if (listOfNames.contains(studentName)){
            println("Student Name found on our record, $listOfNames")

        }else{
            println("Name is not on the record!!!")
            println("Do you want to add the Student Name?")
            var answer = readln().lowercase()
            if (answer == "yes"){
                addStudent()
            }else{
                loginCredentials()
            }
        }
    }

    fun addStudent(){
        println("ADD STUDENT")
        println("============")
        print("STUDENT NAME: ")
        var addStudents = readln().uppercase()
        listOfNames.add(addStudents)
        println(listOfNames)
        loginCredentials()
    }

    fun removeStudent(){
        println("REMOVE STUDENT")
        println("===============")
        print("STUDENT NAME: ")
        var removename = readln().uppercase()
        if (listOfNames.contains(removename)){
            listOfNames.remove(removename)
            println(listOfNames)
            loginCredentials()
        }else{
            println("STUDENT NAME NOT ON OUR RECORD!!!")
            loginCredentials()
        }

    }

    fun countStudent(){
        println("COUNT NUMBER OF STUDENTS ON THE LIST")
        println("====================================")
        print("NUMBER OF STUDENTS: ")
        println(listOfNames.size)
        loginCredentials()
    }

    fun searchStudentWildSearch(){
        if (listOfNames.contains(studentName)){
            println("FOUND!!!")
            println("STUDENT LIST:")
            println(listOfNames)
        }else{
            println("FAILED")
        }
        return loginCredentials()
    }

    fun searchStudentName(){
        if (listOfNames.contains(studentName)){
            println("Student Name on the list, $listOfNames")
        }else{
            println("No Student Record Found!!!")
        }
        return loginCredentials()
    }

    fun searchStudent(){
        println("SEARCH")
        print("STUDENT NAME: ")
        studentName = readln().uppercase()

        if (studentName.length <= 3){
            searchStudentWildSearch()
        }else{
            searchStudentName()
        }
    }

    fun showStudents(){
        println(listOfNames)
    }

    fun loginCredentials(){
        print("Username: ")
        var userName = readln().lowercase()

        if (userName == "teacher") {

            print("Password: ")
            var password = readln().lowercase()

            if (password == "teacher123") {
                println("LIST OF STUDENTS:")
                showStudents()
            }else{
                println("Username and Password didn't match!!! Try Again")
                loginCredentials()
            }
        }else{
            println("Username didn't match our records!!!")
            loginCredentials()
        }
    }
}


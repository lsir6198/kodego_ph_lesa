//Activity 03 - A
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F

fun main () {
//Create an application that will accept 2 string inputs.
// Your application will print all unique characters in both Strings.

    print("Enter your Name:")
    var name = readln().lowercase()

    try{
        if (name.isEmpty()){
            throw Exception()
        }
        println("Name is $name")

    }catch (e:Exception){
        println("Please enter a valid input")
    }


    print("Enter your Occupation:")
    var occupation = readln().lowercase()

    try {
        if (occupation.isEmpty()) {
            throw Exception()
        }
        println("Occupation is $occupation")

        var setA = mutableSetOf<Char>()
        var setB = mutableSetOf<Char>()

        for (char in name) {
            setA.add(char)
        }
        println("The unique letters in set A is ${setA.minus((setB))}")

        for (char in occupation) {
            setB.add(char)
        }
        println("The unique letters in set B is ${setB.minus(setA)}")

        println(setA.union(setB))
        print("Intersecting letters: ")
        println(setA.intersect(setB))

    }catch (e:Exception){
        println(e)
        println("Not a valid input")
    }
}

fun main () {

//Create an application that will accept 2 string inputs.
// Your application will print all unique characters in both Strings.

    print("Enter your Name:")
    var name = readln().lowercase()

    println("Name is $name")


    print("Enter your Occupation:")
    var occupation = readln().lowercase()

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
}
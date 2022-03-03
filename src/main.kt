// string interpolation

fun main(){
    var dayOfWeek = "Thursday"
    var stmt = "Today is $dayOfWeek "

//    println(stmt +" "+dayOfWeek)
    println(stmt)
    println()

// Invoking the function
    myVariable("Mary")
    myYear()
    case2()
    dot()
    black()
    reverseCase("mercy")
    start()
    replacement()
    split()
    printName("","")

var pin = years(1998,22)
    println(pin)


}

// create a function that takes in a name and print out " Hello, $name"
fun myVariable(name:String){

    var stmt2 = "Hello, $name"
    println(stmt2)
}
// String Comparison
fun myYear(){
   var name = "Jane"
    var name2 = "jane"
    println(name == name2)
    var name3= "Jane"
    var name4 = "Jane"
    println(name3.equals(name4))


}
// String Case
fun case2(){
    var name5 =  "jane"
    var name6 = "Maven"
    println(name5.capitalize())
    println(name5.decapitalize())
    println(name5.uppercase())
    println(name6.lowercase())
}

//  lets talk about Blank ()
fun dot(){
    var x = ""
    var y = " "
    println(x.isEmpty()) // true
    println(x.isBlank()) //true
    println(y.isEmpty())  //false
    println(x.isBlank())  // true


}

fun black(){
    var name7 = " Mary Waiguru "
    println(name7)
    println(name7.trim())
    println(name7.trimStart())
    println(name7.trimEnd())
    println(name7.replace(" ",""))

}

fun reverseCase(name: String){
    if (name.equals("Lovelace")){
        println(name.uppercase())
    }else{
        println(name.lowercase())
    }

}
// String startWith() and end
fun start(){
    var city = "Chicago"
    // does it start with "Chi" === true
    println(city.startsWith("c")) // false
    println(city.endsWith("ogo")) // true

}

fun replacement(){
    var stmt = "Nairobi is a big city"
    println(stmt.replace("Nairobi", "Kigali"))
    println(stmt.replace("i", "y"))
    println(stmt.replace("i", "y").replace("a", "e"))


}


// Spliting a statement
/// what slip the words is called delimiter
fun split(){
    var stmt = "Nairobi is a big city"
    var word =stmt.split(" ")

    println(word)
    println(word[0])
    println(word[0].length)// the character of Nairobi is 7

    var char =stmt.split("")
    println(char)

    var chars = word[0].split("r")
    println(chars)
    println(chars.size)  // empty string before and after for it to be 9 character


}
fun printName(fName:String, sName:String){
    var name = "$fName $sName"
}
// toString inbuilt function
fun toString(){
    var weight = 52.5
    var state = "My current weight is" + weight.toString()
    println()

}
// Creating a function that has two numbers; year of birth and age
// concatenating them to form a PIN

fun years(year: Int, age: Int):String {
    var total = year.toString() + age
    return total

}
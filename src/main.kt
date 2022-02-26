fun main() {
  var school = "akirachix"
    var char1 = school[0]
    var char3 = school[2]
    var char4 = school[3]
    var stmt = "$char1$char3$char4"
    println(stmt)
    var nage =info("Rose",23)
    println(nage)
    line("Kotlin is the best programming language")
    call("Mercy")
}
fun info (x: String,y: Int): String{
    var personal = "Hi my name is $x and I am $y years old"
    return personal
}
fun line (j: String): String{
    var statement = "The length is " +j.length
    println(statement)
    return statement
}
fun call (name: String){
    var myName = "Rose"
    var myName1 ="Mercy"
    if(myName==myName1){
       println("That's me!")
}
    else{
        println("I don't know who that is")
    }
}

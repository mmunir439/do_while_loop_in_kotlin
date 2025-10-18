//do while loop. it will executes once before checking the condition.
// then it executes untill the condition will be true in here

fun dowhile(){
    var x=1;
    do{
        x++;
        println("what is your name?")
        var name=readLine()!!;
        println("what is your age?")
        var age=readLine()!!.toInt();
        println("what is your current semester now?")
        var semester=readLine()!!.toInt();
        println("which city you belong?")
        var city=readLine()!!;
        println("what is your degree name?")
        var degename=readLine()!!;
        println("My name is ${name}")
        println("I am doing  ${degename}")
        println("I am from $city");
        println("I am in $semester semester")
        println("and I am $age years old")
    }while(x<3)
}
fun main(){
    dowhile();
}
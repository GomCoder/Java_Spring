package chap03

fun prompt(name: String) {
    println("***** Hello, $name! *****")
}

fun prompt2(name: String): Unit {
    println("***** Hello, $name! *****")
}

fun main(){
    prompt("kim")
    prompt2("park")
}
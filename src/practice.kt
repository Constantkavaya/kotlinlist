import kotlin.reflect.jvm.internal.ReflectProperties

fun main(){
    mutableListOf<String>()
   var mutableList1= mutableListOf("mango","orange","bananas")
    mutableList1.add("apple")
    mutableList1.add("guavas")
    for (element in mutableList1){
        println(element)

    }
    mutableListOf<Int>()
    var mutableList2= mutableListOf(80,90)
    mutableList2.add(12)
    mutableList2.add(7)
    for (element in mutableList2){
        println(element)
    }
    var mutableListAny = mutableListOf<Any>()
    mutableListAny.add(2001)
    mutableListAny.add("dress")
    mutableListAny.add("buldings")
    for(characters in mutableListAny)
        println(characters)
    var combine=mutableList1.plus(mutableList2).plus(mutableListAny)
    println(combine)
    var human=doctor("Abunwasi","centi")
var  humans=farmer("john","twatwa")

//Immutable Lists
val classes = listOf("AnitaB", "Lisalab", "Lovelace")
    println(classes)



}
//  data class Product(val name:String,var weight:Float,var price:Int){
//     var product= ListOf(
//      Product("OMO",59.2F,700)
//
//     )
//
//}


open class Person( talk:String){
    var talk="words"

}
class farmer(name:String, dig:String):Person(talk="words"){

    var name="john"
    var dig="twatwa"
}
 class doctor(name:String,needle:String):Person(talk = "words"){
     var name="Abunwasi"
     var needle="shhhhhhhhh!"
     
}







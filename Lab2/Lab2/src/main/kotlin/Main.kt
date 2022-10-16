import java.io.File
import java.util.StringJoiner
import kotlin.io.path.Path


fun String.Monogram(): String = split(" ").map {it.first()}.joinToString("")
fun MutableList<String>.joinByGivenSeparator(separator: String): String = this.joinToString { "$separator" }


fun main() {

    //val dict: IDictionary = ListDictionary
    /*val dict: IDictionary = DictionaryProvider.createDictionary(DictionaryType.ARRAY_LIST)

    println("Number of words: ${dict.size()}")
    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.find(it) }}")
    }
    val name = "John Smith"
    val list = mutableListOf<String>("apple", "pear", "melon");
    println(list.joinByGivenSeparator("#"))
    println(name.Monogram())
    */
    val date1 = Date(2000,5,5)
    val date2 = Date(2020,5,5)
    println(date1.IsLeapYear())

    val dateList = mutableListOf<Date>()

    while(dateList.size < 10){
        val randYear = (-1000..3000).random()
        val randMonth = (-100..100).random()
        val randDay = (-50..50).random()
        val date = Date(randYear,randMonth, randDay)

        if(date.IsValid()){
            dateList.add(date)
        }else{
            println(date)
        }

    }

    println("#########################################################################")

    dateList.forEach{ println(it) }
    dateList.sort()
    println("Sorted list: ")
    dateList.forEach{ println(it) }
    dateList.sortDescending()
    println("Reverse sorted list: ")
    dateList.forEach{ println(it) }



}
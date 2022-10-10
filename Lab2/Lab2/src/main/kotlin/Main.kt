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
    }*/
    val name = "John Smith"
    val list = mutableListOf<String>("apple", "pear", "melon");
    println(list.joinByGivenSeparator("#"))
    println(name.Monogram())
    println()


}
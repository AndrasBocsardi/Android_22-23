interface IDictionary {
    fun add(word : String) : Boolean
    fun find(word : String) : Boolean
    fun size() : Int

    companion object{
        var PATH = "C:\\Egyetem\\Android\\Android_22-23\\Lab2\\text.txt"
    }
}
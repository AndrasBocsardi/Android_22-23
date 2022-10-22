class ItemRepository {

    val items = mutableListOf<Item>()

    constructor()

    fun save(item: Item){
        items.add(item)
    }

    fun size() : Int = items.size

    fun randomItem() : Item = this.items[(0..this.size() ).random()]

    fun createItem(question: String, answers: List<String>, correct: Int): Item = Item(question, answers, correct)

}
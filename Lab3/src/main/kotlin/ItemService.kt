class ItemService(val ItemRepository: ItemRepository) {

    fun selectRandomItems(numItems: Int) :List<Item> = ItemRepository.items.shuffled().take(numItems)
}
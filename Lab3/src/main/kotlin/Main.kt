fun main() {
    val ir1 = ItemRepository()

    val i1 = ir1.createItem("1 a helyes valasz?", listOf("1","2","3","4"), 1)
    ir1.save(i1)

    val i2 = ir1.createItem("2 a helyes valasz?", listOf("1","2","3","4"), 2)
    ir1.save(i2)

    val i3 = ir1.createItem("3 a helyes valasz?", listOf("1","2","3","4"), 3)
    ir1.save(i3)

    val i4 = ir1.createItem("4 a helyes valasz?", listOf("1","2","3","4"), 4)
    ir1.save(i4)

    val is1 = ItemService(ir1)
    val ic1 = ItemController(is1)
    ic1.quiz(3)

}
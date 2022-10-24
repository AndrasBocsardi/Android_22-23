fun main() {
    val ir1 = ItemRepository()

    val i1 = ir1.createItem("What is the difference between val and var in Kotlin?",
                            listOf( "Variables declared with var are final, those with val are not.",
                                    "Variables declared with val are final, those with var are not.",
                                    "Variables declared with val can only access const members."), 2)
    ir1.save(i1)

    val i2 = ir1.createItem("What is to in the example below: val test = 33 to 42",
                            listOf( "An infix extension function creating Pair(33, 42)",
                                    "A syntax error",
                                    "A Kotlin keyword to create a Range from 33 to 42",
                                    "A Kotlin keyword to create a Pair(33, 42)"), 1)
    ir1.save(i2)

    val i3 = ir1.createItem("Which of these targets does Kotlin currently not support?",
                            listOf( "LLVM",
                                    ".NET CLR",
                                    "JavaScript",
                                    "JVM"), 2)
    ir1.save(i3)

    val i4 = ir1.createItem("What is the correct way to declare a variable of integer type in Kotlin?",
                            listOf( "let i = 42",
                                    "var i: Int = 42",
                                    "var i: int = 42",
                                    "int i = 42"), 2)
    ir1.save(i4)

    val i5 = ir1.createItem("Válaszd ki a helyes kódrészleteket!",
                            listOf( "fun foo( c: Char ) = c !in '0' .. '9'",
                                    "for( i in 1..9) { print(i) }",
                                    "un foo(c: Char) = c !in 0..9",
                                    "println( \"Kotlin\" in setOf(\"Java\", \"Scala\"))"), 2)
    ir1.save(i5)

    val i6 = ir1.createItem("Which is a valid function declaration in Kotlin?",
                            listOf( "int sum(a: Int, b: Int)",
                                    "fun sum(a: Int, b: Int): Int",
                                    "int sum(int a, int b)",
                                    "function sum(a: Int, b: Int): Int"), 2)
    ir1.save(i6)

    val i7 = ir1.createItem("Adott a következő függvény:\n" +
            "\n" +
            "fun String.lastChar() = get( length - 1 )\n" +
            "\n" +
            "Válaszd ki a helyes függvényhívásokat!",
                            listOf( "lastChar(\"abc\")",
                                    "val a = \"alma\"\n"+
                                    "a.lastChar()",
                                    "\"abc\".lastChar()"), 3)
    ir1.save(i7)

    val i8 = ir1.createItem("Which of the following methods is called in an Activity when another activity gets into the foreground? ",
                            listOf( "onStop()",
                                    "onExit()",
                                    "onPause()",
                                    "onDestroy()"), 3)
    ir1.save(i8)

    val i9 = ir1.createItem("Which of the following is not an Activity lifecycle call-back method? ",
                            listOf( "onBackPressed",
                                    "onStart",
                                    "onCreate",
                                    "onPause"), 1)
    ir1.save(i9)

    val i10 = ir1.createItem("Which metod is used to close an activity?",
                            listOf( "finish()",
                                    "destroy()",
                                    "close()",
                                    "stop()"), 1)
    ir1.save(i10)



    val is1 = ItemService(ir1)
    val ic1 = ItemController(is1)
    ic1.quiz(5)

}
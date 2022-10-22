class ItemController(val ItemService: ItemService) {

    fun performQuestion(item: Item): Boolean{
        println("Q: ${item.question}")
        item.answesrs.forEach{println("-$it")}
        print("Enter the number of your answer: ")
        val answerInput = readln()
        return answerInput.toInt() == item.correct
    }

    fun quiz(numQuestions: Int){
        var numCorrectAnswers: Int = 0

        for (item in ItemService.selectRandomItems(numQuestions)){
            if(performQuestion(item)){
                numCorrectAnswers++
            }
        }

        println("Result: $numCorrectAnswers/$numQuestions")
    }


}
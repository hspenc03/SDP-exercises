object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val re = Regex("[^A-Za-z0-9,'\" ]")
        var editedPhrase = re.replace(phrase, "")
        editedPhrase = editedPhrase.replace(" '", " ")
        println(editedPhrase)
        editedPhrase = editedPhrase.replace(" ,", " ")
        editedPhrase = editedPhrase.replace(", ", " ")
        editedPhrase = editedPhrase.replace(",", " ")
        println(editedPhrase)
        editedPhrase = editedPhrase.replace("' ", " ")

        val list = editedPhrase.toLowerCase().split(" ")
        println(list)
        val map = HashMap<String, Int>()

        for(word in list) {
            if (map.containsKey(word)) {
                var count = map.getValue(word)
                count++
                map.set(word, count)
            } else {
                map.put(word, 1)
                println("not in map")
            }
            println(map)
        }

        return map
    }

}
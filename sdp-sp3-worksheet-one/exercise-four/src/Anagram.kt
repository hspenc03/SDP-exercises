class Anagram(private val word: String) {

    fun match(anagrams: Collection<String>): Set<String> {

       // val letters = word.toLowerCase().split("")
        var letters = mutableListOf<String>()
        var test = word.toLowerCase().split("")
        for (letter in test) {
            letters.add(letter)
        }
        var resultList = mutableSetOf<String>()
        var lettersmatch = false;
        for (phrase in anagrams) {
            var newLetters = mutableListOf<String>()
            for (letter in letters)
                newLetters.add(letter)
            var anaLetters = phrase.toLowerCase().split("");
            if (anaLetters.size == letters.size) {
                for (letter in anaLetters) {
                    if (newLetters.contains(letter)) {
                        newLetters.remove(letter)
                        lettersmatch = true;
                    } else {
                        lettersmatch = false;
                        break
                    }
                }
                if (anaLetters.equals(letters)) {
                    lettersmatch = false
                }
                if (lettersmatch == true) {
                    resultList.add(phrase)
                }
            }
        }
        return resultList
    }
}
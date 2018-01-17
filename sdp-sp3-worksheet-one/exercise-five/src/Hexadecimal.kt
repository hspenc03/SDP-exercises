object Hexadecimal {

    fun toDecimal(s: String): Int {
        val characters = s.split("")
        var result = "";
        var valid = true
        for(char in characters) {
           when (char) {
               "1" -> result += "0001"
               "2" -> result += "0010"
               "3" -> result += "0011"
               "4" -> result += "0100"
               "5" -> result += "0101"
               "6" -> result += "0110"
               "7" -> result += "0111"
               "8" -> result += "1000"
               "9" -> result += "1001"
               "A", "a" -> result += "1010"
               "B", "b" -> result += "1011"
               "C", "c" -> result += "1100"
               "D", "d" -> result += "1101"
               "E", "e" -> result += "1110"
               "F", "f" -> result += "1111"
               "" -> result += ""
               "0" -> result += "0000"
               else -> valid = false
           }

        }

        if (!valid) {
            result = "0"
        }
        val reversed = result.split("").reversed().joinToString("")
        var multiplier = 1
        var decimal = 0
        for(num in reversed) {
            if (num.equals('1')) {
                decimal += multiplier
            }
            multiplier = multiplier * 2
        }
        return decimal
    }
}
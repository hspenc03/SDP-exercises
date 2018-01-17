object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        var result = 0
        for (num in 1..limit-1) {
            println("num = $num")
            var alreadyAdded = false;
            for (i in factors.indices) {
                var divisor = factors.elementAt(i)
                println("divisor: $divisor")
                if(num % divisor == 0 && alreadyAdded == false) {
                   result += num
                    alreadyAdded = true;
                }
                //if both of them divide into it, make it so num only gets added once
                println("result: $result")
            }
        }

        return result
    }
}
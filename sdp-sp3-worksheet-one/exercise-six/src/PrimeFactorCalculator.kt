object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        var n = int
        var factors = mutableListOf<Int>()
        for (i in 2..n) {
            while(n % i == 0) {
                factors.add(i)
                n/=i
            }
        }
        return factors
    }

    fun primeFactors(long: Long): List<Long> {
        var n = long
        var factors = mutableListOf<Long>()
        for (i in 2..n) {
            while(n % i == 0L) {
                factors.add(i)
                n/=i
            }
        }
        return factors
    }
}

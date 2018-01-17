object PascalsTriangle {

    fun computeTriangle(rows: Int): List<List<Int>> {
        if (rows < 0) {
            throw IllegalArgumentException("Rows can't be negative!")
        }
        var triangleList = mutableListOf<List<Int>>()
        for (i in 0..rows-1) {
            var number = 1
            var miniList = mutableListOf<Int>()
            //System.out.printf("%" + (rows - i) * 2 + "s", "");
            for (j in 0..i) {
                miniList.add(number)
                //System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            triangleList.add(miniList)
        }
        return triangleList
    }
}
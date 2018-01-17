object Accumulate {
  fun <T, R> accumulate(collection: List<T>, function: (T) -> R): List<R> {
    val resultList = mutableListOf<R>()
    for (item in collection) {
      val result = function(item)
      resultList.add(result)
    }
    return resultList
  }
}

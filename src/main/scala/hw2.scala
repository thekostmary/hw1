object hw2 extends App {
  def sumOfDivBy3Or(iFrom: Int, iTo: Int): Long = {
    var summa = 0
    for (i <- iFrom to iTo) {
      if (i % 3 == 0 || i % 5 == 0) {
        summa = summa + i
      }

    }
    summa.toLong
  }
}

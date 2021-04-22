object hw1 extends App  {
  def div(iFrom: Int, iTo: Int): IndexedSeq[Int] = {
    for {i <- iFrom to iTo
         if i % 3 == 0 || i % 7 == 0
         } yield i
  }
}


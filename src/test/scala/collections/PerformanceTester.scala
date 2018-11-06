package collections

import collections.concrete.{ConcreteProduct_Double, ConcreteProduct_Int}
import collections.generic.{GenericProduct_FoldLeft, GenericProduct_For, GenericProduct_ForEach}

object PerformanceTester
{

  // first argument is the max list size to test
  // second argument is the size increment between each test
  def main(args:Array[String]):Unit=
  {
    val maxListSize = args(0).toInt
    val amountToIncrement = args(1).toInt

    // calculate a new list size for this round
    var listSize = amountToIncrement

    // check if we have reached the end of the test
    while (listSize <= maxListSize) {

      // test all combinations with this list size
      for (concrete <- Implementations.concretes) {
        for (generic <- Implementations.generics) {

          println("Testing " + generic._1 + " algorithm with " + concrete._1 + " type and list size of " + listSize)
          var list1 = concrete._2.getTestList(listSize)
          var list2 = concrete._2.getTestList(listSize)

          // print the amount of time taken to calculate this inner product
          timeTaken {concrete._2.innerProduct(list1, list2, generic._2)}
        }
      }

      // now increment the size of the lists for the next run
      listSize += amountToIncrement
    }

  }

  //See http://biercoff.com/easily-measuring-code-execution-time-in-scala/
  def timeTaken[R](block: => R):R=
  {
    val startTime = System.nanoTime()
    val result = block
    val endTime = System.nanoTime()

    println("Time taken was " + (endTime - startTime) + "nanoseconds")
    result
  }

}

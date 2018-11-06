package collections.concrete

import collections.generic.GenericProduct

import scala.util.Random
import scala.collection.immutable.Seq
import scala.collection.immutable.List
import scala.Int

// FIXME - this class SHOULD be used!
import scala.Int

class ConcreteProduct_Int[Int] extends ConcreteProduct[Int] {

  def innerProduct(list1:Seq[Int], list2:Seq[Int], implementation:GenericProduct): Int =
  {
    val map = (v1:Int,v2:Int) => {v1 * v2}
    val fold = (v1:Int,v2:Int) => (v1 + v2)

    implementation.innerProduct[Int](list1, list2, map, fold, 0)
  }

//  def getTestValue(): Int =
//  {
//    (Random.nextInt())
//  }

  def getTestList(size:Int):Seq[Int]=
  {
    // need implicit value for Integral in the context?
    // See: https://stackoverflow.com/questions/25248837/generic-method-with-cannot-resolve-symbol-errors-in-scala
    // And: https://docs.scala-lang.org/tutorials/FAQ/finding-implicits.html

    //List.range[Int](1, 10)
    //(1 to 10).toList.toSeq
    List(1, 2, 3, 4, 5)
  }
}

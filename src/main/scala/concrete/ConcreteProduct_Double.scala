package collections.concrete

import collections.generic.GenericProduct

import scala.collection.immutable.List
import scala.collection.immutable.Seq
import scala.Double
import scala.util.Random

class ConcreteProduct_Double[Double] extends ConcreteProduct[Double] {

  def innerProduct(list1:Seq[Double], list2:Seq[Double], implementation:GenericProduct): Double =
  {
    val map:(Double,Double) => Double = (v1, v2) => (v1 * v2)
    val fold:(Double,Double) => Double = (v1,v2) => (v1 + v2)

    implementation.innerProduct[Double](list1, list2, map, fold, 0.0)
  }

//  def getTestValue(): Double =
//  {
//    (Random.nextDouble())
//  }

  def getTestList(size:Double): List[Double] =
  {
    //Seq.newBuilder[Double].range(1.0, size)

     List(1.0, 2.0, 3.0, 4.0, 5.0)
  }

}

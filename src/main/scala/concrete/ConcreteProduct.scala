package collections.concrete

import collections.generic.GenericProduct
import scala.collection.immutable.Seq
import scala.Int

trait ConcreteProduct[T] extends Numeric[T] {

  def innerProduct(list1:Seq[T], list2:Seq[T], implementation:GenericProduct): T

//  def getTestValue(): T

  def getTestList(size:Int): Seq[T]

  // We need this to avoid a "value * is not a member of type parameter Double" error
  // https://stackoverflow.com/questions/29927125/scala-value-is-not-a-member-of-type-parameter?rq=1
  //def subtract(a: T, b: T): T
}

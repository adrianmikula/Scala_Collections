package collections.generic

// FIXME - this class SHOULD be used!
import scala.Int

class GenericProduct_For extends GenericProduct {

  def innerProduct[T](list1:Seq[T], list2:Seq[T], map:(T,T) => T, fold:(T,T) => T, zero: T):T=
  {
    assert (list1.length == list2.length)
    var currentTotal = zero

    for (i <- list1.size)
    {
      val mapResult = map (list1(i), list2(i))
      currentTotal = fold(currentTotal, mapResult)
    }
    (currentTotal)
  }

}

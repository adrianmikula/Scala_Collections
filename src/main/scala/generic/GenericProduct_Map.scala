package collections.generic

class GenericProduct_Map extends GenericProduct {

  def innerProduct[T](list1:Seq[T], list2:Seq[T], map:(T,T) => T, fold:(T,T) => T, zero: T):T=
  {
    assert (list1.length == list2.length)
    var currentTotal = zero

    (list1,list2).zipped.map((e1,e2) => {
      val mapResult = map (e1, e2)
      currentTotal = fold(currentTotal, mapResult)
    })

    (currentTotal)
  }

}

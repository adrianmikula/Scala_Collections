package collections

import collections.concrete.{ConcreteProduct_Double, ConcreteProduct_Int}
import collections.generic.{GenericProduct_FoldLeft, GenericProduct_For, GenericProduct_ForEach, GenericProduct_Map}

object Implementations
{

  val generics = Map(
    "foldLeft" -> new GenericProduct_FoldLeft(),
    "for" -> new GenericProduct_For(),
    "forEach" -> new GenericProduct_ForEach(),
    "map" -> new GenericProduct_Map()
  )

  val concretes = Map(
    "double" -> new ConcreteProduct_Double(),
    "int" -> new ConcreteProduct_Int()
  )

}

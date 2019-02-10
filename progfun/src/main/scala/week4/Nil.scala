package week4

object Nil extends week4.List[Nothing] {
  def isEmpty = true
  def head : Nothing = throw new NoSuchElementException("Nil.head")
  def tail : Nothing = throw new NoSuchElementException("Nil.tail")
}

object test {
  val x : List[String] = Nil
}
package week4

class Nil[T] extends week4.List[T] {
  def isEmpty = true
  def head : Nothing = throw new NoSuchElementException("Nil.head")
  def tail : Nothing = throw new NoSuchElementException("Nil.tail")
}
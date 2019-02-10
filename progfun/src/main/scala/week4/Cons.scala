package week4

class Cons[T](val head: T, val tail: List[T]) extends week4.List[T] {
  def isEmpty = false
}
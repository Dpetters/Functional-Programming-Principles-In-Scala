import week4._

object Test {

  def nth[T](n:Int, xs:List[T]): T = {
    if(n == 0)
      if(xs.isEmpty)
        throw new IndexOutOfBoundsException()
      else
        xs.head
    else
      nth(n-1, xs.tail)
  }

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  println(nth(2, list))
  println(nth(-1, list))

  println("Hello World")
}

Test
import scala.annotation.tailrec

object test {
  def sum (f:Int=>Int)(a:Int, b:Int): Int = {
      if(a > b) 0 else f(a) + sum(f)(a+1, b)
  }

  def product(f: Int=>Int)(a:Int, b:Int):Int = mapReduce(1, (x,y)=>x*y, f)(a,b)

  def factorial(n:Int): Int =
    product(x=>x)(1, n)

  def mapReduce(zero:Int, combine:(Int, Int)=>Int, f: Int=>Int)(a:Int, b:Int):Int =
    if (a>b) zero else combine(f(a), mapReduce(zero, combine, f)(a+1, b))

  def averageDamp(f:Double => Double, x:Double) = (f(x)+x)/2
  
  product(x=>x*x)(3,5)
}

test
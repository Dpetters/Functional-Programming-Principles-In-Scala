import scala.annotation.tailrec

object Test {
  def abs(x: Double) = if (x < 0) -x else x
  def sqrt(x : Double) : Double = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }

  def factorial(x : Int) : Int = {
    @tailrec
    def factorialIter(y: Int, v: Int): Int =
      if (y == 0) v else factorialIter(y - 1, v * y)

    factorialIter(x, 1)
  }

  println(factorial(6))
}

Test
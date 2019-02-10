package week3

object rationals {
  class Rational(x:Int, y:Int) {
    require(y != 0, "denominator must be nonzero")

    def this(x: Int) = this(x, 1)

    private def gcd(a: Int, b:Int): Int = if(b==0) a else gcd(b, a%b)
    private val g = gcd(x,y)
    def numer = x/g
    def denom = y/g
    def add(that: Rational) : Rational =
      new Rational(numer*that.denom+that.numer*denom, denom*that.denom)

    def neg : Rational = new Rational(-numer, denom)

    def sub(that: Rational) = add(that.neg)

    def less(that:Rational) = this.numer * that.denom > that.numer * this. denom

    override def toString():String = this.numer + "/" + this.denom
  }

  val x = new Rational(1,3)
  val y = new Rational(5,7)
  val z = new Rational(3,2)
  println(x.numer)
  println(x.denom)
  println(x.sub(y).sub(z))
  println(x.sub(y).sub(z))
  println(y.add(y))
  println(x.less(y))
  val strange = new Rational(2)
  println(strange.add(strange))
}

rationals
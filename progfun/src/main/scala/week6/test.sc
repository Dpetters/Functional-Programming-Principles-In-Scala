
val xs = Array(1, 2, 3, 44)
xs map (x => x * 2)

val s = "Hello World"
s filter (c => c.isUpper)
s filter (c => c.isUpper)
def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
val n = 7
val xss = (1 until n) flatMap (i => (1 until i) map (j => (j, i))) filter(pair => isPrime(pair._1 + pair._2))

def scalarProduct(
    xs: List[Double],
    ys: List[Double]
) : Double = {
  val s = for {
    (x,y) <- xs zip ys
  } yield x*y
  s.sum
}

scalarProduct(List(1,2,3), List(2,3,4))

for {
  x <- 1 to 10;
  y <- 1 to 5
} yield(x,y)

val a = Array("apple", "banana", "cherry")
a.mkString(", ")

val x = List(1,2,3,6)

x foldLeft(0)(_+_)
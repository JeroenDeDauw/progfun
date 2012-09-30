object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1 + 2                                           //> res0: Int(3) = 3

  def abs(x: Double): Double = if (x < 0) -x else x
                                                  //> abs: (x: Double)Double
  def squareRoot(x: Double): Double = {

    def squareIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else squareIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    squareIter(1)

  }                                               //> squareRoot: (x: Double)Double

  squareRoot(2)                                   //> res1: Double = 1.4142156862745097
  squareRoot(4)                                   //> res2: Double = 2.000609756097561
  squareRoot(1e-6)                                //> res3: Double = 0.0010000001533016628
}
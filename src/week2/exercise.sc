object exercise {
  def factorial(n: Int): Int = {
  	def loop(product: Int, n: Int): Int =
	  	if (n == 0) product
	  	else loop(product * n, n -1)
  	loop(1, n)
  }                                               //> factorial: (n: Int)Int
 
  factorial(4)                                    //> res0: Int = 24
}
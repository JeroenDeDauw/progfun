object Currying {
 
  def rangeReduce(f: (Int, Int) => Int )(lowerBound: Int, upperBound: Int, initial: Int): Int =
 	  if (lowerBound > upperBound) initial
 	  else rangeReduce(f)(lowerBound +1, upperBound, f(initial, lowerBound))
                                                  //> rangeReduce: (f: (Int, Int) => Int)(lowerBound: Int, upperBound: Int, initia
                                                  //| l: Int)Int

  def product(a: Int, b: Int): Int = a * b        //> product: (a: Int, b: Int)Int
  def sum(a: Int, b: Int): Int = a + b            //> sum: (a: Int, b: Int)Int
 
  def rangeProduct(f: Int => Int)(lowerBound: Int, upperBound: Int): Int =
    rangeReduce(product)(lowerBound, upperBound, 1)
                                                  //> rangeProduct: (f: Int => Int)(lowerBound: Int, upperBound: Int)Int
 
  def factorial(n: Int): Int = rangeProduct(x => x)(1, n)
                                                  //> factorial: (n: Int)Int
   
  factorial(1)                                    //> res0: Int = 1
  factorial(2)                                    //> res1: Int = 2
  factorial(3)                                    //> res2: Int = 6
  factorial(4)                                    //> res3: Int = 24
 
}
object tailRecursiveSum {

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) return acc
      else loop(a + 1, acc + a)
    }
    loop(a, 0)
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int

  def self(n: Int): Int = n                       //> self: (n: Int)Int
  
  self(42)                                        //> res0: Int = 42
  
  sum(self, 1, 4)                                 //> res1: Int = 10
  
}
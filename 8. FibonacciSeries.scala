//Program to print sum of Fibonacci Series using recursion

def fibonacci (n : Int) : Int = {
  if (n<3)
  return 1
  else 
  return (fibonacci (n-1) + fibonacci (n-2))
}

//Output fibonacci: (n:Int)Int

fibonacci (7)
//Output res2: Int = 13
 

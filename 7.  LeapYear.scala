//Program using function to check whether an year is leap year or not

def leapyear (yea : Int) : Boolean = {
  if (yea%400 == 0) 
  return true
  else if (yea%100 == 0)
  return false
  else if (yea%4 == 0)
  return true
  else 
  return false
}
//Output leapyear: (yea : Int)Boolean

leapyear (2016)
//Output res0 : Boolean = true

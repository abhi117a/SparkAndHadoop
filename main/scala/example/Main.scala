package example

object Main extends App {
  val ages = Seq(42, 75, 99, 64)
  println(s"The oldest person is ${ages.max}")

  def sum(lb: Int, ub: Int) ={
    var total = 0
    for (element <- lb to ub){
      total += element
    }
    println(total)
  }

  def sum1(func1: Int => Int, lb: Int, ub: Int) ={

    var total = 0
    for(element <- lb to ub){
      total += func1(element)
    }
    println(total)
  }

  def Square( funcCheck: Int => Boolean, value: Int) = {
    if(funcCheck(value)) {
      var finalVal = value * value;
      println(finalVal)
    }
    else {
      println("Value is 0 or Negative")
    }
  }

  def funcCheck(valu: Int): Boolean ={
  if(valu <= 0){
    return false
  }
  else {
    return true
  }
}


  def id(i:Int) = i
  def sqr(i:Int) = i*i
  def double(i: Int) = i*2

  //sum(1,5)
  //sum1(sqr,1,5)
  Square(funcCheck,0)
}

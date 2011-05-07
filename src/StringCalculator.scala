
assertEquals("blank string adds up to 0", 0, add(""))
assertEquals("one adds up to one", 1, add("1"))
assertEquals("one number alone adds up to itself", 2, add("2"))
assertEquals("adds any number of comma-separated numbers", 20, add("2,3,4,5,6"))
assertEquals("can separate numbers by either ',' or '\n'", 9, add("2\n3,4"))
//assertEquals("can specify your own delimiter" 3 $ add "//;?n1;2")

def add(s: String) = {
  if(s == "") 0
  else s.split(",|\n").map { _.toInt }.sum
}

def assertEquals(message: String, expressionA: Any, expressionB: Any) = {
  val resultMsg = if(expressionA == expressionB) "yes" else "you failed"
  println(resultMsg + ": " + message)
}
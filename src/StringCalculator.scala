
assertEquals("one == one", 1, 1)

def assertEquals(message: String, expressionA: Any, expressionB: Any) = {
  val resultMsg = if(expressionA == expressionB) "yes" else "you failed"
  print(resultMsg + ": " + message)
}


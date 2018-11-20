object DottyForGenerator extends App {

  for {
    arg1 <- Seq(1,2)
    var varCompileCheck = arg1
    arg2 <- Seq(3,4)
  } yield {
    println(arg1 * arg2)
  }
}

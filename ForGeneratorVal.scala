object DottyForGenerator extends App {

  for {
    arg1 <- Seq(1,2)
    val valCompileCheck = arg1
    arg2 <- Seq(3,4)
  } yield {
    println(arg1 * arg2)
  }
}

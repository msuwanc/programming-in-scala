import forexpression.ForExpression

object Main extends App {
  val forExpression: ForExpression = new ForExpression

//  forExpression.printFilesByDirectory("./src")

//  forExpression.printNTime(4)

//  forExpression.printNTimeWithoutUpperBound(4)

//  forExpression.printOnlyScalaSuffixFilesByDirectory("./src/main/scala/forexpression")

  forExpression.printOnlyScalaFilesByDirectory("./src/main/scala/forexpression")
}
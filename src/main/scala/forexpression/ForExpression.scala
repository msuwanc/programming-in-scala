package forexpression

import java.io.File

class ForExpression {
  def printFilesByDirectory(directory: String): Unit = {
    val filesHere: Array[File] = (new java.io.File(directory)).listFiles()

    for (file <- filesHere)
      println(file)
  }

  def printNTime(n: Int): Unit = {
    for (i <- 1 to n)
      println("Iteration " + i)
  }

  def printNTimeWithoutUpperBound(n: Int): Unit = {
    for (i <- 1 until n)
      println("Iteration " + i)
  }

  def printOnlyScalaSuffixFilesByDirectory(directory: String): Unit = {
    val filesHere = (new java.io.File(directory)).listFiles()

    // 1
//    for (file <- filesHere if file.getName.endsWith(".scala"))
//      println(file)

    //2
    for (file <- filesHere)
      if (file.getName.endsWith(".scala"))
        println(file)
  }

  def printOnlyScalaFilesByDirectory(directory: String): Unit = {
    val filesHere = (new java.io.File(directory)).listFiles()

    for (
      file <- filesHere
      if file.isFile;
      if file.getName.endsWith(".scala")
    ) println(file)
  }
}
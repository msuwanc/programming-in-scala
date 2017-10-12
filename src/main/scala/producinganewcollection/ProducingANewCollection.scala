package producinganewcollection

import java.io.File

// 7.10

class ProducingANewCollection {
  val filesHere: Array[File] = (new java.io.File("./src/main/scala/producinganewcollection")).listFiles

  def scalaFiles: Array[File] = {
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield {
      file

      println(file)

      file
    }
  }

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines.toList

  val forLineLengths: Array[Int] =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length
  
  forLineLengths map { length => println(Console.GREEN + length + Console.RESET); length }

  scalaFiles
}

// 7.8

class NestedIteration {
  val filesHere = (new java.io.File("./src/main/scala/whileloop")).listFiles

//  for (file <- filesHere)
//    println(file)

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines.toList

  def grep(pattern: String) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      if line.trim.matches(pattern)
    } println(file +": "+ line.trim)

  grep(".*gcd.*")
}
import exampleobjects.{Simple, SimpleWithOnlyAttribute, commit}
import spray.json.{JsonParser, _}

/**
  * Created by Hung on 10/17/16.
  */
object SprayJsonExample {
  import JsonConversion._
  val simpleInput =
    """
      |{
      |    "sha": "f26efe8a9b1ce42b2528dc8c9b32759658d2cd9a",
      |    "author": "hungnv",
      |    "message": "Simple commit message",
      |    "content": "Spray json simple example"
      |    }
    """.stripMargin

  val listCommits: String = List.fill(2)(simpleParser(simpleInput)).toJson.toString()

  val nestedInput =
    s"""
      |{
      |   "commit": $simpleInput
      |}
    """.stripMargin

  def simpleParser(jsonString: String) = {
    JsonParser(jsonString).convertTo[Simple]
  }
  def simpleParserToOneAttribute(jsonString: String) = {
    JsonParser(jsonString).convertTo[SimpleWithOnlyAttribute]
  }

  def listJsonParser(jsonString: String) = {
    JsonParser(jsonString).convertTo[List[Simple]]
  }

  def nestedJsonParser(jsonString: String) = {
    JsonParser(jsonString).convertTo[commit]
  }

  def main(args: Array[String]): Unit = {
    println(simpleInput)
    println(listCommits)
    println(nestedInput)
  }
}

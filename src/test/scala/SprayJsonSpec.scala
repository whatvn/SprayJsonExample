import org.scalatest.FlatSpec

/**
  * Created by Hung on 10/17/16.
  */
class SprayJsonSpec extends FlatSpec {
  "Parsed ouput" should "return valid value as input" in {
    val output = SprayJsonExample.simpleParser(SprayJsonExample.simpleInput)
    assert(output.author == "hungnv")
    assert(output.sha == "f26efe8a9b1ce42b2528dc8c9b32759658d2cd9a")
    assert(output.content == "Spray json simple example")
    assert(output.message == "Simple commit message")
  }


  "Simple attribute parsed ouput" should "return only author" in {
    val output = SprayJsonExample.simpleParserToOneAttribute(SprayJsonExample.simpleInput)
    assert(output.author == "hungnv")
  }

  "Parsed Json String with list of 2 json object" should "return list with length 2" in {
    val output = SprayJsonExample.listJsonParser(SprayJsonExample.listCommits)
    assert(output.length == 2)
  }

  "Nested Json String parsed output" should "contain our object" in {
    val output = SprayJsonExample.nestedJsonParser(SprayJsonExample.nestedInput)
    assert(output.commitInfo.author == "hungnv")
    assert(output.commitInfo.sha == "f26efe8a9b1ce42b2528dc8c9b32759658d2cd9a")
    assert(output.commitInfo.message == "Simple commit message")
    assert(output.commitInfo.content == "Spray json simple example")
  }
}

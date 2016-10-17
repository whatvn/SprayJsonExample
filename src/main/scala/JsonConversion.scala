import exampleobjects._
import spray.json.{DefaultJsonProtocol, RootJsonFormat}

/**
  * Created by Hung on 10/17/16.
  */
object JsonConversion extends DefaultJsonProtocol {
  implicit val simpleJsonFormat = jsonFormat4(Simple)
  implicit val nestedJsonFormat: RootJsonFormat[commit] = jsonFormat(commit, "commit")
  // parse simple json string into object with one atrribute
  implicit val evenMoreSimpleJsonFormat: RootJsonFormat[SimpleWithOnlyAttribute] = jsonFormat(SimpleWithOnlyAttribute, "author")

}

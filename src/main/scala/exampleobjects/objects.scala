package exampleobjects

/**
  * Created by Hung on 10/17/16.
  */

case class Simple(sha: String, author: String, message: String, content: String)
case class commit(commitInfo: Simple)
case class SimpleWithOnlyAttribute(author: String)

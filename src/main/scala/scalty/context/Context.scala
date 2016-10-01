package scalty.context
import scala.concurrent.ExecutionContextExecutor

/**
  * Created by kisilnazar on 01.10.16.
  */
trait Context {

  implicit val executionContext: ExecutionContextExecutor = scala.concurrent.ExecutionContext.Implicits.global

}

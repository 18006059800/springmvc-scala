package Controller
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation._
import play.libs.Json
/**
  * Created by jackywong on 24/03/2017.
  */
@RestController
@RequestMapping(value=Array("/rest/"))
class RestHelloController {
  @RequestBody
  @RequestMapping(value=Array("objstr"),produces = Array("application/json"))
  def objstr={
    val putstr=
      """
        {"result":"success",
        "millis":"""+System.currentTimeMillis()+"""}
      """
    val put=Json.parse(putstr)
    println(put)
    put
  }

}

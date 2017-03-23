package Controller
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import Models._
import org.springframework.web.bind.annotation._
/**
  * Created by jackywong on 24/03/2017.
  */
@Controller
@RequestMapping(value=Array("/"))
class HelloController {
  @RequestMapping(value=Array("/","index"))
  def index(model: Model)={
    model.addAttribute("msg","Hello world!")
    "index"
  }

  //这个逻辑出了点错误，我也不知我想怎样
  @RequestMapping(value=Array("getobj"))
  @RequestBody
  def getobj(@RequestBody per:Person,model: Model)={
    println(per)
    model.addAttribute("msg",s"Hello ${per.name}/${per.age} lived in ${per.address}")
    "index"
  }
}

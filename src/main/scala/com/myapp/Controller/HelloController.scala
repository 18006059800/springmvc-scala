package com.myapp.Controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import com.myapp.Models._
import com.myapp.Service._
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._
/**
  * Created by jackywong on 24/03/2017.
  */
@Controller
@RequestMapping(value=Array("/"))
class HelloController {
  @Autowired
  private var userService:UserService=null;//对于scala这里需要指定一个null

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

  @RequestMapping(value=Array("testDB/{str}"))
  def testDB(@PathVariable("str")str:String)={
    val id=str.toLong
    val user=this.userService.getUserById(id);
    println(user)
    "index"
  }
}

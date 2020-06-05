package com.telusko.tusk;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import com.telusko.tusk.dao.CodeDAO;
import com.telusko.tusk.entity.Code;

@Controller
@EnableWebMvc
public class CodeController 
{
	@Autowired
	CodeDAO cDao;
	
	@RequestMapping("/code.htm")
  public ModelAndView getCode(@RequestParam("cname") String cname) throws  ClassNotFoundException
  {
	 ModelAndView mv = new ModelAndView();
	 mv.setViewName("code.jsp");
	 Code c = cDao.getCode(cname);
	 System.out.println(c);
	 mv.addObject("code",c);
	 return mv;
  }
}

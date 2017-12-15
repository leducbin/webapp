package com.boraji.tutorial.springboot.controller;

import com.boraji.tutorial.springboot.exceptions.EmployeeNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

   @RequestMapping("/loginpg")
   public String index() throws Exception {
      return "login";
   }

   @PostMapping("/hello")
   public String sayHello(@RequestParam(value = "name",required=true) String name, Model model) {
      model.addAttribute("name", name);
      return "hello";
   }

    @GetMapping("/hello")
    public String indexhello(@RequestParam(value = "name",required=false, defaultValue = "YOU") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable String name, Model model) throws Exception{

        if(name.equals("bin")){
            throw new EmployeeNotFoundException(name);
        }else if(name.equals("le")){
            throw new SQLException("SQLException, name="+name);
        }else if(name.equals("duc")){
            throw new IOException("IOException, name="+name);
        }else {
            model.addAttribute("name", name);
            return "hello";
        }

    }


    @ExceptionHandler(EmployeeNotFoundException.class)
    public ModelAndView handleEmployeeNotFoundException(HttpServletRequest request, Exception ex){
        logger.error("Requested URL="+request.getRequestURL());
        logger.error("Exception Raised="+ex);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", ex);
        modelAndView.addObject("url", request.getRequestURL());

        modelAndView.setViewName("error");
        return modelAndView;
    }
}

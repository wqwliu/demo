package com.qf.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Demo class
 *
 * @author wq
 * @date 2018/7/17
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/view/{path}")
    public String view(@PathVariable String path){
        return path;
    }

    @RequestMapping("/view/{path}/{path1}")
    public String view(@PathVariable String path,@PathVariable String path1){
        return path+"/"+path1;
    }
}

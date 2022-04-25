package com.hz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hz.pojo.bill;
import com.hz.service.billService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class billcontroller {
    @Autowired
    @Qualifier("billServiceimpl")
   private billService billService;
    //查询全部的书籍，并且返回到一个页面上
    @RequestMapping("/bill")    @Qualifier("")
    public  String selectInformation(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){
        List<bill> list=billService.selectInformation();
        model.addAttribute("list",list);
        return "order";
 /*       PageHelper.startPage(pn,5);
        List<bill> list=billService.selectInformation();
        PageInfo page=new PageInfo(list,5);
        model.addAttribute("pageInfo",page);//

        return "order";*/
    }
  /*  public  String selectInformation(Model model ){

    }*/
/*分页查询*/


}

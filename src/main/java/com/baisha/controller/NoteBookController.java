package com.baisha.controller;

import com.baisha.pojo.Notebook;
import com.baisha.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class NoteBookController {
    @Autowired
    private NotebookService service;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        System.out.println("get");
        return "/index";
    }
    @RequestMapping(value = "/notebook",method = RequestMethod.GET)
    public String insert(){
        Notebook notebook = new Notebook();
        notebook.setText("HELLO");
        notebook.setTitle("test");
        service.add(notebook);
        return "/index";
    }
    @RequestMapping(value = "/mybookpage",method = RequestMethod.POST)
    public String goNotebookPage(Map<String, Object> map){
        List<Notebook> notebooks = service.notebooks();
        map.put("list",notebooks);
        return "/notebook/bookpage";
    }

    @RequestMapping(value = "/userlogin",method = RequestMethod.GET)
    public String goLogin(){
        return "/notebook/login";
    }
}

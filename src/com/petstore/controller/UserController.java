package com.petstore.controller;

import com.petstore.service.GoodService;
import com.petstore.service.TypeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/index")
public class UserController {
    static Logger log = Logger.getLogger(UserController.class);
    @Autowired
    private GoodService goodService;
    @Autowired
    private TypeService typeService;
    @RequestMapping("/homePage")
    public String homePage(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("typeList", typeService.getList());
        log.debug("I AM ETHANT!");
        return "index.jsp";
    }

    @RequestMapping("/ajax")
    public void ajax(HttpServletResponse response) {
        try {
            response.setCharacterEncoding("utf-8");
            PrintWriter out = response.getWriter();
            out.print("黄诚");
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

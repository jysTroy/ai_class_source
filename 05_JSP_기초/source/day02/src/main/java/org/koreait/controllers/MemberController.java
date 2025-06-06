package org.koreait.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("회원 가입 페이지");
        System.out.printf("req:%s, resp:%s%n", req, resp);

        // 게시판 페이지로 이동
        resp.sendRedirect(req.getContextPath() + "/board");
    }
}

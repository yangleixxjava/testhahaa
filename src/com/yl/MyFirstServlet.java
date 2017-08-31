package com.yl;

import java.io.IOException;

public class MyFirstServlet extends javax.servlet.http.HttpServlet {
    private javax.servlet.http.HttpServletRequest request;

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException { request
        Object o = new Object()

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    this.doPost(request,response);
    }
}

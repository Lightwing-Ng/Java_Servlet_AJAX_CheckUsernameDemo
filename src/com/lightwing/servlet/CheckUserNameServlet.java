package com.lightwing.servlet;

import com.lightwing.dao.UserDao;
import com.lightwing.dao.impl.UserDaomImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class CheckUserNameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        try {
            request.setCharacterEncoding("UTF-8");

            // 1.检测是否存在
            String name = request.getParameter("name");
            System.out.println("name: " + name);
            UserDao dao = new UserDaomImpl();
            boolean isExist = dao.checkUserName(name);

            // 2.通知页面
            if (isExist)
                response.getWriter().println(1);
            else
                response.getWriter().println(2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}

package com.exa;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HelloWorldServlet extends HttpServlet{
    //继承之后才能调用此类进行处理请求

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");

        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>HelloWorld</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
        out.println("<hr>");
        out.println("The userName is : " + userName);
        out.println("The password is : " + password);
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
}

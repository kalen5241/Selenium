
package com.kalen;

import com.kalen.JavaBean;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public loginServlet() {
		super();
	}
	// 处理POST请求
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doPost(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			// 获取name参数值
			String username = request.getParameter("username");
			String pwd = request.getParameter("pwd");
			
			System.out.println(username);
			System.out.println(pwd);
			
//			// 从response中获取PrintWriter对象
//			PrintWriter writer = response.getWriter();
//			// 判断name是否为空
//			if (username != null && pwd != null) {
//				// 如果name不为空，则通过writer输出name
//				writer.write("name:" + username + "password:" + pwd);
//			}
//			writer.flush(); // 刷新writer
//			writer.close(); // 关闭writer
			
			JavaBean user = new JavaBean();
			user.setUsername(username);
			user.setPwd(pwd);
			
			ServletContext appliction = getServletContext();
			@SuppressWarnings("unchecked")
			List<JavaBean> list = (List<JavaBean>) appliction.getAttribute("users");
			if (list == null) {
				list = new ArrayList<JavaBean> ();
			}
			list.add(user);
			appliction.setAttribute("users",list);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("loginfo.jsp");
			dispatcher.forward(request,response);
			
		}
}

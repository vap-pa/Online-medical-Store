package com;

import java.io.IOException;
import java.util.Vector;

import DBServics.DBServic;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/showord")
public class showorder extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Vector v1 = DBServic.orderdisplay();

		request.setAttribute("data", v1);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/OrderDisplay.jsp");
		rd.include(request, response);
	}

}

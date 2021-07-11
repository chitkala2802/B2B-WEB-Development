package com.higradius;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Date due_date;
	private Date predicted_date;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cust_name=request.getParameter("cust_name");
		String notes=request.getParameter("notes");
//		String invoice_id=request.getParameter("invoice_id");
		int invoice_id = Integer.parseInt(request.getParameter("invoice_id"));
		int cust_id=Integer.parseInt(request.getParameter("cust_id"));
		int invoice_amount=Integer.parseInt(request.getParameter("invoice_amount"));
		try {
			java.util.Date due_date=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("due_date"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			java.util.Date predicted_date=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("predicted_date"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//	Date due_date = null;
//	Date predicted_date = null;
	invoice invoice =new invoice(cust_name,notes,invoice_id,cust_id,invoice_amount,due_date,predicted_date);
	Adddetailsdao adao=new Adddetailsdao();
	String result=adao.insert(invoice);
	response.getWriter().print(result);
	
		
		
		doGet(request, response);
	}

}


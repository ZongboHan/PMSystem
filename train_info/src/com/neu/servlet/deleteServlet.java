package com.neu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.dao.TrainDao;
import com.neu.dao.TrainDaoImpl;
import com.neu.entity.Train;

/**
 * Servlet implementation class deleteServlet
 */
@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] checks = request.getParameterValues("trainNO");
		TrainDao dao = new TrainDaoImpl();
		
		try {
			
			if(checks != null) {
				int sum = 0 ;
				for(int i=0;i<checks.length;i++) {
					int n = dao.delete(checks[i]);
					sum += n;
				}
				if(sum == checks.length) {
					List<Train> trains = dao.getAll();
					request.setAttribute("success", 1);
					request.setAttribute("trains", trains);
					request.getRequestDispatcher("/main.jsp").forward(request, response);
				}
			}else {
				List<Train> trains = dao.getAll();
				request.setAttribute("error", 1);
				request.setAttribute("trains", trains);
				request.getRequestDispatcher("/main.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

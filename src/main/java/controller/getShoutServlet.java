package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.WordChangeFun;

/**
 * Servlet implementation class getShoutServlet
 */
@WebServlet("/getShoutServlet")
public class getShoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getShoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String getShout = request.getParameter("getShout");
		
		WordChangeFun userWords = new WordChangeFun(getShout);
				
		request.setAttribute("wordCap", userWords);
		
		getServletContext().getRequestDispatcher("/resultShout.jsp").forward(request, response);

	}

}

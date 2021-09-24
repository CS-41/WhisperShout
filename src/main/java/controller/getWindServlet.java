package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.WordChangeFun;

/**
 * Servlet implementation class getWindServlet
 */
@WebServlet("/getWindServlet")
public class getWindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String getWhisper = request.getParameter("getWhisper");
		
		WordChangeFun userWords = new WordChangeFun(getWhisper);
				
		request.setAttribute("wordCap", userWords);
		
		getServletContext().getRequestDispatcher("/resultWhisper.jsp").forward(request, response);
		
	}

}

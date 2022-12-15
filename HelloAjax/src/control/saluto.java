package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/saluto")
public class saluto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public saluto() {

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user"); //prendo il parametro user dal saluto
		PrintWriter out = response.getWriter();
		if(user.equals("Giovanni"))
		{
			out.print("ciao " + user);
		}
		else
		{
			out.print("hello " + user);	
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

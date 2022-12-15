package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getInfo")
public class getInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public getInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		if(user.equals("Carlo"))
		{
			out.print("Ciao Carlo");
		}
		else if(user.equals("Anna")) {
			out.print("Hello Anna");
		}
		else
		{
			out.print("Salve Giovanni");
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String mess = "{\"name\":[\"Giovanni\", \"Luca\"],\"age\":33,\"city\":[\"Napoli\",\"Milano\"]}"; 
        out.println(mess);
	}

}

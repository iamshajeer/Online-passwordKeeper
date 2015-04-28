

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import passwordkeeper.DbHandler;

/**
 * Servlet implementation class LoginValidator
 */
@WebServlet("/LoginValidator")
public class LoginValidator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	protected void doService(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		
		//String username = request.getParameter("username");
		//String password = request.getParameter("password");
		
		getLoginData("admin", "password");
		
	}
	
	public boolean getLoginData(String username,String password){
		try {

			String query = "SELECT * FROM user";
			Statement statement = new DbHandler().dbConnectionMaker();
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()){
				if(result.getString(1).equals(username) && result.getString(2).equals(password)){
					return true;
				}
				return false;
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			return false;
		
	}

}

package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoEmploye;
import model.Employe;

/**
 * Servlet implementation class EmployeSevlet
 */
@WebServlet("/EmployerServlet")
public class EmployeSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeSevlet() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			DaoEmploye empl = new DaoEmploye();
			List<Employe> employees = empl.listar();
			request.setAttribute("employees", employees);
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

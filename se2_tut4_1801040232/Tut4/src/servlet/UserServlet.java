package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.OrderDAO;
import dao.ProductDAO;
import dao.UserDAO;
import model.Product;
import model.User;
import model.Order;



/**
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 */

@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
	private ProductDAO productDAO;
	private OrderDAO orderDAO;

	public void init() {
		userDAO = new UserDAO();
		productDAO = new ProductDAO();
		orderDAO = new OrderDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			listUser(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listUser = userDAO.selectAllUsers();
		List<Product> listProduct = productDAO.selectAllProducts();
		List<Order> listOrder = orderDAO.selectAllOrders();
		request.setAttribute("listUser", listUser);
		request.setAttribute("listProduct", listProduct);
		request.setAttribute("listOrder", listOrder);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}
}

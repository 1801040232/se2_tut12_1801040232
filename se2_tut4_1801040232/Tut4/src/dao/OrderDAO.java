package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Order;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides 
 * CRUD (CREATE - READ - UPDATE - DELETE) database operations 
 * for the table order in the database
 */
public class OrderDAO {

	public OrderDAO() {
	}

	public List<Order> selectAllOrders() {

		List<Order> orders = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_ORDERS = "SELECT * FROM orderline";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ORDERS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int orderId = rs.getInt("orderId");
				int id = rs.getInt("id");
				String proId = rs.getString("proId");
				int quantity = rs.getInt("quantity");
				orders.add(new Order(orderId, id, proId, quantity));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
}

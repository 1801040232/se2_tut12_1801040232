package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.Product;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides 
 * CRUD (CREATE - READ - UPDATE - DELETE) database operations 
 * for the table product in the database
 */
public class ProductDAO {

	public ProductDAO() {
	}

	public List<Product> selectAllProducts() {

		List<Product> products = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_PRODUCTS = "SELECT * FROM product";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCTS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				String proId = rs.getString("proId");
				String proName = rs.getString("proName");
				products.add(new Product(proId, proName));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
}

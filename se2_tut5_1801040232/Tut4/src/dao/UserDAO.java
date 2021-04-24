package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.User;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides CRUD (CREATE - READ -
 * UPDATE - DELETE) database operations for the table user in the database
 */
public class UserDAO {

	public UserDAO() {
	}

	private Connection connection = DBConnect.getConnection();

	public List<User> selectAllUsers() {

		List<User> users = new ArrayList<>();
		// Step 1: Establishing a Connection

		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_USERS = "SELECT * FROM user";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int userId = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String mobile = rs.getString("mobile");
				users.add(new User(userId, name, address, mobile));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	// TO-DO: Implement selectUser() method to select user by ID (use in UPDATE
	// function)
	public User selectUser(int id) throws SQLException {
		User user = null;

		String SELECT_USER_BY_ID = "SELECT * FROM user WHERE id = ?";
		PreparedStatement ps = connection.prepareStatement(SELECT_USER_BY_ID);
		return user;
	}

	// TO-DO: Implement insertUser() method to add new record to table User
	public void insertUser(User user) throws SQLException {

		try {
			String SELECT_USER = "INSERT INTO user(name, address, mobile) VALUES (?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(SELECT_USER);
			ps.setString(1, user.getName());
			ps.setString(2, user.getAddress());
			ps.setString(3, user.getMobile());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// TO-DO: Implement updateUser() method to update record in table User
	public boolean updateUser(User user) throws SQLException {
		boolean rowUpdated = false;

		return rowUpdated;
	}

	// TO-DO: Implement deleteUser() method to delete record in table User
	public boolean deleteUser(int id) throws SQLException {
		boolean rowDeleted = false;

		return rowDeleted;
	}
}

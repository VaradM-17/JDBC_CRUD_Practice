package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.connection.DBConnection;
import com.entity.Users;

public class UserDao {

	// insert
	public void insertData(Users u) {
		Connection c = null;
		PreparedStatement ps = null;

		try {
			c = DBConnection.getConnection();

			if (c != null) {
				String query = "insert into userdetails (firstname, lastname, email, phoneno) values (?,?,?,?)";

				ps = c.prepareStatement(query);

				ps.setString(1, u.getFirstName());
				ps.setString(2, u.getLastName());
				ps.setString(3, u.getEmail());
				ps.setInt(4, u.getPhoneNo());

				int result = ps.executeUpdate();

				if (result > 0) {
					System.out.println("Data Inserted...");
				} else {
					System.out.println("Data Not Inserted...");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (c != null) {
					c.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// update
	public void updateData(Users u) {
		Connection c = null;
		PreparedStatement ps = null;

		try {
			c = DBConnection.getConnection();

			if (c != null) {
				String query = "update userdetails set firstname=?, lastname=?, email=?, phoneno=? where uid=?";
				ps = c.prepareStatement(query);

				ps.setString(1, u.getFirstName());
				ps.setString(2, u.getLastName());
				ps.setString(3, u.getEmail());
				ps.setInt(4, u.getPhoneNo());
				ps.setInt(5, u.getUid());

				int result = ps.executeUpdate();

				if (result > 0) {
					System.out.println("Data Updated...");
				} else {
					System.out.println("Data Not Updated...");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (c != null) {
					c.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// Delete
	public void deleteData(Users u) {
		Connection c = null;
		PreparedStatement ps = null;

		try {
			c = DBConnection.getConnection();
			if (c != null) {
				String query = "delete from userdetails where uid=?";
				ps = c.prepareStatement(query);
				ps.setInt(1, u.getUid());
				int i = ps.executeUpdate();

				if (i > 0) {
					System.out.println("Data Deleted...");
				} else {
					System.out.println("Data Not Deleted...");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (c != null) {
					c.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.connection.DBConnection;
import com.entity.Users;

public class UserDao {
	public void insertData(Users u) {
		Connection c = DBConnection.getConnection();

		if (c != null) {
			try {
				String query = "insert into userdetails (firstname, lastname, email, phoneno) values (?,?,?,?)";
				PreparedStatement ps = c.prepareStatement(query);
				ps.setString(1, u.getFirstName());
				ps.setString(2, u.getLastName());
				ps.setString(3, u.getEmail());

				int result = ps.executeUpdate();

				if (result > 0) {
					System.out.println("Data Inserted...");
				} else {
					System.out.println("Data Not Inserted...");
				}

				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (c != null) {
						c.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	// update
	public void updateData(Users u) {
		Connection c = DBConnection.getConnection();
		if (c != null) {
			try {
				String query = "update userdetails set firstname=?, lastname=?, email = ?, phoneno = ? where uid = ?";
				PreparedStatement ps = c.prepareStatement(query);

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
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (c != null) {
						c.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}
	
	
	
}

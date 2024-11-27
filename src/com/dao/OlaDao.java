package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.entity.OLA;

public class OlaDao {
	public void insertData(OLA o) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ola", "root", "root");

			String query = "insert into bookingdetails values (?,?,?,?)";
			PreparedStatement ps = c.prepareStatement(query);

			ps.setInt(1, o.getDid());
			ps.setString(2, o.getDname());
			ps.setInt(3, o.getDage());
			ps.setInt(4, o.getVehicalno());

			int i = ps.executeUpdate();
			if (i > 0)
				System.out.println("Data Inserted");
			else
				System.out.println("Data Not Inserted");

			ps.close();
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateData(OLA o) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/OLA", "root", "root");

			String query = "update bookingdetails set dname=?, dage=?, vehical_no=? where did=?";
			PreparedStatement ps = c.prepareStatement(query);

			ps.setString(1, o.getDname());
			ps.setInt(2, o.getDage());
			ps.setInt(3, o.getVehicalno());
			ps.setInt(4, o.getDid());

			int i = ps.executeUpdate();
			if (i > 0)
				System.out.println("Data Updated...");
			else
				System.out.println("Data Not Updated...");

			ps.close();
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteData(int did) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/OLA", "root", "root");

			String query = "delete from bookingdetails where did=?";
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, did);

			int i = ps.executeUpdate();
			if (i > 0)
				System.out.println("Data Deleted...");
			else
				System.out.println("Data Not Deleted...");

			ps.close();
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void displayallData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/OLA", "root", "root");

			String query = "select * from bookingdetails";
			PreparedStatement ps = c.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) 
			{
				int did = rs.getInt("did");
				String dname = rs.getString("dname");
				int dage = rs.getInt("dage");
				String vehicalno = rs.getString("vehicalno");
				System.out.println("OLA Booking ID: " + did + " Driver Name: " + dname + " Driver Age: " + dage + " Vehicle Number: " + vehicalno);
			}

			rs.close();
			ps.close();
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

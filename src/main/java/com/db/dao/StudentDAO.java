package com.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.db.model.Student;
import com.db.util.DBUtil;

public class StudentDAO {

	public static boolean insertStudent(String name) {

		String userName = name;

		String sql = "insert into signup(uname) values (?)";

		try {
			
			
			Connection connection = DBUtil.getDataSource().getConnection();

			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userName);
			boolean add = ps.execute();
			
			if(!add) {
				System.out.println("Successfully added!");
			}else {
				System.out.println("Not added!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}

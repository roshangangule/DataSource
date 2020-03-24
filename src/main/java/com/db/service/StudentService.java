package com.db.service;
import com.db.dao.*;
import com.db.dao.StudentDAO;

public class StudentService {
	public static boolean createStudent(String name) {
		String fname = name;
		return new StudentDAO().insertStudent(fname);
	}
}

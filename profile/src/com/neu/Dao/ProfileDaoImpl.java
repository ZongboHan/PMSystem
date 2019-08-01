package com.neu.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Profile;

public class ProfileDaoImpl implements ProfileDao {

	@Override
	public List<Profile> getAll() throws Exception {
		DBUtils db = new DBUtils();
		String sql = "select * from profile";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql);
		List<Profile> list = new ArrayList<>();
		
		Profile profile = null;
		Integer id;
		String name;
		String birthday;
		String gender;
		String career;
		String address;
		Long mobile;
		while(rs.next()) {
			id = rs.getInt("id");
			name = rs.getString("name");
			birthday = rs.getString("birthday");
			gender = rs.getString("gender");
			career = rs.getString("career");
			address = rs.getString("address");
			mobile = rs.getLong("mobile");
			
			profile = new Profile(id,name,birthday,gender,career,address,mobile);
			
			list.add(profile);
		}
		db.closeConnection(connection);
		return list;
	}

	@Override
	public Profile get(int id) throws Exception {
		DBUtils db = new DBUtils();
		String sql = "select * from profile where id = ?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql,id);
		
		Profile profile = null;
		
		String name;
		String birthday;
		String gender;
		String career;
		String address;
		Long mobile;
		if(rs.next()) {
			
			name = rs.getString("name");
			birthday = rs.getString("birthday");
			gender = rs.getString("gender");
			career = rs.getString("career");
			address = rs.getString("address");
			mobile = rs.getLong("mobile");
			
			profile = new Profile(id,name,birthday,gender,career,address,mobile);
		}
		db.closeConnection(connection);
		return profile;
	}

	@Override
	public int update(Profile profile) throws Exception {
		DBUtils db = new DBUtils();
		String sql = "update profile set name=?,birthday=?,gender=?,career=?,address=?,mobile=? where id = ?";
		int n = db.executeUpdate(sql, profile.getName(),profile.getBirthday(),profile.getGender(),profile.getCareer(),profile.getAddress(),profile.getMobile(),profile.getId());
		return n;
	}

	@Override
	public int insert(Profile profile) throws Exception {
		DBUtils db = new DBUtils();
		String sql = "insert into profile values(null,?,?,?,?,?,?,?)";
		int n = db.executeUpdate(sql,profile.getId(), profile.getName(),profile.getBirthday(),profile.getGender(),profile.getCareer(),profile.getAddress(),profile.getMobile());
		return n;
	}

}

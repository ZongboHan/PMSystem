package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Train;

public class TrainDaoImpl implements TrainDao{
	public DBUtils db = new DBUtils();
	@Override
	public int delete(String train_no) throws Exception {
		String sql = "delete from train_info where train_no = ?";
		int n = db.executeUpdate(sql, train_no);
		return n;
	}

	@Override
	public List<Train> getAll() throws Exception {
		String sql = "select * from train_info";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql);
		List<Train> list = new ArrayList<>();
		String train_no;
		String start_station;
		String arrival_station;
		String start_time;
		String arrival_time;
		String type;
		String runtime;
		Integer mile;
		while(rs.next()) {
			train_no = rs.getString("train_no");
			start_station = rs.getString("start_station");
			arrival_station = rs.getString("arrival_station");
			start_time = rs.getString("start_time");
			arrival_time = rs.getString("arrival_time");
			type = rs.getString("type");
			runtime = rs.getString("runtime");
			mile = rs.getInt("mile");
			
			list.add(new Train(train_no, start_station, arrival_station, start_time, arrival_time, type, runtime, mile));
		}
		db.closeConnection(connection);
		return list;
	}

	@Override
	public Train getById(String train_no) throws Exception {
		String sql = "select * from train_info where train_no = ?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql, train_no);
		Train train = null;
		String start_station;
		String arrival_station;
		String start_time;
		String arrival_time;
		String type;
		String runtime;
		Integer mile;
		if(rs.next()) {
			
			start_station = rs.getString("start_station");
			arrival_station = rs.getString("arrival_station");
			start_time = rs.getString("start_time");
			arrival_time = rs.getString("arrival_time");
			type = rs.getString("type");
			runtime = rs.getString("runtime");
			mile = rs.getInt("mile");
			
			train = new Train(train_no, start_station, arrival_station, start_time, arrival_time, type, runtime, mile);
		}
		db.closeConnection(connection);
		return train;
	}

	@Override
	public List<Train> getPaged(int pageSize, int pageNum) throws Exception {
		String sql = "select * from train_info order by train_no limit ?,?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql,(pageNum-1)*pageSize,pageSize);
		List<Train> list = new ArrayList<>();
		String train_no;
		String start_station;
		String arrival_station;
		String start_time;
		String arrival_time;
		String type;
		String runtime;
		Integer mile;
		while(rs.next()) {
			train_no = rs.getString("train_no");
			start_station = rs.getString("start_station");
			arrival_station = rs.getString("arrival_station");
			start_time = rs.getString("start_time");
			arrival_time = rs.getString("arrival_time");
			type = rs.getString("type");
			runtime = rs.getString("runtime");
			mile = rs.getInt("mile");
			
			list.add(new Train(train_no, start_station, arrival_station, start_time, arrival_time, type, runtime, mile));
		}
		db.closeConnection(connection);
		return list;
	}

	@Override
	public int count() throws Exception {
		Connection connection = db.getConnection();
		String sql = "select count(*) from train_info";
		ResultSet rs = db.executeQuery(connection, sql);
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}

}

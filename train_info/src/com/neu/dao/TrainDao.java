package com.neu.dao;

import java.util.List;

import com.neu.entity.Train;

public interface TrainDao {
	public int delete(String train_no) throws Exception;
	public List<Train> getAll() throws Exception;
	public Train getById(String train_no) throws Exception;
	//pageSize每页最多有多少行，pageNum，需要第几页数据
	public  List<Train> getPaged(int pageSize,int pageNum) throws Exception;
	//得到一共有多少行
	int count() throws Exception;
}

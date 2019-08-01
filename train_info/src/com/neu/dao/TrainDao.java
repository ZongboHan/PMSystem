package com.neu.dao;

import java.util.List;

import com.neu.entity.Train;

public interface TrainDao {
	public int delete(String train_no) throws Exception;
	public List<Train> getAll() throws Exception;
	public Train getById(String train_no) throws Exception;
	//pageSizeÿҳ����ж����У�pageNum����Ҫ�ڼ�ҳ����
	public  List<Train> getPaged(int pageSize,int pageNum) throws Exception;
	//�õ�һ���ж�����
	int count() throws Exception;
}

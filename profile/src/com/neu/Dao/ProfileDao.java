package com.neu.Dao;

import java.util.List;

import com.neu.entity.Profile;

public interface ProfileDao {
	public List<Profile> getAll() throws Exception;
	public Profile get(int id) throws Exception;
	public int update(Profile profile) throws Exception;
	public int insert(Profile profile) throws Exception;
}

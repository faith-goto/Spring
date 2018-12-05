package com.example.demo.login.domain.repository.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.login.domain.model.User;
import com.example.demo.login.domain.repository.UserDao;

@Repository
public class UserDaoJdbcImpl implements UserDao {

	@Autowired
	JdbcTemplate jdbc;
	
	//　Userテーブルの件数を取得
	@Override
	public int count() throws DataAccessException{
		return 0;
	}
	
	//Userテーブルにデータを一件insert
	@Override
	public int insertOne(User user) throws DataAccessException{
		return 0;
	}
	
	//Userテーブルのデータを一件取得
	@Override
	public User selectOne(String userId) throws DataAccessException{
		return null;
	}
	
	//Userテーブルの全データを取得
	public List<User> selectMany() throws DataAccessException{
		return null;
	}
	
	//Userテーブルを一件更新
	public int updateOne(User user) throws DataAccessException{
		return 0;
	}
	
	//Userテーブルを一件削除
	public int deleteOne(String userId) throws DataAccessException{
		return 0;
	}
	
	//Userテーブルの全データをCSVに出力
	public void userCsvOut() throws DataAccessException{
		
	}
}
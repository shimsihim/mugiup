package com.ssafy.ssafit.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.ssafit.model.dto.User;

@Mapper
public interface UserDao {
	
	//유저 전체 조회
	public List<User> selectAll();
	
	//아이디로 유저 조회
	public User selectByUserId(String user_id);
	
	//회원가입 시 DB추가
	public int insertUser(User user);
	
	//본인 정보 수정 DB업데이트
	public int updateUser(User user);
	
	//아이디로 유저 삭제(관리자권한) DB삭제
	public int deleteUser(String user_id);
	
}

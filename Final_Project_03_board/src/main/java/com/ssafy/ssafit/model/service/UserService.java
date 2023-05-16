package com.ssafy.ssafit.model.service;

import java.util.List;

import com.ssafy.ssafit.model.dto.User;

public interface UserService {

	//유저 전체 조회
	public List<User> selectAll();
	
	//유저 상세보기
	public User userDetail(String user_id);

	//로그인
	public User login(String user_id, String user_pw);
	
	//회원가입
	//public int signUp(User user, MultipartFile file) throws IllegalStateException, IOException;
	public int signUp(User user);
	
	//회원정보 업데이트
	//public int updateUserInfo(User user, MultipartFile file) throws IllegalStateException, IOException;
	public int updateUserInfo(User user);
	
	//탈퇴처리(관리자)
	public int withdraw(String user_id);

}

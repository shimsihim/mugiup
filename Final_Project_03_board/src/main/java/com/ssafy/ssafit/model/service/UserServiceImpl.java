package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.ssafit.model.dao.UserDao;
import com.ssafy.ssafit.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	// resource 경로를 가져오기 위함(파일처리를 위해)
//	/*
//	 * @Autowired ResourceLoader resLoader;
//	 */
	
	private UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	//유저 상세조회(마이페이지)
	@Override
	public User userDetail(String user_id) {
		return userDao.selectByUserId(user_id);
	}

	//로그인
	//아이디로 select해서 유저정보가 있고, pw가 동일하면 로그인 성공.로그인 유저반환
	@Override
	public User login(String user_id, String user_pw) {
		User user = userDao.selectByUserId(user_id);
		if(user !=null && user.getUser_pw().equals(user_pw))
			return user;
		return null;
	}

	//회원가입
	@Override
	@Transactional
	//public int signUp(User user, MultipartFile file) throws IllegalStateException, IOException {
		//fileHandling(user, file);
	public int signUp(User user) {
		return userDao.insertUser(user);
		
	}

	//회원 정보 수정
	@Override
	@Transactional
	//public int updateUserInfo(User user, MultipartFile file) throws IllegalStateException, IOException {
		//fileHandling(user, file);
	public int updateUserInfo(User user) {
		return userDao.updateUser(user);
	}

	//탈퇴
	@Override
	@Transactional
	public int withdraw(String user_id) {
		return userDao.deleteUser(user_id);
	}
	
	//유저 전체 조회
	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}

//	private void fileHandling(User user, MultipartFile file) throws IOException {
		// 파일을 저장할 폴더 지정
//		Resource res = resLoader.getResource("resources/upload");
//
//		if (file != null && file.getSize() > 0) {
//			// prefix를 포함한 전체 이름
//			user.setUser_imgFolder(res.getFile().getCanonicalPath());
//			user.setUser_imgFile(System.currentTimeMillis() + "_" + file.getOriginalFilename());
//
//			file.transferTo(new File(user.getUser_imgFolder() + "/" + user.getUser_imgFile()));
//		}
//	}
	
}

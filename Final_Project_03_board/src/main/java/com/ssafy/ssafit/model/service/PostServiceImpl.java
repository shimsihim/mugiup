package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.PostDao;
import com.ssafy.ssafit.model.dto.Post;

@Service
public class PostServiceImpl implements PostService {

	// resource 경로를 가져오기 위함(파일처리를 위해)
//	/*
//	 * @Autowired ResourceLoader resLoader;
//	 */
	
	private PostDao postDao;
	
	@Autowired
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}


	@Override
	public List<Post> readPostAll(int board_id) {
		return postDao.selectAll(board_id);
	}

	//로그인 유저만 가능하도록 하기
	@Override
	public void registPost(Post post) {
		postDao.insertPost(post);
	}

	
	@Override
	public Post readPost(int post_num) {
		postDao.updateViewCnt(post_num);
		return postDao.selectOne(post_num);
	}

	//본인만 가능하도록 하기
	@Override
	public void updatePost(Post post) {
		postDao.updatePost(post);
	}

	//본인만 가능하도록 하기
	@Override
	public void deletePost(int post_num) {
		postDao.deletePost(post_num);		
	}

	
}

package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.ssafit.model.dao.CommentDao;
import com.ssafy.ssafit.model.dto.Comment;

@Service
public class CommentServcieImpl implements CommentService{
	
	@Autowired
	private CommentDao CommentDao;

	@Override
	public List<Comment> selectComment(int post_num) {
		// TODO Auto-generated method stub
		return CommentDao.selectComment(post_num);
	}

	@Override
	@Transactional
	public void registComment(Comment comment) {
		// TODO Auto-generated method stub
		CommentDao.registComment(comment);
	}

	@Override
	public void updateComment(Comment comment) {
		// TODO Auto-generated method stub
		CommentDao.updateComment(comment);
		
	}

	@Override
	public void deleteComment(int id) {
		// TODO Auto-generated method stub
		CommentDao.deleteComment(id);
		
	}


	
	

}

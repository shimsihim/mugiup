package com.ssafy.ssafit.model.service;

import java.util.List;

import com.ssafy.ssafit.model.dto.Comment;

public interface CommentService {
	
List<Comment> selectComment(int post_num);
	
	void registComment(Comment comment);
	
	void updateComment(Comment comment);
	
	void deleteComment(int id);
}

package com.ssafy.ssafit.model.service;

import java.util.List;

import com.ssafy.ssafit.model.dto.Post;

public interface PostService {

	// 게시판별 게시글 목록
	List<Post> readPostAll(int board_id);
	
	// 게시물 등록
	void registPost(Post post);

	// 게시물 상세보기(조회수 올릴것)
	Post readPost(int post_num);

	//게시물 수정
	void updatePost(Post post);

	// 게시물 삭제
	void deletePost(int post_num);

}

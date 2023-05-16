package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.Post;

public interface PostDao {
	

	// 게시판별 게시글 목록
	public List<Post> selectAll(int board_id);
	
	// 게시글 상세보기
	public Post selectOne(int post_num);

	// 게시글 등록
	public void insertPost(Post post);

	// 게시글 삭제
	public void deletePost(int post_num);

	// 게시글 수정
	public void updatePost(Post post);

	// 조회수 증가
	public void updateViewCnt(int post_num);
	
	
}

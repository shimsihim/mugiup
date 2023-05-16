package com.ssafy.ssafit.model.dto;


public class PostLike {
	
	private int postLike_num;
	private String postLike_user_id;
	private int postLike_post_num;
	
	public PostLike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostLike(int postLike_num, String postLike_user_id, int postLike_post_num) {
		super();
		this.postLike_num = postLike_num;
		this.postLike_user_id = postLike_user_id;
		this.postLike_post_num = postLike_post_num;
	}

	public int getPostLike_num() {
		return postLike_num;
	}

	public void setPostLike_num(int postLike_num) {
		this.postLike_num = postLike_num;
	}

	public String getPostLike_user_id() {
		return postLike_user_id;
	}

	public void setPostLike_user_id(String postLike_user_id) {
		this.postLike_user_id = postLike_user_id;
	}

	public int getPostLike_post_num() {
		return postLike_post_num;
	}

	public void setPostLike_post_num(int postLike_post_num) {
		this.postLike_post_num = postLike_post_num;
	}

	@Override
	public String toString() {
		return "PostLike [postLike_num=" + postLike_num + ", postLike_user_id=" + postLike_user_id
				+ ", postLike_post_num=" + postLike_post_num + "]";
	}

	
}

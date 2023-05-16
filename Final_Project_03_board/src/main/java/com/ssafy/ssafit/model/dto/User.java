package com.ssafy.ssafit.model.dto;


import io.swagger.annotations.ApiModelProperty;

public class User {
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_email;
	private String user_phone;
	@ApiModelProperty(hidden = true)
	private String user_imgFolder;
	@ApiModelProperty(hidden = true)
	private String user_imgFile;
	private String user_nickname;
	private int user_height;
	private int user_weight;
	@ApiModelProperty(hidden = true)
	private int user_point;
	@ApiModelProperty(hidden = true)
	private String user_created_at;
	@ApiModelProperty(hidden = true)
	private String user_deleted_at;
	
	public User() {
	}

	public User(String user_id, String user_pw, String user_name, String user_email, String user_phone,
			String user_imgFolder, String user_imgFile, String user_nickname, int user_height, int user_weight,
			int user_point, String user_created_at, String user_deleted_at) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_phone = user_phone;
		this.user_imgFolder = user_imgFolder;
		this.user_imgFile = user_imgFile;
		this.user_nickname = user_nickname;
		this.user_height = user_height;
		this.user_weight = user_weight;
		this.user_point = user_point;
		this.user_created_at = user_created_at;
		this.user_deleted_at = user_deleted_at;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_imgFolder() {
		return user_imgFolder;
	}

	public void setUser_imgFolder(String user_imgFolder) {
		this.user_imgFolder = user_imgFolder;
	}

	public String getUser_imgFile() {
		return user_imgFile;
	}

	public void setUser_imgFile(String user_imgFile) {
		this.user_imgFile = user_imgFile;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public int getUser_height() {
		return user_height;
	}

	public void setUser_height(int user_height) {
		this.user_height = user_height;
	}

	public int getUser_weight() {
		return user_weight;
	}

	public void setUser_weight(int user_weight) {
		this.user_weight = user_weight;
	}

	public int getUser_point() {
		return user_point;
	}

	public void setUser_point(int user_point) {
		this.user_point = user_point;
	}

	public String getUser_created_at() {
		return user_created_at;
	}

	public void setUser_created_at(String user_created_at) {
		this.user_created_at = user_created_at;
	}

	public String getUser_deleted_at() {
		return user_deleted_at;
	}

	public void setUser_deleted_at(String user_deleted_at) {
		this.user_deleted_at = user_deleted_at;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_pw=" + user_pw + ", user_name=" + user_name + ", user_email="
				+ user_email + ", user_phone=" + user_phone + ", user_imgFolder=" + user_imgFolder + ", user_imgFile="
				+ user_imgFile + ", user_nickname=" + user_nickname + ", user_height=" + user_height + ", user_weight="
				+ user_weight + ", user_point=" + user_point + ", user_created_at=" + user_created_at
				+ ", user_deleted_at=" + user_deleted_at + "]";
	}
	
}

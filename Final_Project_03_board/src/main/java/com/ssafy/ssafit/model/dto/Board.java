package com.ssafy.ssafit.model.dto;

import java.sql.Timestamp;

public class Board {
	
	private int board_id;
	private String board_name;
	private Timestamp board_created_at;
	private int board_point;
	
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Board(int board_id, String board_name, Timestamp board_created_at, int board_point) {
		super();
		this.board_id = board_id;
		this.board_name = board_name;
		this.board_created_at = board_created_at;
		this.board_point = board_point;
	}
	
	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public Timestamp getBoard_created_at() {
		return board_created_at;
	}
	public void setBoard_created_at(Timestamp board_created_at) {
		this.board_created_at = board_created_at;
	}
	public int getBoard_point() {
		return board_point;
	}
	public void setBoard_point(int board_point) {
		this.board_point = board_point;
	}
	@Override
	public String toString() {
		return "Board [board_id=" + board_id + ", board_name=" + board_name + ", board_created_at=" + board_created_at
				+ ", board_point=" + board_point + "]";
	}

}

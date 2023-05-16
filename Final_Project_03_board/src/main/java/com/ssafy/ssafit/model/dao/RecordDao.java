package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.Record;

public interface RecordDao {
	
	
	void registRecod(Record record); 			 //운동 기록 등록
	
	List<Record> selectAllRecord(String id);	//나의 운동기록 전체 불러오기 
	Record selectRecord(int record_num);
	
	void updateRecord(int record_num); 			//기록 수정
	
	void deleteRecord(int record_num);			//기록 삭제
}

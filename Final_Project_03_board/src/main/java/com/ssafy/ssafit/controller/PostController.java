package com.ssafy.ssafit.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Comment;
import com.ssafy.ssafit.model.dto.Post;
import com.ssafy.ssafit.model.service.CommentService;
import com.ssafy.ssafit.model.service.PostService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/ssafit/post")
@Api(tags = "게시글 컨트롤러")
public class PostController {
	
	@Autowired
	PostService postService;
	@Autowired
	CommentService commentService;
	
	@GetMapping("/board/{board_id}")
	@ApiOperation(value="게시판별 글 목록", notes = "board_id로 게시판 별 글 전체 불러오기")
	public ResponseEntity<?> readPostAll(@PathVariable int board_id) {
		List<Post> postlist = postService.readPostAll(board_id);
	return new ResponseEntity<List<Post>>(postlist, HttpStatus.OK);
	}
	
	@PostMapping("/regist")
	@ApiOperation(value="글 등록", notes = "게시글 등록하기 (DB확인)")
	public ResponseEntity<?> registPost(Post post, @ApiIgnore HttpSession session) {
//		if(session.getAttribute("loginUser") == null) {
//			return new ResponseEntity<String>("loginUser is null.",HttpStatus.BAD_REQUEST);
//		}
		postService.registPost(post);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	//여러개 응답 보내는거 확인하기 & 댓글 서비스 만들고 난후 댓글도 불러오게 하기
	@GetMapping("/read/{post_num}") 
	@ApiOperation(value="특정 게시글 상세보기", notes = "post_num 입력시 특정 게시글과 댓글들을 조회 ")
	public ResponseEntity<?> readPost(@PathVariable int post_num) {
		List<Object> detailPage = new ArrayList<>();
		detailPage.add(postService.readPost(post_num)); //Post
		detailPage.addAll(commentService.selectComment(post_num)); //Post

		return new ResponseEntity<List<Object>>(detailPage,HttpStatus.OK);
	}
	
	@PostMapping("/update")
	@ApiOperation(value="게시글 수정", notes = "게시글 수정하기 (DB확인)")
	public ResponseEntity<?> updatePost(Post post) {
		postService.updatePost(post);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PostMapping("delete")
	@ApiOperation(value="게시글 삭제", notes = "게시글 삭제하기 (DB확인)")
	public ResponseEntity<?> deletePost(int post_num) {
		postService.deletePost(post_num);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}	
	

}

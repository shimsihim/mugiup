USE ssafit_final;


INSERT INTO `user` (user_id, user_pw, user_name, user_email, user_phone, user_nickname ) 
VALUES
('ssafy', '1234','김싸피', 'ssafy@ssafy.com', '010-1234-1234', '관리자'),
('rudtjq', '1234','심경섭', '11goatmxj@ssafy.com', '010-5678-5678', '조이'),
('alsgml', '1234','정민희', 'mong2072@ssafy.com', '010-2727-2727', '미늬'),
('codud', '1234','이채영', 'coco@ssafy.com', '010-0505-2424', '채채'),
('whdals', '1234','이종민', 'jjong@ssafy.com', '010-8596-8596', '라따뚜이');


INSERT INTO `Board` (board_name, board_created_at, board_point) 
VALUES
('공지사항', now(), 0),
('자유게시판', now(), "100"),
('운동관련정보', now(), "200"),
('식단관련정보', now(), "200");


INSERT INTO `Post` (post_writer_id, post_board_id, post_title, post_content) 
VALUES
('ssafy', '1', '공지사항글1', '공지사항은 관리자만 작성가능하게 해주세요'),
('ssafy', '1', '공지사항글2', '공지사항은 관리자만 작성가능하게 해주세요'),
('ssafy', '1', '공지사항글3', '공지사항은 관리자만 작성가능하게 해주세요'),
('alsgml', '2', '자유게시글1', '자유게시판에 민희가 쓴 글'),
('alsgml', '2', '자유게시글2', '자유게시판에 민희가 쓴 글'),
('rudtjq', '2', '자유게시글3', '자유게시판에 경섭이가 쓴 글'),
('rudtjq', '2', '자유게시글4', '자유게시판에 경섭이가 쓴 글'),
('alsgml', '3', '운동관련글1', '운동관련글에 민희가 쓴 글'),
('alsgml', '3', '운동관련글2', '운동관련글에 민희가 쓴 글'),
('rudtjq', '3', '운동관련글3', '운동관련글에 경섭이가 쓴 글'),
('rudtjq', '3', '운동관련글4', '운동관련글에 경섭이가 쓴 글'),
('alsgml', '4', '식단관련글1', '식단관련글에 민희가 쓴 글'),
('rudtjq', '4', '식단관련글2', '식단관련글에 경섭이가 쓴 글'),
('codud', '4', '식단관련글3', '식단관련글에 채영이가 쓴 글'),
('whdals', '4', '식단관련글4', '식단관련글에 종민이가 쓴 글');
  
INSERT INTO `Comment` (post_num, comment_writer_id, comment_content) 
VALUES
('1', 'alsgml', '확인용댓글입니다.'),
('1', 'rudtjq', '확인용댓글입니다'),
('1', 'codud', '확인용댓글입니다'),
('1', 'whdals', '확인용댓글입니다'),
('4', 'alsgml', '확인용댓글입니다.'),
('4', 'rudtjq', '확인용댓글입니다'),
('4', 'codud', '확인용댓글입니다'),
('8', 'whdals', '확인용댓글입니다'),
('8', 'alsgml', '확인용댓글입니다.'),
('8', 'rudtjq', '확인용댓글입니다'),
('8', 'codud', '확인용댓글입니다'),
('12', 'whdals', '확인용댓글입니다'),
('12', 'alsgml', '확인용댓글입니다.'),
('12', 'rudtjq', '확인용댓글입니다'),
('12', 'codud', '확인용댓글입니다');

SELECT * FROM user;
SELECT * FROM board;
SELECT * FROM post;
SELECT * FROM comment;


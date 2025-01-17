package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    //게시글 목록
    public List<BoardVO> getList();
    //게시글 추가
    public void boardInsert(BoardVO boardVO);
    //게시글 한 개 가져오기
    public BoardVO boardSelectOne(Integer boardNumber);
    //게시글 수정
    public void boardUpdate(BoardVO boardVO);
    //게시글 삭제
    public void boardDelete(BoardVO boardVO);
    //게시글 전체 개수
    public void boardGetTotal();
    //게시글 작성 시간 가져오기
    public String boardGetRegisterDate();
    //게시글 수정 시간 가져오기
    public String boardGetUpdateDate();
    //게시글 신고 횟수 가져오기
    public Integer boardGetWarningCount();
    //게시글 제목 가져오기
    public void boardGetTitle(BoardVO boardVO);
    //게시글 내용 가져오기
    public void boardGetContent(BoardVO boardVO);
    //게시글 카테고리 가져오기
    public void boardGetField(BoardVO boardVO);




}

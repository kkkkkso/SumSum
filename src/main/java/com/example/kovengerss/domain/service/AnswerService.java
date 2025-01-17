package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.AnswerVO;
import org.springframework.stereotype.Service;

@Service
public interface AnswerService {
    //메세지 답장 작성
    public void answerInsert(AnswerVO answerVO);
    //메세지  답장 한개 가져오기
    public AnswerVO answerSelectOne(Integer answerNum);
    //메세지 답장 수정
    public void answerUpdate(AnswerVO answerVO);
    //메세지 답장 삭제
    public void answerDelete(AnswerVO answerVO);
    //메세지 답장 보낸 시간 가져오기
    public String answerGetSendDate();
    //메세지 답장 제목 가져오기
    public String answerSelectTitle(AnswerVO answerVO);
    //메세지 답장 내용 가져오기
    public String answerSelectContent(AnswerVO answerVO);
}

package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.MessageVO;
import com.example.kovengerss.mapper.MessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MessageDAO {
    private final MessageMapper messageMapper;

    //메세지(쪽지) 목록
    public void msgGetList(){;}
    //메세지(쪽지) 입력
    public  void msgInsert(MessageVO messageVO){;}
    //메세지(쪽지) 수정
    public  void msgUpdate(MessageVO messageVO){;}
    //메세지(쪽지) 삭제
    public  void msgDelete(MessageVO messageVO){;}
    //메세지(쪽지) 전체수
    public void msgGetTotal(){;}
    //메세지(쪽지) 보낸 시간 가져오기
    public void msgGetSendDate(){;}
    //메세지(쪽지) 한개 가져오기
    public void msgSelectOne(Integer messageNum){;}
    //메세지(쪽지) 제목 가져오기
    public void msgSelectTitle(MessageVO messageVO){;}
    //메세지(쪽지) 내용 가져오기
    public void msgSelectContent(MessageVO messageVO){;}
}

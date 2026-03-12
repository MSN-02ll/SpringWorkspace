package com.kh.spring.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.kh.spring.board.model.vo.BoardExt;
import com.kh.spring.common.util.Utils;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class XSSHandlingAOP {

	@AfterReturning(pointcut="CommonPointcut.boardPoint()", returning = "returnObj")
	public void xssHandle (JoinPoint jp , Object returnObj) {
		//반환형이 boardEXt인 경우 /게시판수정삭제
		//boardExt내부의 값 중 제목과 내용을 꺼내서 Xss방어처ㅣㅇㄹ
		if(returnObj instanceof BoardExt) {
			BoardExt b = (BoardExt) returnObj;
			b.setBoardContent( Utils.XSSHandling(b.getBoardContent()) );
			
			b.setBoardTitle( Utils.XSSHandling(b.getBoardTitle()));
			
			b.setBoardContent(Utils.newLineHandling(b.getBoardContent()));
			
		}
		
	}
	
	
}

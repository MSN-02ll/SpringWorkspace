package com.kh.spring.common.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
/* 
 * 
 * Aspect
 * 
 * 공통관심사를 모듈화한 클래스를 의미한다
 * 이 클래스 안에서는 실제로 수행될 공통 로직(Advice)과 (joinpoint)
 * 그 로직을 적용시킬 지점(Pointcut) 을 정의해야 한다
 * 
 * 
 * */
public class Aop {
/* 
 * JoinPoint
 *  - 클라이언트가 호출 가능ㅎㄴ 모든 메서드 실행 지점을 의미
 *  - AOP가 적용될수 있는 후보지들.
 *  - Pointcut
 *  무수히 많은 JoinPoint안에서 실제 어드바이스 공통로직이 
 *  실행될 지점을 의미ㅣ한다
 *  
 *  @Pointcut("excution([접근제한자] [반환형] 패키지명.클래스명.메서드명([매개변수]))") [] == 생략가능
 *  * - 모든 값
 *  .. - 매개변수에서는 0개 이상을 의미
 * 
 * */
	
	
	
	//boad패키지 아래 Impl로 끝나는 클래스의 모든 메서드를 Pointcut으로 지정
	@Pointcut("execution(* com.kh.spring.board..*Impl.*(..))")
	
	public void testPointcut () {}
	
	//@Before("testPointcut()")
	public void start () {
		//서비스 로직 시작시 로깅
		log.debug("=============================== Service Start ===============================");
		
	}
	
	
	
	
	
	
	
}











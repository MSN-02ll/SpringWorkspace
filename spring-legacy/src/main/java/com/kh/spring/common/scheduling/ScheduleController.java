package com.kh.spring.common.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ScheduleController {
	
	/*  
	 * 1. 고정시간 방식 스케줄링
	 * fixedDelay ; 이전 작업 종료 시점으로 지정한 시간만큼 지연한 후 실행
	 * fixedRate : 이전 작업 시작 지점을 기준으로 일정 간격으로 메서드를 수행
	 *  
	 * */
	
//	
//	@Scheduled(fixedDelay = 5000)
//	public void fixedDelayTask() {
//		log.debug("[fixedDelay] 작업 실행 중 - {}", System.currentTimeMillis());
//	}
//	
//	@Scheduled(fixedRate = 5000)
//	public void fixedRateTest() {
//		log.debug("[fixedRate] 작업 실행 중 - {}", System.currentTimeMillis());
//	}
//	
	


/*  
 * 2. cron 표현식
 * 
 * cron : 초 분 시 일 월 요일
 *        * * *  * * * 
 * 
 * 		* : 모든값 (매분 , 매초 , 매시간)
 * 		? : 일, 요일에서만 사용 가능 
 * 		- : 값의 범위 (1-10)
 *  	, : 여러값을 지정할때 (1,5,10) 1초5초10초
 *  	/ : 증가단위 (0/2 -> 0초부터 2초간격으로)
 *		L : 마지막을 의미 , 매달 마지막일 
 *		W : 가장 가까운 평일
 *		# : N번째 요일
 *		
 *		매일 오전 1시에 어떤 작업을 실행하고싶다
 *	cron : 0 0 1 * * *
 *
 * 		매 시간 30분
 * 			0 30 * * * *
 * 
 * 
 * */

	@Scheduled(cron = "0/5 * * * * *")
 public void testCron () {
	 log.debug("크론 표현식 {}", System.currentTimeMillis());
 }
 
}





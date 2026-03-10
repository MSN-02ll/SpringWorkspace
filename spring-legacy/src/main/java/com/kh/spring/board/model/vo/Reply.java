package com.kh.spring.board.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 매개생성 부분에서 많이 쓰이는 프레임워크 어노테이션
@Data
public class Reply {

	private int replyNo;
	private String replyContent;
	private String refBno;
	private String replyWriter;
	private String createDate;
	private String status;
}

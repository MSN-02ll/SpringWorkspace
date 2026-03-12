package com.kh.spring.chat.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatRoomJoin {

	private int userNo;
	private int chatRoomNo;
	//이거 두개 합쳐서 FPK
}

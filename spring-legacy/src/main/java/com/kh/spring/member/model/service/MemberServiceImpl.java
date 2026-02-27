package com.kh.spring.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.spring.member.model.dao.MemberDao;
import com.kh.spring.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public Member loginMember(Member m) {
		return memberDao.loginMember(m);
	}

	@Override
	public int insertMember(Member m) {
		return memberDao.insertMember(m);
	}

	@Override
	public int idCheck(String userId) {
		// TODO Auto-generated method stub
		return memberDao.idCheck(userId);
	}

	@Override
	public Member selectOne(String userId) {
		// TODO Auto-generated method stub
		return memberDao.selectOne(userId);
	}

}

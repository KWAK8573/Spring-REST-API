package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.dto.Member;
import com.example.demo.service.MembersService;

@Service
public class MembersServiceImpl implements MembersService {

	@Override
	public Member testMember() {
			Member testMember = new Member();
			testMember.setId(1);
			testMember.setName("testName");
			testMember.setAge(15);
			testMember.setDept("서비스로 이동 함!");
			
			return testMember;
	}

}

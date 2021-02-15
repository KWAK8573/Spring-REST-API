package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.MembersService;

import com.example.demo.dto.Member;

@RestController
public class MembersController {
		
		@Autowired
		private MembersService service;
	
		@GetMapping(path= "/test")
		public Member memberTest() {
				
				return service.testMember();
		}
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Subject;
import com.example.demo.repository.SubjectRepository;

public class SubjectServiceImpl implements SubjectService{
	
	
	@Autowired
	SubjectRepository subjectRepository;

	@Override
	public Subject insertStudent(Subject subject) {
		return subjectRepository.save(subject);
	}

	
	
	
	
}

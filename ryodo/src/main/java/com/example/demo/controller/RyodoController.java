package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Classroom;
import com.example.demo.repo.Classroomrepo;

@RestController
public class RyodoController {

	@Autowired
	Classroomrepo classroomrepo ;
	
	
	@GetMapping("fetchstudentbyclassroomid")
	public ResponseEntity  getStudentInClass(@RequestParam("classroomid") String classRoomId) {
		
		      List<Classroom> classroomlist = classroomrepo.findByClassroomId(Integer.parseInt(classRoomId));
		
		if(classroomlist.isEmpty()) {
		return new ResponseEntity("No Classroom found for given classroomid",HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity(classroomlist,HttpStatus.FOUND);
		}
		}
	
	
}

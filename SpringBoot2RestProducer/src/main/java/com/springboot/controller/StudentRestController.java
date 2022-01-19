package com.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;

@RestController
@RequestMapping("/rest/student")
public class StudentRestController {

	@GetMapping("showa")
	public ResponseEntity<String> showMsgA() {
		System.out.print("From SHOWA.");
		return ResponseEntity.ok("Welcome to Application!");
	}

	@GetMapping("showb/{id}/{name}")
	public ResponseEntity<String> showMsgB(@PathVariable Integer id, @PathVariable String name) {
		System.out.print("From SHOWB.");
		return ResponseEntity.ok("Welcome to Application! " + id + "," + name);
	}

	@GetMapping("/showc")
	public ResponseEntity<Student> showMsgC() {
		System.out.println("From SHOWC");
		return ResponseEntity.ok(new Student(10, "A", 200.0));

	}

}

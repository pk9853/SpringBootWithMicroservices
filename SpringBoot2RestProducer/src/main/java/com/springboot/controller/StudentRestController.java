package com.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/showd")
	public ResponseEntity<List<Student>> showMsgD() {
		System.out.println("From SHOWD");
		return ResponseEntity.ok(
				Arrays.asList(
						new Student(10, "A", 200.0),
						new Student(11,"B",300.0),
						new Student(12,"C",400.0)
						));
	}
	
	@PostMapping("/savea")
	public  ResponseEntity<String> saveDataA(@RequestBody Student student)
	{
		System.out.println("FROM SAVE#A"+student);
		return ResponseEntity.ok(student.toString());
	}
}

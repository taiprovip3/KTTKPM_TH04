package spring.data.jpa.spring.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import spring.data.jpa.spring.data.jpa.entity.ChuyenBay;
import spring.data.jpa.spring.data.jpa.service.ChuyenBayService;
import spring.data.jpa.spring.data.jpa.service.MayBayService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
	
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/cau17")
	public List<ChuyenBay> cau17(){
		return chuyenBayService.cau17("SGN", "DAD");
	}
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}
	
}

package com.web.intercecptor;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.exception.CustomException;

@RestController
//@CrossOrigin("*")
public class SpringController {

	@RequestMapping(value  = "/test/url", method = RequestMethod.POST)
	public ResponseEntity<Object> getDetails() throws Exception{
		System.out.println("inside controlelr");
		throw new CustomException("test exception");
		//return new ResponseEntity<Object>(null, HttpStatus.OK);
		//@RequestBody Map<String, Object> input
	}
}

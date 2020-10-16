package com.luciano.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
	
	
	@ApiOperation(value="Retorna um exemplo hello world")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Sucesso method return")	
	})
	@GetMapping
	public String hello() {
		return "Olá";
	}
	

}

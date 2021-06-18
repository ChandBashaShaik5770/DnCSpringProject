package com.dnc.mvc.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController 
{
	@RequestMapping("/book/{name}/{id}")
	public String hello(@PathVariable("name") String name,@PathVariable("id") int id)
	{
		return "Hello World "+name+" "+id;
	}

}

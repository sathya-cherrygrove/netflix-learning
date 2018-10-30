package com.DatamuseServer.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.DatamuseServer.Services.callDatamuse;

@RestController
public class ClassDatamuseAPI{
	
	@Autowired
	private callDatamuse calldata;
	@RequestMapping("/datamuse")
	public String getDatamuseAPI(@RequestParam("value") String wordvalue)
	{
		String wordData = calldata.test(wordvalue);
		return wordData;
		
	}	
	
	
	@RequestMapping("/datacheck")
	public String testDatamuseAPI()
	{
		
		return "Datamuse Running Correctly";
		
	}	
	

}

package com.DatamuseServer.Services;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.DatemuseServer.model.wordPojo;

@Component
public class callDatamuse {

	public String test(String word) {

		RestTemplate resttemplate = new RestTemplate();
		String url = "https://api.datamuse.com/" + "words?rel_jjb=" + word;
		
		
		ResponseEntity<List<wordPojo>> response = resttemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<wordPojo>>() {
				});
		List<wordPojo> worddata = response.getBody();
		String alldata = "";

		for (wordPojo w : worddata) {
			alldata = alldata + w.getWord() + "\n";

		}
		
		return alldata;

	}

}

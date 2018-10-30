package com.DatemuseServer.model;

import org.springframework.stereotype.Component;

@Component
public class wordPojo {
	
	private String word;
	private String score;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}

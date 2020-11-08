package com.test.question.q17;

public class TIme {

	private int hour;
	private int minute;
	private int second;
	
	public TIme() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public TIme(int hour, int minute, int second) {
		
		this.second = second % 60;
		this.hour = (second / 60 + minute) / 60;
		this.minute = (second / 60 + minute) % 60;
		this.hour += hour;
		
	}

	public TIme(int minute, int second) {
		
		this.second = second % 60;
		this.hour = (second / 60 + minute) / 60;
		this.minute = (second / 60 + minute) % 60;
		
	}

	public TIme(int second) {
		
		this.second = second % 60;
		this.hour = (second / 60) / 60;
		this.minute = (second / 60) % 60;
		
	}

	public String info() {
		
		return String.format("%d:%02d:%02d", this.hour , this.minute, this.second);
	}
	
}
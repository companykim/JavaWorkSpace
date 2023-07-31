package study.util.scanner;

import java.util.Date;

public class TimerGreeting {

	public static void main(String[] args) {
		Date time = new Date();
		
		int hours = time.getHours();
//		int minutes = time.getMinutes();
//		int seconds = time.getSeconds();
		
		System.out.println("현재 시간은 " + time);
		
		if (hours >= 6 && hours < 12) {
			System.out.println("Good morning");
		} else if (hours < 18) {
			System.out.println("Good afternoon");
		} else if (hours < 23) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}
	}
}

package com.date;

import java.time.LocalTime;

public class time {
		public static void main(String[] args) {
			LocalTime it = LocalTime.now();
			System.out.println(it);
			System.out.println(it.getMinute());
			System.out.println(it.getSecond());
			System.out.println(it.minusMinutes(100));
		}
}

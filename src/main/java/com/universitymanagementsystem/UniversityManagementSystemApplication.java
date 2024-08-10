package com.universitymanagementsystem;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversityManagementSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(UniversityManagementSystemApplication.class, args);
		findMissingNumber();
	}
	
	/*
	 * arr[N-1] 1 => N N=9 arr[8] 1 => 9
	 * 
	 * arr[1,2,3,4,6,7,8,9]
	 */
					
	public static void findMissingNumber() {
		int N = 9;
		int arr[] = new int[] {1,2,3,4,6,7,8,5};
		for (int i = 1; i <= N; i++) {
			boolean isNumberMissed = false;
			for (int j = 0; j < N - 1; j++) {
				if(i == arr[j]) {
					break;
				}
				if (j == N-2 && i != arr[j]) {
					isNumberMissed = true;
				}
			}
		if(isNumberMissed) {
			System.out.println("Missed Number "+ i);
			break;
		}	
		}
	}
	

}

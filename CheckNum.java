package com.acharya.classes;
import java.util.Scanner;

		public class CheckNum {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the numbers:");
		        int[][] arr = new int[3][3];

		        System.out.println("Enter the numbers:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                arr[i][j] = sc.nextInt();
		            }
		        }

		        int count1to50 = 0, count50to100 = 0, countAbove100 = 0;

		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                if (arr[i][j] >= 1 && arr[i][j] <= 50) {
		                    count1to50++;
		                } else if (arr[i][j] > 50 && arr[i][j] <= 100) {
		                    count50to100++;
		                } else if (arr[i][j] > 100) {
		                    countAbove100++;
		                }
		            }
		        }

		        System.out.println("Numbers between 1 to 50: " + count1to50);
		        System.out.println("Numbers between 50 to 100: " + count50to100);
		        System.out.println("Numbers above 100: " + countAbove100);
		    }
		}



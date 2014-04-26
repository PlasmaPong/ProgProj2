package SortingAlgorithmTesting;

import java.lang.Math;
import java.util.Random;
import java.io.*;

public class Tester {
	static PrintWriter output;
	static long runtime;
	public static void main(String[] args){

		try {
			output = new PrintWriter("Results.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("aint no file here mang");
			System.exit(0);
		}
		int j;
		int averager;
		Random rand = new Random();
		for(int i = 1000; i<10000000;i*=10){

			runtime = 0;
			for(j = 10; j<1000000;j*=10){
				for(averager = 0;averager<=10;averager++){
					int[] array = new int[i];
					
					for(int k = 0;k<array.length;++k){
						int num = rand.nextInt(j);
						if(num<0){
							array[k]=num*(-1);
						}else
							array[k]=num;
					}
					long initTime = System.currentTimeMillis();
					SortingAlgorithms.countingSort(array, j);
					long finalTime = System.currentTimeMillis();
					runtime+=(finalTime-initTime);
					/*
					 * SYSOUT SET FOR DESIGNATION
					 */
					//System.out.println("Time spent for Merge Sort");
				}
				output.println("average runtime for 10 iterations"+(runtime/(long)averager));
			}

		}
	}
}

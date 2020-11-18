package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] salary={4000,3000,1000,2000};
        int max=salary[0];
        int min=salary[0];
        int sum=0;
        for (int i = 0; i <salary.length ; i++) {
            if (max < salary[i]) {
                max = salary[i];
            }
            min=min>salary[i]?salary[i]:min;
            sum+=salary[i];
        }
        sum=sum-min-max;

        double r = (double)sum / (salary.length - 2);
        System.out.println(r);
    }
}

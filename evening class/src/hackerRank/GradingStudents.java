package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class GradingStudents {
	public static  ArrayList<Integer> gradeingStudents(ArrayList<Integer> grades) {
		ArrayList al=new ArrayList();
		int i=0,size=grades.size();
		while(size>0){
            int n=grades.get(i);

            if(n>37){
                if(n%5==0||((5*((n/5)+1))-n)>=3){
                    al.add(n);
                }
                else{
                    al.add(5*((n/5)+1));
                }
            }
            else
                al.add(n);
            	size--;
            i++;
        }
        return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		ArrayList<Integer> grades=new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			grades.add(scan.nextInt());
		}
		System.out.println(gradeingStudents(grades));

	}

}

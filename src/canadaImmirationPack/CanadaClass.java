package canadaImmirationPack;

import java.util.Iterator;
import java.util.Scanner;

public class CanadaClass {
	
	String degree;
	int education,total;
	int experience,ielts,Age,experPoint,agePoint;
	double ieltsPoint;
	boolean isRelative;
	int[] age = {18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47};
	int[] score = new int[10];
	Scanner sc = new Scanner(System.in);
	
	void education() {
		System.out.println("ENTER YOUR EDUCATION LEVEL");
		degree=sc.next();
		switch(degree) {
		case "phd":
			education=25;
			//System.out.println("25 point scored");
			break;
		case "masters":	
			education=23;
			//System.out.println("23 point scored");
			break;
		case "university":
			education=22;
			//System.out.println("22 point scored");
			break;
		case "12degree":
			education=21;
			//System.out.println("21 point scored");
			break;
			default:
				System.out.println("Not eligible");
				break;
			}
	}
	void experience() {
		System.out.println("ENTER YOUR EXPERIENCE IN YEAR");
		experience=sc.nextInt();
		switch (experience) {
		case 4:
			experPoint=13;
			break;
		case 5:
			experPoint= 13;
			break;
		case 6:
			experPoint=15;
			break;
			default:
				System.out.println("not accetable");
				break;
		}
				
			}
	void age() {
		for(int i=0;i<=age.length;i++) {
			System.out.println("ENTER THE AGE IN YEARS");
			Age=sc.nextInt();
		switch(age[i]) {
		case 18:
			agePoint=12;
			break;
		case 19:
			agePoint=12;
			break;
		case 20:
			agePoint=12;
			break;
		case 21:
			agePoint=12;
			break;
		case 22:
			agePoint=12;
			break;
		case 23:
			agePoint=12;
			break;
		case 24:
			agePoint=12;
			break;
		case 25:
			agePoint=12;
			break;
		case 26:
			agePoint=12;
			break;
		case 27:
			agePoint=12;
			break;
		case 28:
			agePoint=12;
			break;
		case 29:
			agePoint=12;
			break;
		case 30:
			agePoint=12;
			break;
		case 31:
			agePoint=12;
			break;
		case 32:
			agePoint=12;
			break;
		case 33:
			agePoint=12;
			break;
		case 34:
			agePoint=12;
			break;
		case 35:
			agePoint=12;
			break;
		case 36:
			agePoint=11;
			break;
		case 37:
			agePoint=10;
			break;
		case 38:
			agePoint=9;
			break;
		case 39:
			agePoint=8;
			break;
		case 40:
			agePoint=7;
			break;
		case 41:
			agePoint=6;
			break;
		case 42:
			agePoint=5;
			break;
		case 43:
			agePoint=4;
			break;
		case 44:
			agePoint=3;
			break;
		case 45:
			agePoint=2;
			break;
		case 46:
			agePoint=1;
			break;
		case 47:
			agePoint=0;
			break;
			default:
				System.out.println("not accetable");
				break;
		}
		break;
		}
		
	}
	void ielts() {
		System.out.println("ENTER YOUR IELTS SCORE FOR LISTENING");
		ielts=sc.nextInt();
		if(ielts>=8) {
			ieltsPoint=6;
			}
		else if (ielts<=7.5) {
			ieltsPoint=5;
		}
			else {
				System.out.println("not accetable");
			}
		System.out.println("ENTER THE IELTS SCORE FOR SPEAKING");
		ielts=sc.nextInt();
		if(ielts>=7) {
			ieltsPoint=6;
		}
		else if(ielts<=6.5) {
			ieltsPoint=5;
		}
		else
		{
			System.out.println("not accetable");
		}
		System.out.println("ENTER THE IELTS SCORE FOR READING");
		ielts=sc.nextInt();
		if(ielts>=7) {
			ieltsPoint=6;
			}
		else if(ielts<=6.5) {
			ieltsPoint=5;
		}
		else {
			System.out.println("not accetable");
		}
		System.out.println("ENTER THE IELTS SCORE FOR WRITING");
		ielts=sc.nextInt();
		if(ielts>=7) {
			ieltsPoint=6;
		}
		else if(ielts<=6.5) {
			ieltsPoint=5;
		}
		else {
			System.out.println("not accetable");
		}
		
		
	}
	//void adaptbility() {
	//	System.out.println("IF YOU HAVE A RELATIVE IN CANADA");
	//	isRelative=sc.nextBoolean();
	//	if(isRelative==)
		
		
	//}
	void total() {
		total=education + experPoint + agePoint + ieltsPoint;
		System.out.println("TOTAL POINTS YOU HAVE SCORED :"+total);
		System.out.println("you qualify to submit an expression of interest(EOI) to immigration canada");
		
	}
			
		
	}
	
	



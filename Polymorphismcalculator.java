package week3.day2;

public class Polymorphismcalculator {
	public int add(int a1, int a2, int a3) {
		int sum=a1+a2+a3;
		return sum;
	}
	public int add(int a1, int a2) {
		int sum=a1+a2;
		return sum;
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Polymorphismcalculator poly=new Polymorphismcalculator();
System.out.println(poly.add(2, 4, 6));
System.out.println(poly.add(5, 6));;
	}
}

import java.util.Scanner;
public class wip12 {
	void generatefibonacci(int x){
        int a=0;
        int b=1,c;

		System.out.println(a+"\n");
		while(x>0){
			System.out.println(b+"\n");
			c=b;
			b=a+b;
			a=c;
			x--;
            	}
	
	}
	public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					wip12 a=new wip12();
					System.out.println("Enter number");
					int y=sc.nextInt();
					a.generatefibonacci(y);
					sc.close();
				}
			

		}



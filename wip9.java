import java.util.Scanner;
public class wip9 {
	void cross(int arr[],int s) {
		int min = 0;
		for (int i=0;i<s;i++) {
			if(min>arr[i])
				min=i;
		}
		int sum=0;
		for(int i=0;i<s;i++ ) {
			if(i!=min) {
				if(i==s-1) {sum=sum+arr[i];}
				else {
			sum=sum+(arr[min]+arr[i]);
			}}
		}
		System.out.println("Total time taken="+sum+"mins");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of people");
		int s=sc.nextInt();
		int[] time=new int[s];
		System.out.println("Enter the time required for each");
		for(int i=0;i<s;i++) {
			time[i]=sc.nextInt();
		}
		wip9 a=new wip9();
		a.cross(time, s);

		sc.close();
	}
	}

	



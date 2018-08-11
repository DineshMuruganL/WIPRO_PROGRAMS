import java.util.*;
public class wip11 {
public static void main(String ar[])
			{
				int n,sum=0,i;
				int[] a=new int[20];
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the N value=");
				n=s.nextInt();
				for(i=0;i<n;i++)
				{
					if(i%2==0)
					{a[i]=i;
						sum+=i;
			}
				}
				System.out.println("The sum of even numbers till"+n+"is"+a[2]+"+"+a[4]+"="+sum);

		}
		}

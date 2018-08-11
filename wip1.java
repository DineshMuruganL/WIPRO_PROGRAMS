import java.util.*;
		
public class wip1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{Scanner s=new Scanner(System.in);
				int[] d=new int[15];
				int i;
				System.out.println("Enter your  15 values=");
				for(i=0;i<15;i++)
				{
					d[i]=s.nextInt();
				}
				for(i=0;i<15;i++)
				{
					if(d[i]%3==0)
					{
						System.out.println(d[i]+"=is divisible by 3");
					}
					else
					{
						System.out.println(d[i]+"=is not divisible by 3");
					}
				}
			}

		}


	}



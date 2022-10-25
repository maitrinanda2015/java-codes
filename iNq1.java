
public class iNq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println();
		System.out.println();
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)//I
			{
			   if(j==(3*n)/4)
				   System.out.print("#");
			   else
				   System.out.print(" ");
			}
			System.out.print("   ");
			for(int j=0;j<n;j++)//N
			{
			   if(j==0||j==n-1||i==j)
				   System.out.print("#");
			   else
				   System.out.print(" ");
			}
			System.out.print("   ");
			for(int j=0;j<n;j++)//E
			{
			   if(j==0||i==0||i==n-1||i==(n-1)/2)
				   System.out.print("#");
			   else
				   System.out.print(" ");
			}
			System.out.print("   ");
			for(int j=0;j<n;j++)//U
			{
			   if(j==0&&i<n-2||j==n-1&&i<n-2||i==n-1&&j>1&&j<n-2||i==n-2&&j==1||i==n-2&&j==n-2)
				   System.out.print("#");
			   else
				   System.out.print(" ");
			}
			System.out.print("   ");
			for(int j=0;j<n;j++)//R
			{
			   if(j==0||i==0&&j<n-2||i==(n-1)/2&&j<n-2||i==1&&j==n-2||i==(n-1)/2-1&&j==n-2||i==(n-1)/2-2&&j==n-1||i-j==1&&i>=(n-1)/2&&j>3)
				   System.out.print("#");
			   else
				   System.out.print(" ");
			}
			System.out.print("   ");
			for(int j=0;j<n;j++)//O
			{
			   if(j==0&&i<n-2&&i>1||j==n-1&&i<n-2&&i>1||i==n-2&&j==1||i==n-2&&j==n-2||i==n-1&&j>1&&j<n-2||i==0&&j>1&&j<n-2||
					   i==1&&j==1||j==n-2&&i==1 )
				   System.out.print("#");
			   else
				   System.out.print(" ");
			}
			System.out.print("   ");
			for(int j=0;j<n;j++)//N
			{
			   if(j==0||j==n-1||i==j)
				   System.out.print("#");
			   else
				   System.out.print(" ");
			}

			System.out.println();
		}

	}

}

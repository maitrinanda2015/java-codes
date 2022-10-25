
public class iNq5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23;
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print("        ");
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||i+j<=(n-1)/2||i-j>=(n-1)/2)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

public class INeuronPattern {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)//Letter i
			{
			if(j==(3*n)/4 && i!=0&&i!=3||
			   i==2&& j>=((3*n)/4)-1&&j<=((3*n)/4)+1) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//Letter N
			{
			if(j==0||j==n-1||i==j) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//Letter e
			{
			if(i==(5*n)/8||j==0&&i==-1||j==n-1&&i==((5*n)/8)-1||
		       j==1&&i==((5*n)/8)-2||j==n-2&&i==((5*n)/8)-2||i==((5*n)/8)-3&&j>1&&j<n-2
		      ||j==0&&i>((5*n)/8)-2&&i!=n-1||i==n-1&&j>0&&j<n-1||j==n-1&&i==n-2) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//Letter u
			{
			if(j==0&&i>=3&&i<n-2||i==n-1&&j>1&&j<n-2||j==n-2&&i==n-2||
			   j==1&&i==n-2||j==n-1&&i>=3&&i<n-2) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//Letter r
			{
			if(j==1&&i>=3||i==5&&j==2||i==4&&j==3||i==3&&j>3&&j<n-2)
				 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print(" ");
			for(int j=0;j<n;j++)//Letter o
			{
			if(j==0&&i>4&&i<n-2||j==n-1&&i>4&&i<n-2||i==4&&j==1||i==4&&j==n-2||
			   i==3&&j>1&&j<n-2||i==n-1&&j>1&&j<n-2||i==n-2&&j==1||i==n-2&&j==n-2)
				 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("   ");
			for(int j=0;j<n;j++)//Letter n
			{
			if(j==0&&i>=3||i==5&&j==1||i==4&&j==2||i==3&&j>=3&&j<n-2||i==4&&j==n-2||j==n-1&&i>4)
				 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("     ");
			for(int j=0;j<n-9;j++)//Letter n
			{
			if(j==1&&i==n-1)
				 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("     ");
			for(int j=0;j<n;j++)//Letter a
			{
			if(j==0&&i>4&&i<n-2||j==n-2&&i>4&&i<n-1||i==4&&j==1||i==4&&j==n-3||
			   i==3&&j>1&&j<n-3||i==n-1&&j>1&&j<n-3||i==n-2&&j==1||i==n-2&&j==n-3||i==n-1&&j==n-1)
				 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.print("  ");
			for(int j=0;j<n;j++)//Letter i
			{
			if(j==(n)/4 && i!=0&&i!=3||
			   i==2&& j>=(n/4)-1&&j<=((n)/4)+1) 
				System.out.print("#");
			else
			    System.out.print(" ");
		    }
			System.out.println();
       	}

	}

}

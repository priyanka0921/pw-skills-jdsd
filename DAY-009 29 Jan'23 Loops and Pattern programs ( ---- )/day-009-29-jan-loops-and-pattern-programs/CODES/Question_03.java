public class Question_03
{
	public static void main(String[] args) {
	    int n = 14;
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<=n;j++)
	        {
	            if(i==0&&j<(n-1)||i==(n-1)&&j<(n-1)||j==0&&i<(n-1)||j==(n-1)&&i<=(n-1)||i==1&&j!=(n-1)/2&&i<(n/4)&&j<(n-1)||
	            i==2&&j!=(n-1)/2&&j<(n-1)&&j!=5&&j!=7||i==3&&j!=(n-1)/2&&j<(n-1)&&j!=6&&j!=5&&j!=4&&j!=7&&j!=8
	            ||i==4&&j!=(n-1)/2&&j<(n-1)&&j!=3&&j!=5&&j!=4&&j!=7&&j!=8&&j!=9||
	            i==5&&j!=(n-1)/2&&j<(n-1)&&j!=3&&j!=5&&j!=4&&j!=7&&j!=8&&j!=9&&j!=2&&j!=10||
	            i==6&&j!=(n-1)/2&&j<(n-1)&&j!=3&&j!=5&&j!=4&&j!=7&&j!=8&&j!=9&&j!=2&&j!=10&&j!=1&&j!=11)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
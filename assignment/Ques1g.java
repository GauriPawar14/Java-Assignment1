package assignment;

public class Ques1g {

	public static void main(String[] args) {
		int r=5,x=5,y=5,c;
		for(r=0;r<=5;r++) {
			for(c=0;c<=10;c++) 
			{
				if(r==5 || x==c || y==c) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
			x--;
			y++;
		}

	}

}

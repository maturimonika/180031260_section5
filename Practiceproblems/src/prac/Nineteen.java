package prac;

public class Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int c=0;
		while(c<=5)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i);
				c++;
			}
		}

	}

}

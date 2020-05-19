package Newpagkage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(args[0]);
		for (int i = 0; i < N; i++)
			   for (int j = 0; j < N; j++)
			       if (i != j) System.out.print(i + ", " + j);

			for (int i = 0; i < N; i++)
			   for (int j = 0; (i != j) && (j < N); j++)
			       System.out.println(i + ", " + j);
			

	}

}

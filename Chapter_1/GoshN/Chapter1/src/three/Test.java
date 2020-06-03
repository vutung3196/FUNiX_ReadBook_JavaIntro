package three;

public class Test {
	public static void main(String[] args) {
		int N = 5;
		for (int i = 0; i < N; i++)
			   for (int j = 0; (i != j) && (j < N); j++)
			       System.out.println(i + ", " + j);
	}
	

}




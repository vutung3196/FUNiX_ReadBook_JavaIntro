
public class SeriesSum {
	public static void main(String[] args) {
		// nhap so n
		int n = Integer.parseInt(args[0]);
		// phuong an a
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {      
           	sum += 1 / (i * i);           	
        }
        System.out.println("Sum = " + sum); 
        System.out.println("Pi = " + Math.sqrt(6 * sum));
        System.out.println();      
        // phuong an b
        sum = 0.0;
        for (int i = 1; i <= n; i++) {
	         sum += 1.0 / i * i;  
	    }
        System.out.println("Sum = " + sum);       	
        System.out.println("Pi = " + Math.sqrt(6 * sum));        	
        System.out.println();
        // phuong an c
        sum = 0.0;
  		for (int i = 1; i <= n; i++) { 				
	         sum += 1.0 / (i * i);   
 	    }
        System.out.println("Sum = " + sum);       	
        System.out.println("Pi = " + Math.sqrt(6 * sum)); 
 		System.out.println(); 		
 		// phuong an d
 		sum = 0.0;
 		for (int i = 1; i <= n; i++) {
			sum += 1 / (1.0 * i * i);
        }
        System.out.println("Sum = " + sum);       	
        System.out.println("Pi = " + Math.sqrt(6 * sum)); 
	}        	
}

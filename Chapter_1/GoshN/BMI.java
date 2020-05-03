
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double H = Double.parseDouble(args[0]);
		double W = Double.parseDouble(args[1]);
		
		double BMI = W / (Math.pow(H, 2));
		System.out.println("BMI = " + BMI);
		if (0 < BMI && BMI <= 18.5 )
			System.out.println("Underweight");
		else if (18.5 < BMI && BMI <=25)
			System.out.println("Normal");
		else if (25 < BMI && BMI <= 30 )
			System.out.println("Overweight");
		else 
			System.out.println("Obese");
	}

}

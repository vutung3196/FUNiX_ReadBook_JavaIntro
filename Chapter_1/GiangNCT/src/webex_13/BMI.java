package webex_13;

// 78. takes two command-line arguments, weight and height, computes the BMI, and prints the corresponding BMI category:
// Starvation: less than 15
// Anorexic: less than 17.5
// Underweight: less than 18.5
// Ideal: greater than or equal to 18.5 but less than 25
// Overweight: greater than or equal to 25 but less than 30
// Obese: greater than or equal to 30 but less than 40
// Morbidly Obese: greater than or equal to 40
public class BMI {

  public static void main(String[] args) {
    /*
    double height = Double.valueOf(args[0]);
    double weight = Double.valueOf(args[1]);
    double bmi = weight / Math.pow(height, 2);
    */
    double bmi = 20;
    if (bmi < 15) {
      System.out.println("Starvation");
    } else if (bmi < 17.5) {
      System.out.println("Anorexic");
    } else if (bmi < 18.5) {
      System.out.println("Underweight");
    } else if (bmi < 25) {
      System.out.println("Ideal");
    } else if (bmi < 30) {
      System.out.println("Overweight");
    } else if (bmi < 40) {
      System.out.println("Obese");
    } else {
      System.out.println("Morbidly Obese");
    }
  }

}

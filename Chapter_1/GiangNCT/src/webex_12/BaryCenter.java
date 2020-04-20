package webex_12;

// 28. Compute the distance from the center of the first (more massive) body to the barycenter: r1 = a m2 / (m1 + m2).
public class BaryCenter {

	public static void main(String[] args) {
		double m1 = 1, m2 = .0123, a = 384000;
		//m1 = .0021; m2 = .000254; a = 19600;
		double baryCenter = a * m2 / (m1 + m2);
		System.out.println(baryCenter);
	}

}

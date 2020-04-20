package webex_12;

// 21. Altitude = asin (sin φ sin δ  + cos φ cos δ cos H)
// Azimuth  = acos ((cos φ sin δ  - sin φ cos δ cos H) / cos (Altitude) )
public class EquatorialToHorizontal {

	public static void main(String[] args) {
		double declination = Integer.valueOf(args[0]);
		double hourAngle = Integer.valueOf(args[1]);
		double latitude = Integer.valueOf(args[2]);
		
		double altitude = Math.asin(Math.sin(latitude) * Math.sin(declination)
			   + Math.cos(latitude) * Math.cos(hourAngle) * Math.cos(declination));
		double azimuth = Math.acos((Math.cos(latitude) * Math.sin(declination) - Math.sin(latitude) * Math.cos(declination)
						 * Math.cos(hourAngle)) / Math.cos(altitude));
		System.out.println("Declination: " + declination + ", Hour Angle: " + hourAngle + ", Latitude: " + latitude);
		System.out.println("Altitude: " + altitude + ", Azimuth: " + azimuth);
	}

}

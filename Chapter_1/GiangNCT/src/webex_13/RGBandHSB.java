package webex_13;

// 12. takes an RGB color (three integers between 0 and 255) and transforms it to an HSB color
// and inverse

public class RGBandHSB {

	public static void main(String[] args) {
		// RGB to HSB
		/*
		int red = Integer.valueOf(args[0]);
		int green = Integer.valueOf(args[1]);
		int blue = Integer.valueOf(args[2]);
		*/
		int red = 100, green = 150, blue = 200;
		
		int maxRGB = Math.max(Math.max(red, green), blue);
		int minRGB = Math.min(Math.min(red, green), blue);
		int delta = maxRGB - minRGB;
		int brightness = delta;
		int brightness_ = maxRGB * 100 / 255;
		int saturation = (red + green + blue == 0) ? 0 : 255 * delta / maxRGB;
		
		int hue;
		if (maxRGB == red) {
			hue = (green - blue) / delta;
		} else if (maxRGB == green) {
			hue = 2 + (blue - red) / delta;
		} else {
			hue = 4 + (red - green) / delta;
		}
		hue *= 60;
		hue = hue < 0 ? hue + 360 : hue;
		int saturation_ = saturation * 100 / 255;
		System.out.println("Hue: " + hue);
		System.out.println("Saturation: " + saturation_);
		System.out.println("Brightness: " + brightness_);
		
		// Reversed HSB to RGB
		int reversedRed, reversedGreen, reversedBlue;
		int i;
		double factorial, p, q, t;
		double h = hue / 255.0;
		double s= saturation / 255.0;
		double b= brightness / 255.0;
		if (s== 0) {
			reversedRed = reversedGreen = reversedBlue = brightness;					
		} else {
			h/= 60.0;
			i = (int) h;
			factorial = h- i;
			p = b * (1 - s);
			q = b * (1 - s* factorial);
			t = b * (1 - s* (1 - factorial));
			switch (i) {
			case 0:
				reversedRed = (int) b;
				reversedGreen = (int) t;
				reversedBlue = (int) p;
				break;
				
			case 1:
				reversedRed = (int) q;
				reversedGreen = (int) b;
				reversedBlue = (int) p;
				break;
				
			case 2:
				reversedRed = (int) p;
				reversedGreen = (int) b;
				reversedBlue = (int) t;
				break;
			case 3:
				reversedRed = (int) p;
				reversedGreen = (int) q;
				reversedBlue = (int) b;
				break;
			case 4:
				reversedRed = (int) t;
				reversedGreen = (int) p;
				reversedBlue = (int) b;
				break;

			default:
				reversedRed = (int) b;
				reversedGreen = (int) p;
				reversedBlue = (int) q; break;
			}
		}
		System.out.println("Red: " + reversedRed);
		System.out.println("Green: " + reversedGreen);
		System.out.println("Blue: " + reversedBlue);
	}

}

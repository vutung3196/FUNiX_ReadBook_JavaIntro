package three;

public class RGBtoHSV {
	public static void main(String[] args) {
		double R = Double.parseDouble(args[0]);
		double G = Double.parseDouble(args[1]);
		double B = Double.parseDouble(args[2]);
		 double h, s, v;

		    double min, max, delta;
		    double r = R / 255;
		    double g = G / 255;
		    double b = B / 255;

		    min = Math.min(Math.min(r, g), b);
		    max = Math.max(Math.max(r, g), b);
		    delta = max - min;
		   //v
		    v = max;

		     

		    //S
		     if( max != 0 )
		        s = delta / max;
		     else {
		        s = 0;		        
		     }
		     
		     //H
		     if(delta == 0)
		    	 h = 0;
		     else
					if( r == max )
						h = ( g - b ) / delta;
					else if( g == max )
						h = 2 + ( b - r ) / delta; 
					else
						h = 4 + ( r - g ) / delta; 

					h *= 60;    

					if( h < 0 )
						h += 360;

		    System.out.println(h + " , " + s + " , " + v);
		
	}
}

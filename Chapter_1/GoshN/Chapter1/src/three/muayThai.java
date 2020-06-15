package three;

public class muayThai {

	public static void main(String[] args) {
		int weight = Integer.parseInt(args[0]);
		System.out.print("Weight class ");
		if (weight > 220) {
			System.out.println("Super heavyweight");
		}
		else {
			switch (weight) {
			case 113: case 114: case 115:
		        System.out.println("Super flyweight"); break;
		      case 116: case 117: case 118:
		        System.out.println("Bantamweight"); break;
		      case 119: case 120: case 121: case 122:
		        System.out.println("Super bantamweight"); break;
		      case 123: case 124: case 125: case 126:
		        System.out.println("Featherweight"); break;
		      case 127: case 128: case 129: case 130:
		        System.out.println("Super featherweight"); break;
		      case 131: case 132: case 133: case 134: case 135:
		        System.out.println("Lightweight"); break;
		      case 136: case 137: case 138: case 139: case 140:
		        System.out.println("Super lightweight"); break;
		      case 141: case 142: case 143: case 144: case 145: case 146: case 147:
		        System.out.println("Welterweight"); break;
		      case 148: case 149: case 150: case 151: case 152: case 153: case 154:
		        System.out.println("Super welterweight"); break;
		      case 155: case 156: case 157: case 158: case 159: case 160:
		        System.out.println("Midleweight"); break;
		      case 161: case 162: case 163: case 164: case 165: case 166: case 167:
		        System.out.println("Super middleweight"); break;
		      case 168: case 169: case 170: case 171: case 172: case 173: case 174: case 175:
		        System.out.println("Light heavyweight"); break;
		      case 176: case 177: case 178: case 179: case 180: case 181: case 182: case 183:
		        System.out.println("Super light heavyweight"); break;
		      case 184: case 185: case 186: case 187: case 188: case 189: case 190:
		        System.out.println("Cruiserweight"); break;
		      case 191: case 192: case 193: case 194: case 195: case 196: case 197: case 198: case 199: case 200:
		      case 201: case 202: case 203: case 204: case 205: case 206: case 207: case 208: case 209: case 210:
		      case 211: case 212: case 213: case 214: case 215: case 216: case 217: case 218: case 219: case 220:
		        System.out.println("Heavyweight"); break;
		      default:
		        System.out.println("Flyweight");break;
			}
		}
	}

}

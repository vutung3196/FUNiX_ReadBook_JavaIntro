
public class Dragon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 nhận xét: ta thấy chuỗi sau = chuỗi trước + l + nghịch đảo của chuỗi trước theo thứ tự từ cuối lên đầu
		 
		tìm thuật toán để tạo chuỗi nghịch đảo
		
		ta có chuỗi nghịch đảo đầu tiền : F R F
		CHUỖI NGHỊCH ĐẢO THỨ 2 : FLFRFRF
		CHUỖI NGHỊCH ĐẢO THỨ 3 : FLFLFRFRFLFRFRF
		
		MỘT CÁCH VÔ TÌNH TA THẤY CHUỖI NGHỊCH ĐẢO NÀY = CHUỖI TRƯỚC + R + NGHỊCH ĐẢO CỦA CHUỖI TRƯỚC THEO THỨ TỰ TỪ CUỐI LÊN ĐẦU
		VÌ VẬY TA CÓ 
		 */
		String a0 = "F";
        String b0 = "F";
        String a1 = a0 + "L" + b0;
        String b1 = a0 + "R" + b0;
        String a2 = a1 + "L" + b1;
        String b2 = a1 + "R" + b1;
        String a3 = a2 + "L" + b2;
        String b3 = a2 + "R" + b2;
        String a4 = a3 + "L" + b3;
        String b4 = a3 + "R" + b3;
        String a5 = a4 + "L" + b4;

        System.out.println(a0);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
    
	}

}

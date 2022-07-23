package org.add;

public class GreensTechno {
	static boolean GreensStudent = true;
	private void greensOmr(String cname,String cadd) {
		System.out.println("Institute Name is"+cname);
		System.out.println("Institute Address is"+cadd);
}
			private void greensOmr(int brcode,String brarea,int code) {
		System.out.println("Institute code is"+brcode);
		System.out.println("Institute Covered area is "+brarea);
		System.out.println("Institute branch code is "+code);
			System.out.println("greens omr student"+GreensStudent);
			}
			@SuppressWarnings("static-access")
			public static void main(String[] args) {
				GreensTechno gt = new GreensTechno();
				gt.greensOmr("Greens Technology", "Omr Road, Customer  colony");
				gt.greensOmr(21147, "Thoraipakkam Road", 6000027);
				gt.GreensStudent = false;
				
			}
}

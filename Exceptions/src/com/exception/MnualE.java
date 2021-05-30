package com.exception;

public class MnualE {


		public void main123() throws HarikaException6 {

				int[] a = new int[6];
				a[3] = 30;
				if(a[3]%3 == 0 ) {
					throw new HarikaException6("Number is Divisible by 3");
				}
					
		}
		
		public static void main(String[] args) {
			MnualE v = new MnualE();
			try {
				v.main123();
			} catch (HarikaException6 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

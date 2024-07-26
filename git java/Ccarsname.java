class Ccarsname{
	public static void main(String[] args){
		String[] Cars={"Maruti Suzuki Alto","Hyundai Santro","Tata Nexon","Mahindra XUV300","Maruti Suzuki Swift","Tata Tiago","Honda City","Mahindra Thar","Maruti Suzuki Baleno","Hyundai Creta"};
         System.out.println("statring names  in forward order");
		 System.out.println("                     ");
		 System.out.println("                     ");
		 System.out.println("starting in forward order now");
		 System.out.println("                     ");
		for(int indx=0;indx< Cars.length;indx++){                   //forward order
			System.out.println("starting in  Cars");
			System.out.println( Cars[indx]);
			System.out.println("ENDING in  Cars");
		}
		System.out.println("                     ");
		System.out.println("                     ");
		System.out.println("statring names  in reverse order");
		System.out.println("statring reverse names now ");
		System.out.println("                     ");
		System.out.println("                     ");
		for(int indx=Cars.length-1;indx>0;indx--){                  //reverse order
			System.out.println("starting in  Cars reverse order");
			System.out.println( Cars[indx]);
			System.out.println("ENDING in  Cars reverse order");
		}
	}
}
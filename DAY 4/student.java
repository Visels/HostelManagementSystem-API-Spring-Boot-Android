public class student{



public static void main(String[] args){

	String name = "John Manuels";

	String admissionNo = "F17/1350/2018";

	String studentClass = "1W";

	String course = "Immersive Java";

	String gender = "M";

	String address = "45 WALLSTREET";

	String sport = "Hockey";

	String grade = "A-";

	int totalMarks = 345;

	String room = "PO1A";


	boolean isActivityFeePaid = true;

	double feeBalance = 67345.90;


	System.out.println("STUDENT DETAILS");
	System.out.println("NAME: "+name);
	System.out.println("ADMISSION NO:"+admissionNo);
	System.out.println("COURSE:"+course);
	System.out.println("GENDER:"+gender);
	System.out.println("ADDRESS:"+address);
	System.out.println("SPORT:"+sport);
	System.out.println("GRADE:"+grade);
	System.out.println("TOTAL MARKS: "+totalMarks);
	System.out.println("ROOM:"+room);
	//System.out.println("ACTIVITY FEE:"+isActivityFeePaid);
	System.out.println("FEE BALANCE:"+feeBalance);

	if(isActivityFeePaid){
	System.out.println("ACTIVITY FEE PAID: YES");
	}
	else{
		System.out.println("ACTIVITY FEE PAID: NO");
	}


	if(feeBalance > 10000 && feeBalance < 15000){
		System.out.println("STATUS:: No accessing Library");

	}

	if (feeBalance > 15000){
		System.out.println("STATUS :: GO HOME!!");
	}


	if (feeBalance<10000){
		System.out.println("STATUS:: REMAIN IN SCHOOL");

	}






}


}
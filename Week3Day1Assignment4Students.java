package week3.day1;

public class Week3Day1Assignment4Students {
	
	public static void getStudentInfo(int id ) {
		System.out.println(id);
	}
	
	public static void getStudentInfo(int id , String name ) {
		System.out.println(id +"  " +name);
	}
	
	public static void getStudentInfo(String phoneNumber, String Email ) {
		System.out.println(phoneNumber +"  " + Email);
	}	
	
	public static void main(String[] args) {
		Week3Day1Assignment4Students studentinfo = new Week3Day1Assignment4Students();
		
		studentinfo.getStudentInfo(142653);
		studentinfo.getStudentInfo(187965, "Jayasree");
		studentinfo.getStudentInfo("0459874563", "jayasreer@icloud.com");
		
			}
}

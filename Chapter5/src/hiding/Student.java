package hiding;

public class Student {
	int studentID;
	private String studentName;  // studentName ������ private���� ����
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
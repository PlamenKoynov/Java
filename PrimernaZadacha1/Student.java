//����������� ����, ������� ������� ���� �������� �������� �����:
//���;
//���������� �����;
//���� �� ������� � ����������� ����� �� ���.1;
//������ �����.
//�) ����������� ����������� �� ������������ � � ��������� �� �������������� �� ������.
//�) ����������� ����������� get � set ������.
//�) ����������� �����, ����� �� ������� ��������� ������ ����, ����� ��������� �� �������� ���� ���� ��������� ������.
//�) ����������� �������� �����, ����� �������� ����� �������� �� ����� (����� -1, 0 ��� 1 � ���������� �� ���� ���� ������� � � ��-�����, ����� ��� ��-����� ����� �� ������).

public class Student {
	
	private String name; 
	private long fakNumber; 
	private Date dateOfBirth;
	private double averageMark;
	
	public Student(){
		name = "";
		fakNumber = -1;
		dateOfBirth = new Date();
		averageMark = 0;
	}
	
	public Student(String name, long fakNumber, Date dateOfBirth, double averageMark){
		this.name = name;
		this.fakNumber = fakNumber;
		this.dateOfBirth = dateOfBirth;
		this.averageMark = averageMark;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public long getFakNumber(){
		return fakNumber;
	}
	
	public void setFakNumber(long fakNumber){
		this.fakNumber = fakNumber;
	}
	
	public Date getDateOfBirth(){
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	
	public double getAverageMark(){
		return averageMark;
	}
	
	public void setAverageMark(double averageMark){
		this.averageMark = averageMark;
	}
	
	public int years(Date today){
		return today.getYear() - getDateOfBirth().getYear(); 
	}
	
	public static int compareTo(Student st1, Student st2){
		if(st1.getAverageMark() > st2.getAverageMark()){
			return -1;
		}
		else if(st1.getAverageMark() == st2.getAverageMark()){
			return 0;
		}
		else{
			return 1;
		}
	}
}

package test1;

public class Employee {
	
	private String empNo;
	private String name;
	private String part;
	
	public Employee() {} 
	public Employee(String empNo, String name, String part)
	{
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	public String getEmpNo() { return this.empNo;}
	public String getName() { return this.name;}
	public String getPart() { return this.part;}
	
	public void setEmpNo(String empNo) { this.empNo=empNo;}
	public void setName(String name) { this.name= name;}
	public void setPart(String part) { this.part= part;}
	
	public void result()
	{
		System.out.println("��� : " + empNo + "\n");
		System.out.println("���� : " + name + "\n");
		System.out.println("�μ� : " + part + "\n");
	}
}

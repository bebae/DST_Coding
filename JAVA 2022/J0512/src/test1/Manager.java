package test1;

public class Manager extends Employee {
	
	private String position;
	
	public Manager(String empNo, String name, String part, String position)
	{
		setEmpNo(empNo);
		setName(name);
		setPart(part);
		this.position = position;
	}
	public void result() //�޼ҵ� �������̵�
	{
		System.out.println("��� : " + getEmpNo() );
		System.out.println("���� : " + getName() );
		System.out.println("�μ� : " + getPart() );
	    System.out.print("�������� : ");
		if (position.equals("3"))
			System.out.println("����");
		else if (position.equals("4"))
			System.out.println("����");
			
	}

}

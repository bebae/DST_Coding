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
	public void result() //메소드 오버라이딩
	{
		System.out.println("사번 : " + getEmpNo() );
		System.out.println("성명 : " + getName() );
		System.out.println("부서 : " + getPart() );
	    System.out.print("관리직급 : ");
		if (position.equals("3"))
			System.out.println("과장");
		else if (position.equals("4"))
			System.out.println("부장");
			
	}

}

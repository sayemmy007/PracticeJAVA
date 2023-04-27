package interview.programs.SortByAge;
class EmployeeEntity {
	
	private int eid;
	private String name;
	private int age;
	
	public EmployeeEntity(int eid, String name, int age) {
		this.eid=eid;
		this.name=name;
		this.age=age;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeExamplee [eid=" + eid + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}

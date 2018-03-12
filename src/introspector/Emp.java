package introspector;

import java.util.Date;

public class Emp {
	private int id;
	private String name;

	private double salary;
	
	private Date birthday;
	

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Emp() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp ���=" + id + ", ����=" + name + ", нˮ=" + salary;
	}

}

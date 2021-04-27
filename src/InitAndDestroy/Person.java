package InitAndDestroy;

import java.util.Arrays;

public class Person {
	
	
	private String name ;
	private String adress ;
	private String phone;
	private String [] familyMember ;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String adress, String phone, String[] familyMember) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.familyMember = familyMember;
	}



	



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String[] getFamilyMember() {
		return familyMember;
	}



	public void setFamilyMember(String[] familyMember) {
		this.familyMember = familyMember;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", adress=" + adress + ", phone=" + phone + ", familyMember="
				+ Arrays.toString(familyMember) + ", getName()=" + getName() + ", getAdress()=" + getAdress()
				+ ", getPhone()=" + getPhone() + ", getFamilyMember()=" + Arrays.toString(getFamilyMember())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	

}

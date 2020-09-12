package dataProviderPracticeClasses;

public class BeanClass {
	
	String name;
	int age;
	
	public BeanClass(String n, int a){
		this.name = n;
		this.age = a;
		
	}
	
	public BeanClass() {
		// TODO Auto-generated constructor stub
	}

	public String getPersonName(){
		return name;
	}
	
	public int getAge(){
		return age;
		
	}

}

package Classes;

import javax.swing.JOptionPane;

class Cities{
	String name;
	double population;
	Cities(String name, double population){
		this.name = name;
		this.population = population;
	}
	public String getName() {
		return this.name;
	}
	public double getPopulation() {
		return this.population;
	}
	public double setPopulation(double population) {
		 this.population = population;
		 return this.population;
	}
}
public class Classes {
	class Employee{
//		id, name, department, age , gender
		String name;
		String  gender;
		String department;
		int id;
		int age;
		Employee(String name, int age, int id){
			this.name = name;
			this.age = age;
			this.id = id;
			this.gender = JOptionPane.showInputDialog("What gender do you identify as?(this field is optional)");
			JOptionPane.showMessageDialog(null, "Your answer is submitted");
			this.department = JOptionPane.showInputDialog("What department are you registered in?\n(this field is mandatory)");
			JOptionPane.showMessageDialog(null, "Your answer is submitted");
		}
		Employee(String name, int age, int id, String department, String  gender){
			this.name = name;
			this.age = age;
			this.id = id;
			this.department = department;
			this.gender = gender;
		}	
		///how to print the info of all the objects created 
	void printEmployee() {
		System.out.println("Gendes: " + this.gender);
		System.out.println("Department: " + this.department);
		System.out.println("Employees name: " + this.name);
		System.out.println("Employees age: " + this.age);
		System.out.println(this.name+ " " +this.age + " years old " + " from " + this.department + "\n Your id: " + this.id);
	}	
	}
	//class Dog{}
	//class Cat{}
	//class Horse{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cities cityY = new Cities("Yerevan", 21000);
		Cities cityM = new Cities("Moscow", 31000);
		Cities cityNY = new Cities("New York", 31000);
		System.out.println(cityY.getName());
		System.out.println(cityM.getName());
		cityM.setPopulation(3122312);
		System.out.println(cityM.population);
		Classes class1 = new Classes();
		Employee JJ = class1.new Employee("James Johnson", 24, 12353, "Cybersecurity", "Male");
		Employee KK = class1.new Employee("Kate Keensy", 40, 12353);
		Employee CA = class1.new Employee("Christy Anderson", 40, 12353);
		JJ.printEmployee();
		KK.printEmployee();
		CA.printEmployee();
		
	}



}


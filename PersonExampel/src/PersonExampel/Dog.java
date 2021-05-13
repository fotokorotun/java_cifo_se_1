package PersonExampel;

public class Dog {

	
	public String name;
	public int age;
	public String genro;
	public Dog(String name, int age, String genro) {
		super();
		this.name = name;
		this.age = age;
		this.genro = genro;
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
	public String getGenro() {
		return genro;
	}
	public void setGenro(String genro) {
		this.genro = genro;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", genro=" + genro + "]";
	}
}
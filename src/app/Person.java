// Brandon Ortega// CST-239// 10.29.2023// This is my own work

package app;

/**
 * 
 * Represents a Person with basic details and also behaviors. 
 * @author Brandon Ortega
 *
 */
public class Person {
	private String name;
    private int age;
    private  float height;
    private float weight;
    
    /**
     * 
     * @param age the age the person is
     * @param name the name of the person
     * @param height how tall the person is
     * @param weight how much the person weighs
     */
     public Person(int age, String name, float height, float weight){
         super();
         this.age = age;
         this.name = name;
         this.height = height;
         this.weight = weight;
     }
     
     // Getters and setters that were generated by Eclipse
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
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}	

	/**
     * Simulates the person walking.
     */
    public void walk() {
        System.out.println(name + " is walking.");
    }
    
    /**
     * This simulates the person running and for what distance in miles
     * 
     * @param distance ... the distance the person runs for
     * @return time it takes to run, set to 0 for now
     */
    public float run(float distance) {
        System.out.println(name + " is running for " + distance + " miles.");
        return 0; // Placeholder return value
    }

	public static void main(String[] args) {
		Person person = new Person(29, "Brandon", (float)70.3F, (float) 233.56F);
       System.out.println("My name is " + person.getName() + ", I am " + person.getAge() + " years old, I am " +
               person.getHeight() + " inches tall and I weigh " + person.getWeight() + " pounds.");
       person.walk();
       person.run(14);
   }

}

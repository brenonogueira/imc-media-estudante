package poo;

public class Person {

    //class Attributes
    public String name;
    private int age;
    private double weight;
    private double height;

    //class constructor 
    public Person() {
        //System.out.println("## Person Constructor ##");
    }

    //class methods
    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Can't set age! Age must be > 0 and <= 150");
        }

    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0.1 && weight < 500) {
            this.weight = weight;
        } else {
            System.out.println("Can't set weight! Weight must be > 0.1kg and < 500kg.");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0.2 && height < 2.30) {
            this.height = height;
        } else {
            System.out.println("Can't set height! Height must be 0.2m and 2.30m ");
        }
    }

    public double BMI() {
        if (height > 0.2 && weight > 0.1) {
            return weight / (height * height);
        } else {
            //Can't Calculate
            return 0.0;
        }
    }
    
    

    public String getInfo() {
        return "Name: " + name + "\n Age: " + age + "\n Height: " + height + "m " + "\n Weight: " + weight + "kg" + "\n BMI: " + BMI();
    }

}

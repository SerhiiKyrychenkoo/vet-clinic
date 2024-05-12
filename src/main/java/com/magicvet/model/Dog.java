package main.java.com.magicvet.model;

public class Dog extends Pet {

    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";

    private String size;
    private String age;

    public Dog() { }

    public Dog(String size, String age) {
        this.size = size;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name = " + getName()
                + " type = " + getType()
                + " sex = " + getSex()
                + " age = " + getAge()
                + " owner name = " + getOwnerName()
                + "}";
     }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }
}

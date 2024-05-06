package main.java.com.magicvet.model;

public class Dog extends Pet {

    private String size;

    @Override
    public String toString() {
        return "{" + "\n\tname = " + getName()
                + "\n\ttype = " + getType()
                + "\n\tsex = " + getSex()
                + "\n\tage = " + getAge()
                + "\n\towner name = " + getOwnerName()
                + "\n}";
     }

    public String getSize(String size) {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

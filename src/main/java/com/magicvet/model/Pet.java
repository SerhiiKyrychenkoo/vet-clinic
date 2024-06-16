package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pet {

    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;
    private HealthStatus healthStatus;
    private final LocalDateTime registrationDate = LocalDateTime.now();

    public Pet() {}

    public Pet(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        return "Pet {"
                + " type = " + type
                + ", name = " + name
                + ", sex = " + sex
                + ", age = " + age
                + ", owner name = " + ownerName
                + ", registration date = " + registrationDate.format(FORMATTER)
                + "}";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public enum HealthStatus {
        GOOD(3),
        SICK(2),
        CRITICAL(1),
        UNKNOWNSTATUS(0);

        private final int valueHS;

        HealthStatus(int valueHS) {
            this.valueHS = valueHS;
        }

        public int getValueHS() {
            return valueHS;
        }
    }
}

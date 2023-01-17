package org.example;

public class Department {
    private String name;
    private int peopleCount;
    private String role;

    public Department(){}

    public Department(String name, int peopleCount, String role){
        this.name = name;
        this.peopleCount = peopleCount;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" \t ").append(peopleCount).append(" \t ").append(role).append(" \t ");
        return builder.toString();
    }
}
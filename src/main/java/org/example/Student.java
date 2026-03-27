package org.example;

public class Student {
    private  String name;
    private String email;
    private boolean present;
    private String className;

    public Student(String name, String email, boolean present, String className){
        this.name = name;
        this.email = email;
        this.present = present;
        this.className = className;
    }

    public void setName(String name ){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public boolean isPresent() {
        return this.present;
    }
    public void setClassName(){
        this.className = className;
    }
    public String getClassName(){
        return this.className;
    }
}

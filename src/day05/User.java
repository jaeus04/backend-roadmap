package day05;

public class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void printInfo(){
        System.out.println("ID: "+id);
        System.out.println("이름: "+name);
        System.out.println("이메일: "+email);
    }

    public String getEmail(){
        return email;
    }
}

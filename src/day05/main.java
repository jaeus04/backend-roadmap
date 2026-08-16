package day05;

public class main {
    public static void main(String[] args){
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        User user1 = new User(1,"홍길동", "hong@example.com");
        User user2 = new User(2, "김철수", "kim@example.com");
        User user3 = new User(3, "이영희", "lee@example.com");

        service.register(user1);
        service.register(user2);
        service.register(user3);

        for (User user : service.getUsers()) {
            user.printInfo();
        }
    }
}

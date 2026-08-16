package day05;

public class Prob5 {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        User user1 = new User(1, "홍길동", "hong@example.com");
        User user2 = new User(2, "김철수", "");

        service.register(user1);
        try {
            service.register(user2);
        } catch (IllegalArgumentException e) {
            System.out.println("회원가입 실패: " + e.getMessage());
        }

        for (User user : service.getUsers()) {
            user.printInfo();
        }
    }
}

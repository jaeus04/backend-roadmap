package day06;

public class Problem01 {
    public static void main(String[] args){
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        User user1 = new User(1,"홍길동", "hong@example.com");
        User user2 = new User(2, "김철수", "kim@example.com");
        User user3 = new User(3, "이영희", "lee@example.com");

        service.register(user1);
        service.register(user2);
        service.register(user3);

        User user = repository.findById(2);

        if (user != null) {
            user.printInfo();
        } else {
            System.out.println("사용자를 찾을 수 없습니다.");
        }
    }
}

package day06;

public class Problem02 {
    public static void main(String[] args){
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        service.register(new User(1, "홍길동", "hong@example.com"));
        service.register(new User(2, "김철수", "kim@example.com"));
        service.register(new User(3, "이영희", "lee@example.com"));

        service.deleteUser(2);

        for (User user : service.getUsers()) {
            user.printInfo();
        }

        User user = repository.findById(2);

        if (user != null) {
            user.printInfo();
        } else {
            System.out.println("사용자를 찾을 수 없습니다.");
        }
    }
}

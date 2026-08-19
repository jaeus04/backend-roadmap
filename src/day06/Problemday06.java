package day06;

public class Problemday06 {
    public static void main(String[] args){
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        User user1 = new User(1,"홍길동", "hong@example.com");
        User user2 = new User(2, "김철수", "kim@example.com");
        User user3 = new User(3, "이영희", "lee@example.com");

        service.register(user1);
        service.register(user2);
        service.register(user3);

        for (User i : service.getUsers()) {
            i.printInfo();
        }
        User user = service.getUser(2);
        user.printInfo();
        service.updateUser(2,"김철수2", "kim2@example.com");
        user = service.getUser(2);
        user.printInfo();
        service.deleteUser(2);
        for (User i : service.getUsers()) {
            i.printInfo();
        }
        try {
            service.deleteUser(99);
        } catch (IllegalArgumentException e) {
            System.out.println("삭제 실패: " + e.getMessage());
        }

    }
}

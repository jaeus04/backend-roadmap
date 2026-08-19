package day06;
import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(User user) {
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            throw new IllegalArgumentException("이메일은 필수입니다.");
        }
        userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id);
    }

    public void updateUser(int id, String name, String email){
        User user = userRepository.findById(id);

        if (user == null) {
            throw new IllegalArgumentException("사용자를 찾을 수 없습니다.");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일은 필수입니다.");
        }

        user.update(name, email);
    }

    public void deleteUser(int id) {
        if (userRepository.findById(id) == null) {
            throw new IllegalArgumentException("사용자를 찾을 수 없습니다.");
        }
        userRepository.delete(id);
    }
}
package day06;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public List<User> findAll(){
        return users;
    }

    public User findById(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public void delete(int id){
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();

            if (user.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }
}

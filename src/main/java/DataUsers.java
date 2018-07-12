import java.util.ArrayList;
import java.util.List;

public class DataUsers {
    private List<User> users = new ArrayList<>();

    public DataUsers() {
        User user1 = new User("ezesubu@gmail.com", "secret");
        User user2 = new User("other@test.com", "abc");
        users.add(user1);
        users.add(user2);
    }

    public List<User> getUsers() {
        return users;
    }
}

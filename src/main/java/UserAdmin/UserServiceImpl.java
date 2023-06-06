package UserAdmin;
import java.util.LinkedList;
import java.util.List;
public class UserServiceImpl implements UserService{
    private List<User> userList = new LinkedList<User>();
    private static int id = 1;

    /*(String userName, String name, String email, String role, String active)*/
    public UserServiceImpl(){
        userList.add(
                new User("AChiang", "Alice Chiang", "alice@gmail.com","Administrator",false ));

        userList.add(
                new User("Bantu", "Bantu Hlamule", "bantu@gmail.com","Data Steward", false));

        userList.add(
                new User("EJanari", "Emile Janari", "janari@gmail.com","CPU User", true));

        userList.add(
                new User("FCorn", "Fahwaaz Cornelius", "corn@gmail.co.za","Administrator", false));

        userList.add(
                new User("JCon", "Jacques Conradie", "jac_con@gmail.com","Data Steward", true));

        userList.add(
                new User("JadeS", "Jade Scholtz", "Scholtzjade@gmail.com","Administrator", true));

    }
    public List<User> findAll(){
        return userList;
    }
}

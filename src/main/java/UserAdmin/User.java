package UserAdmin;
//This is the dataModel
public class User {

    private String userName;
    private String name;
    private String email;
    private String role;
    private boolean active;
    public User(){}
    public User(String userName, String name, String email, String role, boolean active){
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.role = role;
        this.active = active;
    }


    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;


    }

    @Override
    public String toString(){

        return "";
    }

}


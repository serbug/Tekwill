public class User {
    String login;
    String firstName;
    String lastName;

    public User() {
        this.login="Login";
        this.firstName="FirstName";
        this.lastName="LastName";
    }
    public User(String login,String firstName,String lastName){
        this.login=login;
        this.firstName=firstName;
        this.lastName=lastName;
    }
}

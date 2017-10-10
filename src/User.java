public class User extends Person{
    protected Boolean isAdmin;

    public User(String firstName, String lastName, Boolean isAdmin) throws IllegalArgumentException {
        super(firstName, lastName);
    }

    public static void isAdmin() {
        boolean isAdmin = true;
        if (isAdmin) {
            System.out.println("Contact is an administrator");
        } else {
            System.out.println("Contact is not administrator");
        }

    }


}

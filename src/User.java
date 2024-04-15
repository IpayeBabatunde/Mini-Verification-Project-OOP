import java.util.List;

public class User {
    private String _name;
    private String _membership = "Bronze";

    public static List<User> admins;

    private boolean _verified = false;
    void set_verified (boolean verified){
        _verified = verified;
    }
    Boolean get_verified () {
        return _verified;
    }

    void verify () {
        System.out.println("Verifying...");
        set_verified(true);
    }
    public static void print_admin_names ()  {
        for (User u : admins){
            System.out.println(u.get_Name());

        }
    }


    public User(String name) {
        set_Name(name);
    }


    public String toString () {
        // return "Tacos";
        return get_Name() + " " + get_membership();
    }
    public boolean equals (User u2) {
        if (get_Name() == u2.get_Name() && get_membership() == u2.get_membership() ) {
            return true;
        } else {
            return false; }

    }

    public User () {

    }
    public User(String name, String membership) {
        set_Name(name);
        set_membership(membership);
    }


    // USING GETTERS AND SETTERS
    void set_Name (String name) {
        //   System.out.println("logging into log file");
        _name = name;
    }

    String get_Name () {
        return _name;
    }

    void set_membership(String membership) {
        _membership = membership;
    }

    void set_membership (Membership membership) {
        _membership = membership.name();
    }
    public enum Membership {
        Bronze, Silver, Gold;
    }
    String get_membership () {
        return _membership;
    }
}

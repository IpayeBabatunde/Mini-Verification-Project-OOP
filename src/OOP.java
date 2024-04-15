import java.util.ArrayList;
import java.util.List;

public class OOP {
    public static void main(String[] args) {
        //  System.out.println("hello world");

        // CREATING AN OBJECT WHICH IS AN INSTANCE OF A CLASS
       // User u = new User ("Caleb", "Silver");
       // User u2 = new User("mary", "Silver");
//       User u = new User();
  //     u.set_Name("CALEB");
        // User u2 = new User("Caleb" ,"Silver" );

        // List<User> users = new ArrayList<User>();

       // ArrayList<User> users = new ArrayList<User>();


        Students s = new Students();
        s.set_Name("Student");
        Teacher t = new Teacher();
        t.set_Name("Teacher");
//        System.out.println(t.get_membership());
//        System.out.println(s.get_verified());
//        s.set_membership("Gold");
//        System.out.println(s.get_membership()  );

        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        User.admins.add(new User("CALEB"));
        User.admins.add(new User("YOU"));
        User.admins.add(new User("WALE"));
//
//        User.print_admin_names();

        for (User u : User.admins) {
            u.verify();
        }
//        for(int i = 0; i< User.admins.size(); i++) {
//            System.out.println(User.admins.get(i).get_Name());
//
//        }
//        for (User u : User.admins) {
//            System.out.println(u.get_Name());
//        }

      //  System.out.println(users.get(0).get_Name());

       // u._name = "Caleb";
       // u.membership = "Gold";
        // u.age = 24;
        //u.set_Name("Clever");
       // u.set_membership(User.Membership.Gold);

        // User u2 = new User();
       // u2._name = "Sally";
     //   u2.membership = "Silver";

        // System.out.println(u == u2);
        // System.out.println(u.equals(u2));
        // System.out.println(u2);
      //  System.out.println(u2._name);
      //  System.out.println(u.age);
    }
}

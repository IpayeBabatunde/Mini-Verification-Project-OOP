public class Teacher extends User{
        void verify() {
            System.out.println("Verifying through Email");
            set_verified(true);
        }
}

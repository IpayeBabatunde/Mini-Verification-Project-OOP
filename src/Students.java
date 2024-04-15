public class Students extends User{
//    private boolean _verified = false;
//    void set_verified (boolean verified){
//        _verified = verified;
//    }
//    Boolean get_verified () {
//        return _verified;
//    }

        void verify() {
            System.out.println("Verifying through Phone");
            set_verified(true);
        }
}


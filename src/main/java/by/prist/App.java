package by.prist;

public class App {
    public static void main(String[] args) {
        Dao dao = new Dao();

        User user = new User("Alex", "qwerty", "q");
        user.addTelephone(new Telephone(14781765));
        user.addTelephone(new Telephone(14781766));
        user.addTelephone(new Telephone(14781500));
        user.addTelephone(new Telephone(14781711));


        User user2 = new User("Aliaksei", "xyz", "x");
        user2.addTelephone(new Telephone(1233434));
        user2.addTelephone(new Telephone(1423232));
        user2.addTelephone(new Telephone(1405543));
        user2.addTelephone(new Telephone(1478223));

        dao.save(user);
        dao.save(user2);

        //dao.updateUser(user2, "Tom", "tommy", "tp");

        //dao.deleteUser(user2);


    }
}

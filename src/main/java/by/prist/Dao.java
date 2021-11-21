package by.prist;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Dao {
    private Session session;


    public void save(User user) {
        Transaction t = null;
        session = HibernateUtil.getSessionFactory().openSession();
        t = session.getTransaction();
        t.begin();
        session.save(user);
        t.commit();
        session.close();
    }

    public void deleteUser(User user) {
        Transaction t = null;
        session = HibernateUtil.getSessionFactory().openSession();
        t = session.getTransaction();
        t.begin();
        session.delete(user);
        t.commit();
        session.close();
    }

    public void updateUser(User user, String name, String username, String password) {
        Transaction t = null;
        session = HibernateUtil.getSessionFactory().openSession();
        t = session.getTransaction();
        t.begin();
        user.setName(name);
        user.setLogin(username);
        user.setPassword(password);
        session.update(user);
        t.commit();
        session.close();
    }
//    public boolean save(User user) {
//        Transaction t = null;
//        boolean flag = false;
//        if (true) {  //если юзера нет в базе то true
//            try {
//
//                flag = true;
//            } catch (HibernateException e) {
//                if (t != null) {
//                    t.rollback();
//                }
//                e.printStackTrace();
//            } finally {
//                session.close();
//            }
//        }
//        return flag;
//    }

}

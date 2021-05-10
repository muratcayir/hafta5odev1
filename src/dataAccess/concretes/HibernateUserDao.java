package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Hibernate ile eklendi"+ user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Hibernate ile güncellendi"+ user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Hibernate ile silindi"+ user.getFirstName());
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}

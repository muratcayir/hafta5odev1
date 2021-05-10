package core.concretes;

import core.abstracts.EmailVertificationService;
import entities.concretes.User;

public class EmailVertificationManager implements EmailVertificationService {

    @Override
    public boolean Vertification(User user) {
        System.out.println(user.getFirstName()+""+user.getLastName()+"E-mail adresiniz doğrulanmıştır....");
        return true;
    }
}

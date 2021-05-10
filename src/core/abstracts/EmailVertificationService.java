package core.abstracts;

import entities.concretes.User;

public interface EmailVertificationService {

    boolean Vertification(User user);
}

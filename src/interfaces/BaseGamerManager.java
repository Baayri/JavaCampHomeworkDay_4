package interfaces;

import managers.VerificationManager;
import models.Gamer;

public interface BaseGamerManager {
    void add(Gamer gamer);
    void update(Gamer gamer,int id, String firstName, String lastName,
                String nationalIdentity, String birthday,String nickName);
    void delete(Gamer gamer);
}

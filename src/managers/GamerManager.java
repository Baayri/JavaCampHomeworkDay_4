package managers;

import interfaces.BaseGamerManager;
import models.Gamer;

public class GamerManager implements BaseGamerManager {

    VerificationManager verification;
    public GamerManager(VerificationManager verification){
        this.verification=verification;
    }

    @Override
    public void add(Gamer gamer) {
        if(verification.verify(gamer)){
            System.out.println(gamer.getNickName()+" Onaylandı ve eklendi");
        }
        else {
            System.out.println(gamer.getNickName()+" Oyuncu onaylanamadı hata olustu");
        }

    }

    @Override
    public void update(Gamer gamer,int id, String firstName, String lastName,
                       String nationalIdentity, String birthday,String nickName) {
        String previousNickName=gamer.getNickName();
        gamer.setId(id);
        gamer.setFirstName(firstName);
        gamer.setLastName(lastName);
        gamer.setNationalIdentity(nationalIdentity);
        gamer.setBirthday(birthday);
        gamer.setNickName(nickName);
        System.out.println(previousNickName+" isimli oyuncu "+gamer.getNickName()+" olarak guncellendi");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getNickName()+" Silindi");
    }
}

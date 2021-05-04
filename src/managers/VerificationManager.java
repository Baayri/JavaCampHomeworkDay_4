package managers;

import interfaces.BaseVerificationManager;
import models.Game;
import models.Gamer;

public class VerificationManager implements BaseVerificationManager {
    @Override
    public boolean verify(Gamer gamer) {
        if (gamer.getNationalIdentity().length()==11){
            return true;
        }
        else{
            return false;
        }
    }
}

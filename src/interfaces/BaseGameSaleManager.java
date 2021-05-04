package interfaces;

import models.Game;
import models.Gamer;

public interface BaseGameSaleManager {
    void sell(Gamer gamer,Game game);
}

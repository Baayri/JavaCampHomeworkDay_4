package interfaces;

import models.Game;

public interface BaseGameManager {
    void add(Game game);
    void update(Game game,int id,int price,String gameName);
    void delete(Game game);
}

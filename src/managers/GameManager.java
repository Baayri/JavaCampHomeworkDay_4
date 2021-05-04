package managers;

import interfaces.BaseGameManager;
import models.Game;

public class GameManager implements BaseGameManager {
    @Override
    public void add(Game game) {
        System.out.println(game.getGameName()+" Eklendi");
    }

    @Override
    public void update(Game game,int id,int price,String gameName) {
        String previousName=game.getGameName();
        game.setId(id);
        game.setGameName(gameName);
        game.setPrice(price);
        System.out.println(previousName+" isimli oyun guncellendi");

    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName()+" Silindi");
    }
}

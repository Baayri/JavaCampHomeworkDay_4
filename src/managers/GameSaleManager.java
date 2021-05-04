package managers;

import interfaces.BaseGameSaleManager;
import models.Campaign;
import models.Game;
import models.Gamer;

public class GameSaleManager implements BaseGameSaleManager {
    Campaign campaign;

    public GameSaleManager(Campaign campaign){
        this.campaign=campaign;
    }

    @Override
    public void sell(Gamer gamer,Game game) {
        int newPrice=game.getPrice()-(game.getPrice()*campaign.getDiscount()/100);
        System.out.println(game.getGameName()+" %"+campaign.getDiscount()+" indirimle "+newPrice+
                " tl fiyatina "+gamer.getNickName()+" nickli oyuncuya satildi");
    }
}

import managers.*;
import models.Campaign;
import models.Game;
import models.Gamer;

public class Main {
    public static void main(String[] args) {
        Gamer gamer=new Gamer(1,"Muhammed","Bayri","12345678910","2000","Pseudo");
        GamerManager gamerManager=new GamerManager(new VerificationManager());
        gamerManager.add(gamer);
        gamerManager.update(gamer,1,"Muhammed","Bayri","12345678911","2000","PseudoX");
        gamerManager.delete(gamer);

        System.out.println("");

        Gamer gamer1=new Gamer(1,"x","y","123","2000","req");
        gamerManager.add(gamer1);

        System.out.println("");

        Game game=new Game(1,20,"GTA V");
        GameManager gameManager=new GameManager();
        gameManager.add(game);
        gameManager.update(game,1,30,"GTA V");
        gameManager.delete(game);

        System.out.println("");

        Campaign campaign = new Campaign("First day discount",10);
        CampaingManager campaingManager=new CampaingManager();
        campaingManager.addDiscount(campaign);
        campaingManager.updateDiscount(campaign,15);


        System.out.println("");

        GameSaleManager gameSaleManager=new GameSaleManager(campaign);
        gameSaleManager.sell(gamer,game);

        System.out.println("");

        campaingManager.deleteDiscount(campaign);
    }
}

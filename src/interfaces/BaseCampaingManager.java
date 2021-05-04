package interfaces;

import models.Campaign;
import models.Game;

public interface BaseCampaingManager {
    void addDiscount(Campaign campaign);
    void updateDiscount(Campaign campaign,int discount);
    void deleteDiscount(Campaign campaign);
}

package managers;

import interfaces.BaseCampaingManager;
import models.Campaign;


public class CampaingManager implements BaseCampaingManager {



    @Override
    public void addDiscount(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" %"+campaign.getDiscount()+" Eklendi");
    }

    @Override
    public void updateDiscount(Campaign campaign,int discount) {
        int previousDiscount=campaign.getDiscount();
        campaign.setDiscount(discount);
        System.out.println("%"+previousDiscount+" indirim %"+campaign.getDiscount()+" olarak guncellendi");
    }

    @Override
    public void deleteDiscount(Campaign campaign) {
        System.out.println("%"+campaign.getDiscount()+" indirim silindi");
    }
}

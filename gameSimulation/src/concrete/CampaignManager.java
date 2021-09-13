package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" "+"kampanyası eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" "+"kampanya bilgileri güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" "+"kampanyası silindi.");
		
	}

}

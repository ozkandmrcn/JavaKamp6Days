package etiyaGamesLayered.core;

import etiyaGamesLayered.entities.concretes.User;
import etiyaGamesLayered.mernis.MernisService;

public class MernisServiceAdapter implements UserIdentityValidatorService {

	@Override
	public boolean isValid(User user) {
		MernisService mernisService = new MernisService();

		return mernisService.tcKimlikDogrula(Long.parseLong(user.getIdentyNumber()), user.getFirstName(),
				user.getLastName(), user.getYearOfBirth());
	}
	

}

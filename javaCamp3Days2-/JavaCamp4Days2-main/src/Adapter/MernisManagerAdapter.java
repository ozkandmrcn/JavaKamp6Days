package Adapter;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entity.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManagerAdapter implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
		try {
			
			return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalId()), user.getFirstName(), user.getLastName(), user.getBirthDate());
			
		} catch (RemoteException e) {
			 
			
			e.printStackTrace();
		}
		
		
		
		
	
		return false;
	}

}

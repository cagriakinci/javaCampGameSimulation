package adapters;

import java.rmi.RemoteException;

import abstracts.PersonCheckService;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckService implements PersonCheckService {
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException {
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNo()), user.getFirstName(),
				user.getLastName(), user.getDateOfBirth());
		if (result == true) {
			System.out.println("Giriş Başarılı");
			return true;
		} else {
			System.out.println("Giriş Başarısız");
			return false;
		}
	}

}

package odev2.core;

import odev2.entities.concretes.Kullanici;

public class KontrolManager implements Kontrol{
public  Kullanici kullanici;
 String fullName = kullanici.getAdi()+kullanici.getSoyAdi();
	@Override
	public boolean eMailDogrula(String eMail) {
		
		return true;
	}

	@Override
	public boolean adSoyadDogrula(String fullName) {
		if (fullName.length()<=2) {
			System.out.println("isim ve ya soy isim uzunlu�u 2 karakterden b�y�k olmal�d�r");
			return false;
		}
		else {
			return true;
		}
	}



	

	

}

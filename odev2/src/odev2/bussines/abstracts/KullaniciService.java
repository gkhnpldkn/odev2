package odev2.bussines.abstracts;

import odev2.entities.concretes.Kullanici;

public interface KullaniciService {
	
	void kayit(Kullanici kullanici , String parola);
	
	void giris( String Email, String parola);

}

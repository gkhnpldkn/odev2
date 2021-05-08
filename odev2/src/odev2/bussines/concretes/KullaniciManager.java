package odev2.bussines.concretes;



//import java.util.Scanner;

import odev2.bussines.abstracts.KullaniciService;
import odev2.dataAccess.abstracts.KullaniciDao;
//import odev2.dataAccess.concretes.HafýzaKullaniciDao;
import odev2.entities.concretes.Kullanici;

public class KullaniciManager implements KullaniciService{
	private  KullaniciDao kullaniciDao;
	private Kullanici kullanici;
 public KullaniciManager(KullaniciDao kullaniciDao,Kullanici kullanici) {
		super();
		this.kullaniciDao = kullaniciDao;
		this.kullanici= kullanici;
	}

	@Override
	public void kayit(Kullanici kullanici, String parola) {
		if (kullanici.getParola() ==parola) {
			kullaniciDao.add(kullanici);
			System.out.println("kayýt yapýldý");
		}
		else {
			System.out.println("parolayý yeniden gir");
		}
	}

	@Override
	public void giris(String Email, String parola) {
		if (kullanici.geteMail()== Email&& kullanici.getParola()==parola) {
			System.out.println("giriþ baþarýlýdýr");
		}
		else {
			System.out.println("e mail ve ya parolanýzý kontrol ederk tekrar giriniz");
		}
	}

}

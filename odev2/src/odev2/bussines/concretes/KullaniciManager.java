package odev2.bussines.concretes;



//import java.util.Scanner;

import odev2.bussines.abstracts.KullaniciService;
import odev2.dataAccess.abstracts.KullaniciDao;
//import odev2.dataAccess.concretes.Haf�zaKullaniciDao;
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
			System.out.println("kay�t yap�ld�");
		}
		else {
			System.out.println("parolay� yeniden gir");
		}
	}

	@Override
	public void giris(String Email, String parola) {
		if (kullanici.geteMail()== Email&& kullanici.getParola()==parola) {
			System.out.println("giri� ba�ar�l�d�r");
		}
		else {
			System.out.println("e mail ve ya parolan�z� kontrol ederk tekrar giriniz");
		}
	}

}

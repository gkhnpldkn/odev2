package odev2;

import odev2.bussines.concretes.KullaniciManager;
//import odev2.dataAccess.abstracts.KullaniciDao;
import odev2.dataAccess.concretes.Haf�zaKullaniciDao;
import odev2.entities.concretes.Kullanici;

public class Main {

	public static void main(String[] args) {
		Kullanici kullanici = new Kullanici("g�khan", "palant�ken", "gkn@gmail.com", "11223213");

		  KullaniciManager adam = new KullaniciManager(new Haf�zaKullaniciDao(),kullanici);
		  

//adam.kayit(kullanici,"11223213");
adam.giris("gkn@gmail.com", "1122321");


System.out.println();
	}

}

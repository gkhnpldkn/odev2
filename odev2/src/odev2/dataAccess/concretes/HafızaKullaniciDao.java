package odev2.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import odev2.dataAccess.abstracts.KullaniciDao;
import odev2.entities.concretes.Kullanici;

public class HafýzaKullaniciDao  implements KullaniciDao{
	 List<Kullanici> kullanicilar = new ArrayList<>();
	 

	@Override
	public void add(Kullanici kullanici) {
		
		System.out.println(kullanici.getAdi()+"kullanicisi eklendi");
		kullanicilar.add(kullanici);
	}

	
	@Override
	public void delete(Kullanici kullanici) {
		System.out.println("kullanici silindi");
		
	}

	@Override
	public List<Kullanici> getAll() {
		// TODO Auto-generated method stub
		return kullanicilar;
	}

}

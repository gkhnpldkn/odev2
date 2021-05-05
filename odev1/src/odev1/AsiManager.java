package odev1;

public class AsiManager implements AsiService {

	@Override
	public void asiEkle(Asi asi) {
		System.out.println(asi.getAsiAdi()+ "adlý aþýyý seçtiniz ");
	}

	@Override
	public void asiSil(Asi asi) {
		System.out.println(asi.getAsiAdi()+ "adlý aþýyý sisteminizden sildiniz ");
		
	}

	@Override
	public void dozBelirle(Asi asi) {
		System.out.println(asi.getAsiAdi()+ " adlý aþýdan "+ asi.getDozAdedi()+" doz aþýyý" + asi.getGunAraligi()+" gün aralýðýnda vurulacaksýnýz");
		
	}

}

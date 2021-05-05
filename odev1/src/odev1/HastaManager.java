package odev1;

public class HastaManager implements HastaService{
private HastaKontrol hastaKontrol;

 public HastaManager(HastaKontrol hastaKontrol) {
	this.hastaKontrol= hastaKontrol;
}
	@Override
	public void hastaEkle(Hasta hasta) {
		if (hastaKontrol.GercekMi(hasta)) {
			
			System.out.println(hasta.getFirstName()+" "+hasta.getLastName()+"isimli hasta aþý listesine eklenmiþtir");
		}
		
		
	}

	@Override
	public void hastaSil(Hasta hasta) {
		if (hastaKontrol.GercekMi(hasta)==false) {
			System.out.println("sayýn "+ hasta.getFirstName()+ " "+ hasta.getLastName()+" henüz aþý sýrnýz gelediði için aþý listesinden siliniyorsunuz");
		}
		
	}

	@Override
	public void asiYap(Hasta hasta) {
		System.out.println( "aþý yapýldý");
		
	}

	

	

}

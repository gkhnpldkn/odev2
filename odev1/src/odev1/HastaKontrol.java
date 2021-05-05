package odev1;

public class HastaKontrol implements HastaKontrolService{



	@Override
	public boolean GercekMi(Hasta hasta) {
	if (hasta.getDogumYili()<=1985) {
		return true;
	}
	else {
		
		return false;
	}
	}

}

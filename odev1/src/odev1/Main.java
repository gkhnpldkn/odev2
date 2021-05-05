package odev1;



public class Main {

	public static void main(String[] args) {
	
		HastaManager hastaManager =new HastaManager(new HastaKontrol());
		 AsiManager asimanager = new AsiManager();
    Hasta hasta = new Hasta();
    	hasta.setFirstName("gökhan");
    	hasta.setLastName("palantöken");
    	hasta.setTcNo("30883288957");
    	hasta.setDogumYili(1974);
    	hasta.setAsiGunu("pazartesi");
   
    
    Asi asi =new Asi();
    	asi.setAsiAdi("biontech");
    	asi.setDozAdedi(2);
    	asi.setFirmaAdi("biontec-pfizer");
    	asi.setGunAraligi(21);
    
   
    
if (hasta.getDogumYili()<=1975 ) {
	hastaManager.hastaEkle(hasta);
	asimanager.asiEkle(asi);
	hastaManager.asiYap(hasta);
}
else {
	 asimanager.asiEkle(asi);
	System.out.println("sayýn "+ hasta.getFirstName()+" "+ hasta.getLastName()+" yaþ aralýðýnýz aþý sýralamsýnda deðildir sen evde kal ");
}
	}

}

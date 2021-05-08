package odev2.entities.concretes;
import odev2.entities.abstaract.Entitiy;


public class Kullanici implements Entitiy {
private String adi;
private String soyAdi;
private String eMail;
private String parola;
public Kullanici(String adi, String soyAdi, String eMail, String parola) {
	super();
	this.adi = adi;
	this.soyAdi = soyAdi;
	this.eMail = eMail;
	this.parola = parola;
}
public String getAdi() {
	return adi;
}
public void setAdi(String adi) {
	this.adi = adi;
}
public String getSoyAdi() {
	return soyAdi;
}
public void setSoyAdi(String soyAdi) {
	this.soyAdi = soyAdi;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
public String getParola() {
	return parola;
}
public void setParola(String parola) {
	this.parola = parola;
}

}

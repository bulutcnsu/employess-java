
public class Calisan {
private String ad;
private String soyad;
private int ID;


public Calisan(String ad, String soyad, int iD) {

	this.ad = ad;
	this.soyad = soyad;
	ID = iD;
}

public void bilgileriGoster() {
	
		System.out.println("Çalýþan Bilgileri:");
		System.out.println("Ad: " +ad);
		System.out.println("Soyad: " +soyad);
		System.out.println("ID:" +ID);
	
}

public String getAd() {
	return ad;
}

public void setAd(String ad) {
	this.ad = ad;
}

public String getSoyad() {
	return soyad;
}

public void setSoyad(String soyad) {
	this.soyad = soyad;
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}


}

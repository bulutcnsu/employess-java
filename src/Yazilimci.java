
public class Yazilimci extends Calisan {

	private String diller;
	
	public Yazilimci(String ad, String soyad, int iD,String diller) {
		super(ad, soyad, iD);
		this.diller=diller;
		
	}

	public void formatAt(String isletimSistemi) {
		System.out.println(getAd() +  " " + isletimSistemi +" ni yüklüyor...");
		
	}
	
	public void bilgileriGoster() {//override Metod
		super.bilgileriGoster();//Çalýþan sýnýfýnýn metodunu çaðýrýr
		System.out.println("Yazýlýmcýnýn Bildiði Diller :" + diller);
		
	}
	
}

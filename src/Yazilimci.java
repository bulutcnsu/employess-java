
public class Yazilimci extends Calisan {

	private String diller;
	
	public Yazilimci(String ad, String soyad, int iD,String diller) {
		super(ad, soyad, iD);
		this.diller=diller;
		
	}

	public void formatAt(String isletimSistemi) {
		System.out.println(getAd() +  " " + isletimSistemi +" ni y�kl�yor...");
		
	}
	
	public void bilgileriGoster() {//override Metod
		super.bilgileriGoster();//�al��an s�n�f�n�n metodunu �a��r�r
		System.out.println("Yaz�l�mc�n�n Bildi�i Diller :" + diller);
		
	}
	
}

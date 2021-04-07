
public class Yonetici extends Calisan {
	private int sorumluKisiSayisi;
	
	public Yonetici(String ad, String soyad, int iD, int sorumluKisiSayisi) {
		super(ad, soyad, iD);
		this.sorumluKisiSayisi=sorumluKisiSayisi;
		
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println(" Yönetiicnin Sorumlu  Oldugu Kiþi Sayýsý :" +sorumluKisiSayisi);
	}

	
	public void zamYap(int zamMiktari) {
		System.out.println(getAd() +"  çalýþanlara " +zamMiktari + "tl  kadar zam yapýyor");
		
	}
	
	

}

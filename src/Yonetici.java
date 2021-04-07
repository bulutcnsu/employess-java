
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
		System.out.println(" Y�netiicnin Sorumlu  Oldugu Ki�i Say�s� :" +sorumluKisiSayisi);
	}

	
	public void zamYap(int zamMiktari) {
		System.out.println(getAd() +"  �al��anlara " +zamMiktari + "tl  kadar zam yap�yor");
		
	}
	
	

}

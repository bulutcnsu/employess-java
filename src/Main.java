import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Çalýþanlar Projesine Hoþgeldiniz...");
		String islemler="Ýþlemler..\n" +"1.Yazýlýmcý Ýþlmleri \n" +"2.Yönetici Ýþlemleri\n" +"Çýkýþ Ýçin Q'ya Basýn";
		System.out.println("*************************************");
		System.out.println(islemler);
		System.out.println("*************************************");
		
		
		while(true) {
			System.out.print("Ýþlemi Seçiniz :");
			String islem=scan.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Pogramdan çýkýlýyor");
				break;
			}
			else if(islem.equals("1")){
				
				Yazilimci yazilimci =new Yazilimci("cansu", "bulut", 34, "c# ,java");
				String yazilimciIslem="1.Format At\n"+"2.Bilgileri Göster\n" +"Çýkýþ Ýçin q'a Basýn";
				System.out.println(yazilimciIslem);
				
				while(true) {
					System.out.print("Ýþlemi seciniz: ");
					String yIslem=scan.nextLine();
					
					
					if(yIslem.equals("q")) {
						System.out.println("Yazýlýmcý Ýþlemlerinden Çýkýlýyor");
						break;
						
					}else if(yIslem.equals("1")) {
						
						System.out.print("Ýþletim Sistemi Seciniz: ");
						String iSistemi=scan.nextLine();
						yazilimci.formatAt(iSistemi);
						
                    }else if(yIslem.equals("2")){
                    	
                    	yazilimci.bilgileriGoster();
						
					}else {
						System.out.println("Geçersiz Yazýlýmci Ýþlemi Yaptýnýz");
					}
				}
				
			}
			
			else if(islem.equals("2")) {
				Yonetici yonetici =new Yonetici("Ece", "Þener", 23, 6);
				String yoneticiIslem="1.Zam Yap\n"+"2.Bilgileri Göster\n" +"Çýkýþ Ýçin q'a Basýn";
				System.out.println(yoneticiIslem);
				
				while(true) {
					System.out.print("Ýþlemi seciniz: ");
					String yIslem=scan.nextLine();
					

					if(yIslem.equals("q")) {
						System.out.println("Yönetici Ýþlemlerinden Çýkýlýyor");
						break;
				
					
				 }else if(yIslem.equals("1")) {
					
					System.out.print("Yoneticinin Ne Kadar Zam Yapmasýný Ýstiorsunuz: ");
					int zamOrani=scan.nextInt();
					scan.nextLine();
					yonetici.zamYap(zamOrani);
					
                  }else if(yIslem.equals("2")){
                	
                	yonetici.bilgileriGoster();
					
				}else {
					System.out.println("Geçersiz Yonetici Ýþlemi Yaptýnýz");
				}
				
				}}
			
			else {
				System.out.println("Geçersiz Ýþlem Yapyýnýz");
			}
		
		}}}

	



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�al��anlar Projesine Ho�geldiniz...");
		String islemler="��lemler..\n" +"1.Yaz�l�mc� ��lmleri \n" +"2.Y�netici ��lemleri\n" +"��k�� ��in Q'ya Bas�n";
		System.out.println("*************************************");
		System.out.println(islemler);
		System.out.println("*************************************");
		
		
		while(true) {
			System.out.print("��lemi Se�iniz :");
			String islem=scan.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Pogramdan ��k�l�yor");
				break;
			}
			else if(islem.equals("1")){
				
				Yazilimci yazilimci =new Yazilimci("cansu", "bulut", 34, "c# ,java");
				String yazilimciIslem="1.Format At\n"+"2.Bilgileri G�ster\n" +"��k�� ��in q'a Bas�n";
				System.out.println(yazilimciIslem);
				
				while(true) {
					System.out.print("��lemi seciniz: ");
					String yIslem=scan.nextLine();
					
					
					if(yIslem.equals("q")) {
						System.out.println("Yaz�l�mc� ��lemlerinden ��k�l�yor");
						break;
						
					}else if(yIslem.equals("1")) {
						
						System.out.print("��letim Sistemi Seciniz: ");
						String iSistemi=scan.nextLine();
						yazilimci.formatAt(iSistemi);
						
                    }else if(yIslem.equals("2")){
                    	
                    	yazilimci.bilgileriGoster();
						
					}else {
						System.out.println("Ge�ersiz Yaz�l�mci ��lemi Yapt�n�z");
					}
				}
				
			}
			
			else if(islem.equals("2")) {
				Yonetici yonetici =new Yonetici("Ece", "�ener", 23, 6);
				String yoneticiIslem="1.Zam Yap\n"+"2.Bilgileri G�ster\n" +"��k�� ��in q'a Bas�n";
				System.out.println(yoneticiIslem);
				
				while(true) {
					System.out.print("��lemi seciniz: ");
					String yIslem=scan.nextLine();
					

					if(yIslem.equals("q")) {
						System.out.println("Y�netici ��lemlerinden ��k�l�yor");
						break;
				
					
				 }else if(yIslem.equals("1")) {
					
					System.out.print("Yoneticinin Ne Kadar Zam Yapmas�n� �stiorsunuz: ");
					int zamOrani=scan.nextInt();
					scan.nextLine();
					yonetici.zamYap(zamOrani);
					
                  }else if(yIslem.equals("2")){
                	
                	yonetici.bilgileriGoster();
					
				}else {
					System.out.println("Ge�ersiz Yonetici ��lemi Yapt�n�z");
				}
				
				}}
			
			else {
				System.out.println("Ge�ersiz ��lem Yapy�n�z");
			}
		
		}}}

	



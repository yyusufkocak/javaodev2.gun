package odev;

public class Main {

	public static void main(String[] args) {
		
		KartBilgisi kartBilgisi1=new KartBilgisi();
		kartBilgisi1.kartAdi="Garanti";
		kartBilgisi1.kartNumarasi=1111111111;
		kartBilgisi1.ulke= "Türkiye";
		kartBilgisi1.postaKodu=5624;
		kartBilgisi1.sKulTarihi=2023;
		kartBilgisi1.cvcKodu=055;
		
		KartBilgisi kartBilgisi2=new KartBilgisi();
		kartBilgisi2.kartAdi="Finansbank";
		kartBilgisi2.kartNumarasi=222222222;
		kartBilgisi2.ulke= "Türkiye";
		kartBilgisi2.postaKodu=777;
		kartBilgisi2.sKulTarihi=2022;
		kartBilgisi2.cvcKodu=512;

		KartBilgisi kartBilgisi3=new KartBilgisi();
		kartBilgisi3.kartAdi="Vakýfbank";
		kartBilgisi3.kartNumarasi=33333333;
		kartBilgisi3.ulke= "Türkiye";
		kartBilgisi3.postaKodu=9947;
		kartBilgisi3.sKulTarihi=2024;
		kartBilgisi3.cvcKodu=742;
		
		KartBilgisi[] kartBilgileri= {kartBilgisi1,kartBilgisi2,kartBilgisi3};
		
		for (KartBilgisi kartBilgisi : kartBilgileri) {
			System.out.println(kartBilgisi.kartAdi);
		}
		System.out.println();
		System.out.println();


		UyelikleriYonet uyelik1=new UyelikleriYonet();
		uyelik1.abonelik="Premium";
		uyelik1.ucret=50;
		uyelik1.kayitTarihi=2021;
		uyelik1.eylemler="Abonelik Yenileme Baþarýlý";
		
		UyelikleriYonet uyelik2=new UyelikleriYonet();
		uyelik2.abonelik="Free";
		uyelik2.ucret=0;
		uyelik2.kayitTarihi=2021;
		uyelik2.eylemler="Abonelik Kaydý Baþarýlý";
		
		UyelikleriYonet[] uyelikler= {uyelik1,uyelik2};
		
		for (UyelikleriYonet uyelikleriYonet : uyelikler) {
			System.out.println(uyelikleriYonet.abonelik+" = " +uyelikleriYonet.eylemler );
		}
		System.out.println();
		System.out.println();

		
		IsYapanClass isYapanClass=new IsYapanClass();
		
		isYapanClass.anasayfaButonu();
		
		System.out.println();
		System.out.println();

		isYapanClass.accountButonu();
		
		
		
	}

}

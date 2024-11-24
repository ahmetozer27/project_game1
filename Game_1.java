package start;
import java.util.Random;
import java.util.Scanner;

public class Game_1 {
//                                                 V 2.0 SWÝTCH VE CASE LERÝN YERÝNE ÝF LER GELMELÝ!
	public static void main(String[] args) {
		Random rastgele=new Random();
		Scanner input=new Scanner(System.in);
		int can=0;
		int hasar1=0,hasar2=0,toplamhasar=0;
		double para=0;
		double tecrübe=0;
		// insan rastgele hasarý
		//int hasari=rastgele.nextInt(41);
		//hasari+=40;
		// kýlýç ve kalkan fiyatlarý
		int ký1=20,ký2=100,ký3=175;
		int ka1=30,ka2=125,ka3=200;
		// türlerin canlarý
		int hpe=150,hpc=125,hpo=100,hpi=200;
		//türlerin hasarlarý
		int hasare1=50,hasare2=75,hasarc1=70,hasarc2=90,hasaro1=100,hasaro2=125,hasari1=40,hasari2=80;
		String hasare=hasare1+"-"+hasare2,hasarc=hasarc1+"-"+hasarc2,hasaro=hasaro1+"-"+hasaro2,hasari=hasari1+"-"+hasari2;
		// kýlýç ve kalkan etkileri
		int kýlýç1=10,kýlýç2=50,kýlýç3=100;
		int kalkan1=50,kalkan2=100,kalkan3=200;
		// giydiðimiz eklentiler
		int kýyafet=0,saldýrý_aleti=0;
		//tecrübe seviyesi
		int sayac1=0,sayac2=0;
		//tecrübe özellikleri
		int bilek=0,akýl=0;
		//hasar azaltma
		int hasar_azaltma=0;
		//while için döngü deðiþkenleri
		int i1=0,i2=0,i3=0,i4=0;
		//zýrhý veya kýlýcý satarken kullanýlan geçici deðiþkenler
		double tempka=0,tempký=0;
		//çöl canavarlarý can ve hasar deðiþkenleri
		int çican=50,çkcan=150,çlcan=250;
		int çihasar=10,çkhasar=25,çlhasar=50;
		//volkan canavarlarý can ve hasar deðiþkenleri
		int vican=75,vkcan=200,vlcan=300;
		int vihasar=15,vkhasar=45,vlhasar=65;
		//orman haritasý can ve hasar deðiþkenleri
		int oican=100,okcan=300,olcan=400;
		int oihasar=25,okhasar=65,olhasar=80;
		//deniz haritasý can ve hasar deðiþkenleri
		int dican=125,dkcan=350,dlcan=500;
		int dihasar=35,dkhasar=80,dlhasar=150;
		//seçimler
		int seçim1,seçim2,seçim3,seçim4,seçim5,seçim6,seçim7,seçim8,seçim9,seçim10,seçim11,seçim12,seçim13,seçim14,seçim15,seçim16,seçim17,seçim18,seçim19,seçim20,tür=0;
		String elf,insan,cüce,ork,cins = " ",kýlýç="yok",kalkan="yok";
		System.out.println("                                    CANAVAR AVI 1                     Made by Ahmet Özer");
		System.out.println();
		System.out.println();
		System.out.println("Karakterinin Ýsmi Ne Olsun?");
		String isim=input.nextLine();
		if(isim.equals("Ahmet") || isim.equals("Ahmet Özer") || isim.equals("ahmet") || isim.equals("ahmet özer")) {
			System.out.println("\n\nÖzel bir isim girdiniz bu yüzden lütfen þifre girin:");
			String password=input.nextLine();
			if(password.equals("1176")) {
			
			para=9999999;
			System.out.println("                       \n\nAdmin Giriþi Yapýldý!\n\nPara: 0 ==>"+para+"\n(Atlamak Ýçin Bir Tuþa Basýnýz!)\n");
			String tuþ8=input.nextLine();			
		}else {
			System.out.println("\n\nYanlýþ bir þifre girdiniz:\n\n\nAdmin giriþi yapýlamadý!\n\n");
		}
		}
		while(i1<1) {
		System.out.println();
		System.out.println("Türü Ne Olsun? \n\n1-Elf     Can:150   Hasar:50-75\n\n2-Cüce    Can:125   Hasar:70-90 \n\n3-Ork     Can:100    Hasar:100-125 \n\n4-Ýnsan   Can:200   Hasar:40-80");
		seçim1=input.nextInt();		
		switch(seçim1){
		case 1:
			tür=1;
			cins="Elf";
			can=hpe;
			hasar1=hasare1; 
			hasar2=hasare2;
			i1++;
			break;
		case 2:
			tür=2;
			cins="Cüce";
			can=hpc;
			hasar1=hasarc1;
			hasar2=hasarc2;
			i1++;
			break;
		case 3:
			tür=3;
			cins="Ork";
			can=hpo;
			hasar1=hasaro1;
			hasar2=hasaro2;
			i1++;
			break;
		case 4:
			tür=4;
			cins="Ýnsan";
			can=hpi;
			hasar1=hasari1;
			hasar2=hasari2;
			i1++;
			break;
		
		default:
			System.out.println();
			System.out.println("Yanlýþ Bir Seçim Yaptýnýz!");
			System.out.println();
			System.out.println("Lütfen Tekrar Giriniz:");
			System.out.println();
		}
		}
		if(tür>=1&&tür<=4) {
			System.out.println("                         Hikayemiz Tüm Diyara Barýþ Getirmek Ýsteyen "+cins+" Soyundan "+isim+" Ýle Baþladý! ");
			System.out.println("                                      (Atlamak Ýçin Bir Tuþa Basýnýz!)");
			String tuþ1=input.nextLine();
			String tuþ7=input.nextLine();
			System.out.println();
			System.out.println("                         Amacý Canavarlarý Öldürerek Geliþmek Ve Deniz Lordundan Ýntikam Almaktý!");
			System.out.println("                                      (Atlamak Ýçin Bir Tuþa Basýnýz!)");
			String tuþ2=input.nextLine();
			System.out.println();
			System.out.println("                                 Unutma Sadece 1 Hakkýn Var.Ölürsen Biter!");
			System.out.println("                                      (Atlamak Ýçin Bir Tuþa Basýnýz!)\n\n");
			String tuþ4=input.nextLine();
			
		while(i2<1) {
			//geçici can,para veya hasar deðiþkenleri 

		int temph1,temph2;
		int tempc;
		double tempp;
		tempp=para;
		temph1=hasar1;
		temph2=hasar2;
		tempc=can;
		if(can<=10 && para<25) {
			System.out.println("\n\nMalesef Canýnýz En Düþük Leveldeki Canavarý Bile Öldürecek Kadar Yeterli Deðil!\n\nAyný Zamanda Paranýzda Canýnýzý Arttýrmak Ýçin Yeterli Deðil!\n\nBu Sebeple Daha Fazla Oynamanýzýn Anlamý yok!");
			System.out.println("\n\n                                  Oyun Bitti!");
	    	i2++;
	    	break;
		}
		System.out.println("                                                        CANAVAR AVI 1");
		System.out.println("\n");
		System.out.println("Karakterin Ýsmi: "+isim+"   Türü: "+cins);
		System.out.println();
		System.out.print("Canýnýz: "+can);
		System.out.print("   Hasarýnýz: "+hasar1+"-"+hasar2);
		System.out.println("   Paranýz: "+para+" TL");
		System.out.println();
		System.out.println("Ne Yapmak Ýstiyorsunuz? \n\n 1-Market \n\n 2-Envanter \n\n 3-Karakter \n\n 4-Savaþ\n\n 5-Bilgi \n\n 6-Çarkýfelek \n\n 7-Çýkýþ(Her Þey Sýfýrlanýr!)\n\n");
		seçim2=input.nextInt();
		switch(seçim2) {
		case 1:
			//market
			System.out.println(" 1-Silah Al\n\n 2-Zýrh Al\n\n 3-Ýksir Al\n\n 4-Geri Dön\n");
			seçim3=input.nextInt();
			switch(seçim3) {
			case 1:
				System.out.println(" 1-Tahta Kýlýç 20TL"+"     Toplam paranýz:"+para+"\n\n 2-Demir Kýlýç 100TL\n\n 3-Elmas Kýlýç 175TL\n\n 4-Geri Dön\n");
				seçim4=input.nextInt();
				switch(seçim4) {
				case 1:
					if(saldýrý_aleti<1) {
					if(para>=ký1) {
					para-=20;	
					hasar1+=kýlýç1;
					hasar2+=kýlýç1;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Hasarýnýz: "+temph1+"-"+temph2+" ==> "+hasar1+"-"+hasar2);
					System.out.println();
					System.out.println();
					kýlýç="Tahta Kýlýç";
					tempký=20;
					saldýrý_aleti++;
					}
					else {
						System.out.println("Yeterli Paranýz Bulunmamaktadýr!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Silah Takýlý!");
						System.out.println();
						System.out.println();
					}
					break;
				case 2:
					if(saldýrý_aleti<1) {
					if(para>=ký2) {
					para-=100;	
					hasar1+=kýlýç2;
					hasar2+=kýlýç2;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Hasarýnýz: "+temph1+"-"+temph2+" ==> "+hasar1+"-"+hasar2);
					System.out.println();
					System.out.println();
					kýlýç="Demir Kýlýç";
					tempký=100;
					saldýrý_aleti++;
					}else {
						System.out.println("Yeterli Paranýz Bulunmamaktadýr!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Silah Takýlý!");
						System.out.println();
						System.out.println();
					}
					break;
				case 3:
					if(saldýrý_aleti<1) {
					if(para>=ký3) {
					para-=175;
					hasar1+=kýlýç3;
					hasar2+=kýlýç3;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Hasarýnýz: "+temph1+"-"+temph2+" ==> "+hasar1+"-"+hasar2);
					System.out.println();
					System.out.println();
					kýlýç="Elmas Kýlýç";
					tempký=175;
					saldýrý_aleti++;
					}
					else {
						System.out.println("Yeterli Paranýz Bulunmamaktadýr!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Silah Takýlý!");
						System.out.println();
						System.out.println();
					}
					break;
				case 4:
					break;	
					
				}
				break;
			case 2:
				System.out.println(" 1-Tahta Kalkan 30TL"+"     Toplam Paranýz:"+para+"\n\n 2-Demir Kalkan 125TL\n\n 3-Elmas Kalkan 200TL\n\n 4-Geri Dön\n");
				seçim5=input.nextInt();
				switch(seçim5) {
				case 1:
					if(kýyafet<1) {
					if(para>=ka1) {
					para-=30;	
					can+=kalkan1;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Canýnýz: "+tempc+" ==> "+can);
					System.out.println();
					System.out.println();
					kalkan="Tahta Kalkan";
					tempka=30;
					kýyafet++;
					}
					
					else {
						System.out.println("Yeterli Paranýz Bulunmamaktadýr!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Zýrh Takýlý!");
						System.out.println();
						System.out.println();
					}
					break;
				case 2:
					if(kýyafet<1) {
					if(para>=ka2) {
					para-=125;	
					can+=kalkan2;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Canýnýz: "+tempc+" ==> "+can);
					System.out.println();
					System.out.println();
					kalkan="Demir Kalkan";
					tempka=125;
					kýyafet++;
					}
					else {
						System.out.println("Yeterli Paranýz Bulunmamaktadýr!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Zýrh Takýlý!");
						System.out.println();
						System.out.println();
						}
					break;
				case 3:
					if(kýyafet<1) {
					if(para>=ka3) {
					para-=200;	
					can+=kalkan3;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Canýnýz: "+tempc+" ==> "+can);
					kalkan="Elmas Kalkan";
					tempka=200;
					kýyafet++;
					}
					else {
						System.out.println("Yeterli Paranýz Bulunmamaktadýr!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Zýrh Takýlý!");
						System.out.println();
						System.out.println();
					}
					break;
				case 4:
					break;
				}
				break;
			case 3:
				System.out.println("Almak Ýstediðiniz Ýksiri Seçiniz:\n\n 1-Can Ýksiri (+20 Can)  25TL\n\n 2-Hasar Ýksiri (+10 Hasar)  25TL\n\n 3-Geri Dön");
				seçim9=input.nextInt();
				if(seçim9==1) {
					if(para>=25) {
					can+=20;
					para-=25;
					System.out.println("Mevcut Bakiyeniz: "+para);
					System.out.println();
					System.out.println("Canýnýz: "+tempc+" ==> "+can);
					System.out.println();
					}else {
						System.out.println("Yeterli Paranýz yok!");
						System.out.println();
					}
					
				}
				else if(seçim9==2) {
					if(para>=25) {
						hasar1+=10;
						hasar2+=10;
						para-=25;
						System.out.println("Mevcut Bakiyeniz: "+para);
						System.out.println();
						System.out.println("Hasarýnýz: "+temph1+"-"+temph2+" ==> "+hasar1+"-"+hasar2);
						System.out.println();
					}
				}else if(seçim9==3){
					break;
				}
				break;
			case 4:
					break;
			}
			break;	
		case 2:
			//envanter
			System.out.println("Kýlýç: "+kýlýç+"  Zýrh: "+kalkan);
			System.out.println();
			System.out.println(" 1-Kýlýcý Çýkar Ve Sat\n\n 2-Zýrhý Çýkar Ve Sat\n\n 3-Geri Dön");
			seçim6=input.nextInt();
			switch(seçim6) {
			case 1:
				if(saldýrý_aleti==1) {
					tempký/=2;
					para+=tempký;
					saldýrý_aleti--;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
				}else {
					System.out.println("Kýlýç Yok");
					System.out.println();
					System.out.println();
				}
				break;
			case 2:
				if(kýyafet==1) {
					tempka/=2;
					para+=tempka;
					kýyafet--;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
				}else {
					System.out.println("Zýrh Yok");
					System.out.println();
					System.out.println();
				}
				break;
			case 3:
				break;
				
			}
			break;
		case 3:
			//karakter özellikleri
			System.out.println("Ýsmi: "+isim+"   Türü: "+cins+"   Toplam Tecrüben: "+tecrübe);
			System.out.println();
			System.out.print("Bilek Seviyesi: "+bilek);
			System.out.println("   Akýl Seviyesi: "+akýl);
			System.out.println();
			System.out.println("Geliþtirmek Ýstediðiniz Özelliði Seçiniz:\n\n 1-Bilek   (+10 Hasar)\n\n 2-Akýl   (+10 Dayanýklýlýk)");
			System.out.println();
			System.out.println("Çýmak Ýçin Herhangi Bir Sayýya Basýnýz!");
			seçim7=input.nextInt();
			if(seçim7==1) {
				if(tecrübe > 0) {
				if(bilek<10) {
					hasar1+=10;
					hasar2+=10;
					bilek++;
					tecrübe--;
				}else {
					System.out.println("Zaten Max Level");
					System.out.println();
					System.out.println();
				}
				}else {
					System.out.println("Yeterli Tecrübeniz yok!\n\nHaydi Savaþa!");
					System.out.println();
					System.out.println();
				}
			}else if(seçim7==2) {
				if(tecrübe > 0) {
				if(akýl<10) {
					hasar_azaltma+=10;
					akýl++;
					tecrübe--;
				}else {
					System.out.println("Zaten Max Level");
					System.out.println();
					System.out.println();					
				}
				}else {
					System.out.println("Yeterli Tecrübeniz Yok!\n\nHaydi Savaþa!");
					System.out.println();
					System.out.println();					
				}
			}else if(seçim7==3) {
			break;
			}
			
			break;
		case 4:
			//savaþ
			//hasar azaltmayý eklmeyi unutma
			//para kazanmayý unutma
			//tecrübe kazanmayý unutma
			System.out.println("HARÝTALAR\n\n 1-ÇÖL Haritasý(Kolay)\n\n 2-VOLKAN Haritasý(Orta)\n\n 3-ORMAN Haritasý(Zor)\n\n 4-DENÝZ Haritasý(Çok Zor)\n\n 5-Harita Özellikleri\n\n 6-Geri Dön");
			seçim8=input.nextInt();			
			if(seçim8==1) {
				System.out.println("ÇÖL Haritasýna Hoþ Geldiniz!\n\nSaldýrmak Ýstediðiniz Canavarý Seçiniz:");
				System.out.println();
				System.out.println(" 1-Çöl Ýskeleti Can:50 Hasar:10\n\n 2-Çöl Komutaný Can:150 Hasar:25\n\n 3-Çöl Lordu Can:250 Hasar:50\n\n 4-Geri Dön");
				seçim10=input.nextInt();
				if(seçim10==1) {
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    çihasar-=hasar_azaltma;
				    can-=çihasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    çican-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(çican>=0) {
				    	System.out.println("Çöl Ýskeletinin Kalan Caný: "+çican);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 15TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=15;
				    	çihasar=10;
				    	if(çican<=0) {
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		çican=50;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 15TL Ve Yarým Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=0.5;
				    		para+=15;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim10==2) {
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    çkhasar-=hasar_azaltma;
				    can-=çkhasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    çkcan-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(çkcan>=0) {
				    	System.out.println("Çöl Komutanýnýn Kalan Caný: "+çkcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 20TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=20;
				    	çkhasar=25;
				    	if(çkcan<=0) {
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		çkcan=150;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 25TL Ve 1 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe++;
				    		para+=25;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim10==3) {
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    çlhasar-=hasar_azaltma;
				    can-=çlhasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    çlcan-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(çlcan>=0) {
				    	System.out.println("Çöl Lordunun Kalan Caný: "+çlcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 25TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=25;
				    	çlhasar=50;
				    	if(çlcan<=0) {
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		çlcan=250;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 50TL Ve 2 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=2;
				    		para+=50;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim10==4) {
					break;
				}
				
				
			}
			if(seçim8==2) {
				System.out.println("VOLKAN Haritasýna Hoþ Geldiniz!\n\nSaldýrmak Ýstediðiniz Canavarý Seçiniz:");
				System.out.println();
				System.out.println(" 1-Volkan Ýskeleti Can:75 Hasar:15\n\n 2-Volkan Komutaný Can:200 Hasar:45\n\n 3-Volkan Lordu Can:300 Hasar:65\n\n 4-Geri Dön");
				seçim11=input.nextInt();
				if(seçim11==1) {
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    vihasar-=hasar_azaltma;
				    can-=vihasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    vican-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(vican>=0) {
				    	System.out.println("Volkan Ýskeletinin Kalan Caný: "+vican);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 20TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=20;
				    	vihasar=15;
				    	if(vican<=0) {
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		vican=75;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 25TL Ve 1 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=1;
				    		para+=25;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim11==2) {
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    vkhasar-=hasar_azaltma;
				    can-=vkhasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    vkcan-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(vkcan>=0) {
				    	System.out.println("Volkan Komutanýnýn Kalan Caný: "+vkcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 25TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=25;
				    	vkhasar=45;
				    	if(vkcan<=0) {
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		vkcan=200;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 35TL Ve 1.5 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=1.5;
				    		para+=35;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim11==3) {
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    vlhasar-=hasar_azaltma;
				    can-=vlhasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    vlcan-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(vlcan>=0) {
				    	System.out.println("Volkan Lordunun Kalan Caný: "+vlcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 35TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=35;
				    	vlhasar=65;
				    	if(vlcan<=0) {
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		vlcan=300;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 75TL Ve 3 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=3;
				    		para+=75;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim11==4) {
					break;
				}
				
				
			}
			if(seçim8==3) {
				System.out.println("ORMAN Haritasýna Hoþ Geldiniz!\n\nSaldýrmak Ýstediðiniz Canavarý Seçiniz:");
				System.out.println();
				System.out.println(" 1-Orman Ýskeleti Can:100 Hasar:25\n\n 2-Orman Komutaný Can:300 Hasar:65\n\n 3-Orman Lordu Can:400 Hasar:80\n\n 4-Geri Dön");
				seçim12=input.nextInt();
				if(seçim12==1) {
					System.out.println();
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    oihasar-=hasar_azaltma;
				    can-=oihasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    oican-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(oican>=0) {
				    	System.out.println("Orman Ýskeletinin Kalan Caný: "+oican);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 25TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=25;
				    	oihasar=25;
				    	if(oican<=0) {
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		oican=100;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 50TL Ve 1.5 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=1.5;
				    		para+=50;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim12==2) {
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    okhasar-=hasar_azaltma;
				    can-=okhasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    okcan-=toplamhasar;
				    if(can>0) {				    	
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(okcan>=0) {
				    	System.out.println("Orman Komutanýnýn Kalan Caný: "+okcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 35TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=35;
				    	okhasar=65;
				    	if(okcan<=0) {
				    		System.out.println();
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		okcan=300;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 75TL Ve 2 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=2;
				    		para+=75;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim12==3) {
					System.out.println();
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    olhasar-=hasar_azaltma;
				    can-=olhasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    olcan-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(olcan>=0) {
				    	System.out.println("Orman Lordunun Kalan Caný: "+olcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 45TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=45;
				    	olhasar=80;
				    	if(olcan<=0) {
				    		System.out.println();
				    		System.out.println("Onu Öldürdünüz!");
				    		olcan=400;
				    		System.out.println();
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 100TL Ve 4 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=4;
				    		para+=100;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim12==4) {
					break;
				}
				
				
			}
			if(seçim8==4) {
				System.out.println("Deniz Haritasýna Hoþ Geldiniz!\n\nSaldýrmak Ýstediðiniz Canavarý Seçiniz:");
				System.out.println();
				System.out.println(" 1-Deniz Ýskeleti Can:125 Hasar:35\n\n 2-Deniz Komutaný Can:350 Hasar:80\n\n 3-Deniz Lordu Can:500 Hasar:150\n\n 4-Geri Dön");
				seçim13=input.nextInt();
				if(seçim13==1) {
					System.out.println();
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    dihasar-=hasar_azaltma;
				    can-=dihasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    dican-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(dican>=0) {
				    	System.out.println("Deniz Ýskeletinin Kalan Caný: "+dican);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 30TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=30;
				    	dihasar=35;
				    	if(dican<=0) {
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		dican=125;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 100TL Ve 3 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=3;
				    		para+=100;
				    	}
				    	
				    }else {
				    	System.out.println();
				    	System.out.println("Malesef Öldünüz!\n\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim13==2) {
					System.out.println();
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
					System.out.println();
				    dkhasar-=hasar_azaltma;
				    can-=dkhasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    dkcan-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(dkcan>=0) {
				    	System.out.println("Deniz Komutanýnýn Kalan Caný: "+dkcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 50TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=50;
				    	dkhasar=80;
				    	if(dkcan<=0) {
				    		System.out.println("Onu Öldürdünüz!");
				    		System.out.println();
				    		dkcan=350;
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül: 150TL Ve 4 Tecrübe");
				    		System.out.println();
				    		System.out.println();
				    		tecrübe+=4;
				    		para+=150;
				    	}
				    	
				    }else {
				    	System.out.println();
				    	System.out.println("Malesef Öldünüz!\n\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim13==3) {
					System.out.println();
					System.out.println("Saldýrdýnýz Ve Sonuç:");
					System.out.println();
				    dlhasar-=hasar_azaltma;	
					can-=dlhasar;
					toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    dlcan-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(dlcan>=0) {
				    	System.out.println("Deniz Lordunun Kalan Caný: "+dlcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Canýnýz: "+can);
				    	System.out.println();
				    	System.out.println("Kazandýðýnýz Para: 1TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=1;
				    	dlhasar=150;
				    	if(dlcan<=0) {
				    		System.out.println("Onu Öldürdünüz!\n");
				    		System.out.println("Öldürdüðünüz Ýçin 999999999 TL Ve 999999999 Tecrübe Kazandýnýz!");
				    		para+=999999999;
				    		tecrübe+=999999999;
				    		System.out.println();
				    		System.out.println();
				    		dlcan=500;
				    		System.out.println("                      ...Ve Hikayemiz Böylece Tüm Diyara Barýþ Getirerek Sonlanmýþ Oldu!");
				    		System.out.println("                                      (Atlamak Ýçin Bir Tuþa Basýnýz!)");
							String tuþ5=input.nextLine();
							String tuþ15=input.nextLine();
							System.out.println();
							System.out.println();
				    		System.out.println("Öldürdüðünüz Ýçin Kazandýðýnýz Ödül:Bir Oyunu Bitirmenin Vermiþ Olduðu Zevk!");
				    		System.out.println("                               Oyunu Kazandýnýz!\n\n                                         Tebrikler!");
				    		System.out.println("\n                                 (Oyunu Sonlandýrmak Ýçin Bir Tuþa Basýnýz!)");
							String tuþ6=input.nextLine();
							String tuþ17=input.nextLine();
				    		i2++;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef Öldünüz!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(seçim13==4) {
					break;
				}
				
				
			}
			if(seçim8==5) {
				System.out.println();
				System.out.println("Haritalarýn Zorluk Dereceleri Yanlarýnda Yazýyor!\n\nHedefin Haritalardaki Canavarlarý Öldürüp Geliþmen Ve Deniz Lordunu Öldürecek Güce Ulaþman!");
				System.out.println("\n\n                   Her Vuruþunda              Öldürdüðünde");
				System.out.println("\n\nÇöl Ýskeleti            15TL                      15TL\n\nÇöl Komutaný            20TL                      25TL\n\nÇöl Lordu               25TL                      50TL");
				System.out.println("\n\nVolkan Ýskeleti         20TL                      25TL\n\nVolkan Komutaný         25TL                      35TL\n\nVolkan Lordu            35TL                      75TL");
				System.out.println("\n\nOrman Ýskeleti          25TL                      50TL\n\nOrman Komutaný          35TL                      75TL\n\nOrman Lordu             45TL                     100TL");
				System.out.println("\n\nDeniz Ýskeleti          30TL                     100TL\n\nDeniz Komutaný          45TL                     150TL\n\nDeniz Lordu              1TL               999999999TL");
				System.out.println("\n");
				break;
			}
			if(seçim8==6) {
				break;
			}
			
			
			break;
		case 5:
			while(i4<1) {
			System.out.println();
			System.out.println("Yapan:Ahmet Özer");
			System.out.println();
			System.out.println("Karakterin aklýný geliþtirirsen daha az hasar alýr!\n\nKarakterin bileðini geliþtirirsen gücü artar!\n");
			System.out.println();
			System.out.println("                Copyright belongs to Ahmet Özer");
			System.out.println();
			System.out.println(" (Geri Dönmek Ýçin Bir Tuþa Basýnýz)");
			String exit=input.nextLine();
			i4++;
			System.out.println();
			System.out.println();
			System.out.println();
			}
			break;
		case 6:
			System.out.println("                            ÇARKIFELEK'E HoÞGELDÝNÝZ\n\n");
			System.out.println("1-UCUZ ZAR  (10TL ==>  25TL)    (%50 ÞANS)\n\n2-ORTA ZAR  (25TL ==> 100TL)    (%25 ÞANS)\n\n3-BÜYÜK ZAR (50TL ==> 500TL)    (%15 ÞANS)\n\n4-Geri Dön");
			seçim17=input.nextInt();
			
			if(seçim17==1) {
				if(para>=10) {
					para-=10;
			int uczar=rastgele.nextInt(2);
			if(uczar==1) {
				para+=25;
				System.out.println("             Bravo Kazandýnýz!\n\nParanýz: "+tempp +"==>"+ para);
			}else if(uczar==0) {
				System.out.println("             Malesef Kaybettiniz!");
			}
			}else {
				System.out.println("           Yeterli Paranýz Bulunmamaktadýr!");
			}
			}
			else if(seçim17==2) {
				if(para>=25) {
					para-=25;
			int uczar=rastgele.nextInt(4);
			if(uczar==1) {
				para+=100;
				System.out.println("             Bravo Kazandýnýz!\n\nParanýz: "+tempp +"==>"+ para);
			}else if(uczar!=1) {
				System.out.println("             Malesef Kaybettiniz!");
			}
			}else {
				System.out.println("           Yeterli Paranýz Bulunmamaktadýr!");
			}
			}
			else if(seçim17==3) {
				if(para>=50) {
					para-=50;
			int uczar=rastgele.nextInt(20);
			if(uczar==1 || uczar==3 || uczar==5) {
				para+=500;
				System.out.println("             Bravo Kazandýnýz!\n\nParanýz: "+tempp +"==>"+ para);
			}else if(uczar!=1 || uczar!=3 || uczar!=5) {
				System.out.println("             Malesef Kaybettiniz!");
			}
			}else {
				System.out.println("           Yeterli Paranýz Bulunmamaktadýr!");
			}
			}else if(seçim17==4) {
				break;
			}
			break;
		case 7:
			i2++;
			break;
		}
		}
		}
			
}
	}
	 



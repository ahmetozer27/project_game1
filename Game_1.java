package start;
import java.util.Random;
import java.util.Scanner;

public class Game_1 {
//                                                 V 2.0 SW�TCH VE CASE LER�N YER�NE �F LER GELMEL�!
	public static void main(String[] args) {
		Random rastgele=new Random();
		Scanner input=new Scanner(System.in);
		int can=0;
		int hasar1=0,hasar2=0,toplamhasar=0;
		double para=0;
		double tecr�be=0;
		// insan rastgele hasar�
		//int hasari=rastgele.nextInt(41);
		//hasari+=40;
		// k�l�� ve kalkan fiyatlar�
		int k�1=20,k�2=100,k�3=175;
		int ka1=30,ka2=125,ka3=200;
		// t�rlerin canlar�
		int hpe=150,hpc=125,hpo=100,hpi=200;
		//t�rlerin hasarlar�
		int hasare1=50,hasare2=75,hasarc1=70,hasarc2=90,hasaro1=100,hasaro2=125,hasari1=40,hasari2=80;
		String hasare=hasare1+"-"+hasare2,hasarc=hasarc1+"-"+hasarc2,hasaro=hasaro1+"-"+hasaro2,hasari=hasari1+"-"+hasari2;
		// k�l�� ve kalkan etkileri
		int k�l��1=10,k�l��2=50,k�l��3=100;
		int kalkan1=50,kalkan2=100,kalkan3=200;
		// giydi�imiz eklentiler
		int k�yafet=0,sald�r�_aleti=0;
		//tecr�be seviyesi
		int sayac1=0,sayac2=0;
		//tecr�be �zellikleri
		int bilek=0,ak�l=0;
		//hasar azaltma
		int hasar_azaltma=0;
		//while i�in d�ng� de�i�kenleri
		int i1=0,i2=0,i3=0,i4=0;
		//z�rh� veya k�l�c� satarken kullan�lan ge�ici de�i�kenler
		double tempka=0,tempk�=0;
		//��l canavarlar� can ve hasar de�i�kenleri
		int �ican=50,�kcan=150,�lcan=250;
		int �ihasar=10,�khasar=25,�lhasar=50;
		//volkan canavarlar� can ve hasar de�i�kenleri
		int vican=75,vkcan=200,vlcan=300;
		int vihasar=15,vkhasar=45,vlhasar=65;
		//orman haritas� can ve hasar de�i�kenleri
		int oican=100,okcan=300,olcan=400;
		int oihasar=25,okhasar=65,olhasar=80;
		//deniz haritas� can ve hasar de�i�kenleri
		int dican=125,dkcan=350,dlcan=500;
		int dihasar=35,dkhasar=80,dlhasar=150;
		//se�imler
		int se�im1,se�im2,se�im3,se�im4,se�im5,se�im6,se�im7,se�im8,se�im9,se�im10,se�im11,se�im12,se�im13,se�im14,se�im15,se�im16,se�im17,se�im18,se�im19,se�im20,t�r=0;
		String elf,insan,c�ce,ork,cins = " ",k�l��="yok",kalkan="yok";
		System.out.println("                                    CANAVAR AVI 1                     Made by Ahmet �zer");
		System.out.println();
		System.out.println();
		System.out.println("Karakterinin �smi Ne Olsun?");
		String isim=input.nextLine();
		if(isim.equals("Ahmet") || isim.equals("Ahmet �zer") || isim.equals("ahmet") || isim.equals("ahmet �zer")) {
			System.out.println("\n\n�zel bir isim girdiniz bu y�zden l�tfen �ifre girin:");
			String password=input.nextLine();
			if(password.equals("1176")) {
			
			para=9999999;
			System.out.println("                       \n\nAdmin Giri�i Yap�ld�!\n\nPara: 0 ==>"+para+"\n(Atlamak ��in Bir Tu�a Bas�n�z!)\n");
			String tu�8=input.nextLine();			
		}else {
			System.out.println("\n\nYanl�� bir �ifre girdiniz:\n\n\nAdmin giri�i yap�lamad�!\n\n");
		}
		}
		while(i1<1) {
		System.out.println();
		System.out.println("T�r� Ne Olsun? \n\n1-Elf     Can:150   Hasar:50-75\n\n2-C�ce    Can:125   Hasar:70-90 \n\n3-Ork     Can:100    Hasar:100-125 \n\n4-�nsan   Can:200   Hasar:40-80");
		se�im1=input.nextInt();		
		switch(se�im1){
		case 1:
			t�r=1;
			cins="Elf";
			can=hpe;
			hasar1=hasare1; 
			hasar2=hasare2;
			i1++;
			break;
		case 2:
			t�r=2;
			cins="C�ce";
			can=hpc;
			hasar1=hasarc1;
			hasar2=hasarc2;
			i1++;
			break;
		case 3:
			t�r=3;
			cins="Ork";
			can=hpo;
			hasar1=hasaro1;
			hasar2=hasaro2;
			i1++;
			break;
		case 4:
			t�r=4;
			cins="�nsan";
			can=hpi;
			hasar1=hasari1;
			hasar2=hasari2;
			i1++;
			break;
		
		default:
			System.out.println();
			System.out.println("Yanl�� Bir Se�im Yapt�n�z!");
			System.out.println();
			System.out.println("L�tfen Tekrar Giriniz:");
			System.out.println();
		}
		}
		if(t�r>=1&&t�r<=4) {
			System.out.println("                         Hikayemiz T�m Diyara Bar�� Getirmek �steyen "+cins+" Soyundan "+isim+" �le Ba�lad�! ");
			System.out.println("                                      (Atlamak ��in Bir Tu�a Bas�n�z!)");
			String tu�1=input.nextLine();
			String tu�7=input.nextLine();
			System.out.println();
			System.out.println("                         Amac� Canavarlar� �ld�rerek Geli�mek Ve Deniz Lordundan �ntikam Almakt�!");
			System.out.println("                                      (Atlamak ��in Bir Tu�a Bas�n�z!)");
			String tu�2=input.nextLine();
			System.out.println();
			System.out.println("                                 Unutma Sadece 1 Hakk�n Var.�l�rsen Biter!");
			System.out.println("                                      (Atlamak ��in Bir Tu�a Bas�n�z!)\n\n");
			String tu�4=input.nextLine();
			
		while(i2<1) {
			//ge�ici can,para veya hasar de�i�kenleri 

		int temph1,temph2;
		int tempc;
		double tempp;
		tempp=para;
		temph1=hasar1;
		temph2=hasar2;
		tempc=can;
		if(can<=10 && para<25) {
			System.out.println("\n\nMalesef Can�n�z En D���k Leveldeki Canavar� Bile �ld�recek Kadar Yeterli De�il!\n\nAyn� Zamanda Paran�zda Can�n�z� Artt�rmak ��in Yeterli De�il!\n\nBu Sebeple Daha Fazla Oynaman�z�n Anlam� yok!");
			System.out.println("\n\n                                  Oyun Bitti!");
	    	i2++;
	    	break;
		}
		System.out.println("                                                        CANAVAR AVI 1");
		System.out.println("\n");
		System.out.println("Karakterin �smi: "+isim+"   T�r�: "+cins);
		System.out.println();
		System.out.print("Can�n�z: "+can);
		System.out.print("   Hasar�n�z: "+hasar1+"-"+hasar2);
		System.out.println("   Paran�z: "+para+" TL");
		System.out.println();
		System.out.println("Ne Yapmak �stiyorsunuz? \n\n 1-Market \n\n 2-Envanter \n\n 3-Karakter \n\n 4-Sava�\n\n 5-Bilgi \n\n 6-�ark�felek \n\n 7-��k��(Her �ey S�f�rlan�r!)\n\n");
		se�im2=input.nextInt();
		switch(se�im2) {
		case 1:
			//market
			System.out.println(" 1-Silah Al\n\n 2-Z�rh Al\n\n 3-�ksir Al\n\n 4-Geri D�n\n");
			se�im3=input.nextInt();
			switch(se�im3) {
			case 1:
				System.out.println(" 1-Tahta K�l�� 20TL"+"     Toplam paran�z:"+para+"\n\n 2-Demir K�l�� 100TL\n\n 3-Elmas K�l�� 175TL\n\n 4-Geri D�n\n");
				se�im4=input.nextInt();
				switch(se�im4) {
				case 1:
					if(sald�r�_aleti<1) {
					if(para>=k�1) {
					para-=20;	
					hasar1+=k�l��1;
					hasar2+=k�l��1;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Hasar�n�z: "+temph1+"-"+temph2+" ==> "+hasar1+"-"+hasar2);
					System.out.println();
					System.out.println();
					k�l��="Tahta K�l��";
					tempk�=20;
					sald�r�_aleti++;
					}
					else {
						System.out.println("Yeterli Paran�z Bulunmamaktad�r!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Silah Tak�l�!");
						System.out.println();
						System.out.println();
					}
					break;
				case 2:
					if(sald�r�_aleti<1) {
					if(para>=k�2) {
					para-=100;	
					hasar1+=k�l��2;
					hasar2+=k�l��2;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Hasar�n�z: "+temph1+"-"+temph2+" ==> "+hasar1+"-"+hasar2);
					System.out.println();
					System.out.println();
					k�l��="Demir K�l��";
					tempk�=100;
					sald�r�_aleti++;
					}else {
						System.out.println("Yeterli Paran�z Bulunmamaktad�r!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Silah Tak�l�!");
						System.out.println();
						System.out.println();
					}
					break;
				case 3:
					if(sald�r�_aleti<1) {
					if(para>=k�3) {
					para-=175;
					hasar1+=k�l��3;
					hasar2+=k�l��3;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Hasar�n�z: "+temph1+"-"+temph2+" ==> "+hasar1+"-"+hasar2);
					System.out.println();
					System.out.println();
					k�l��="Elmas K�l��";
					tempk�=175;
					sald�r�_aleti++;
					}
					else {
						System.out.println("Yeterli Paran�z Bulunmamaktad�r!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Silah Tak�l�!");
						System.out.println();
						System.out.println();
					}
					break;
				case 4:
					break;	
					
				}
				break;
			case 2:
				System.out.println(" 1-Tahta Kalkan 30TL"+"     Toplam Paran�z:"+para+"\n\n 2-Demir Kalkan 125TL\n\n 3-Elmas Kalkan 200TL\n\n 4-Geri D�n\n");
				se�im5=input.nextInt();
				switch(se�im5) {
				case 1:
					if(k�yafet<1) {
					if(para>=ka1) {
					para-=30;	
					can+=kalkan1;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Can�n�z: "+tempc+" ==> "+can);
					System.out.println();
					System.out.println();
					kalkan="Tahta Kalkan";
					tempka=30;
					k�yafet++;
					}
					
					else {
						System.out.println("Yeterli Paran�z Bulunmamaktad�r!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Z�rh Tak�l�!");
						System.out.println();
						System.out.println();
					}
					break;
				case 2:
					if(k�yafet<1) {
					if(para>=ka2) {
					para-=125;	
					can+=kalkan2;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Can�n�z: "+tempc+" ==> "+can);
					System.out.println();
					System.out.println();
					kalkan="Demir Kalkan";
					tempka=125;
					k�yafet++;
					}
					else {
						System.out.println("Yeterli Paran�z Bulunmamaktad�r!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Z�rh Tak�l�!");
						System.out.println();
						System.out.println();
						}
					break;
				case 3:
					if(k�yafet<1) {
					if(para>=ka3) {
					para-=200;	
					can+=kalkan3;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
					System.out.println("Can�n�z: "+tempc+" ==> "+can);
					kalkan="Elmas Kalkan";
					tempka=200;
					k�yafet++;
					}
					else {
						System.out.println("Yeterli Paran�z Bulunmamaktad�r!");
						System.out.println();
						System.out.println();
					}
					}else {
						System.out.println("Zaten Bir Z�rh Tak�l�!");
						System.out.println();
						System.out.println();
					}
					break;
				case 4:
					break;
				}
				break;
			case 3:
				System.out.println("Almak �stedi�iniz �ksiri Se�iniz:\n\n 1-Can �ksiri (+20 Can)  25TL\n\n 2-Hasar �ksiri (+10 Hasar)  25TL\n\n 3-Geri D�n");
				se�im9=input.nextInt();
				if(se�im9==1) {
					if(para>=25) {
					can+=20;
					para-=25;
					System.out.println("Mevcut Bakiyeniz: "+para);
					System.out.println();
					System.out.println("Can�n�z: "+tempc+" ==> "+can);
					System.out.println();
					}else {
						System.out.println("Yeterli Paran�z yok!");
						System.out.println();
					}
					
				}
				else if(se�im9==2) {
					if(para>=25) {
						hasar1+=10;
						hasar2+=10;
						para-=25;
						System.out.println("Mevcut Bakiyeniz: "+para);
						System.out.println();
						System.out.println("Hasar�n�z: "+temph1+"-"+temph2+" ==> "+hasar1+"-"+hasar2);
						System.out.println();
					}
				}else if(se�im9==3){
					break;
				}
				break;
			case 4:
					break;
			}
			break;	
		case 2:
			//envanter
			System.out.println("K�l��: "+k�l��+"  Z�rh: "+kalkan);
			System.out.println();
			System.out.println(" 1-K�l�c� ��kar Ve Sat\n\n 2-Z�rh� ��kar Ve Sat\n\n 3-Geri D�n");
			se�im6=input.nextInt();
			switch(se�im6) {
			case 1:
				if(sald�r�_aleti==1) {
					tempk�/=2;
					para+=tempk�;
					sald�r�_aleti--;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
				}else {
					System.out.println("K�l�� Yok");
					System.out.println();
					System.out.println();
				}
				break;
			case 2:
				if(k�yafet==1) {
					tempka/=2;
					para+=tempka;
					k�yafet--;
					System.out.println("Mevcut bakiyeniz: "+para);
					System.out.println();
				}else {
					System.out.println("Z�rh Yok");
					System.out.println();
					System.out.println();
				}
				break;
			case 3:
				break;
				
			}
			break;
		case 3:
			//karakter �zellikleri
			System.out.println("�smi: "+isim+"   T�r�: "+cins+"   Toplam Tecr�ben: "+tecr�be);
			System.out.println();
			System.out.print("Bilek Seviyesi: "+bilek);
			System.out.println("   Ak�l Seviyesi: "+ak�l);
			System.out.println();
			System.out.println("Geli�tirmek �stedi�iniz �zelli�i Se�iniz:\n\n 1-Bilek   (+10 Hasar)\n\n 2-Ak�l   (+10 Dayan�kl�l�k)");
			System.out.println();
			System.out.println("��mak ��in Herhangi Bir Say�ya Bas�n�z!");
			se�im7=input.nextInt();
			if(se�im7==1) {
				if(tecr�be > 0) {
				if(bilek<10) {
					hasar1+=10;
					hasar2+=10;
					bilek++;
					tecr�be--;
				}else {
					System.out.println("Zaten Max Level");
					System.out.println();
					System.out.println();
				}
				}else {
					System.out.println("Yeterli Tecr�beniz yok!\n\nHaydi Sava�a!");
					System.out.println();
					System.out.println();
				}
			}else if(se�im7==2) {
				if(tecr�be > 0) {
				if(ak�l<10) {
					hasar_azaltma+=10;
					ak�l++;
					tecr�be--;
				}else {
					System.out.println("Zaten Max Level");
					System.out.println();
					System.out.println();					
				}
				}else {
					System.out.println("Yeterli Tecr�beniz Yok!\n\nHaydi Sava�a!");
					System.out.println();
					System.out.println();					
				}
			}else if(se�im7==3) {
			break;
			}
			
			break;
		case 4:
			//sava�
			//hasar azaltmay� eklmeyi unutma
			//para kazanmay� unutma
			//tecr�be kazanmay� unutma
			System.out.println("HAR�TALAR\n\n 1-��L Haritas�(Kolay)\n\n 2-VOLKAN Haritas�(Orta)\n\n 3-ORMAN Haritas�(Zor)\n\n 4-DEN�Z Haritas�(�ok Zor)\n\n 5-Harita �zellikleri\n\n 6-Geri D�n");
			se�im8=input.nextInt();			
			if(se�im8==1) {
				System.out.println("��L Haritas�na Ho� Geldiniz!\n\nSald�rmak �stedi�iniz Canavar� Se�iniz:");
				System.out.println();
				System.out.println(" 1-��l �skeleti Can:50 Hasar:10\n\n 2-��l Komutan� Can:150 Hasar:25\n\n 3-��l Lordu Can:250 Hasar:50\n\n 4-Geri D�n");
				se�im10=input.nextInt();
				if(se�im10==1) {
					System.out.println("Sald�rd�n�z Ve Sonu�:");
					System.out.println();
					System.out.println();
				    �ihasar-=hasar_azaltma;
				    can-=�ihasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    �ican-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(�ican>=0) {
				    	System.out.println("��l �skeletinin Kalan Can�: "+�ican);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 15TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=15;
				    	�ihasar=10;
				    	if(�ican<=0) {
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		�ican=50;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 15TL Ve Yar�m Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=0.5;
				    		para+=15;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im10==2) {
					System.out.println("Sald�rd�n�z Ve Sonu�:");
					System.out.println();
					System.out.println();
				    �khasar-=hasar_azaltma;
				    can-=�khasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    �kcan-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(�kcan>=0) {
				    	System.out.println("��l Komutan�n�n Kalan Can�: "+�kcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 20TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=20;
				    	�khasar=25;
				    	if(�kcan<=0) {
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		�kcan=150;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 25TL Ve 1 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be++;
				    		para+=25;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im10==3) {
					System.out.println("Sald�rd�n�z Ve Sonu�:");
					System.out.println();
					System.out.println();
				    �lhasar-=hasar_azaltma;
				    can-=�lhasar;
				    toplamhasar=rastgele.nextInt((hasar2-hasar1)+1);
				    toplamhasar+=hasar1;
				    �lcan-=toplamhasar;
				    if(can>0) {
				    	System.out.println("Bravo "+toplamhasar+" Vurdunuz!");
				    	System.out.println();
				    	if(�lcan>=0) {
				    	System.out.println("��l Lordunun Kalan Can�: "+�lcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 25TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=25;
				    	�lhasar=50;
				    	if(�lcan<=0) {
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		�lcan=250;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 50TL Ve 2 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=2;
				    		para+=50;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im10==4) {
					break;
				}
				
				
			}
			if(se�im8==2) {
				System.out.println("VOLKAN Haritas�na Ho� Geldiniz!\n\nSald�rmak �stedi�iniz Canavar� Se�iniz:");
				System.out.println();
				System.out.println(" 1-Volkan �skeleti Can:75 Hasar:15\n\n 2-Volkan Komutan� Can:200 Hasar:45\n\n 3-Volkan Lordu Can:300 Hasar:65\n\n 4-Geri D�n");
				se�im11=input.nextInt();
				if(se�im11==1) {
					System.out.println("Sald�rd�n�z Ve Sonu�:");
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
				    	System.out.println("Volkan �skeletinin Kalan Can�: "+vican);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 20TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=20;
				    	vihasar=15;
				    	if(vican<=0) {
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		vican=75;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 25TL Ve 1 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=1;
				    		para+=25;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im11==2) {
					System.out.println("Sald�rd�n�z Ve Sonu�:");
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
				    	System.out.println("Volkan Komutan�n�n Kalan Can�: "+vkcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 25TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=25;
				    	vkhasar=45;
				    	if(vkcan<=0) {
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		vkcan=200;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 35TL Ve 1.5 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=1.5;
				    		para+=35;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im11==3) {
					System.out.println("Sald�rd�n�z Ve Sonu�:");
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
				    	System.out.println("Volkan Lordunun Kalan Can�: "+vlcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 35TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=35;
				    	vlhasar=65;
				    	if(vlcan<=0) {
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		vlcan=300;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 75TL Ve 3 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=3;
				    		para+=75;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im11==4) {
					break;
				}
				
				
			}
			if(se�im8==3) {
				System.out.println("ORMAN Haritas�na Ho� Geldiniz!\n\nSald�rmak �stedi�iniz Canavar� Se�iniz:");
				System.out.println();
				System.out.println(" 1-Orman �skeleti Can:100 Hasar:25\n\n 2-Orman Komutan� Can:300 Hasar:65\n\n 3-Orman Lordu Can:400 Hasar:80\n\n 4-Geri D�n");
				se�im12=input.nextInt();
				if(se�im12==1) {
					System.out.println();
					System.out.println("Sald�rd�n�z Ve Sonu�:");
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
				    	System.out.println("Orman �skeletinin Kalan Can�: "+oican);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 25TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=25;
				    	oihasar=25;
				    	if(oican<=0) {
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		oican=100;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 50TL Ve 1.5 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=1.5;
				    		para+=50;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im12==2) {
					System.out.println("Sald�rd�n�z Ve Sonu�:");
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
				    	System.out.println("Orman Komutan�n�n Kalan Can�: "+okcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 35TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=35;
				    	okhasar=65;
				    	if(okcan<=0) {
				    		System.out.println();
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		okcan=300;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 75TL Ve 2 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=2;
				    		para+=75;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im12==3) {
					System.out.println();
					System.out.println("Sald�rd�n�z Ve Sonu�:");
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
				    	System.out.println("Orman Lordunun Kalan Can�: "+olcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 45TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=45;
				    	olhasar=80;
				    	if(olcan<=0) {
				    		System.out.println();
				    		System.out.println("Onu �ld�rd�n�z!");
				    		olcan=400;
				    		System.out.println();
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 100TL Ve 4 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=4;
				    		para+=100;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im12==4) {
					break;
				}
				
				
			}
			if(se�im8==4) {
				System.out.println("Deniz Haritas�na Ho� Geldiniz!\n\nSald�rmak �stedi�iniz Canavar� Se�iniz:");
				System.out.println();
				System.out.println(" 1-Deniz �skeleti Can:125 Hasar:35\n\n 2-Deniz Komutan� Can:350 Hasar:80\n\n 3-Deniz Lordu Can:500 Hasar:150\n\n 4-Geri D�n");
				se�im13=input.nextInt();
				if(se�im13==1) {
					System.out.println();
					System.out.println("Sald�rd�n�z Ve Sonu�:");
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
				    	System.out.println("Deniz �skeletinin Kalan Can�: "+dican);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 30TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=30;
				    	dihasar=35;
				    	if(dican<=0) {
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		dican=125;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 100TL Ve 3 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=3;
				    		para+=100;
				    	}
				    	
				    }else {
				    	System.out.println();
				    	System.out.println("Malesef �ld�n�z!\n\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im13==2) {
					System.out.println();
					System.out.println("Sald�rd�n�z Ve Sonu�:");
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
				    	System.out.println("Deniz Komutan�n�n Kalan Can�: "+dkcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 50TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=50;
				    	dkhasar=80;
				    	if(dkcan<=0) {
				    		System.out.println("Onu �ld�rd�n�z!");
				    		System.out.println();
				    		dkcan=350;
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l: 150TL Ve 4 Tecr�be");
				    		System.out.println();
				    		System.out.println();
				    		tecr�be+=4;
				    		para+=150;
				    	}
				    	
				    }else {
				    	System.out.println();
				    	System.out.println("Malesef �ld�n�z!\n\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im13==3) {
					System.out.println();
					System.out.println("Sald�rd�n�z Ve Sonu�:");
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
				    	System.out.println("Deniz Lordunun Kalan Can�: "+dlcan);
				    	System.out.println();
				    	}
				    	System.out.println("Sizin Kalan Can�n�z: "+can);
				    	System.out.println();
				    	System.out.println("Kazand���n�z Para: 1TL");
				    	System.out.println();
				    	System.out.println();
				    	para+=1;
				    	dlhasar=150;
				    	if(dlcan<=0) {
				    		System.out.println("Onu �ld�rd�n�z!\n");
				    		System.out.println("�ld�rd���n�z ��in 999999999 TL Ve 999999999 Tecr�be Kazand�n�z!");
				    		para+=999999999;
				    		tecr�be+=999999999;
				    		System.out.println();
				    		System.out.println();
				    		dlcan=500;
				    		System.out.println("                      ...Ve Hikayemiz B�ylece T�m Diyara Bar�� Getirerek Sonlanm�� Oldu!");
				    		System.out.println("                                      (Atlamak ��in Bir Tu�a Bas�n�z!)");
							String tu�5=input.nextLine();
							String tu�15=input.nextLine();
							System.out.println();
							System.out.println();
				    		System.out.println("�ld�rd���n�z ��in Kazand���n�z �d�l:Bir Oyunu Bitirmenin Vermi� Oldu�u Zevk!");
				    		System.out.println("                               Oyunu Kazand�n�z!\n\n                                         Tebrikler!");
				    		System.out.println("\n                                 (Oyunu Sonland�rmak ��in Bir Tu�a Bas�n�z!)");
							String tu�6=input.nextLine();
							String tu�17=input.nextLine();
				    		i2++;
				    	}
				    	
				    }else {
				    	System.out.println("Malesef �ld�n�z!\n                        Oyun Bitti!");
				    	i2++;
				    }
				}
				if(se�im13==4) {
					break;
				}
				
				
			}
			if(se�im8==5) {
				System.out.println();
				System.out.println("Haritalar�n Zorluk Dereceleri Yanlar�nda Yaz�yor!\n\nHedefin Haritalardaki Canavarlar� �ld�r�p Geli�men Ve Deniz Lordunu �ld�recek G�ce Ula�man!");
				System.out.println("\n\n                   Her Vuru�unda              �ld�rd���nde");
				System.out.println("\n\n��l �skeleti            15TL                      15TL\n\n��l Komutan�            20TL                      25TL\n\n��l Lordu               25TL                      50TL");
				System.out.println("\n\nVolkan �skeleti         20TL                      25TL\n\nVolkan Komutan�         25TL                      35TL\n\nVolkan Lordu            35TL                      75TL");
				System.out.println("\n\nOrman �skeleti          25TL                      50TL\n\nOrman Komutan�          35TL                      75TL\n\nOrman Lordu             45TL                     100TL");
				System.out.println("\n\nDeniz �skeleti          30TL                     100TL\n\nDeniz Komutan�          45TL                     150TL\n\nDeniz Lordu              1TL               999999999TL");
				System.out.println("\n");
				break;
			}
			if(se�im8==6) {
				break;
			}
			
			
			break;
		case 5:
			while(i4<1) {
			System.out.println();
			System.out.println("Yapan:Ahmet �zer");
			System.out.println();
			System.out.println("Karakterin akl�n� geli�tirirsen daha az hasar al�r!\n\nKarakterin bile�ini geli�tirirsen g�c� artar!\n");
			System.out.println();
			System.out.println("                Copyright belongs to Ahmet �zer");
			System.out.println();
			System.out.println(" (Geri D�nmek ��in Bir Tu�a Bas�n�z)");
			String exit=input.nextLine();
			i4++;
			System.out.println();
			System.out.println();
			System.out.println();
			}
			break;
		case 6:
			System.out.println("                            �ARKIFELEK'E Ho�GELD�N�Z\n\n");
			System.out.println("1-UCUZ ZAR  (10TL ==>  25TL)    (%50 �ANS)\n\n2-ORTA ZAR  (25TL ==> 100TL)    (%25 �ANS)\n\n3-B�Y�K ZAR (50TL ==> 500TL)    (%15 �ANS)\n\n4-Geri D�n");
			se�im17=input.nextInt();
			
			if(se�im17==1) {
				if(para>=10) {
					para-=10;
			int uczar=rastgele.nextInt(2);
			if(uczar==1) {
				para+=25;
				System.out.println("             Bravo Kazand�n�z!\n\nParan�z: "+tempp +"==>"+ para);
			}else if(uczar==0) {
				System.out.println("             Malesef Kaybettiniz!");
			}
			}else {
				System.out.println("           Yeterli Paran�z Bulunmamaktad�r!");
			}
			}
			else if(se�im17==2) {
				if(para>=25) {
					para-=25;
			int uczar=rastgele.nextInt(4);
			if(uczar==1) {
				para+=100;
				System.out.println("             Bravo Kazand�n�z!\n\nParan�z: "+tempp +"==>"+ para);
			}else if(uczar!=1) {
				System.out.println("             Malesef Kaybettiniz!");
			}
			}else {
				System.out.println("           Yeterli Paran�z Bulunmamaktad�r!");
			}
			}
			else if(se�im17==3) {
				if(para>=50) {
					para-=50;
			int uczar=rastgele.nextInt(20);
			if(uczar==1 || uczar==3 || uczar==5) {
				para+=500;
				System.out.println("             Bravo Kazand�n�z!\n\nParan�z: "+tempp +"==>"+ para);
			}else if(uczar!=1 || uczar!=3 || uczar!=5) {
				System.out.println("             Malesef Kaybettiniz!");
			}
			}else {
				System.out.println("           Yeterli Paran�z Bulunmamaktad�r!");
			}
			}else if(se�im17==4) {
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
	 



package satısKomisyon;

public class SalerPeaple {
	
	    private String firstName;
	    private String lastName;
	    private double weeklySalary;
	    private double commissionRate;
	    private static int urunCount = 0;
	    private int urunfiyat=100;
	    

	    
	    public SalerPeaple(String firstName, String lastName, double weeklySalary,int urunfiyat) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.weeklySalary = weeklySalary;
	        this.commissionRate = 0.05; 
	        this.setUrunfiyat(urunfiyat) ;
	        
	    }

	    
	    public void sellProduct(int productCount) {
	        urunCount += productCount;
	        
	    }

	    
	    public void show() {
	        double totalCommission = urunCount * 100 * commissionRate; 
	        double totalSalary = weeklySalary + totalCommission;

	        System.out.println("Satış Elemanı: " + firstName + " " + lastName);
	        System.out.println("Haftalık Maaş: " + weeklySalary + " TL");
	        System.out.println("Komisyon: " + totalCommission + " TL");
	        System.out.println("Toplam Maaş: " + totalSalary + " TL");
	        System.out.println("Satılan Ürün Sayısı : " +urunCount);
	        
	    }


		public int getUrunfiyat() {
			return urunfiyat;
		}


		public void setUrunfiyat(int urunfiyat) {
			this.urunfiyat = urunfiyat;
		}
	}




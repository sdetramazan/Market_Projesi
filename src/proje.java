import java.util.Scanner;

public class proje {
    public static void main (String[] args){

        Scanner scanner =new Scanner(System.in);

        System.out.println("Gıda ürünleri:");
        System.out.println("Makarna \nNohut\n");
        System.out.println("Temizlik ürünleri:");
        System.out.println("Bulaşık Deterjanı\nÇamaşır Deterjanı\n");
        System.out.println("Kişisel Bakım ürünleri:");
        System.out.println("Parfüm\nKrem\nBakım seti\n");

        String[] products={"Makarna","Nohut","Bulaşık Deterjanı","Çamaşır Deterjanı","Parfüm","Krem","Bakım Seti"};
        double[] unitPrices={1.5,2,3,4,5,6,7};
        int[] stocks={7,6,5,4,3,2,1};
        String value="";
        double total=0;
        double total1=0;

        do {
            System.out.print("Lütfen bir ürün seçiniz:");
            String product = scanner.nextLine();

            for (int i = 0; i < products.length; i++) {


                if (product.equalsIgnoreCase(products[i])) {
                    boolean varMi=true;

                    double unitPrice = unitPrices[i];
                    int stock = stocks[i];
                    System.out.println(product + " Birim Fiyatı:" + unitPrice + "TL Stok Miktarı: " + stock+" adet");
                    System.out.print("Kaç tane olsun:");
                    int price = scanner.nextInt();

                    if(stocks[i]<price){
                        System.out.println("yeterli stok bulunmamaktadır.");
                        System.out.println("********************");
                        continue;
                    }
                    stocks[i]-=price;
                    total=(price*unitPrice);
                    total1+=(price*unitPrice);
                    System.out.println("Ürün Toplam Tutar: "+total+"TL\n");
                    System.out.println("Genel Toplam Tutar: "+total1+"TL");
                    System.out.println("**********************");

                }
            }


            System.out.print("Başka ürün ister misiniz:");
            scanner.nextLine();
            value = scanner.nextLine();
            if (value.equalsIgnoreCase("hayır")){
                System.out.println("Alış Veriş Toplam Tutarı: "+total1+"TL");
            }
        }while (value.equalsIgnoreCase("evet"));


    }
}

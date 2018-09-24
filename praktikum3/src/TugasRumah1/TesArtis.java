package TugasRumah1;

public class TesArtis {
    public static void main(String[] args){
        Artis Artis1 = new Artis("MC", "Pria", "Pesawat", 1, 1500);
        Artis Artis2 = new Artis("MC", "Wanita", "Travel", 1, 700);
        Artis Artis3 = new Artis("Penyanyi", "Wanita", "Pesawat", 1, 5000);
        Artis Artis4 = new Artis("Band", "Campuran", "Kereta api", 5, 10000);

        System.out.println("Artis1 Mengisi "+Artis1.getPengisiAcara()+" dengan kategori "+Artis1.getKategori()+" menggunakan transportasi "+Artis1.getTransportasi()+" berjumlah "+Artis1.getJumlah()+" orang dengan bayaran "+Artis1.getBayaran());
        System.out.println("Artis2 Mengisi "+Artis2.getPengisiAcara()+" dengan kategori "+Artis2.getKategori()+" menggunakan transportasi "+Artis2.getTransportasi()+" berjumlah "+Artis2.getJumlah()+" orang dengan bayaran "+Artis2.getBayaran());
        System.out.println("Artis3 Mengisi "+Artis3.getPengisiAcara()+" dengan kategori "+Artis3.getKategori()+" menggunakan transportasi "+Artis3.getTransportasi()+" berjumlah "+Artis3.getJumlah()+" orang dengan bayaran "+Artis3.getBayaran());
        System.out.println("Artis4 Mengisi "+Artis4.getPengisiAcara()+" dengan kategori "+Artis4.getKategori()+" menggunakan transportasi "+Artis4.getTransportasi()+" berjumlah "+Artis4.getJumlah()+" orang dengan bayaran "+Artis4.getBayaran());

        System.out.println("Artis 1");Artis1.infoArtis();
        System.out.println("Artis 2");Artis2.infoArtis();
        System.out.println("Artis 3");Artis3.infoArtis();
        System.out.println("Artis 4");Artis4.infoArtis();
    }
}

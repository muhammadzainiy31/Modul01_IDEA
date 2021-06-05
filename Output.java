import javax.swing.JOptionPane;

public class Output{
 public static void main(String[] args){

 String namaDepan = "Muhammad";
 String namaTengah ="Zaini";
 String namaLengkap ="MuhammadZaini";
 int usia = 22;
 int targetTahunKuliah = 4;
 double ipk = 3.89764512;
 char nilaiAbjab ='A';
 boolean tampan = true;

System.out.println("Nama depan: "+ namaDepan);
System.out.println("Nama tengah : "+ namaTengah);
System.out.println("Nama lengkap : "+ namaLengkap);
System.out.println("Usia : " + usia);
System.out.println("Target Kuliah : "+ targetTahunKuliah + "tahun");
System.out.println("IPK : " + ipk);
System.out.println("Nilai PBO : " + nilaiAbjab);
System.out.println("Tampan : " + tampan);

JOptionPane.showMessageDialog(null,"Hai," + namaDepan + namaTengah + namaLengkap);

 }
}
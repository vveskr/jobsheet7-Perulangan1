import java.util.Scanner;
public class DoWhileCuti17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Deklarasi
        int jatahCuti, jumlahHari;
        String konfirmasi;
        //Output
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();
        do{
        System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
        konfirmasi = sc.next();

        if(konfirmasi.equalsIgnoreCase("y")){
            System.out.print("Jumlah hari: ");
            jumlahHari = sc.nextInt();

            if(jumlahHari <= jatahCuti){
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: "+ jatahCuti);
            }else{
                System.out.println("Sisa jatah cuti anda tidak mencukupi");
                break;
            }
        }
    } while (jatahCuti>0);
}}

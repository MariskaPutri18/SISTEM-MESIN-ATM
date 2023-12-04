import java.util.Scanner;
import java.util.Random;

public class SistemMesinATM7 {

    public static class Account {  
        int saldoAwal; 
        int pin, nomorRekening;
        String masalahLaporan;

        public Account(int pin, int nomorRekening, int saldoAwal){
            this.pin = pin;
            this.nomorRekening = nomorRekening;
            this.saldoAwal = saldoAwal;
        }
        public void reportProblem(int tanggal, String masalah) {
            masalahLaporan = masalah;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Account[] accounts = {
            new Account(223344, 632453, 4000000),
            new Account(556677, 632672, 2300000),
            new Account(889911, 632649, 1000000)
        };

        System.out.print("Masukan PIN            : ");
        int pin = sc.nextInt();
        System.out.print("Masukan Nomor Rekening : ");
        int nomorRekening = sc.nextInt();
        Account currentAccount = null;

        for (Account account : accounts) {
            if (account.pin == pin && account.nomorRekening == nomorRekening) {
                currentAccount = account;
                break;
            }
        }

        if (currentAccount != null) {
            System.out.println("       SELAMAT DATANG");
            System.out.println("PILIH TRANSAKSI YANG DIINGINKAN");
            
            while (true) {
                System.out.println("___________________________________");
                System.out.println("          Menu      ");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Setor Tunai");
                System.out.println("4. Transfer");
                System.out.println("5. Laporan Permasalahan");
                System.out.println("6. Keluar");
                System.out.print("Pilih menu (1/2/3/4/5/6): ");

                int pilihan = sc.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Saldo Anda saat ini: " + currentAccount.saldoAwal);
                        break;
                    case 2:
                        boolean jalurTidakTersedia=true;
                        while (jalurTidakTersedia){
                            System.out.println("Jalur Tarik Tunai");
                            System.out.println("1.ATM ");
                            System.out.println("2.Alfamaret");
                            System.out.println("3.Indomaret");
                            System.out.print("Pilih Jalur Penarikan Tunai : ");
                            int jalurPenarikan = sc.nextInt();
                            switch (jalurPenarikan){
                                case 1:
                                System.out.println("Anda akan melakukan transaksi melalui mesin ATM");
                                jalurTidakTersedia = false;
                                break;
                                case 2:
                                System.out.println("Anda akan melakukan transaksi melalui Alfamaret");
                                jalurTidakTersedia = false;
                                break;
                                case 3:
                                System.out.println("Anda akan melakukan transaksi melalui Indomaret");
                                jalurTidakTersedia = false;
                                break;
                                default:
                                System.out.println("Pilih jalur penarikan yang tersedia!!");
                            }
                        }
                        boolean jumlahTdkTersedia = true;
                        while( jumlahTdkTersedia){
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+"\n      PILIHAN NOMINAL PENARIKAN");
                            System.out.println("1. Rp 10.000,00");
                            System.out.println("2. Rp 20.000,00");
                            System.out.println("3. Rp 50.000,00");
                            System.out.println("4. Rp 100.000,00");
                            System.out.println("5. Rp 200.000,00");
                            System.out.println("6. Rp 500.000,00");
                            System.out.println("7. Rp 1.000.000,00");
                            System.out.println("Pilih Nominal Penarikan(1/2/3/4/5/6/7) : ");
                            int jumlahTarikan = sc.nextInt();
                            int kodeTransaksi = random.nextInt(1000000);
                            int inputPin = sc.nextInt();
                            switch (jumlahTarikan){
                                case 1:
                                currentAccount.saldoAwal -= 10000;
                                jumlahTdkTersedia = false;
                                System.out.print("Masukkan PIN: ");
                                inputPin = sc.nextInt();
                                if (inputPin == currentAccount.pin) {
                                System.out.println("Kode : "+ kodeTransaksi);
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                break; 
                                }else {
                                    System.out.println("PIN Tidak Sesuai, Transaksi Dibatalkan");
                                }
                                break;
                                case 2:
                                currentAccount.saldoAwal -= 20000;
                                jumlahTdkTersedia = false;
                                System.out.print("Masukkan PIN: ");
                                inputPin = sc.nextInt();
                                if (inputPin == currentAccount.pin) {
                                System.out.println("Kode : "+ kodeTransaksi);
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                break; 
                                }else {
                                    System.out.println("PIN Tidak Sesuai, Transaksi Dibatalkan");
                                }
                                break;
                                case 3:
                                currentAccount.saldoAwal -= 50000;
                                jumlahTdkTersedia = false;
                                System.out.print("Masukkan PIN: ");
                                inputPin = sc.nextInt();
                                if (inputPin == currentAccount.pin) {
                                System.out.println("Kode : "+ kodeTransaksi);
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                break; 
                                }else {
                                    System.out.println("PIN Tidak Sesuai, Transaksi Dibatalkan");
                                }
                                break;
                                case 4:
                                currentAccount.saldoAwal -= 100000;
                                jumlahTdkTersedia = false;
                                System.out.print("Masukkan PIN: ");
                                inputPin = sc.nextInt();
                                if (inputPin == currentAccount.pin) {
                                System.out.println("Kode : "+ kodeTransaksi);
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                break; 
                                }else {
                                    System.out.println("PIN Tidak Sesuai, Transaksi Dibatalkan");
                                break;
                                }
                                case 5:
                                currentAccount.saldoAwal -= 200000;
                                jumlahTdkTersedia = false;
                                System.out.print("Masukkan PIN: ");
                                inputPin = sc.nextInt();
                                if (inputPin == currentAccount.pin) {
                                System.out.println("Kode : "+ kodeTransaksi);
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                break;
                                }else {
                                    System.out.println("PIN Tidak Sesuai, Transaksi Dibatalkan");
                                }
                                break;
                                case 6:
                                currentAccount.saldoAwal -= 500000;
                                jumlahTdkTersedia = false;
                                System.out.print("Masukkan PIN: ");
                                inputPin = sc.nextInt();
                                if (inputPin == currentAccount.pin) {
                                System.out.println("Kode : "+ kodeTransaksi);
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                break; 
                                }else {
                                    System.out.println("PIN Tidak Sesuai, Transaksi Dibatalkan");
                                break;
                                }
                                case 7:
                                currentAccount.saldoAwal -= 1000000;
                                jumlahTdkTersedia = false;
                                System.out.print("Masukkan PIN: ");
                                inputPin = sc.nextInt();
                                if (inputPin == currentAccount.pin) {
                                System.out.println("Kode : "+ kodeTransaksi);
                                System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                                break; 
                                }else {
                                    System.out.println("PIN Tidak Sesuai, Transaksi Dibatalkan");
                                break;
                                }
                                default:
                                System.out.println("Nominal Penarikan Tidak tersedia!!");
                            }
                        }
                    break;
                        
                    case 3:
                        int kodeTransaksi = random.nextInt(1000000);
                        System.out.print("Masukkan jumlah setoran: ");
                        int setoran = sc.nextInt();
                        currentAccount.saldoAwal += setoran;
                        System.out.println("Kode : "+ kodeTransaksi);
                        System.out.println("Setoran berhasil, Saldo Anda sekarang: " + currentAccount.saldoAwal);
                        break;
                    case 4:
                        System.out.print("Masukkan nomor rekening tujuan: ");
                        sc.nextDouble();
                        System.out.print("Nominal transfer: ");
                        double transfer = sc.nextDouble();
                        if (transfer <= currentAccount.saldoAwal){
                        currentAccount.saldoAwal -= transfer;
                        System.out.println("Transfer berhasil. Saldo Anda sekarang: " + currentAccount.saldoAwal);
                        } else {
                            System.out.println("Saldo Tidak mencukupi");
                        }
                        break;
                    case 5:
                        System.out.println("===== Pengaduan Masalah =====");
                        
                        System.out.print("Masukkan No Rekening :");
                        nomorRekening = sc.nextInt();
                        System.out.print("Masukkan Tanggal (dd/mm/yy): ");
                        String tanggalInput = sc.next();
                        sc.nextLine();
                        String[] parts = tanggalInput.split("/");
                        int tanggal = Integer.parseInt(parts[0]);
                        int bulan = Integer.parseInt(parts[1]);
                        int tahun = Integer.parseInt(parts[2]);
                        System.out.println("Permasalahan yang Anda alami :");
                        String masalah = sc.nextLine();
                        System.out.print("Masukkan PIN: ");
                        int inputPin = sc.nextInt();
                        sc.nextLine();
                        if (inputPin != currentAccount.pin) {
                         System.out.println("PIN tidak sesuai. Pengaduan masalah dibatalkan.");
                        }
                        Account selectedAccount = null;
                        for (Account account : accounts) {
                            if (account.nomorRekening == nomorRekening) {
                                selectedAccount = account;
                                break;
                            }
                        }
                        if (selectedAccount != null) {
                            selectedAccount.reportProblem(tanggal, masalah);
                            System.out.println("===== Data Akun Terkait =====");
                            System.out.println("Nomor Rekening: " + selectedAccount.nomorRekening);
                            System.out.println("Saldo Awal: " + selectedAccount.saldoAwal);
                            System.out.println("Tanggal Laporan: " + String.format("%02d/%02d/%02d", tanggal, bulan, tahun));
                            System.out.println("Masalah Dilaporkan: " + selectedAccount.masalahLaporan);
                            System.out.println("Terima kasih atas laporan masalah Anda. Masalah akan segera diproses dan ditangani.");
                        } else {
                            System.out.println("Account not found");
                        }
                        break;
                    case 6:
                        System.out.println("Terima kasih telah menggunakan ATM. Sampai jumpa!");
                        System.exit(0);
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                
                }
      
            }
        } else {
            System.out.print("PIN ATAU NOMOR REKENING SALAH " + "\nANDA KELUAR DARI SISTEM");
        }
        sc.close();
    }
}


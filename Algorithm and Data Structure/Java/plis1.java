import java.util.*;
import java.time.*;//import semua method dalam time

public class plis1 {
    static Scanner sc = new Scanner(System.in);
    static String namaAsal[][] = new String[50][5];// array untuk mengisi data user 1 hari di batasi 50 antrean
    static int setoran[] = new int[5];// array untuk mengisi jumlah setoran
    static double saldo[] = { 4000000, 3000000, 4260000, 32680000, 1746000, 5700000, 1340000, 657000, 6427800,
            1750000, 8490000, 6000000, 1230000, 230000, 4950000, 1739000, 900000, 837000, 4850000, 3020000 };
    // array yang disiapkanan ntinya akan mengisi saldousersecara random
    static double saldoUser[] = new double[saldo.length];
    // untuk menyimpan data saldo pada index yang berjalan agarbisa terus digunakan
    // aray bertipe data double sepanjang,panjang array saldo
    static LocalDate tgl = LocalDate.now(); // untuk tanggal sekarang
    static LocalTime waktu = LocalTime.now();
    static boolean dataVerifikasi[] = new boolean[10]; // agar jika keadaan true bisa diulang
    static int pil = 0, saldoAkhir = 0, pilihVerif = 0, jumlahSetoran = 0, jenis;
    static int l, m, kirim = 0, index = 0, betul;
    static double hasil = 0, hasil2 = 0, trans = 0, limit = 0;
    static String kodbank;
    static boolean lanjut = true;
    static Random rand = new Random(); // deklarasi object untuk mengakses library random
    static String namaTujuan[][] = { // digunakan untuk tujuan tf pada bank yang sama
            { "Mirabell Joice", "45220821145", "Malang" },
            { "Andi Wahyu", "781010203", "Bekasi" },
            { "Wanda Febri", "145556459", "Bandung" },
            { "Salwa Labibah", "8798789787", "Padang" },
            { "Muhammad Edwin", "564614654", "Solo" },
            { "Ali Zulfikar", "6714654065", "Bali" },
            { "Abdurahman", "987654654", "Jakarta" },
    };
    static String cekKode[][] = { // digunakan untuk masukkan kode dan menampilkan jenis bank
            { "BRI", "BNI", "BCA", "Mandiri", "Permata", "BTN", "Maybank" },
            { "002", "003", "004", "005", "006", "007", "008" },
    };
    static String tujuanBeda[][] = { // digunakan untuk tujuan tf pada bank yang beda
            { "Ananda Galih", "9871465324", "BCA" },
            { "Afifah Salsa", "987654654", "BNI" },
            { "Alvina Marcy", "874512878", "Mandiri" },
            { "Ryan Syaputra", "964545312", "BTN" },
            { "Ahmad Galih", " 789465874", "Maybank" }
    };
    static String history[][] = {
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
            { " ", " ", " ", " ", " ", " " },
    };
    static String historyWaktu[][] = {
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
            { " " },
    };

    public static void main(String[] args) {
        tabungan();// untuk memanggil fungsi tabungan yang berisi inputan data user
        pilihTabungan(); // memilih jenis tabungan
        while (true) {
            if (jenis == 1) {
                pilihanMenu();
                if (pil == 5) {
                    Verif();
                }
                if (dataVerifikasi[index] == true) {
                    if (pil == 1) {
                        garisbatas();
                        setoran();
                        garisbatas();
                        System.out.println("Teller\t : Ini untuk struk setorannya Kak ");
                        System.out.println("=============================== SETORAN ===============================");
                        cetakSetor();
                    } else if (pil == 2) {
                        System.out.printf("Saldo awal : %.0f \n", saldoUser[index]);// kenapa printf ? agar
                                                                                    // outputspesifik dengan digit
                                                                                    // yangdiinginkan
                        saldoUser[index] = penarikan(saldoUser[index]);
                        System.out.printf("Saldo akhir : %.0f \n", saldoUser[index]);
                        cetakTarik();
                    } else if (pil == 3) {
                        cariNamaBank();
                        System.out.println(
                                "=============================== DATA TRANSFER ===============================");
                        garisbatas();
                        System.out.printf("Saldo awal : %.0f \n", saldoUser[index]);
                        saldoUser[index] = transfer(saldoUser[index]);
                        System.out.printf("Saldo akhir : %.0f \n", saldoUser[index]);
                    } else if (pil == 4) {
                        System.out.println(
                                "=============================== BUKU TABUNGAN ===============================");
                        cetakBuku();
                        System.out.println(" Tanggal\t" + " Saldo Awal" + "  Pemasukkan" + "   Pengeluaran"
                                + "   Transfer" + "  Saldo Akhir ");
                        history[index][4] = " " + saldoUser[index];
                        historyWaktu[index][0] = " " + tgl.getDayOfMonth() + "-" + tgl.getMonthValue() + "-"
                                + tgl.getYear();
                        System.out.println(historyWaktu[index][0]);
                        System.out.println(historyWaktu[index][0] + " [ " + history[index][0] + " ] " + " [ "
                                + history[index][1] + " ] " + " [ " + history[index][2] + " ] " +
                                " [ " + history[index][3] + " ] " + " [ " + history[index][4] + " ]\t\t");
                    } else if (pil == 5) {
                        System.out.println("Teller\t: Anda sudah melakukan verifikasi");
                    } else if (pil == 6) {
                        System.out.println("=============================== SALDO ===============================");
                        System.out.println(
                                "TANGGAL\t:" + tgl.getDayOfMonth() + "-" + tgl.getMonthValue() + "-" + tgl.getYear());
                        System.out.println("WAKTU\t:" + waktu.getHour() + " : " + waktu.getMinute());
                        System.out.println("NAMA\t: " + namaAsal[index][0]);
                        System.out.printf("Saldo\t: %.0f \n", saldoUser[index]);
                        garisbatas();
                    } else if (pil == 7) {
                        break;
                    } else {
                        System.out.println("Mohon maaf kami tidak menyediakan layanan tersebut");
                        break;
                    }

                } else {
                    System.out.println("Teller\t: Verifikasi akun Anda terlebih dahulu ");
                }

            } else if (jenis == 2) {

                pilihanMenu();
                if (pil == 1) {
                    garisbatas();
                    setoran();
                    garisbatas();
                    System.out.println("Teller\t : Ini untuk struk setorannya Kak ");
                    System.out.println("=============================== SETORAN ===============================");
                    cetakSetor();
                } else if (pil == 2) {
                    System.out.printf("Saldo awal : %.0f\n", saldoUser[index]);
                    saldoUser[index] -= penarikanJunio(saldoUser[index]); // saldo awal dikurangi dengan hasil yang
                                                                          // direturn
                    System.out.printf("Saldo akhir : %.0f \n", saldoUser[index]);
                    cetakTarik();
                } else if (pil == 3) {
                    cariNamaBank();
                    System.out.printf("Saldo awal : %.0f\n", saldoUser[index]);
                    saldoUser[index] = transferJunio(saldoUser[index]);
                    System.out.printf("Saldo akhir : %.0f \n", saldoUser[index]);
                } else if (pil == 4) {
                    System.out.println(
                            "=============================== BUKU TABUNGAN JUNIO ===============================");
                    cetakBuku();
                    System.out.println(
                            " Tanggal\t" + " Saldo Awal " + "    Pemasukkan " + "    Pengeluaran " + "   Saldo Akhir ");
                    history[index][4] = " " + saldoUser[index];
                    historyWaktu[index][0] = " " + tgl.getDayOfMonth() + "-" + tgl.getMonthValue() + "-"
                            + tgl.getYear();
                    System.out.println(historyWaktu[index][0] + " [ " + history[index][0] + " ] " + " [ "
                            + history[index][1] + " ] " + " [ " + history[index][2] + " ] " +
                            " [ " + history[index][3] + " ] " + " [ " + history[index][4] + " ]\t\t");
                } else if (pil == 5) {
                    System.out.println("Apakah anda ingin verifikasi?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    System.out.print("Masukkan pilihan anda: ");
                    pilihVerif = sc.nextInt();
                    sc.nextLine();
                } else if (pil == 6) {
                    System.out.println("=============================== SALDO ===============================");
                    System.out.println(
                            "TANGGAL\t:" + tgl.getDayOfMonth() + "-" + tgl.getMonthValue() + "-" + tgl.getYear());
                    System.out.println("WAKTU\t:" + waktu.getHour() + " : " + waktu.getMinute());
                    System.out.println("NAMA\t: " + namaAsal[index][0]);
                    System.out.printf("Saldo\t: %.0f \n", saldoUser[index]);
                    garisbatas();
                } else if (pil == 7) {
                    break;
                } else {
                    System.out.println("Teller\t: Mohon maaf kami tidak menyediakan layanan tersebut");
                    break;
                }
            } else {
                System.out.println("Teller\t : Mohon maaf kami tidak menyediakan layanan tersebut. Terimakasih :)");
                break;
            }

            System.out.println();
            System.out.println("Ada yang bisa saya bantu kembali ? ");
            System.out.println("0 untuk melanjutkan transaksi");
            System.out.println("1 untuk lanjut ke antrian selanjutnya");
            int confirm = sc.nextInt();
            sc.nextLine();
            if (confirm == 0) {
                continue;
            } else if (confirm == 1) {
                tabungan();
                pilihTabungan();
            } else {
                System.out.println("Teller\t: Mohon maaf, terdapat kesalahan");
            }
        }
    }

    static void garisbatas() {
        System.out.println("=============================================================================");
    }

    static void pilihTabungan() {
        garisbatas();
        System.out.println("Teller\t: Pilih jenis tabungan terlebih dahulu ");
        System.out.println("1. Tabungan Simpedes \n2. Tabungan Junio");
        System.out.print("User\t: ");
        jenis = sc.nextInt();
        garisbatas();
    }

    static void tabungan() {
        for (int i = 0; i < namaAsal.length; i++) {
            if (namaAsal[i][0] == null) { // jadi ketika suatu array belum terisi dia akan 0, ketika 0 kita akan
                                          // menjalankan progra mdi bawah
                index = i;
                System.out.println(
                        "=============================== ANTREAN KE-" + (i + 1) + " ===============================");// kenapa
                                                                                                                      // i
                                                                                                                      // +
                                                                                                                      // 1
                                                                                                                      // karena
                                                                                                                      // i=0
                System.out.println();
                System.out.print("Nama\t\t\t: ");
                namaAsal[i][0] = sc.nextLine();
                System.out.print("Nomor Rekening\t\t: ");
                namaAsal[i][1] = sc.nextLine();
                saldoUser[index] = saldo[rand.nextInt(saldo.length - 1)];// untuk memilih random hingga indeks terbesar
                System.out.print("Alamat\t\t\t: ");
                namaAsal[i][3] = sc.nextLine();
                System.out.print("Nomor telepon\t\t: ");
                namaAsal[i][4] = sc.nextLine();
                System.out.println("Tanggal transaksi\t: " + tgl.getDayOfMonth() + "-" + tgl.getMonthValue() + "-"
                        + tgl.getYear());
                System.out.println();
                System.out.println("===== DIMOHON VERIFIKASI AKUN SETIAP AKAN MELAKUKAN TRANSAKSI =====");
                garisbatas();
                break;
            }
        }
    }

    static void pilihanMenu() {
        garisbatas();
        System.out.println("Teller : Halo! Selamat Datang di Bank Rakyat");
        System.out.println("\t Dengan Mirabell disini, Ada yang bisa saya bantu ? ");
        garisbatas();

        garisbatas();
        System.out.println("Pilihan\t:");
        System.out.println("1. Setoran");
        System.out.println("2. Penarikan Uang");
        System.out.println("3. Transfer");
        System.out.println("4. Cetak Buku Transaksi");
        System.out.println("5. Verifikasi Data");
        System.out.println("6. Cek Saldo");
        System.out.println("7. Keluar");
        garisbatas();
        System.out.print("User \t:");
        pil = sc.nextInt();
        sc.nextLine();
        garisbatas();
    }

    static void setoran() {
        System.out.println("Teller : Jumlah yang akan Anda setorkan ? ");
        System.out.print("User\t: ");
        namaAsal[index][2] = sc.next();// mengakses index yang sama sesuai data yang dinputkan
        setoran[index] = Integer.parseInt(namaAsal[index][2]);// mengonversi String to int
        history[index][1] = namaAsal[index][2];
        System.out.println("Teller : Baik, Rp" + namaAsal[index][2]); // memastikan jumlah setoran
    }

    static void cetakSetor() {
        System.out.println("TANGGAL\t:" + tgl.getDayOfMonth() + "-" + tgl.getMonthValue() + "-" + tgl.getYear());
        System.out.println("WAKTU\t:" + waktu.getHour() + " : " + waktu.getMinute());
        System.out.println("NAMA\t: " + namaAsal[index][0]);
        System.out.println("ALAMAT\t: " + namaAsal[index][3]);
        System.out.println();
        System.out.printf("Saldo Awal %.0f \n", saldoUser[index]);
        history[index][0] = " " + saldoUser[index];
        saldoUser[index] += setoran[index]; // menambahkan saldo awal dengan setoran dan akan disimpan dalam saldoUser
        System.out.printf("Saldo akhir Anda Rp %.0f \n", saldoUser[index]);
        System.out.println("========================= TRANSAKSI BERHASIL =========================");
    }

    static double penarikan(double saldo1) {
        System.out.println("Teller\t : Berapa jumlah Uang yang ingin Anda tarik ? ");
        System.out.print("User\t :");
        int tarik = sc.nextInt();
        history[index][2] = " " + tarik;
        sc.nextLine(); // agar nextLine tidak terskip
        if ((saldo1 - 200000) > tarik) { // ketika x = saldo yang tersimpan > tarik maka bisa dilakukan perhitungan sbg
                                         // berikut
            hasil = (saldo1 - 200000) - tarik;
        } else {
            System.out.println("Saldo Anda tidak mencukupi");
            hasil = saldo1;
        }
        return hasil;
    }

    static void cetakTarik() {
        System.out.println("Teller\t : Ini untuk struk penarikannya Kak ");
        System.out.println("=============================== PENARIKAN ===============================");
        garisbatas();
        System.out.println("TANGGAL\t: " + tgl.getDayOfMonth() + "-" + tgl.getMonthValue() + "-" + tgl.getYear());
        System.out.println("WAKTU\t: " + waktu.getHour() + " : " + waktu.getMinute());
        System.out.println("NAMA\t: " + namaAsal[index][0]);
        System.out.println("ALAMAT\t: " + namaAsal[index][3]);
        System.out.println();
        System.out.printf("Saldo akhir  : %.0f \n", saldoUser[index]);
        System.out.println("========================= TRANSAKSI BERHASIL =========================");
    }

    static void cariNamaBank() {
        do {
            System.out.println("Teller\t : Sebutkan kode bank yang ingin Anda tuju ");
            System.out.print("User\t:");
            kodbank = sc.nextLine();
            for (int i = 0; i < cekKode[0].length; i++) {
                if (cekKode[1][i].equals(kodbank)) { // cek dengan data array cekKoe\
                    betul = 1;
                    l = i;
                    System.out.println(cekKode[0][l]);
                    break;
                } else {
                    betul = 0;
                }
            }
            if (betul == 0) { // jika salah, dia akan loop
                System.out.println("Maaf kami tidak menyediakan layanan tersebut");
            }
        } while (betul == 0);
    }

    static void tf() {
        do {
            System.out.println("Teller\t : Tuliskan nomor rekening tujuan ");
            System.out.print("User\t : Nomer rekening tujuan " + cekKode[1][l] + " : ");
            String norek = sc.nextLine();
            for (int i = 0; i < namaTujuan.length; i++) {
                if (namaTujuan[i][1].equalsIgnoreCase(norek)) {
                    betul = 1;
                    l = i;// untuk memanggil data yang ingin kamu termukan
                    break;
                } else { // karena ketika tanpa else dengan user yang sama ketika tf 2x kode salah
                         // akanterdeteksi benar
                    betul = 0;
                }
            }
            if (betul == 0) {
                System.out.println("Data salah");
            }
        } while (betul == 0);
    }

    static void dataTujuan() {
        System.out.println("Data sudah benar ");
        System.out.println(namaTujuan[l][1]);
        System.out.println(namaTujuan[l][0]);
        System.out.println(namaTujuan[l][2]);
    }

    static void transferBeda() {
        do {
            System.out.println("Teller\t : Tuliskan nomor rekening tujuan ");
            System.out.print("User\t : Nomer rekening tujuan " + cekKode[1][l]);
            String norek2 = sc.nextLine();
            for (int i = 0; i < tujuanBeda.length; i++) {
                if (tujuanBeda[i][1].equalsIgnoreCase(norek2)) {
                    betul = 1;
                    m = i;// untuk memanggil data yang ingin kamu termukan
                    break;
                } else {
                    betul = 0;
                }
            }
            if (betul == 0) {
                System.out.println("Data salah");
            }
        } while (betul == 0);
    }

    static void dataTujuanbeda() {
        System.out.println("Data sudah benar ");
        System.out.println(tujuanBeda[m][1]);
        System.out.println(tujuanBeda[m][0]);
        System.out.println(tujuanBeda[m][2]);
    }

    static double transfer(double y) {
        if (kodbank.equals("002")) {
            tf();
            dataTujuan();
            System.out.println("Teller\t : Berapa jumlah uang yang ingin Anda transfer ? ");
            System.out.print("User\t : ");
            kirim = sc.nextInt();
            sc.nextLine(); // agar nextLine tidak terskip
            history[index][4] = " " + kirim;
            if (y > kirim && kirim < y) {// saldo harus lebih dari kirim dan kirim harus kurang dari saldo
                trans = y - kirim;
            } else {
                System.out.println("Saldo Anda tidak mencukupi");
                trans = y;
            }
        } else {
            transferBeda();
            dataTujuanbeda();
            System.out.println("Teller\t : Berapa jumlah uang yang ingin Anda transfer ? ");
            System.out.print("User\t : ");
            kirim = sc.nextInt();
            sc.nextLine(); // agar nextLine tidak terskip
            if (y > kirim && kirim < y) {// saldo harus lebih dari kirim dan kirim harus kurang dari saldo
                System.out.println("Teller  : Pada transfer beda bank dikenakan biaya admin sebesar Rp2500");
                trans = y - kirim - 2500;
            } else {
                System.out.println("Saldo Anda tidak mencukupi");
                trans = y;
            }
        }
        return trans;
    }

    static void cetakBuku() {
        System.out.println("Nama              : " + namaAsal[index][0]);
        System.out.println("Nomor Rekening    : " + namaAsal[index][1]);
        System.out.println("Alamat            : " + namaAsal[index][3]);
        System.out.println("Nomor telepon     : " + namaAsal[index][4]);
        System.out.println();

    }

    static int cekSaldo() {
        jumlahSetoran = setoran[index];
        saldoAkhir = (int) saldoUser[index] + setoran[index];
        return saldoAkhir;
    }

    static double penarikanJunio(double saldo2) {
        System.out.println("Teller\t : Berapa jumlah Uang yang ingin Anda tarik ? ");
        System.out.print("User\t :");
        int tarik = sc.nextInt();
        sc.nextLine(); // agar nextLine tidak terskip
        history[index][2] = " " + tarik;
        if (tarik < 500000) { // jika tarik < 500000 program akan berjalan
            if ((saldo2 - 50000) > tarik) { // ketika x = saldo yang tersimpan > tarik maka bisa dilakukan perhitungan
                                            // sbgberikut, saldo2 dikurangi dengan 50k sebagai saldo yang harus tersisa.
                                            // jika saldo sisa lebih dari tarik program akan berjalan.
                hasil2 = tarik; // hasil yang nantinya akan di return
            } else {
                System.out.println("Saldo Anda tidak mencukupi");
            }
        } else {
            System.out.println("Teller\t: Limit penarikan untuk tabungan junio sebesar Rp500000");
        }
        return hasil2;// hasil di return
    }

    static double transferJunio(double saldojun) {
        if (kodbank.equals("002")) {
            tf();
            dataTujuan();
            System.out.println("Teller\t : Berapa jumlah uang yang ingin Anda transfer ? ");
            System.out.print("User\t : ");
            kirim = sc.nextInt();
            sc.nextLine(); // agar nextLine tidak terskip
            history[index][4] = " " + kirim;
            System.out.println(kirim <= limit);
            if (saldojun > kirim && kirim <= limit) {// saldo harus lebih dari kirim dan kirim harus kurang dari saldo
                trans = saldojun - kirim;
            } else {
                System.out.println("Teller\t: Jumlah transfer tidak sesuai prosedur");
                System.out.println("Teller\t: Saldo harus lebih dari jumlah kirim, dan limit jumlah kirim Rp1000000 ");
                trans = saldojun;
            }
        }
        return trans;
    }

    static void VerifikasiJunio() {
        if (pilihVerif == 1) {
            dataVerifikasi[index] = true;
        }
        if (dataVerifikasi[index] == true) {
            limit = 10000000;
        } else {
            limit = 2500000;
        }
    }

    static void Verif() {
        System.out.println("Apakah anda ingin verifikasi?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan pilihan anda: ");
        pilihVerif = sc.nextInt();
        sc.nextLine();
        if (pilihVerif == 1) {
            dataVerifikasi[index] = true;
            System.out.println("============================= DATA TERVERIFIKASI =============================");
        } else if (pilihVerif >= 2) {
            dataVerifikasi[index] = false;
            System.out.println("========================== DATA BELUM TERVERIFIKASI ==========================");
        } else {
            System.out.println("Teller\t: Terdapat kesalahan");
        }
    }

}
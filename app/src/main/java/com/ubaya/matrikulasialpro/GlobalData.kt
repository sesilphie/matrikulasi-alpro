package com.ubaya.matrikulasialpro

object GlobalData {
    val questionModel = arrayOf (
        QuestionModel("Kurs Mata Uang",
            R.drawable.intro_kursmatauang,
            "Terdapat kurs mata uang di planet bebek sebagai berikut: " +
                    "\n 1 dollar A = 2 dollar B" +
                    "\n 1 dollar B = 1.5 dollar C" +
                    "\n Donal ingin menukarkan 1000 dollar A ke dollar C. Berapakah uang Dollar C yang akan diperoleh oleh Donal?",
            "1000 dollar", "2000 dollar", "3000 dollar", "4000 dollar",
            "3000 dollar"),
        QuestionModel("Kandang Bebek",
            R.drawable.intro_kandangbebek,
            "Enam ekor bebek masuk ke dalam 3 buah kandang yang semula kosong. Berapa jumlah maksimal " +
                    "yang mungkin dalam satu kandang apabila dipastikan jika setiap kandang pasti ada bebek di dalamnya?",
            "3 bebek", "4 bebek", "5 bebek", "6 bebek",
            "4 bebek"),
        QuestionModel("Mainan Baru part 1",
            0,
            "Joko baru saja membeli mainan bola baru. Mainan itu terdiri dari 9 potongan angka-angka yang berwarna-warni. " +
                    "Dari hasil pengamatan dinyatakan informasi berikut: \n " +
                    "-  Sebuah angka berwarna jingga dan ada masing-masing dua angka yang berwarna merah, hijau, kuning, dan biru.\n" +
                    "-  Angka-angka yang berwarna merah, adalah angka yang berurutan.\n" +
                    "-  Angka bernomor 4 berwarna hijau.\n" +
                    "-  Dua buah angka yang berwarna biru bukanlah angka yang berurutan.\n" +
                    "-  Angka 1 dan 9 berwarna kuning.\n" +
                    "-  Angka berwarna jingga bukanlah angka yang berurutan langsung dengan salah satu angka yang berwarna hijau. \n \n" +
                    "Jika salah satu angka yang berwarna merah adalah angka 3, maka angka manakah yang juga berwarna merah?",
            "2", "5", "6", "7",
            "2"),
        QuestionModel("Tugas Prakarya",
        R.drawable.beginner_tugasprakarya,
        "Budi dan temannya sedang mendapatkan tugas prakarya. Mereka harus membuat 100 kertas pesawat. " +
                "Budi kebagian untuk membuat semua angka kelipatan lima (5) yang dibutuhkan. " +
                "Berapa banyak kelipatan angka lima yang harus Budi buat?",
        "20", "11", "12", "10",
        "20"),
        QuestionModel("Eksperimen Tikus",
            R.drawable.beginner_eksperimentikus,
            "Tom si kucing berhasil menangkap 100 ekor tikus yang selalu mencuri makanannya. Karena dia kesal, " +
                    "dia melakukan eksperimen dengan meletakkan tikus-tikus tersebut ke dalam satu kotak, tanpa diberikan makanan. " +
                    "Karena tikus-tikus tersebut sangat lapar, mereka mulai memakan sesamanya. Seekor tikus akan memakan sesamanya " +
                    "setiap minggu untuk bertahan hidup. Bila seekor tikus tidak dapat memakan seekor tikus lainnya, maka tikus tersebut akan mati. " +
                    "Berapakah jumlah tikus yang tersisa di dalam kotak setelah 3 minggu berlalu?",
            "50 tikus", "25 tikus", "12 tikus", "6 tikus",
            "12 tikus"),
        QuestionModel("Bakteri",
            R.drawable.beginner_bakteri,
            "Sebuah bakteri dalam toples berkembang menjadi 2 kali lipat setiap menitnya. " +
                    "Jika dalam toples terdapat 1 bakteri dan dalam 1 jam toples tersebut penuh. Maka kapan toples tersebut 1/2 penuh?",
            "30 menit", "45 menit", "59 menit", "6o menit",
            "59 menit"),
        QuestionModel("Kantong Kelereng",
            R.drawable.beginner_kantongkelereng,
            "Terdapat sebuah kantong berisi 2 buah kelereng merah, 5 buah kelereng biru, dan 8 buah kelereng kuning. " +
                    "Berapa maksimal banyaknya kelereng yang perlu diambil agar kita pasti mendapatkan setidaknya 5 kelereng berwarna sama?",
            "10 kelereng", "11 kelereng", "12 kelereng", "13 kelereng",
            "11 kelereng"),
        QuestionModel("Belanja Tepung",
            R.drawable.standart_belanjatepung,
            "Ibu Martha sedang belanja di pasar. Ia hendak berbelanja tepung untuk membuat kue. " +
                    "Ia hanya membawa uang Rp 10.000,00. Sementara itu ia melihat 5 merk tepung, dengan spesifikasi seperti gambar di atas \n" +
                    "Toko yang Ibu Martha datangi hanya memiliki tepat satu unit tepung untuk setiap merknya. " +
                    "Berapa kue yang dapat Ibu Martha hasilkan dengan batasan uang yang ia miliki?",
            "25 kue", "20 kue", "18 kue", "17 kue",
            "20 kue"),
        QuestionModel("Alat Musik part 1",
            R.drawable.standart_alatmusik,
            "Sebuah alat musik baru sedang dibuat. Musik hanya akan membunyikan 5 nada saja: do, re, mi, fa, dan sol. " +
                    "Terdapat dua tombol untuk membunyikan nada-nadanya: tombol merah, dan tombol putih. Nada yang akan dibunyikan " +
                    "saat penekanan suatu tombol tergantung pada nada sebelumnya dan tombol apa yang ditekan. " +
                    "Pada saat dihidupkan alat musik dalam keadaan ‘reset’. seperti tabel di atas (Sementara, pada saat dihidupkan maka " +
                    "mesin akan langsung membunyikan nada do). \n \n" +
                    "Jika ditekan 5 kali tombol merah setelah dihidupkan maka nada apakah yang terakhir terdengar?",
            "do", "re", "mi", "fa",
            "fa"),
        QuestionModel("Alat Musik part 2",
            R.drawable.standart_alatmusik,
            "Sebuah alat musik baru sedang dibuat. Musik hanya akan membunyikan 5 nada saja: do, re, mi, fa, dan sol. " +
                    "Terdapat dua tombol untuk membunyikan nada-nadanya: tombol merah, dan tombol putih. Nada yang akan dibunyikan " +
                    "saat penekanan suatu tombol tergantung pada nada sebelumnya dan tombol apa yang ditekan. " +
                    "Pada saat dihidupkan alat musik dalam keadaan ‘reset’. seperti tabel di atas (Sementara, pada saat dihidupkan maka " +
                    "mesin akan langsung membunyikan nada do). \n \n" +
                    "Jika sejak dihidupkan diikuti beberapa kali penekanan tombol dan terdengar nada-nada “do-re-mi-fa-sol-do-mi-mi” " +
                    "maka berapa kali tombol merah ditekan dalam rangkaian penekanan itu?",
            "3", "2", "1", "0",
            "3"),
        QuestionModel("Turnamen Catur part 1",
            0,
            "Ada 3 orang pecatur senior L, M, N dan 3 orang pecatur pemula O, P, Q bertanding dalam sebuah turnamen. " +
                    "Semua pecatur akan bertanding satu sama lain masing-masing satu kali pertemuan. \n " +
                    "-  Di awal turnamen poin seluruh peserta adalah 0. \n" +
                    "-  1 poin diberikan jika berhasil mengalahkan pecatur pemula.  \n" +
                    "-  2 poin diberikan jika berhasil mengalahkan pecatur senior.  \n" +
                    "-  Jika pecatur senior kalah dalam satu game, poinnya akan dikurangi 2.  \n" +
                    "-  Jika pecatur pemula kalah dalam satu game, poinnya akan dikurangi 1.  \n" +
                    "-  Jika sebuah pertandingan berakhir dengan seri, maka pertandingan tersebut akan diulang. \n \n" +
                    "Berapakah poin maksimum yang dapat diraih oleh seorang pecatur senior, " +
                    "jika dia menderita 2 kekalahan dalam turnamen tersebut ? ",
            "3", "2", "1", "0",
            "1"),
        QuestionModel("Turnamen Catur part 2",
            0,
            "Ada 3 orang pecatur senior L, M, N dan 3 orang pecatur pemula O, P, Q bertanding dalam sebuah turnamen. " +
                    "Semua pecatur akan bertanding satu sama lain masing-masing satu kali pertemuan. \n " +
                    "-  Di awal turnamen poin seluruh peserta adalah 0. \n" +
                    "-  1 poin diberikan jika berhasil mengalahkan pecatur pemula.  \n" +
                    "-  2 poin diberikan jika berhasil mengalahkan pecatur senior.  \n" +
                    "-  Jika pecatur senior kalah dalam satu game, poinnya akan dikurangi 2.  \n" +
                    "-  Jika pecatur pemula kalah dalam satu game, poinnya akan dikurangi 1.  \n" +
                    "-  Jika sebuah pertandingan berakhir dengan seri, maka pertandingan tersebut akan diulang. \n \n" +
                    "Berapakah poin yang harus dimenangkan oleh seorang pecatur pemula, untuk menempatkan posisinya dalam " +
                    "klasemen diatas seorang pecatur senior yang pernah kalah sekali dari pecatur senior lainnya? ",
            "2", "3", "4", "5",
            "5"),
        QuestionModel("Turnamen Catur part 3",
            0,
            "Ada 3 orang pecatur senior L, M, N dan 3 orang pecatur pemula O, P, Q bertanding dalam sebuah turnamen. " +
                    "Semua pecatur akan bertanding satu sama lain masing-masing satu kali pertemuan. \n " +
                    "-  Di awal turnamen poin seluruh peserta adalah 0. \n" +
                    "-  1 poin diberikan jika berhasil mengalahkan pecatur pemula.  \n" +
                    "-  2 poin diberikan jika berhasil mengalahkan pecatur senior.  \n" +
                    "-  Jika pecatur senior kalah dalam satu game, poinnya akan dikurangi 2.  \n" +
                    "-  Jika pecatur pemula kalah dalam satu game, poinnya akan dikurangi 1.  \n" +
                    "-  Jika sebuah pertandingan berakhir dengan seri, maka pertandingan tersebut akan diulang. \n \n" +
                    "Jika P memenangkan seluruh permainan kecuali satu game melawan L dan tidak kalah dari pemenang dalam turnamen, " +
                    "Siapakah yang mungkin akan menjadi juara dalam turnamen tersebut ?",
            "O atau Q", "L atau P", "M atau N", "Salah satu di antara M, N, O, atau Q",
            "O atau Q")
            )
    val questionPesanLampuandLabirin = arrayOf(
        QuestionPesanLampuAndLabirin("Pesan Lampu part 1",
            "Mawar mengirimkan pesan kepada temannya menggunakan 7 lampu, setiap lampu bisa nyala dan padam. Mawar menggunakan 5 lampu pertama untuk " +
                    "menunjukkan huruf yang dikirimkan. Untuk menunjukkan bahwa pesan itu benar, Mawar memakai 2 lampu sisanya sebagai berikut: \n " +
                    "-  Lampu ke 6 nyala jika jumlah lampu nyala di antara lima lampu pertama adalah genap; jika tidak maka lampu ke 6 padam. \n" +
                    "-  Lampu ke 7 padam jika jumlah lampu padam di antara enam lampu pertama adalah genap; jika tidak maka lampu ke 7 nyala.\n \n" +
                    "Ingatlah, 0 adalah bilangan genap. Sebagai contoh, jika Mawar sudah menentukan lima lampu pertama seperti berikut: ",
            R.drawable.standart_pesanlampu,
            "Maka lampu ke 6 harus padam (karena ada 3 lampu nyala di antara 5 lampu pertama), dan lampu ke 7 harus nyala (karena terdapat " +
                    "3 lampu padam di antara 6 lampu pertama). Jadi, dia harus memakai pola seperti gambar di atas.",
            R.drawable.standart_pesanlampupart1,
            "Jika, mawar menentukan 5 lampu pertama seperti gambar di atas ini, maka bagaimana keadaan lampu ke-6 dan ke-7?",
            R.drawable.standart_pesanlampupart1_pilih_a,
            R.drawable.standart_pesanlampupart1_pilih_b,
            R.drawable.standart_pesanlampupart1_pilih_c,
            "", "", "","",
            R.drawable.standart_pesanlampupart1_pilih_c,
            ""
        ),
        QuestionPesanLampuAndLabirin("Pesan Lampu part 2",
            "Mawar mengirimkan pesan kepada temannya menggunakan 7 lampu, setiap lampu bisa nyala dan padam. Mawar menggunakan 5 lampu pertama untuk " +
                    "menunjukkan huruf yang dikirimkan. Untuk menunjukkan bahwa pesan itu benar, Mawar memakai 2 lampu sisanya sebagai berikut: \n " +
                    "-  Lampu ke 6 nyala jika jumlah lampu nyala di antara lima lampu pertama adalah genap; jika tidak maka lampu ke 6 padam. \n" +
                    "-  Lampu ke 7 padam jika jumlah lampu padam di antara enam lampu pertama adalah genap; jika tidak maka lampu ke 7 nyala.\n \n" +
                    "Ingatlah, 0 adalah bilangan genap. Sebagai contoh, jika Mawar sudah menentukan lima lampu pertama seperti berikut: ",
            R.drawable.standart_pesanlampu,
            "Maka lampu ke 6 harus padam (karena ada 3 lampu nyala di antara 5 lampu pertama), dan lampu ke 7 harus nyala (karena terdapat " +
                    "3 lampu padam di antara 6 lampu pertama). Jadi, dia harus memakai pola seperti gambar di atas.",
            0,
            "Manakah pola berikut ini yang merupakan pesan yang benar?",
            R.drawable.standart_pesanlampupart2_pilih_a,
            R.drawable.standart_pesanlampupart2_pilih_c,
            R.drawable.standart_pesanlampupart2_pilih_b,
            "", "", "", "",
            R.drawable.standart_pesanlampupart2_pilih_c,
            ""
        ),
        QuestionPesanLampuAndLabirin("Labirin",
            "Budi terjebak di sebuah labirin. Budi harus menemukan jalan untuk keluar dari sebuah labirin dan meminta kamu untuk memberikan arahan. " +
                    "Budi memasuki labirin dari bawah dan harus mencapai pintu keluar pada bagian atas (Finish).",
            R.drawable.expert_labirin_map,
            "Budi hanya bisa bergerak dengan empat gerakan berikut ini:",
            R.drawable.expert_labirin_kodegerak,
            "Budi bisa membuat gerakan panjang yang dibentuk dari empat gerakan A, B, C, atau D. Satu gerakan bisa diulang beberapa kali. \n" +
                    "\n \n" +
                    "Urutan gerakan manakah yang dapat membantu Budi mencapai pintu keluar?",
            0, 0, 0,
            "C, D, D, A, C", "C, D, C, A, C", "D, C, D, C, A", "A, D, C, A, C",
            0,
            "C, D, D, A, C")
    )

    val questionKatakAndRobot = arrayOf(
        QuestionKatakAndRobot("Katak",
            "Seekor katak suka melompat-lompat. Terdapat 8 petak yang diberi nomor dari 1 s.d. 8. Setiap petak berisi 1 kotak " +
                    "yang ditandai dengan salah satu dari tiga aturan melompat.\n" +
                    "Contoh:\n" +
                    "Gerakan ke kanan: Misalnya sebuah kotak ditandai dengan “2R” berarti ia harus melompat ke kanan sebanyak 2 petak, " +
                    "lalu menandai petak akhir lompatannya:",
            R.drawable.expert_katak1,
            "Gerakan ke kiri: M`isalnya sebuah kotak ditandai “2L” berarti ia harus melompat ke kiri sebanyak 2 petak " +
                    "lalu menandai petak akhir lompatannya:",
            R.drawable.expert_katak2,
            "Diam. Jika isi petak adalah 0, maka ia harus tetap pada tempatnya alias berhenti melompat.\n" +
                    "\n" +
                    "Diberikan 8 petak dengan kotak-kotak sebagai berikut:",
            R.drawable.expert_katak_pertanyaan,
            "Dimulai dari kotak manakah (petak awal ini ditandai) agar kemudian setiap petak dapat ditandai " +
                    "tepat satu kali dan berhenti di petak dengan kotak berisi 0?",
            "5", "4", "3", "Tidak mungkin semua petak",
            "3"),
        QuestionKatakAndRobot("Robby Si Robot",
            "",
            R.drawable.expert_robbysirobot_map,
            "Robby adalah robot pengantar paket. Suatu hari, Robby mendapatkan tugas mengantarkan sebuah paket. " +
                    "Robby mulai dari pojok kiri bawah (A1) dan berakhir di pojok kanan atas (penerima paket (E5)) \n" +
                    "Robby hanya mengerti perintah sebagai berikut:",
            R.drawable.expert_robbysirobot_kodegerak,
            "Rute manakah yang dapat ditempuh oleh Robby untuk sampai ke penerima paket (E5)?",
            0,
            "",
            "A1 B1 C1 C2 D2 D3 E3 E4 E5", "A1 B1 C1 C2 C3 D3 E3 E4 E5", "A1 B1 C1 C2 D2 D3 D4 D5 E5", "A1 B1 C1 C2 C3 C4 C5 D5 E5",
            "A1 B1 C1 C2 D2 D3 E3 E4 E5")
    )
    val questionMobilPengangkut = MobilPengangkut(
        "Mobil Pengangkut Barang",
        "Ada sebuah mobil pengangkut barang yang hanya mengangkut 4 warna balok.",
        R.drawable.expert_mobilpengangkut,
        "Mobil pengangkut barang mengikuti instruksi sebagai berikut:\n" +
                "-  Mulai dengan mobil pengangkut barang dalam keadaan kosong\n" +
                "-  Ambil 2 balok dengan warna yang sama\n" +
                "-  Ambil 1 balok dengan warna yang berbeda\n" +
                "-  Jika jumlah balok warna yang diangkut sebanyak 6 balok, berhenti. Jika belum, kembali ke langkah 2.\n \n" +
                "Manakah tumpukan balok yang mengikuti instruksi dengan benar?",
        R.drawable.expert_mobilpengangkut_pilihan_a,
        R.drawable.expert_mobilpengangkut_pilihan_b,
        R.drawable.expert_mobilpengangkut_pilihan_c,
        R.drawable.expert_mobilpengangkut_pilihan_d,
        R.drawable.expert_mobilpengangkut_pilihan_a
    )
    val questionUlanganAndPromosi = arrayOf(
        UlanganAndPromosi(
        "Hasil Ulangan Harian",
        "Ana, Ani, Ina, Nia, Ian adalah teman sekelas. Mereka baru saja menerima hasil ulangan harian. Diketahui pernyataan sebagai berikut:\n" +
                "Nilai Ana lebih rendah dari Nia\n" +
                "Nilai Ana lebih tinggi dari Ina\n" +
                "Nilai Ani lebih tinggi dari Ian\n" +
                "Nilai Ina lebih tinggi dari Ian\n" +
                "Nilai Ani lebih tinggi dari Ana\n" +
                "Nilai Ani lebih rendah dari Nia\n" +
                "\n" +
                "Aturlah posisi nama siswa dari nilai tertinggi ke rendah!\n",
        R.drawable.intro_ulanganharian,
        R.drawable.intro_ulanganharian_ana,
        R.drawable.intro_ulanganharian_ani,
        R.drawable.intro_ulanganharian_ian,
        R.drawable.intro_ulanganharian_ina,
        R.drawable.intro_ulanganharian_nia,
        R.drawable.intro_ulanganharian_nia.toString() + R.drawable.intro_ulanganharian_ani.toString() + R.drawable.intro_ulanganharian_ana.toString() +
                R.drawable.intro_ulanganharian_ina.toString() + R.drawable.intro_ulanganharian_ian.toString()),
        UlanganAndPromosi(
            "Promosi Minuman",
            "Seorang salesman atau petugas pemasaran suatu perusahaan minuman harus mengunjungi 5 warung untuk memperkenalkan produk minuman terbaru. " +
                    "Kelima warung tersebut adalah: P, Q, R, S, T. Dia hanya akan mengunjungi masing-masing satu kali saja, satu warung per hari, " +
                    "senin sampai jumat dengan aturan berikut: \n " +
                    "-  Tidak boleh mengunjungi warung R pada hari senin\n" +
                    "-  Harus mengunjungi warung P sebelum mengunjungi warung S\n" +
                    "-  Harus mengunjungi warung Q sebelum mengunjungi warung T\n" +
                    "\n" +
                    "Bantulah salesman untuk mengatur jadwal kunjungan dengan mengikuti aturan di atas! dari hari senin hingga jumat",
            R.drawable.expert_promosiminuman,
            R.drawable.expert_promosiminuman_p,
            R.drawable.expert_promosiminuman_q,
            R.drawable.expert_promosiminuman_r,
            R.drawable.expert_promosiminuman_s,
            R.drawable.expert_promosiminuman_t,
            R.drawable.expert_promosiminuman_p.toString() + R.drawable.expert_promosiminuman_s.toString() + R.drawable.expert_promosiminuman_r.toString() +
                    R.drawable.expert_promosiminuman_q.toString() + R.drawable.expert_promosiminuman_t.toString())
    )

    val questionMainanBaruPart2 = UlanganAndPromosi(
        "Mainan Baru part 2",
        "Joko baru saja membeli mainan bola baru. Mainan itu terdiri dari 9 potongan angka-angka yang berwarna-warni. " +
                "Dari hasil pengamatan dinyatakan informasi berikut: \n" +
                "-  Sebuah angka berwarna jingga dan ada masing-masing dua angka yang berwarna merah, hijau, kuning, dan biru.\n" +
                "-  Angka-angka yang berwarna merah, adalah angka yang berurutan.\n" +
                "-  Angka 4 berwarna hijau.\n" +
                "-  Dua buah angka yang berwarna biru bukanlah angka yang berurutan.\n" +
                "-  Angka 1 dan 9 berwarna kuning.\n" +
                "-  Angka berwarna jingga bukanlah angka yang berurutan langsung dengan salah satu angka yang berwarna hijau. \n \n" +
                "Bantulah Joko untuk mengurutkan angka berwarna ini jika angka 3 berwarna merah dan angka 6 berwarna hijau!. " +
                "Kamu bisa menekan tombol lingkaran 2, 5, 7, dan 8 untuk mengubah warnanya!",
        0,
        R.drawable.intro_mainanbaru_2_putih,
        R.drawable.intro_mainanbaru_5_putih,
        R.drawable.intro_mainanbaru_7_putih,
        R.drawable.intro_mainanbaru_8_putih,
        0,
        R.drawable.intro_mainanbaru_2_merah.toString() + R.drawable.intro_mainanbaru_5_biru.toString() +
                R.drawable.intro_mainanbaru_7_biru.toString() + R.drawable.intro_mainanbaru_8_orange.toString()
    )

    var pilihanA = ""
    var pilihanB = ""
    var pilihanC = ""
    var pilihanD = ""
    var jawabanSoal = ""

    var textJawaban1 = ""
    var textJawaban2 = ""
    var textJawaban3 = ""
    var idGambarBenar1 = 0
    var idGambarBenar2 = 0
    var idGambarBenar3 = 0
    var currentHalaman = 1
    var jumlahHalaman = 0

    var textHint1 = ""
    var textHint2 = ""
    var textHint3 = ""
    var textHint4 = ""
    var textHint5 = ""
    var textHint6 = ""
    var textHint7 = ""
    var idGambarHint1 = 0
    var idGambarHint2 = 0
    var idGambarHint3 = 0
    var idGambarHint4 = 0
    var idGambarHint5 = 0
    var idGambarHint6 = 0
    var idGambarHint7 = 0
    var currentHalamanHint = 1
    var jumlahHalamanHint = 0



    var hintQuestion = arrayOf(
        Hint(
            "Kurs Mata Uang",
            R.drawable.hint_intro_kursmatauang_1,
            "Diketahui:\n" +
                    "1 dollar A = 2 dollar B\n" +
                    "1 dollar B = 1.5 dollar C",
            R.drawable.hint_intro_kursmatauang_2,
            "Diketahui:\n" +
                    "1 dollar A = 2 dollar B = 2 * 1.5 dollar C\n" +
                    "1 dollar A = 2 dollar B = 3 dollar C\n",
            R.drawable.hint_intro_kursmatauang_3,
            "Jadi,\n" +
                    "1 dollar A = 3 dollar C\n" +
                    "1000 dollar A = 3 * 1000 dollar C \n" +
                    "= 3000 dollar C\n",
            0, "", 0, "", 0, "", 0, "",
            3
        ),
        Hint(
            "Hasil Ulangan Harian",
            R.drawable.hint_intro_ulanganharian_1,
            "Kita bisa memulai dengan membandingkan pernyataan 1 dan lainnya yang saling berkaitan.\n" +
                    "Misalnya,\n" +
                    "pernyataan 1: Nilai Ana < Nia\n" +
                    "Pernyataan 2: Nilai Ana > Ina",
            R.drawable.hint_intro_ulanganharian_2,
            "Dari pernyataan tersebut kita tau bahwa nilai Ana berada di antara nilai Ina dan Nia. Jika diurutkan dari yang tertinggi yaitu: \n" +
                    "Nia, Ana, Ina",
            R.drawable.hint_intro_ulanganharian_3,
            "Pernyataan 3: Nilai Ani  > Ian\n" +
                    "Pernyataan 4: Nilai Ina > Ian \n" +
                    "Dari 2 pernyataan ini, kita tau bahwa nilai Ani dan Ina lebih tinggi dari Ian. Tapi kita tidak tau nilai mana yang lebih tinggi antara Ani dan Ina. " +
                    "Yuk, kita liat pernyataan berikutnya.",
            R.drawable.hint_intro_ulanganharian_4n5,
            "Pernyataan 5: Nilai Ani > Ana\n" +
                    "Pernyataan 6: Nilai Ani < Nia\n" +
                    "\n" +
                    "Dari 2 pernyataan ini, kita tahu bahwa nilai Ani berada di antara Nia dan Ana (Nia, Ani, Ana)",
            R.drawable.hint_intro_ulanganharian_4n5,
            "Pernyataan 1-6 harus dipenuhi. Jangan sampai ada pernyataan yang belum dipenuhi ya.",
            0, "", 0, "",
            5
        ),
        Hint(
            "Kandang Bebek",
            R.drawable.hint_intro_kandangbebek_1,
            "Karena setiap kandang ada bebeknya, berarti setiap kandang pasti berisi minimal 1 bebek.",
            R.drawable.hint_intro_kandangbebek_2,
            "Jadi, tersisa 3 bebek yang bisa dimasukkan kedalam 1 kandang lain.",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            2
        ),
        Hint(
            "Mainan Baru part 1",
            R.drawable.hint_intro_mainanbaru_part1_1,
            "Perhatikan aturan ke-2: 2 buah angka berwarna merah adalah angka berurutan.",
            R.drawable.hint_intro_mainanbaru_part1_2,
            "Diketahui bola angka 3 berwarna merah, berarti kemungkinan angka berwarna merah adalah 2 atau 4.",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            2
        ),
        Hint(
            "Mainan Baru part 2",
            R.drawable.hint_intro_mainanbaru_part2_1,
            "Perhatikan aturan yang sudah diberikan dan aturan tambahan di soalnya!. " +
                    "Kamu bisa mulai mengerjakan secara bertahap dari aturan pertama hingga aturan terakhir.",
            R.drawable.hint_intro_mainanbaru_part2_2,
            "Aturan ke-1\n" +
                    "Sebuah angka berwarna jingga dan ada masing-masing dua angka yang berwarna merah, hijau, kuning, dan biru.",
            R.drawable.hint_intro_mainanbaru_part2_3,
            "Aturan ke-2\n" +
                    "Angka-angka yang berwarna merah, adalah angka yang berurutan.",
            R.drawable.hint_intro_mainanbaru_part2_4,
            "Aturan ke-3\n" +
                    "Angka 4 berwarna hijau.",
            R.drawable.hint_intro_mainanbaru_part2_5,
            "Aturan ke-4\n" +
                    "Dua buah angka yang berwarna biru bukanlah angka yang berurutan.",
            R.drawable.hint_intro_mainanbaru_part2_6,
            "Aturan ke-5\n" +
                    "Angka 1 dan 9 berwarna kuning.",
            R.drawable.hint_intro_mainanbaru_part2_7,
            "Aturan ke-6\n" +
                    "Angka berwarna jingga bukanlah angka yang berurutan langsung dengan salah satu angka yang berwarna hijau.",
            7
        ),
        Hint(
            "Tugas Prakarya",
            R.drawable.hint_beginner_tugasprakarya_1,
            "Kelipatan 5 artinya bisa dibagi dengan angka lima. \n" +
                    "Tiap 10 angka, ada 2 angka yang dapat dibagi dengan angka lima yaitu akhiran angka 5 dan 0.",
            R.drawable.hint_beginner_tugasprakarya_2,
            "Maka dari 100 angka,\n" +
                    "100 : 10 = 10 kelompok yang tiap kelompoknya ada 2 angka yang dapat dibagi dengan angka lima.\n" +
                    "Jadi, totalnya yaitu 10 * 2 = 20 angka yang mengandung kelipatan 5.",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            2
        ),
        Hint(
            "Eksperimen Tikus",
            R.drawable.hint_beginner_eksperimentikus_1,
            "Setiap minggu, jumlah tikus berkurang stengah dari jumlah sebelumnya karena saling memakan sesamanya. ",
            R.drawable.hint_beginner_eksperimentikus_2,
            "Misalnya, jika awalnya berjumlah 6 ekor tikus, seminggu kemudian semua tikus saling memakan sesamanya sehingga tersisa 4 ekor.",
            R.drawable.hint_beginner_eksperimentikus_3,
            "Kemudian, minggu berikutnya lagi, 4 ekor tikus akan saling memakan sesamanya lagi sehingga tersisa 2 ekor. Begitu terus tiap minggu berikutnya.",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            3
        ),
        Hint(
            "Bakteri",
            R.drawable.hint_beginner_bakteri_1,
            "Tiap menit, bakteri akan berkembang menjadi 2x lipat.",
            R.drawable.hint_beginner_bakteri_2,
            "Dalam waktu 1 jam toples tersebut penuh, maka sebelumnya toples tersebut keadaannya ½ penuh.",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            2
        ),
        Hint(
            "Kantong Kelereng",
            R.drawable.hint_beginner_kantongkelereng_1,
            "Asumsikan kita orang paling sial sedunia. 2 kali ambil dapat warna merah. 4 kali ambil berikutnya dapat warna biru.",
            R.drawable.hint_beginner_kantongkelereng_2n3,
            "Tinggal 1 biru lagi jadi 5, tapi karena kita orang tersial sedunia ternyata 4 kali ambil berikutnya lagi dapet warna kuning.",
            R.drawable.hint_beginner_kantongkelereng_2n3,
            "Barulah 1 kali ambil lagi, antara warna biru atau kuning, yang manapun yang kita ambil, kita akan mendapatkan kelereng " +
                    "dengan 5 warna yang sama.",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            3
        ),
        Hint(
            "Belanja Tepung",
            R.drawable.hint_standart_belanjatepung_1,
            "Pertama, kita bisa tentukan harga/kue untuk tiap mereknya. Tujuannya supaya kita dapat mengetahui harga " +
                    "merk tepung yang murah tapi bisa mendapatkan kue yang banyak.",
            R.drawable.hint_standart_belanjatepung_2n3,
            "Dari harga/kue itu, kita bisa mengurutkan harga/kue dari yang paling murah ke mahal.\n" +
                    "Setelah itu, kita bisa membeli tepung tersebut berdasarkan urutan harga yang sudah kita buat tadi.",
            R.drawable.hint_standart_belanjatepung_2n3,
            "Jadi, kita bisa membeli tepung merk E, D, A, C dengan total harga Rp.  9,000. Kita tidak bisa membeli " +
                    "merk B karena total harganya sudah lebih dari Rp. 10,000.",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            3
        ),
        Hint(
            "Alat Musik part 1",
            R.drawable.hint_standart_alatmusik_part1_1,
            "Perhatikan tabel tombol merah dan ingat, saat mesinnya nyala akan langsung membunyikan nada ‘do’.",
            R.drawable.hint_standart_alatmusik_part1_2,
            "Contoh:\n" +
                    "jika nada sebelumnya adalah ‘do’ maka setelah menekan tombol merah, nadanya berubah menjadi ‘mi’.",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            2
        ),
        Hint(
            "Alat Musik part 2",
            R.drawable.hint_standart_alatmusik_part2_1,
            "Jika nada setelah ‘do’ adalah ‘re’, kita bisa mencari di tabel tombol merah atau putih yang memiliki nada ‘re’ yaitu tombol putih.",
            R.drawable.hint_standart_alatmusik_part2_2,
            "Jika nada setelah ‘re’ adalah ‘mi’, kita bisa mencari di tabel tombol merah atau putih yang memiliki nada ‘mi’ yaitu tombol putih.",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            2
        ),
        Hint(
            "Pesan Lampu part 1",
            R.drawable.hint_standart_pesanlampu_1,
            "Perhatikan 5 kondisi lampu (nyala/padam) pertama untuk menentukan kondisi lampu ke-6. Jika banyak lampu nyala berjumlah genap, " +
                    "maka kondisi lampu ke-6 nyala. Jika tidak kondisi lampu ke-6 padam.",
            R.drawable.hint_standart_pesanlampu_2,
            "Setelah kita mengetahui kondisi lampu ke-6, barulah kita bisa menentukan kondisi lampu ke-7.",
            R.drawable.hint_standart_pesanlampu_3,
            "Perhatikan 6 kondisi lampu (nyala/padam) pertama untuk menentukan kondisi lampu ke-7. Jika banyak lampu padam berjumlah genap, " +
                    "maka kondisi lampu ke-7 padam. Jika tidak kondisi lampu ke-7 nyala.",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            3
        ),
        Hint(
            "Pesan Lampu part 2",
            R.drawable.hint_standart_pesanlampu_1,
            "Perhatikan 5 kondisi lampu (nyala/padam) pertama untuk menentukan kondisi lampu ke-6. Jika banyak lampu nyala berjumlah genap, " +
                    "maka kondisi lampu ke-6 nyala. Jika tidak kondisi lampu ke-6 padam.",
            R.drawable.hint_standart_pesanlampu_2,
            "Setelah kita mengetahui kondisi lampu ke-6, barulah kita bisa menentukan kondisi lampu ke-7.",
            R.drawable.hint_standart_pesanlampu_3,
            "Perhatikan 6 kondisi lampu (nyala/padam) pertama untuk menentukan kondisi lampu ke-7. Jika banyak lampu padam berjumlah genap, " +
                    "maka kondisi lampu ke-7 padam. Jika tidak kondisi lampu ke-7 nyala.",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            3
        ),
        Hint(
            "Promosi Minuman",
            R.drawable.hint_expert_promosiminuman_1,
            "Kamu bisa mulai mengatur jadwal dengan mengikuti aturan 1-3 secara perlahan. Jangan sampai ada aturan yang dilanggar!.",
            R.drawable.hint_expert_promosiminuman_2,
            "Aturan ke-1\n" +
                    "Salesman tidak boleh mengunjungi warung R pada hari senin.",
            R.drawable.hint_expert_promosiminuman_3,
            "Aturan ke-2\n" +
                    "Salesman harus mengunjungi warung P sebelum mengunjungi warung S.",
            R.drawable.hint_expert_promosiminuman_4,
            "Aturan ke-3\n" +
                    "Salesman harus mengunjungi warung Q sebelum mengunjungi warung T.",
            0,
            "",
            0, "", 0, "",
            4
        ),
        Hint(
            "Turnamen Catur part 1",
            R.drawable.hint_expert_catur_part1_1,
            "Angka menang pecatur senior dan junior memiliki nilai yang berbeda. " +
                    "Nilai menang saat melawan pecatur senior lebih besar dari pada pecatur pemula.",
            R.drawable.hint_expert_catur_part1_2,
            "Dalam 5x pertandingan, untuk mendapatkan nilai maksimum, pecatur senior " +
                    "harus mengalami 2x kekalahan saat melawan pecatur pemula.",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            2
        ),
        Hint(
            "Turnamen Catur part 2",
            R.drawable.hint_expert_catur_part2_1,
            "Diketahui pecatur senior tersebut kalah 1x dari pecatur senior lain " +
                    "dan memenangkan sisanya, maka total nilainya adalah 3 poin.",
            R.drawable.hint_expert_catur_part2_2,
            "Dari permasalahan tersebut, pecatur pemula sudah kalah 1x yang membuat poinnya menjadi -1. Jika dia menang terhadap 2 pecatur senior lain, " +
                    "ia memiliki 3 poin dan butuh 1 lagi menang agar lebih unggul.",
            R.drawable.hint_expert_catur_part2_3,
            "Kemudian dia masih harus bertanding dengan 1 pecatur lain. Jika ia kalah, ia memiliki poin 3 yang sama dengan pecatur senior tadi. " +
                    "Dengan demikian dia butuh 4x menang agar bisa di atas pecatur senior itu.",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            3
        ),
        Hint(
            "Katak",
            R.drawable.hint_expert_katak_1,
            "Cobalah untuk berpikir mundur. Misalnya dari gambar di atas, " +
                    "kita dapat melihat bahwa petak 0 dicapai dari petak 4.",
            R.drawable.hint_expert_katak_2,
            "Petak 4 dapat dicapai oleh petak 1. Petak 1 dapat dicapai oleh petak 3. \n" +
                    "Jadi, kotak petak harus dimulai dari kotak petak 3 agar kemudian setiap petak dapat ditandai tepat " +
                    "satu kali dan berhenti di petak dengan kotak berisi 0.",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            2
        ),
        Hint(
            "Turnamen Catur part 3",
            R.drawable.hint_expert_catur_part3_1,
            "Karena P kalah dengan L, poin yang ia miliki adalah -1 dan ia memenangkan sisanya. Total poin yang ia dapatkan 2×2 + 2×1 = 6 – 1 = 5 poin. " +
                    "Sang juara yang kalah dari P harus memiliki poin yang lebih besar dari 5.",
            R.drawable.hint_expert_catur_part3_2,
            "Total poin pecatur senior jika kalah dari P adalah -2 + 2×2 + 2×1 = 4 poin. " +
                    "Sehingga pecatur senior tidak mungkin juara.",
            R.drawable.hint_expert_catur_part3_3,
            "Total poin pecatur pemula jika kalah dari P adalah -1 + 3×2 + 1 = 6. " +
                    "Sehingga sang juara adalah pecatur pemula lain.",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            3
        ),
        Hint(
            "Robby Si Robot",
            R.drawable.hint_expert_robbysirobot,
            "Perhatikan fungsi simbol-simbol yang ada dalam petak kotak. " +
                    "Kamu bisa mengikuti arah simbol untuk dapat mencapai ke si penerima paket.",
            0,
            "",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            1
        ),
        Hint(
            "Labirin",
            R.drawable.hint_expert_labirin,
            "Perhatikan fungsi kode-kode yang ada untuk dapat menuju ke pintu keluar (finish).",
            0,
            "",
            0,
            "",
            0,
            "",
            0,
            "",
            0, "", 0, "",
            1
        ),
        Hint(
            "Mobil Pengangkut Barang",
            R.drawable.hint_expert_mobilpengangkut_1,
            "Ikuti instruksi dengan teliti untuk dapat menemukan tumpukan balok yang benar.",
            R.drawable.hint_expert_mobilpengangkut_2,
            "Instruksi ke-1\n" +
                    "Mulai dengan mobil pengangkut barang dalam keadaan kosong.",
            R.drawable.hint_expert_mobilpengangkut_3,
            "Instruksi ke-2\n" +
                    "Ambil 2 balok dengan warna yang sama.",
            R.drawable.hint_expert_mobilpengangkut_4,
            "Instruksi ke-3\n" +
                    "Ambil 1 balok dengan warna yang berbeda.",
            R.drawable.hint_expert_mobilpengangkut_5,
            "Instruksi ke-4\n" +
                    "Jika jumlah balok warna yang diangkut sebanyak 6 balok, berhenti. Jika belum, kembali ke langkah 2.",
            0, "", 0, "",
            5
        )
    )

    var answerKey = arrayOf(
        Hint(
            "Kurs Mata Uang",
            R.drawable.benar_intro_kursmatauang_1,
            "Diketahui:\n" +
                    "1 dollar A = 2 x 1.5 dollar C, berarti\n" +
                    "1 dollar A = 3 dollar C",
            R.drawable.benar_intro_kursmatauang_2,
            "Jadi, \n" +
                    "1000 dollar A = 3 x 1000 dollar C\n" +
                    "1000 dollar A = 3000 dollar C",
            0, "", 0, "", 0, "", 0, "", 0, "",
            2
        ),
        Hint(
            "Hasil Ulangan Harian",
            R.drawable.benar_intro_ulanganharian,
            "Diperoleh perbandingan sebagai berikut:\n" +
                    "Ana < Nia\n" +
                    "Ana > Ina\n" +
                    "Ani > Ian\n" +
                    "Ina > Ian\n" +
                    "Ani > Ana\n" +
                    "Ani < Nia",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Kandang Bebek",
            R.drawable.benar_intro_kandangbebek_1,
            "Karena setiap kandang ada bebeknya, berarti Setiap kandang pasti berisi min 1 bebek. ",
            R.drawable.benar_intro_kandangbebek_2,
            "Sehingga tersisa 3 bebek yang bisa dimasukkan ke dalam 1 kandang lain.",
            R.drawable.benar_intro_kandangbebek_3,
            "Jadi, jumlah maksimum pada 1 kandang adalah 4 bebek.",
            0, "", 0, "", 0, "", 0, "",
            3
        ),
        Hint(
            "Mainan Baru part 1",
            R.drawable.benar_intro_mainanpart1_1,
            "Dari aturan yang sudah diberikan, warna merah memiliki syarat harus berurutan.",
            R.drawable.benar_intro_mainanpart1_2,
            "Sehingga jika salah satu merah di angka 3, maka angka merah lainnya berada di antara angka 2 atau angka 4.",
            R.drawable.benar_intro_mainanpart1_3,
            "Karena angka 4 dipakai oleh warna hijau, maka hanya angka 2 yang memenuhi. Mudah bukan?",
            0, "", 0, "", 0, "", 0, "",
            3
        ),
        Hint(
            "Mainan Baru part 2",
            R.drawable.benar_intro_mainanpart2,
            "Dengan memperhatikan aturan yang ada kita bisa menempatkan warna lain dengan tepat.",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Tugas Prakarya",
            R.drawable.benar_beginner_tugasprakarya,
            "Terdapat 10 angka 5 sebagai satuan dan 10 angka 5 sebagai puluhan. Kemudian di total menjadi 20.",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Eksperimen Tikus",
            R.drawable.benar_beginner_eksperimentikus_1,
            "tiap minggu pasti seekor tikus saling memakan tikus lainnya, berarti:\n" +
                    "Minggu ke-1: 100 div 2 = 50 tikus yang berhasil bertahan hidup.",
            R.drawable.benar_beginner_eksperimentikus_2,
            "Minggu ke-2: 50 div 2 = 25 tikus yang berhasil bertahan hidup.",
            R.drawable.benar_beginner_eksperimentikus_3,
            "Minggu ke-3: 25 div 2 = 12 tikus\n" +
                    "Jadi, tikus yang berhasil hidup setelah 3 minggu adalah 12 tikus.",
            0, "", 0, "", 0, "", 0, "",
            3
        ),
        Hint(
            "Bakteri",
            R.drawable.benar_beginner_bakteri_1,
            "Soal bakteri ini berkaitan dengan barisan geometri.\n" +
                    "1, 2, 4, 8, 16, …",
            R.drawable.benar_beginner_bakteri_2,
            "Dalam waktu 1 jam toples tersebut penuh, maka sebelumnya toples tersebut keadaannya ½ penuh.",
            R.drawable.benar_beginner_bakteri_2,
            "Dari keadaan ½ penuh ke penuh membutuhkan waktu 1 menit, sehingga Toples ½ penuh pada menit = 60 – 1 = 59. " +
                    "Jadi, topes tersebut ½ penuh pada menit ke-59.",
            0, "", 0, "", 0, "", 0, "",
            3
        ),
        Hint(
            "Kantong Kelereng",
            R.drawable.benar_beginner_kantongkelereng,
            "Sesial-sialnya kita mengambil 10 kelereng, terdiri dari 2 kelereng merah, 4 kelereng biru, 4 kelereng kuning.",
            R.drawable.benar_beginner_kantongkelereng,
            "Jika kita mengambil 1 kelereng lagi, kelereng warna apapun kita ambil, pasti salah satu warna berjumlah 5. " +
                    "Jadi maksimal kita perlu mengambil 11 kelereng.",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            2
        ),
        Hint(
            "Belanja Tepung",
            R.drawable.benar_standart_belanjatepung,
            "Jika melihat harga/kue dari tiap merk tepung, kita dapat membeli tepung merk E, D, A, C dengan total " +
                    "harga Rp. 9,000 dan mendapatkan total kue sebanyak 20.",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Alat Musik part 1",
            R.drawable.benar_standart_alatmusik,
            "Sesuai dengan urutan penekanan yang berada pada tabel: do-mi-fa-sol-mi-fa.",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Alat Musik part 2",
            R.drawable.benar_standart_alatmusik,
            "Sesuai dengan tombol nada yang ditekan yaitu:\n" +
                    "Do - re(putih) - mi(putih) - fa(merah) - sol(merah) - do(putih) - mi(merah) - mi(putih).",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Pesan Lampu part 1",
            R.drawable.benar_standart_pesanlampu_part1_1,
            "Lampu ke-6 harusnya nyala (karena ada 4 lampu nyala di antara 5 lampu pertama).",
            R.drawable.benar_standart_pesanlampu_part1_2,
            "Lampu ke-7 harusnya nyala (karena hanya ada 1 lampu padam di antara 6 lampu pertama).",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            2
        ),
        Hint(
            "Pesan Lampu part 2",
            R.drawable.benar_standart_pesanlampu_part2_1,
            "Jawaban ke-2 yang mengikuti ketentuan dengan benar.\n" +
                    "Lampu ke-6 harusnya padam (karena semua lampu nyala di antara 5 lampu pertama).",
            R.drawable.benar_standart_pesanlampu_part2_2,
            "Lampu ke-7 harusnya nyala (karena hanya ada 1 lampu padam di antara 6 lampu pertama).",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            2
        ),
        Hint(
            "Promosi Minuman",
            R.drawable.benar_expert_promosiminuman,
            "Kamu berhasil mengatur jadwal kunjungan sesuai dengan aturan yang diberikan!",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Turnamen Catur part 1",
            R.drawable.benar_expert_turnamencatur_part1_1,
            "Nilai semakin tinggi jika mengalahkan pecatur senior. Maka dari itu, Jika kalah 2 kali, maka pecatur senior harus mengalami kekalahan saat melawan pecatur pemula.",
            R.drawable.benar_expert_turnamencatur_part1_2,
            "Dia harus meraih kemenangan di 2 pecatur senior dan 1 pecatur pemula. Jadi, maksimum poinnya adalah 2*2 + 1*1 - 2*2 = 1 poin.",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            2
        ),
        Hint(
            "Turnamen Catur part 2",
            R.drawable.benar_expert_turnamencatur_part2_1,
            "Seorang pecatur senior yang kalah sekali dengan pecatur senior lainnya memiliki total poin: 2*1+3*1-2 = 3.",
            R.drawable.benar_expert_turnamencatur_part2_2,
            "Jika ingin mengalahkan poinnya Pecatur pemula harus memenangkan 4 pertandingan sisanya sehingga memperoleh poin: 2*2 + 2*1 - 1 = 5 poin. ",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            2
        ),
        Hint(
            "Katak",
            R.drawable.benar_expert_katak_1,
            "Berpikir mundur, kita dapat melihat bahwa petak 2 yang berisi angka nol dapat dicapai dari petak 1. \n" +
                    "Petak 1 dapat dicapai dari petak 4. Petak 4 dapat dicapai dari petak 7.",
            R.drawable.benar_expert_katak_2,
            "Petak 7 dapat dicapai dari petak 6.\n" +
                    "Petak 6 dapat dicapai dari petak 8.",
            R.drawable.benar_expert_katak_3,
            "Petak 8 dapat dicapai dari petak 5. \n" +
                    "Terakhir, Petak 5 dapat dicapai dari petak 3.",
            0, "", 0, "", 0, "", 0, "",
            3
        ),
        Hint(
            "Turnamen Catur part 3",
            R.drawable.benar_expert_turnamencatur_part3,
            "Total poin pecatur pemula jika kalah dari P adalah -1 + 3×2 + 1 = 6. Sehingga sang juara adalah pecatur pemula lain, yaitu O atau Q.",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Robby Si Robot",
            R.drawable.benar_expert_robbysirobot,
            "Kamu berhasil menemukan jalur yang tepat.\n" +
                    "A1 B1 C1 C2 D2 D3 E3 E4 E5",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Labirin",
            R.drawable.benar_expert_labirin,
            "Kamu berhasil menemukan jalur yang tepat (C, D, D, A, C).",
            0,
            "",
            0,
            "",
            0, "", 0, "", 0, "", 0, "",
            1
        ),
        Hint(
            "Mobil Pengangkut Barang",
            R.drawable.benar_expert_mobilpengangkutbarang,
            "Tumpukan balok Pertama adalah satu-satunya yang mengikuti instruksi dengan benar. \n",
            R.drawable.benar_expert_mobilpengangkutbarang,
            "Dimulai dengan menempatkan 2 balok berwarna sama diikuti dengan 1 balok berwarna beda. " +
                    "Kemudian, mengulangi langkah yang sama dari langkah ke-2.",
            R.drawable.benar_expert_mobilpengangkutbarang,
            "Sama halnya dengan pemrograman, program selalu berjalan dari perintah atas ke bawah. Mudah bukan?",
            0, "", 0, "", 0, "", 0, "",
            3
        )
    )
    var wrongAnswer = arrayOf(
        WrongAnswer(
            "Kurs Mata Uang",
            "Coba kamu cari terlebih dahulu 1 dollar A berapa dollar C dari pernyataan yang sudah diberikan. Yuk coba lagi!."
        ),
        WrongAnswer(
            "Hasil Ulangan Harian",
            "Sepertinya dari 6 pernyataan yang diberikan, masih ada yang belum kamu penuhi. Yuk cek kembali jawabanmu!."
        ),
        WrongAnswer(
            "Kandang Bebek",
            "Ingat, setiap kandang pasti ada bebeknya, berarti setiap kandang minimal ada 1 bebek di dalamnya. Yuk coba lagi!."
        ),
        WrongAnswer(
            "Mainan Baru part 1",
            "Ingat, peraturan ke-2: angka berwarna merah adalah angka berurutan. Berarti, angka berwarna merah saling bersebelahan. Yuk coba lagi!"
        ),
        WrongAnswer(
            "Mainan Baru part 2",
            "Sepertinya dari beberapa pernyataan yang diberikan, masih ada pernyataan yang belum kamu penuhi. Yuk coba lagi!."
        ),
        WrongAnswer(
            "Tugas Prakarya",
            "Sepertinya ada yang kamu kelewatan dalam menghitung kelipatan 5. Yuk coba lagi!"
        ),
        WrongAnswer(
            "Eksperimen Tikus",
            "Ingat, tiap 1 minggu, jumlah tikus berkurang stengah dari jumlahnya. Yuk coba lagi!"
        ),
        WrongAnswer(
            "Bakteri",
            "Ingat, setiap menit bakteri akan berkembang 2x lipat. Jika dalam 1 jam isi toples sudah dipenuhi dengan bakteri, " +
                    "maka menit sebelumnya bakteri harus sudah 1/2 penuh. Yuk coba lagi!."
        ),
        WrongAnswer(
            "Kantong Kelereng",
            "Sesial-sialnya kita mengambil kelereng, harus mendapatkan semua warna dan jumlah tiap warna kelereng kurang dari 4. Yuk coba lagi!."
        ),
        WrongAnswer(
            "Belanja Tepung",
            "Sepertinya jawabanmu kurang tepat. Coba kamu mempertimbangkan nominal maksimal uang dengan jumlah kue yang dapat dihasilkan."
        ),
        WrongAnswer(
            "Alat Musik part 1",
            "Sepertinya jawabanmu kurang tepat. Coba kamu ikutin arahan dari tabel tombol merah dengan teliti."
        ),
        WrongAnswer(
            "Alat Musik part 2",
            "Sepertinya jawabanmu kurang tepat. Coba kamu ikutin arahan dari tabel tombol nada dengan teliti."
        ),
        WrongAnswer(
            "Pesan Lampu part 1",
            "Sepertinya jawabanmu kurang tepat. Coba kamu ikutin ketentuan kondisi lampu ke-6 dan ke-7 dengan teliti. Yuk coba lagi!"
        ),
        WrongAnswer(
            "Pesan Lampu part 2",
            "Sepertinya jawabanmu kurang tepat. Coba kamu ikutin ketentuan kondisi lampu ke-6 dan ke-7 dengan teliti. Yuk coba lagi!"
        ),
        WrongAnswer(
            "Promosi Minuman",
            "Sepertinya jawabanmu kurang tepat. Coba kamu periksa kembali apakah kamu sudah mengikuti 3 aturan yang sudah diberikan atau belum."
        ),
        WrongAnswer(
            "Turnamen Catur part 1",
            "Sepertinya jawabanmu kurang tepat. Cobalah pertimbangkan poin menang dan kalah saat melawan pecatur senior dan junior."
        ),
        WrongAnswer(
            "Turnamen Catur part 2",
            "Sepertinya jawabanmu kurang tepat. Cobalah kamu mencari total poin pecatur senior terlebih dahulu untuk dapat mengetahui total poin yang harus dilampaui."
        ),
        WrongAnswer(
            "Katak",
            "Sepertinya jawabanmu kurang tepat. Cobalah untuk berpikir mundur. kamu dapat melihat bahwa petak 0 dicapai dari petak 1."
        ),
        WrongAnswer(
            "Turnamen Catur part 3",
            "Sepertinya jawabanmu kurang tepat. Cobalah kamu mencari total poin pecatur pemula P terlebih dahulu untuk dapat mengetahui total poin yang harus dilampaui."
        ),
        WrongAnswer(
            "Robby Si Robot",
            "Sepertinya jawabanmu kurang tepat. Cobalah Perhatikan fungsi simbol-simbol yang ada dalam petak kotak. Kamu bisa mengikuti arah simbol untuk dapat mencapai ke si penerima paket."
        ),
        WrongAnswer(
            "Labirin",
            "Sepertinya jawabanmu kurang tepat. Cobalah perhatikan fungsi kode-kode yang ada untuk dapat menuju ke pintu keluar (finish)."
        ),
        WrongAnswer(
            "Mobil Pengangkut Barang",
            "Sepertinya jawabanmu kurang tepat. Cobalah Ikuti instruksi dengan teliti untuk dapat menemukan tumpukan balok yang benar."
        ),
    )

    fun ClearJawaban(){
        currentHalaman = 1
        jumlahHalaman = 0
        idGambarBenar1 = 0
        idGambarBenar2 = 0
        idGambarBenar3 = 0
        textJawaban1 = ""
        textJawaban2 = ""
        textJawaban3 = ""
    }
    fun ClearHint(){
        textHint1 = ""
        textHint2 = ""
        textHint3 = ""
        textHint4 = ""
        textHint5 = ""
        textHint6 = ""
        textHint7 = ""
        idGambarHint1 = 0
        idGambarHint2 = 0
        idGambarHint3 = 0
        idGambarHint4 = 0
        idGambarHint5 = 0
        idGambarHint6 = 0
        idGambarHint7 = 0
        currentHalamanHint = 1
        jumlahHalamanHint = 0
    }

    var user = User("", "", "", "", 0, 0)
    var levelTertinggiUser = 0
    var noSoalTertinggiUser = 1
}
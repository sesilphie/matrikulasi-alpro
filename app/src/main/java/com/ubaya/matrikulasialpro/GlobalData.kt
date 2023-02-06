package com.ubaya.matrikulasialpro

object GlobalData {
    val QuestionModel = arrayOf (
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
    val QuestionPesanLampuAndLabirin = arrayOf(
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
            "A1 B1 C1 C2 D2 D3 E3 E4 E5", "A1 B1 C1 C2 C3 D3 E3 E4 E5", "A1 B1 C1 C2 D2 D3 D4 D5 E5", "A1 B1 C1 C2 C3 C4 C5 D5 E5",
            0,
            "A1 B1 C1 C2 D2 D3 E3 E4 E5")
    )

    val QuestionKatakAndRobot = arrayOf(
        QuestionKatakAndRobot("Katak",
            "Seekor katak suka melompat-lompat. Terdapat 8 petak yang diberi nomor dari 1 s.d. 8. Setiap petak berisi 1 kotak " +
                    "yang ditandai dengan salah satu dari tiga aturan melompat.\n" +
                    "Contoh:\n" +
                    "Gerakan ke kanan: Misalnya sebuah kotak ditandai dengan “2R” berarti ia harus melompat ke kanan sebanyak 2 petak, " +
                    "lalu menandai petak akhir lompatannya:",
            R.drawable.expert_katak1,
            "Gerakan ke kiri: Misalnya sebuah kotak ditandai “2L” berarti ia harus melompat ke kiri sebanyak 2 petak " +
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

    var pilihanA = ""
    var pilihanB = ""
    var pilihanC = ""
    var pilihanD = ""
    var jawabanSoal = ""
}
package com.dicoding.picodiploma.seputargunung;

import java.util.ArrayList;

public class MountData {

    private static String[] mountPhotos = {
            "https://upload.wikimedia.org/wikipedia/commons/b/b8/Lawu.jpg",
            "https://upload.wikimedia.org/wikipedia/id/8/84/Merbabu_060831_selo.jpg",
            "https://upload.wikimedia.org/wikipedia/id/7/75/Gunung_prahu.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/a/a0/G.Raung%2713.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/e/e9/Savanna_Mt._Rinjani_5.JPG",
            "https://upload.wikimedia.org/wikipedia/commons/1/12/Semeru.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/e/eb/Mt_Sindoro_view_from_Mt_Sikunir.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/3/36/Gunung_Slamet_dari_Kr_Salam.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/a/a4/Sumbing%2C_Java.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/b/bd/Caldera_Mt_Tambora_Sumbawa_Indonesia.jpg"
    };
    private static String[] mountNames = {
            "Lawu",
            "Merbabu",
            "Prau",
            "Raung",
            "Rinjani",
            "Semeru",
            "Sindoro",
            "Slamet",
            "Sumbing",
            "Tambora"
    };

    private static String[] mountDetails = {
            "Gunung Lawu (3.265 MDPL) terletak di Pulau Jawa, Indonesia, tepatnya di perbatasan Provinsi Jawa Tengah dan Jawa Timur. Gunung Lawu terletak di antara tiga kabupaten yaitu Kabupaten Karanganyar, Jawa Tengah, Kabupaten Ngawi, dan Kabupaten Magetan, Jawa Timur. Status gunung ini adalah gunung api \"istirahat\" (diperkirakan terahkir meletus pada tanggal 28 November 1885[3][4]) dan telah lama tidak aktif, terlihat dari rapatnya vegetasi serta puncaknya yang tererosi. Di lerengnya terdapat kepundan kecil yang masih mengeluarkan uap air (fumarol) dan belerang (solfatara). Gunung Lawu mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan hutan Ericaceous. Gunung Lawu adalah sumber inspirasi dari nama kereta api Argo Lawu, kereta api eksekutif yang melayani Solo Balapan-Gambir.",
            "Gunung Merbabu adalah gunung api yang bertipe Strato (lihat Gunung Berapi) yang terletak secara geografis pada 7,5° LS dan 110,4° BT. Secara administratif gunung ini berada di wilayah Kabupaten Magelang di lereng sebelah barat dan Kabupaten Boyolali di lereng sebelah timur dan selatan, Kabupaten Semarang di lereng sebelah utara, Provinsi Jawa Tengah. Gunung ini pernah meletus pada tahun 1560 dan 1797. Dilaporkan juga pada tahun 1570 pernah meletus, akan tetapi belum dilakukan konfirmasi dan penelitian lebih lanjut. Puncak gunung Merbabu berada pada ketinggian 3.145 meter di atas permukaan air laut.",
            "Gunung Prahu (terkadang dieja Gunung Prau) (2.565 mdpl) terletak di kawasan Dataran Tinggi Dieng, Jawa Tengah, Indonesia. Gunung Prahu terletak pada koordinat 7°11′13″S 109°55′22″E. Gunung Prahu merupakan tapal batas antara tiga kabupaten yaitu Kabupaten Batang, Kabupaten Kendal dan Kabupaten Wonosobo. Puncak Gunung Prahu merupakan padang rumput luas yang memanjang dari barat ke timur. Bukit-bukit kecil dan sabana dengan sedikit pepohonan dapat kita jumpai di puncak. Gunung Prahu merupakan puncak tertinggi di kawasan Dataran Tinggi Dieng, dengan beberapa puncak yang lebih rendah di sekitarnya, antara lain Gunung Sipandu, Gunung Pangamun-amun, dan Gunung Juranggrawah.",
            "Gunung Raung (puncak tertinggi: 3.260 mdpl) adalah gunung berapi kerucut yang terletak di ujung timur Pulau Jawa, Indonesia. Secara administratif, kawasan gunung ini termasuk dalam wilayah tiga kabupaten di wilayah Besuki, Jawa Timur, yaitu Banyuwangi, Bondowoso, dan Jember. Secara geografis, lokasi gunung ini berada dalam kawasan kompleks Pegunungan Ijen dan menjadi puncak tertinggi dari gugusan pegunungan tersebut. Dihitung dari titik tertinggi, Gunung Raung merupakan gunung tertinggi ketiga di Jawa Timur setelah Gunung Semeru dan Gunung Arjuno, serta menjadi yang tertinggi keempat di Pulau Jawa. Kaldera Gunung Raung juga merupakan kaldera kering yang terbesar di Pulau Jawa dan terbesar kedua di Indonesia setelah Gunung Tambora di Nusa Tenggara Barat[2]. Terdapat empat titik puncak, yaitu Puncak Bendera, Puncak 17, Puncak Tusuk Gigi, dan, yang tertinggi, Puncak Sejati (3.344 m).",
            "Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia dengan ketinggian 3.726 m dpl serta terletak pada lintang 8º25' LS dan 116º28' BT ini merupakan gunung favorit bagi pendaki Indonesia karena keindahan pemandangannya. Gunung ini merupakan bagian dari Taman Nasional Gunung Rinjani yang memiliki luas sekitar 41.330 ha dan ini akan diusulkan penambahannya sehingga menjadi 76.000 ha ke arah barat dan timur. Secara administratif gunung ini berada dalam wilayah tiga kabupaten: Lombok Timur, Lombok Tengah dan Lombok Barat.",
            "Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut (mdpl). Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatra dan Gunung Rinjani di Nusa Tenggara Barat[1]. Kawah di puncak Gunung Semeru dikenal dengan nama Jonggring Saloko. Gunung Semeru secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Malang dan Kabupaten Lumajang, Provinsi Jawa Timur. Gunung ini termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.",
            "Gunung Sindoro, biasa disebut Sindara, atau juga Sundoro (Ketinggian puncak 3.150 mdpl). Kawah yang disertai jurang dapat ditemukan di sisi barat laut ke selatan gunung, dan yang terbesar disebut Kembang. Sebuah kubah lava kecil menempati puncak gunung berapi. Sejarah letusan Gunung Sindara yang telah terjadi sebagian besar berjenis ringan sampai sedang (letusan freatik).",
            "Gunung Slamet (3.428 meter dpl.) adalah sebuah gunung berapi kerucut yang terdapat di Pulau Jawa, Indonesia. Gunung Slamet terletak di antara 5 kabupaten, yaitu Kabupaten Brebes, Kabupaten Banyumas, Kabupaten Purbalingga, Kabupaten Tegal, dan Kabupaten Pemalang, Provinsi Jawa Tengah. Gunung Slamet merupakan gunung tertinggi di Jawa Tengah serta kedua tertinggi di Pulau Jawa setelah Gunung Semeru. Kawah IV merupakan kawah terakhir yang masih aktif sampai sekarang, dan terakhir aktif hingga pada level siaga medio-2009. Gunung Slamet cukup populer sebagai sasaran pendakian meskipun medannya dikenal sulit. Di kaki gunung ini terletak kawasan wisata Baturraden yang menjadi andalan Kabupaten Banyumas karena hanya berjarak sekitar 15 km dari Purwokerto.",
            "Gunung Sumbing adalah gunung api yang terdapat di Jawa Tengah, Indonesia. (Ketinggian puncak 3.371 mdpl), gunung Sumbing merupakan gunung tertinggi ketiga di Pulau Jawa setelah Gunung Semeru dan Gunung Slamet. Gunung ini secara administratif terletak di tiga wilayah kabupaten, yaitu Kabupaten Magelang; Kabupaten Temanggung; dan Kabupaten Wonosobo. Bersama dengan Gunung Sindoro, Gunung Sumbing membentuk bentang alam gunung kembar, seperti Gunung Merapi dan Gunung Merbabu, apabila dilihat dari arah Temanggung. Gunung Sumbing mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan Hutan Ericaceous atau hutan gunung. Sebagian besar wilayah lereng gunung ini telah digunakan untuk lahan pertanian.",
            "Seperti Pasar Dieng , Puncak Hargo dumilah , Hargo dalem & Sumber air sendang Drajat\n" +
                    "\n" +
                    "Hanya itu saja artikel yang Mimin share untuk kalian , semoga bermanfaat & jaga etika kemanapun tempat kalian akan pergi"
    };

    private static String[] mountTrack = {
            "1. Via Cemoro Sewu = Basecamp Cemoro Sewu terletak di samping jalan utama Karanganyar-Magetan. Hal ini membuat Basecamp Cemoro Sewu mudah untuk dijangkau.\n" +
                    "\n" +
                    "2. Via Cemoro Kandang = Basecamp Cemoro Kandang terletak tidak jauh dari Basecamp Cemoro Sewu. Jarak tempuhnya hanya 750 meter saja. Basecamp Cemoro Kandang berada di Kabupaten Karanganyar, Jawa Tengah.\n" +
                    "\n" +
                    "3. Via Candi Cetho = Jalur pendakian Gunung Lawu via Candi Cetho menjadi rute yang paling terpisah dari Cemoro Sewu dan Cemoro Kandang. Jalur ini berada di sisi barat laut Gunung Lawu, tepatnya di Kecamatan Jenawi, Kabupaten Karanganyar, Jawa Tengah.",

            "1. Via Selo = Jalur pendakian Gunung Merbabu via Selo bisa dibilang merupakan yang paling favorit. Jalur ini berada di Kabupaten Boyolali. Jika mendaki melalui jalur Selo kamu bisa memanfaatkan fasilitas booking online melalui www.tngunungmerbabu.org\n" +
                    "\n" +
                    "2. Via Suwanting = Jalur pendakian Suwanting berada di Dusun Suwanting, Desa Banyuroto, Kecamatan Sawangan, Kabupaten Magelang. Ciri khas jalur ini adalah kamu harus melewati medan di tengah hutan lamtoro yang cukup panjang.\n" +
                    "\n" +
                    "3. Via Wekas = Jalur favorit pendakian Gunung Merbabu dari selatan adalah via Wekas. Jalur ini berada di Kecamatan Pakis, Kabupaten Magelang.\n" +
                    "\n" +
                    "4. Via Cunthel = Kamu yang ingin menjangkau puncak Gunung Merbabu dari sisi utara bisa melakukannya via jalur Cunthel. Jalur ini berada di Dusun Cunthel, Desa Kopeng, Kecamatan Getasan, Kabupaten Semarang.\n" +
                    "\n" +
                    "5. Via Thekelan = Lokasi Basecamp Pendakian Gunung Merbabu via Thekelan berada di desa dan Kecamatan yang sama dengan Basecamp Chuntel, yakni di desa Kopeng, Kecamatan Getasan, Kabupaten Semarang",

            "1. Via Wates = Jalur pendakian ini berada Dusun Wates, Kecamatan Wonoboyo, Kabupaten Temanggung. Basecampnya berada di ketinggian 1.896 mdpl dengan jalur pendakian hanya sekitar 4,7 kilometer.\n" +
                    "\n" +
                    "2. Via Kalilembu = Letak Basecamp Kalilembu sendiri berada tidak jauh dari Basecamp Petak Banteng. Basecamp Kalilembu ini berada di atas desa Patak Banteng. Hanya sekitar 100 meter. Untuk sampai ke Basecamp Kalilembu Kamu hanya tinggal berkendara dari Wonosobo ke arah Dieng atau Desa Kalilembu, Kecamatan Kejajar, Kabupaten Wonosobo.\n" +
                    "\n" +
                    "3. Via Dieng = Jalur Pendakian Prau via Dieng Kulon terletak di Desa Dieng Kulon, Kecamatan Batur, Kabupaten Banjarnegara. Basecamp ini cocok dipilih jika pendaki ingin sekaligus berwisata di Dieng karena basecamp ini tak jauh dari wisata Candi Arjuna, Telaga Warna, Telaga Pengilon, dan masih banyak lagi yang lainnya\n" +
                    "\n" +
                    "4. Via Patak Banteng = Untuk bisa sampai di basecamp Patak Banteng, pendaki bisa berkendara dari Wonosobo menuju Dieng dan berhenti di sebuah kantor Desa Patak Banteng, Kecamatan Kejajar, Kabupaten Wonosobo yang berada di pinggir jalan.",

            "1. Via Kalibaru = Basecamp Kalibaru terletak di Dusun Wonorejo, Desa Kalibaru Wetan, Kalibaru, Banyuwangi.\n" +
                    "\n" +
                    "2. Via Sumber Waringin = Jalur ini merupakan satu-satunya yang melalui Bondowoso dengan Basecamp terletak di desa Sumber Waringin, Wonosari, Bondowoso dan merupakan jalur yang sering dilalui.",

            "1. Via Sembalun = Jalur Sembalun adalah yang paling terkenal di antara semua jalur pendakian. Basecamp Sembalun berada di ketinggian sekitar 1.156 mdpl dan terletak di Lombok Timur.\n" +
                    "\n" +
                    "2. Via Senaru = Basecamp Senaru terletak di Desa Senaru, Kabupaten Lombok Utara, Nusa Tenggara Barat (NTB). \n" +
                    "\n" +
                    "3. Via Aik Berik = Jalur pendakian Gunung Rinjani terletak di Desa Aik Berik, Kecamatan Batukliang Utara Lombok Tengah.",

            "1. Via Ranu Pane = Basecamp Ranu Pane terletak di desa Ranu Pane, Kecanamatan Senduro, Lumajang, Jawa Timur.\n" +
                    "\n" +
                    "2. Via Ayek-Ayek = Jalur ini tidak dibuka untuk pendakian umum karena di kawasannya masih banyak terlihat hewan liar yang dilindungi",

            "1. Via Kledung = Jalur yang terdapat di Desa Kledung tersebut merupakan jalan populer yang biasa dilalui pendaki. Ada tiga pos yang akan dilalui jika kita melewati jalur ini.\n" +
                    "\n" +
                    "2. Via Alang-alang Sewu = Jalur Alang-alang Sewu adalah jalur baru yang basecampnya terletak di samping jalan raya Wonosobo-Panarakan. ",

            "1. Via Bambangan = Jalur Bambangan terletak di Dukuh Bambangan Desa Kutabaawa Kecamatan Karangreja, kabupaten Purbalingga. Bambangan memiliki alam yang subur karena berada di kaki gunung Slamet.\n" +
                    "\n" +
                    "2. Via Guci = Pendakian gunung Slamet via jalur Guci adalah jalur gunung bagian barat laut. Tepatnya di desa Guci, kecamatan Bojong, kabupaten Tegal. Desa Guci juga terkenal sebagai desa wisata. Di sana terdapat obyek wisata berupa pemandian air panas Guci. Selain itu juga banyak berdiri hotel dan vila.\n" +
                    "\n" +
                    "3. Via Baturaden = Pendakian gunung Slamet via Baturaden adalah jalur dari Purwokerto. Baturaden adalah daerah wisata di Purwokerto bagian atas atau di kaki gunung Slamet. Untuk melakukan pendakian via Baturaden kita harus menuju Purwokerto kota terlebih dahulu kamudian menuju Baturaden. Kita bisa naik angkot menuju Baturaden.",

            "1. Via Garung = Basecamp Gunung Sumbing via Garung terletak tepat setelah perbatasan Temanggung dan Wonosobo, ada jalur ke kiri yang bisa kamu ikuti dengan melihat papan penunjuk jalan bertuliskan ‘Basecamp Garung Gunung Sumbing’.\n"+
                    "\n"+
                    "2. Via Cepit Parakan = Lokasi jalur pendakian ini berada di Desa Cepit, Parakan, Kabupaten Temanggung. Walau tidak selalu menjadi pilihan utama para petualang dan pendaki yang ingin mendaki Gunung Sumbing, jalur pendakian ini cukup mempunyai pemandangan indah, lho.\n"+
                    "\n"+
                    "3. Via Mangli Kaliangkrik = Berada di Desa Mangli, Kaliangkrik, Kabupaten Magelang, untuk mencapai desa tersebut, kamu perlu menuju ke Desa Kalegen.\n"+
                    "\n"+
                    "4. Via Bowongso = Jalur pendakian yang satu ini cukup populer, namun sayangnya jalur ini cukup sepi, lho. Berada di Wonosobo, sama dengan jalur Garung, tetapi jalur pendakian Gunung Sumbing yang ini tidak direkomendasikan untuk para pemula.",

            "1. Via Desa Pancasila = Jalur pendakian Pancasila menjadi satu-satunya jalur yang akan mengantarkan pendaki ke Puncak Sejati Tambora dengan ketinggian 2.851 meter di atas permukaan laut (mdpl). Basecamp pendakian terletak di Desa Pancasila yang terletak di Kecamatan Pekat, Kabupaten Dompu, Nusa Tenggara Barat.\n"+
                    "\n"+
                    "2. Via Kawinda Toi = Jalur pendakian Gunung Tambora via Kawinda Toi terletak di desa Kawinda Toi, Kabupaten Bima."
    };

    static ArrayList<Mount> getListData() {
        ArrayList<Mount> list = new ArrayList<>();
        for (int position = 0; position < mountNames.length; position++) {
            Mount mount = new Mount();
            mount.setPhoto(mountPhotos[position]);
            mount.setName(mountNames[position]);
            mount.setDetail(mountDetails[position]);
            mount.setTrack(mountTrack[position]);
            list.add(mount);
        }
        return list;
    }
}

package applusiana.myrecyclerview;

import java.util.ArrayList;

public class IslandsData {
    public static String[][] data = new String[][]{
            {"Sumatera", "Andalas, (bentuk tidak baku: Sumatera) adalah pulau keenam terbesar di dunia yang terletak di Indonesia, dengan luas 473.481 km². Penduduk pulau ini sekitar 57.940.351 (sensus 2018). Pulau ini dikenal pula dengan nama lain yaitu Pulau Percha, Andalas, atau Suwarnadwipa (bahasa Sanskerta, berarti pulau emas). ", "https://upload.wikimedia.org/wikipedia/commons/0/06/Sumatra_Topography.png"},
            {"Jawa", "Java, adalah sebuah pulau di Indonesia dan merupakan pulau terluas ke-13 di dunia. Dengan jumlah penduduk sekitar hampir 160 juta, pulau ini pulau berpenduduk terbanyak di dunia dan merupakan salah satu tempat terpadat di dunia. Meskipun hanya menempati urutan terluas ke-5, ", "https://upload.wikimedia.org/wikipedia/commons/4/43/Java_Topography.png"},
            {"Kalimantan", "Borneo, adalah pulau terbesar ketiga di dunia yang terletak di sebelah utara Pulau Jawa dan di sebelah barat Pulau Sulawesi. Pulau Kalimantan dibagi menjadi wilayah Indonesia, Malaysia, dan Brunei. Pulau Kalimantan terkenal dengan julukan Pulau Seribu Sunga karena banyaknya sungai yang mengalir di pulau ini.", "https://upload.wikimedia.org/wikipedia/commons/2/28/Borneo_Topography.png"},
            {"Sulawesi", "Celebes, adalah sebuah pulau di Indonesia. Sulawesi merupakan salah satu dari empat Kepulauan Sunda Besar, dan merupakan pulau terbesar kesebelas di dunia, yang terletak di sebelah timur Kalimantan, sebelah barat Kepulauan Maluku, dan sebelah selatan Mindanao dan Kepulauan Sulu, Filipina. ", "https://upload.wikimedia.org/wikipedia/commons/6/65/Sulawesi_Topography.png"},
            {"Papua", "New Guinea atau Guinea Baru (bahasa Inggris: New Guinea, bahasa Indonesia: Nugini) atau yang dulu disebut dengan Pulau Irian, adalah pulau terbesar kedua (setelah Tanah Hijau) di dunia yang terletak di sebelah utara Australia. Di pulau yang bentuknya menyerupai burung cendrawasih ini terletak gunung tertinggi di Indonesia, yaitu Puncak Jaya (4.884 m).", "https://upload.wikimedia.org/wikipedia/commons/b/b6/New_Guinea_Topography.png"},
            {"Bali", "Pulau Dewata, adalah sebuah provinsi di Indonesia. Ibu kota provinsi ini adalah Denpasar. dan kini terbagi menjadi 3 provinsi: Bali, Nusa Tenggara Barat, dan Nusa Tenggara Timur Selain terdiri dari Pulau Bali, wilayah Provinsi Bali juga terdiri dari pulau-pulau yang lebih kecil di sekitarnya, yaitu Pulau Nusa Penida, Pulau Nusa Lembongan, Pulau Nusa Ceningan, Pulau Serangan, dan Pulau Menjangan.", "https://upload.wikimedia.org/wikipedia/commons/b/bf/Bali_Labeled.png"},
            {"Pulau Seribu", "Kepulauan Seribu, adalah sebuah kabupaten administrasi di Daerah Khusus Ibukota Jakarta, Indonesia. Pusat pemerintahan kabupaten ini terletak di Pulau Pramuka sejak tahun 2003. Terdapat dua Kecamatan di Kabupaten Administrasi Kepulauan Seribu yakni Kecamatan Kepulauan Seribu Selatan dan Kecamatan Kepulauan Seribu Utara.", "https://upload.wikimedia.org/wikipedia/commons/c/c6/Peta_Banten_Utara.png"},
            {"Madura", "Pulau Garam, adalah nama pulau yang terletak di sebelah timur laut Jawa Timur. Jembatan Nasional Suramadu merupakan pintu masuk utama menuju Madura Untuk jalur laut, bisa dilalui dari Pelabuhan Tanjung Perak di Surabaya menuju Pelabuhan Kamal di bangkalan, Selain itu juga bisa dilalui dari Pelabuhan Jangkar Situbondo menuju Pelabuhan Kalianget di Sumenep, ujung timur Madura.", "https://upload.wikimedia.org/wikipedia/commons/9/98/Madura_Topography.png"},
            {"Pulau Komodo", "(Taman Nasional Komodo), Pulau Komodo dikenal sebagai habitat asli hewan komodo. Pulau ini juga merupakan kawasan Taman Nasional Komodo yang dikelola oleh Pemerintah Pusat. Pulau Komodo berada di sebelah timur Pulau Sumbawa, yang dipisahkan oleh Selat Sape.", "https://upload.wikimedia.org/wikipedia/commons/c/c6/Flores_Locator_Topography.png"},
            {"Pulau Sunda", "Sundaland adalah sebuah wilayah di Asia Tenggara yang mencakup paparan Sunda, Bagian dari landas benua Asia yang terbuka selama zaman es. Batas timur Sundaland adalah garis Wallace, yang diidentifikasi oleh Alfred Russel Wallace sebagai batas timur pegunungan fauna mamalia dataran Asia Kepulauan Timur garis Wallace dikenal sebagai Wallacea, dan dianggap bagian dari Australasia.", "https://upload.wikimedia.org/wikipedia/commons/5/5f/Map_of_Sunda_and_Sahul.png"},
            {"Pulau Timor", "Timor adalah sebuah pulau di bagian selatan Nusantara, terbagi antara negara merdeka Timor Leste dan kawasan Timor Barat, bagian dari provinsi Nusa Tenggara Timur di Indonesia.", "https://upload.wikimedia.org/wikipedia/commons/f/fd/Timor.png"}
    };

    public static ArrayList<Islands> getListData(){
        ArrayList<Islands> list = new ArrayList<>();
        for (String[] aData : data) {
            Islands islands = new Islands();
            islands.setName(aData[0]);
            islands.setOther(aData[1]);
            islands.setPhoto(aData[2]);

            list.add(islands);
        }

        return list;
    }
}

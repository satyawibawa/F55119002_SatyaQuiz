package com.f55119002.f55119002_satyaquiz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.f55119002.f55119002_satyaquiz.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_main);

        // Data sukarno
        binding.imgPhoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.sukarno));
        binding.txtName1.setText("Soekarno");
        binding.txtDescription1.setText("Dr.(H.C.) Ir. H. Soekarno (ER, EYD: Sukarno, nama lahir: Koesno Sosrodihardjo)\n" +
                "            (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970\n" +
                "            pada umur 69 tahun) adalah Presiden pertama Republik Indonesia yang menjabat\n" +
                "            pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa\n" +
                "            Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia\n" +
                "            (bersama dengan Mohammad Hatta) yang terjadi pada tanggal 17 Agustus 1945.\n" +
                "            Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila\n" +
                "            sebagai dasar negara Indonesia dan ia sendiri yang menamainya.");
        // Data sudirman
        binding.imgPhoto2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.sudirman));
        binding.txtName2.setText("Soedirman");
        binding.txtDescription2.setText("Jenderal Besar Raden Soedirman (EYD: Sudirman; lahir 24 Januari 1916 –\n" +
                "            meninggal 29 Januari 1950 pada umur 34 tahun) adalah seorang perwira tinggi\n" +
                "            Indonesia pada masa Revolusi Nasional Indonesia. Menjadi panglima besar Tentara\n" +
                "            Nasional Indonesia pertama, ia secara luas terus dihormati di Indonesia.\n" +
                "            Terlahir dari pasangan rakyat biasa di Purbalingga, Hindia Belanda, Soedirman\n" +
                "            diadopsi oleh pamannya yang seorang priyayi. Setelah keluarganya pindah ke\n" +
                "            Cilacap pada tahun 1916, Soedirman tumbuh menjadi seorang siswa rajin; ia sangat\n" +
                "            aktif dalam kegiatan ekstrakurikuler, termasuk mengikuti program kepanduan yang\n" +
                "            dijalankan oleh organisasi Islam Muhammadiyah. Saat di sekolah menengah,\n" +
                "            Soedirman mulai menunjukkan kemampuannya dalam memimpin dan berorganisasi, dan\n" +
                "            dihormati oleh masyarakat karena ketaatannya pada Islam. Setelah berhenti kuliah\n" +
                "            keguruan, pada 1936 ia mulai bekerja sebagai seorang guru, dan kemudian menjadi\n" +
                "            kepala sekolah, di sekolah dasar Muhammadiyah; ia juga aktif dalam kegiatan\n" +
                "            Muhammadiyah lainnya dan menjadi pemimpin Kelompok Pemuda Muhammadiyah pada\n" +
                "            tahun 1937. Setelah Jepang menduduki Hindia Belanda pada 1942, Soedirman tetap\n" +
                "            mengajar. Pada tahun 1944, ia bergabung dengan tentara Pembela Tanah Air (PETA)\n" +
                "            yang disponsori Jepang, menjabat sebagai komandan batalion di Banyumas. Selama\n" +
                "            menjabat, Soedirman bersama rekannya sesama prajurit melakukan pemberontakan,\n" +
                "            namun kemudian diasingkan ke Bogor.");
        // Data supomo
        binding.imgPhoto3.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.mohammad_hatta));
        binding.txtName3.setText("Mohammad Hatta");
        binding.txtDescription3.setText("Dr.(HC) Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar,\n" +
                "            dikenal sebagai Bung Hatta; lahir di Fort de Kock (sekarang Bukittinggi,\n" +
                "            Sumatera Barat), Hindia Belanda, 12 Agustus 1902 – meninggal di Jakarta,\n" +
                "            14 Maret 1980pada umur 77 tahun) adalah tokoh pejuang, negarawan, ekonom,\n" +
                "            dan juga Wakil Presiden Indonesia yang pertama. Ia bersama Soekarno\n" +
                "            memainkan peranan penting untuk memerdekakan bangsa Indonesia dari\n" +
                "            penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945.\n" +
                "            Ia juga pernah menjabat sebagaiPerdana Menteri dalam Kabinet Hatta I,\n" +
                "            Hatta II, dan RIS. Ia mundur dari jabatan wakil presiden pada tahun 1956,\n" +
                "            karena berselisih dengan Presiden Soekarno. Hatta juga dikenal sebagai\n" +
                "            Bapak Koperasi Indonesia.");
    }
}
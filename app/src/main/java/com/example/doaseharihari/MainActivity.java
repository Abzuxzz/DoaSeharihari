package com.example.doaseharihari;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView lv_doa;

    String judul_doa[]=
            {"Do'a Sebelum Tidur"
            , "Doa Bangun Tidur"
            , "Do'a Masuk Kamar Mandi"
            , "Do'a Keluar Kamar Mandi"
            , "Do'a Berpakaian"
            , "Do'a Bercermin"
            , "Do'a Sebelum Makan"
            , "Do'a Sesudah Makan"
            , "Do'a Keluar Rumah"
            , "Do'a Keselamatan Dunia Akhirat"
            , "Do'a Sesudah Wudhu"
            , "Do'a Sebelum Belajar"
            , "Do'a Sesudah Belajar"
            , "Do'a Menjenguk Orang Sakit"
            , "Do'a Ketika Bersin"
            , "Do'a Ketika Mendengar Orang Bersin "
            , "Do'a Berjalan Ke Masjid"
            , "Do'a Ketika Masuk Masjid"
            , "Do'a Ketika Keluar Masjid"
            };

    String isi_doa[]= {
            "بِسْمِكَ اللّهُمَّ اَحْيَا وَاَمُوْتُ"
            , "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ"
            , "اَللهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ"
            , "غُفْرَانَكَ"
            , "اَلْحَمْدُ ِللهِ الَّذِىْ كَسَانِىْ هَذَا وَرَزَقَنِيْهِ مِنْ غَيْرِحَوْلٍ مِنِّىْ وَلاَقُوَّةٍ"
            , "اَلْحَمْدُ ِللهِ، كَمَا حَسَّنْتَ خَلْقِىْ فَحَسّنْ خُلُقِىْ"
            , "اَللهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ"
            , "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ"
            , "بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ لاَحَوْلَ وَلاَقُوَّةَ اِلاَّ بِاللهِ"
            , "اَللهُمَّ اِنَّا نَسْأَلُكَ سَلاَمَةً فِى الدِّيْنِ وَعَافِيَةً فِى الْجَسَدِ وَزِيَادَةً فِى الْعِلْمِ وَبَرَكَةً فِى الرِّزْقِ وَتَوْبَةً قَبْلَ الْمَوْتِ وَرَحْمَةً عِنْدَ الْمَوْتِ وَمَغْفِرَةً بَعْدَ الْمَوْت"
            , "اَشْهَدُ اَنْ لآّاِلَهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللهُمَّ اجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ"
            , "يَارَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًا"
            , "اَللهُمَّ اِنِّى اَسْتَوْدِعُكَ مَاعَلَّمْتَنِيْهِ فَارْدُدْهُ اِلَىَّ عِنْدَ حَاجَتِىْ وَلاَ تَنْسَنِيْهِ يَارَبَّ الْعَالَمِيْنَ"
            , "اَسْأَلُ اللهَ الْعَظِيْمَ رَبَّ الْعَرْشِ الْعَظِيْمِ اَنْ يُعَافِيَكَ وَيُشْفِيَكَ"
            , "اَلْحَمْدُ ِللهِ"
            , "يَرْحَمُكَ اللهُ"
            , "اَللهُمَّ اجْعَلْ فِىْ قَلْبِى نُوْرًا وَفِى لِسَانِىْ نُوْرًا وَفِىْ بَصَرِىْ نُوْرًا وَفِىْ سَمْعِىْ نُوْرًا وَعَنْ يَسَارِىْ نُوْرًا وَعَنْ يَمِيْنِىْ نُوْرًا وَفَوْقِىْ نُوْرًا وَتَحْتِىْ نُوْرًا وَاَمَامِىْ نُوْرًا وَخَلْفِىْ نُوْرًا وَاجْعَلْ لِّىْ نُوْرًا"
            , "اَللهُمَّ افْتَحْ لِىْ اَبْوَابَ رَحْمَتِكَ"
            ,"اَللهُمَّ اِنِّى اَسْأَلُكَ مِنْ فَضْلِكَ"
    };

    String arti_doa[]= {
            "Artinya: Dengan nama-Mu ya Allah aku hidup dan aku mati."
            ,"Artinya : Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan"
            ,"Artinya: Ya Allah, aku berlindung dari godaan syetan laki-laki dan syetan perempuan"
            ,"Artinya : Dengan mengharap ampunanMu"
            ,"Artinya : Segala puji bagi Allah yang memberi aku pakaian ini dan memberi rizqi dengan tiada upaya dan kekuatan dariku"
            ,"Artinya: Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku"
            ,"Artinya : Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka."
            ,"Artinya : Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam."
            ,"Artinya : Dengan menyebut nama Allah aku bertawakal kepada Allah, tiada daya kekuatan melainkan dengan Allah."
            ,"Artinya : Ya Allah kami memohon kepadaMu keselamatan dalam agama, dan kesejahteraan/kesegaran pada tubuh dan penambahan ilmu, dan keberkahan rizqi, serta taubat sebelum mati dan rahmat di waktu mati, dan keampunan sesudah mati."
            ,"Artinya : Aku mengaku bahwa tidak ada Tuhan selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya, dan aku mengaku bahwa Nabi Muhammad itu adalah hamba dan Utusan Allah. Ya Allah, jadikanlah aku dari golongan orang-orang yang bertaubat dan jadikanlah aku dari golongan orang-orang yang bersuci (sholeh)"
            ,"Artinya : Ya Allah, tambahkanlah aku ilmu dan berikanlah aku rizqi akan kepahaman."
            ,"Artinya : Ya Allah! sesungguhnya aku menitipkan kepada Engkau ilmu-ilmu yang telah Engkau ajarkan kepadaku, dan kembalikanlah kepadaku sewaktu aku butuh kembali dan janganlah Engkau lupakan aku kepada ilmu itu wahai Tuhan seru sekalian alam."
            ,"Artinya: Aku memohon kepada Allah yanag Maha Agung Tuhan Arsy yang agung semoga memberi kesejahteraan kepada engkau dan menyembuhkan engkau (orang yang sakit)."
            ,"Artinya : Segala Puji Bagi Allah"
            ,"Artinya : Ya Allah, jadikanlah dihatiku cahaya, pada lisanku cahaya dipandanganku cahaya, dalam pendengaranku cahaya, dari kananku cahaya, dari kiriku cahaya, dari atasku cahaya, dari bawahku cahaya, dari depanku cahaya, belakangku cahaya, dan jadikanlah untukku cahaya"
            ,"Artinya : Ya Allah, bukakanlah bagiku pintu-pintu rahmat-Mu"
            ,"Artinya : Ya Allah, sesungguhnya aku memohon keutamaan dari-Mu"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_doa = (ListView) findViewById( R.id.lvdoa);

        Adapterdoa adapterdoa = new Adapterdoa(judul_doa, isi_doa, arti_doa,this);

        lv_doa.setAdapter(adapterdoa);

        lv_doa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog_doa);
                TextView txtjudul = (TextView) dialog.findViewById(R.id.JudulDoa);
                TextView txtdoa = (TextView) dialog.findViewById(R.id.Doa);
                TextView txtarti = (TextView) dialog.findViewById(R.id.ArtiDoa);
                txtjudul.setText(judul_doa[position]);
                txtdoa.setText(isi_doa[position]);
                txtarti.setText(arti_doa[position]);
                dialog.show();

            }
        });





    }
}

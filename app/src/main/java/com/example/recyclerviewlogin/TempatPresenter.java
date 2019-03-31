package com.example.recyclerviewlogin;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class TempatPresenter {
    Context context;
    List<TempatModel> tempatModels = new ArrayList<>();
    MainView view;
    public TempatPresenter(MainView view, Context context){
        this.view=view;
        this.context=context;
    }

    public void setData(){
        TempatModel destinasi;
        destinasi= new TempatModel("ALSACE", R.drawable.alsace,"Sebuah région di Prancis bagian timur. Région terkecil di kawasan Prancis Metropolitan ini berbatasan dengan Swiss di sebelah selatan serta Jerman di utara dan timur. Alsace terkkenal karena daerahnya bak berada di negara dongeng" );
        tempatModels.add(destinasi);
        destinasi= new TempatModel("CENTRAL PARK",R.drawable.centralpark,"Sebuah taman umum yang luas di Manhattan, New York City. Luasnya 3,41 km² dengan bentuk lahan persegi panjang (panjang 4 km, lebar 800 m). Setiap tahunnya, taman ini dikunjungi sekitar 25 juta orang, dan sekaligus taman yang paling banyak didatangi orang di Amerika Serikat.Central Park termasuk salah satu taman terkenal di dunia, karena taman ini sering dijadikan lokasi film dan bahan liputan di televisi.");
        tempatModels.add(destinasi);
        destinasi= new TempatModel("GRAND CANYON",R.drawable.grandcanyon,"sebuah ngarai tebing-terjal, diukir oleh Sungai Colorado, di utara Arizona. Ngarai ini merupakan satu dari Tujuh Keajaiban Dunia dan sebagian besar berada di Taman Nasional Grand Canyon; salah satu taman nasional pertama di Amerika Serikat.");
        tempatModels.add(destinasi);
        destinasi= new TempatModel("MALDIVES",R.drawable.maldives,"negara kepulauan 1192 pulau karang kecil di Samudera Hindia. Hal ini terletak sekitar 700 kilometer di Baratdaya Sri Lanka dan sekitar 400 kilometer di barat daya India. Maldives terkenal akan pemandangan pantainya yang menakjubkan");
        tempatModels.add(destinasi);
        destinasi= new TempatModel("YANGSHUO",R.drawable.yangshuo,"Sebuah tempat yang berada di Cina Selatan. Pusat wisata yang cukup populer di sini adalah kota Yangshuo. Kota ini berada di dekat Guilin dan menjadi jujugan. Karena, tempat ini menyajikan view paling bagus dari pemandangan alam sungai Li,");
        tempatModels.add(destinasi);
        destinasi= new TempatModel("BIG BEN",R.drawable.bigben,"Sebuah tempat yang berada di Inggirs. Big Ben adalah nama sebuah lonceng besar di tengah menara jam yang terletak di sebelah utara Istana Westminster, London, Britania Raya.[1] Tetapi nama tersebut sering dipakai untuk menyebut menara jam itu secara menyeluruh");
        tempatModels.add(destinasi);
        destinasi= new TempatModel("LONDON EYE",R.drawable.londoneye,"London Eye atau disebut juga Millennium Wheel adalah sebuah roda pengamatan yang terbesar di dunia setinggi 135 meter atau 443 kaki. London Eye berputar di atas Sungai Thames, London, Britania Raya dan mulai beroperasi pada akhir 1999.");
        tempatModels.add(destinasi);
        destinasi= new TempatModel("NIAGARA FALLS",R.drawable.niagarafalls,"Niagara Falls adalah keajaiban geologi dan salah satu air terjun paling terkenal di dunia. Mengangkangi perbatasan antara Amerika Serikat dan Kanada, telah menjadi daya tarik wisata yang populer selama lebih dari 200 tahun, sekaligus merupakan sumber utama tenaga air");
        tempatModels.add(destinasi);
        view.onSuccess(tempatModels);
    }
}

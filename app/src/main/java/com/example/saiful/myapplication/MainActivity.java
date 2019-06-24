package com.example.saiful.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.saiful.myapplication.R.id.Iv_ayam;
import static com.example.saiful.myapplication.R.id.Iv_gado;
import static com.example.saiful.myapplication.R.id.Iv_gudeg;
import static com.example.saiful.myapplication.R.id.Iv_keraktelor;
import static com.example.saiful.myapplication.R.id.Iv_lumpia;
import static com.example.saiful.myapplication.R.id.Iv_otak;
import static com.example.saiful.myapplication.R.id.Iv_papeda;
import static com.example.saiful.myapplication.R.id.Iv_pempek;
import static com.example.saiful.myapplication.R.id.Iv_rendang;
import static com.example.saiful.myapplication.R.id.Iv_sop;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
            Rendang Sumatera Barat
         */
        Button favoriteRendang = (Button) findViewById(R.id.btn_favorite_rendang);

        favoriteRendang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Rendang",Toast.LENGTH_LONG).show();
            }
        });
        Button shareRendang =(Button) findViewById(R.id.btn_share_rendang);

        shareRendang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Rendang", Toast.LENGTH_LONG).show();
            }
        });
        ImageView g_rendang = (ImageView) findViewById(Iv_rendang);
        g_rendang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rendang = new Intent(MainActivity.this, rendangActivity.class);
                startActivity(rendang);
            }
        });
        /*
            Kerak Telor Jakarta
         */
        Button favoriteKeraktelor = (Button) findViewById(R.id.btn_favorite_keraktelor);

        favoriteKeraktelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Kerak Telor",Toast.LENGTH_LONG).show();
            }
        });
        Button shareKeraktelor =(Button) findViewById(R.id.btn_share_keraktelor);

        shareKeraktelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Kerak Telor", Toast.LENGTH_LONG).show();
            }
        });

        ImageView g_keraktelor = (ImageView) findViewById(Iv_keraktelor);
        g_keraktelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keraktelor = new Intent(MainActivity.this, Keraktelor.class);
                startActivity(keraktelor);
            }
        });

        /*
        Lumpia Semarang
         */

        Button favoritelumpia = (Button) findViewById(R.id.btn_favorite_lumpia);

        favoritelumpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Lumpia",Toast.LENGTH_LONG).show();
            }
        });
        Button sharelumpia =(Button) findViewById(R.id.btn_share_lumpia);

        sharelumpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Lumpia", Toast.LENGTH_LONG).show();
            }
        });

        ImageView g_lumpia = (ImageView) findViewById(Iv_lumpia);
        g_lumpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lumpia = new Intent(MainActivity.this, lumpia.class);
                startActivity(lumpia);
            }
        });

    /*
    Ayam Betutu
     */
        Button favoriteayam = (Button) findViewById(R.id.btn_favorite_ayam);

        favoriteayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Ayam Betutu",Toast.LENGTH_LONG).show();
            }
        });
        Button shareayam =(Button) findViewById(R.id.btn_share_ayam);

        shareayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Ayam Betutu", Toast.LENGTH_LONG).show();
            }
        });

        ImageView g_ayam = (ImageView) findViewById(Iv_ayam);
        g_ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ayam = new Intent(MainActivity.this, Ayam.class);
                startActivity(ayam);
            }
        });

        /*
        Gudeg Yogyakarta
         */
        Button favoritegudeg = (Button) findViewById(R.id.btn_favorite_gudeg);

        favoritegudeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Gudeg",Toast.LENGTH_LONG).show();
            }
        });
        Button sharegudeg =(Button) findViewById(R.id.btn_share_gudeg);

        sharegudeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Gudeg", Toast.LENGTH_LONG).show();
            }
        });

        ImageView g_gudeg = (ImageView) findViewById(Iv_gudeg);
        g_gudeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gudeg = new Intent(MainActivity.this, gudeg.class);
                startActivity(gudeg);
            }
        });

        /*
        Pempek Palembang
         */

        Button favoritepempek = (Button) findViewById(R.id.btn_favorite_pempek);

        favoritepempek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Pempek",Toast.LENGTH_LONG).show();
            }
        });
        Button sharepempek =(Button) findViewById(R.id.btn_share_pempek);

        sharepempek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Pempek", Toast.LENGTH_LONG).show();
            }
        });

        ImageView g_pempek = (ImageView) findViewById(Iv_pempek);
        g_pempek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pempek = new Intent(MainActivity.this, pempek.class);
                startActivity(pempek);
            }
        });

        /*
        Papeda Maliku
         */

        Button favoritepapeda = (Button) findViewById(R.id.btn_favorite_papeda);

        favoritepapeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Papeda",Toast.LENGTH_LONG).show();
            }
        });
        Button sharepapeda =(Button) findViewById(R.id.btn_share_papeda);

        sharepapeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Papeda", Toast.LENGTH_LONG).show();
            }
        });

        ImageView g_papeda = (ImageView) findViewById(Iv_papeda);
        g_papeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent papeda = new Intent(MainActivity.this, papeda.class);
                startActivity(papeda);
            }
        });

         /*
            Rendang RIAU
         */
        Button favoriteOtak = (Button) findViewById(R.id.btn_favorite_otak);

        favoriteOtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Otak-otak",Toast.LENGTH_LONG).show();
            }
        });
        Button shareOtak =(Button) findViewById(R.id.btn_share_otak);

        shareOtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Otak-otak", Toast.LENGTH_LONG).show();
            }
        });
        ImageView g_otak = (ImageView) findViewById(Iv_otak);
        g_otak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otak = new Intent(MainActivity.this, otak.class);
                startActivity(otak);
            }
        });

        /*
        Gado gado DKI Jakarta
         */

        Button favoriteGado = (Button) findViewById(R.id.btn_favorite_gado);

        favoriteGado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Gado-gado",Toast.LENGTH_LONG).show();
            }
        });
        Button shareGado =(Button) findViewById(R.id.btn_share_gado);

        shareGado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Gado-gado", Toast.LENGTH_LONG).show();
            }
        });
        ImageView g_gado = (ImageView) findViewById(Iv_gado);
        g_gado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gado = new Intent(MainActivity.this, gado.class);
                startActivity(gado);
            }
        });

        /*
        Sop Buntut Jawa Barat
         */

        Button favoritesop = (Button) findViewById(R.id.btn_favorite_sop);

        favoritesop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"favorite Sop Buntut",Toast.LENGTH_LONG).show();
            }
        });
        Button sharesop =(Button) findViewById(R.id.btn_share_sop);

        sharesop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Share Sop Buntut", Toast.LENGTH_LONG).show();
            }
        });
        ImageView g_sop = (ImageView) findViewById(Iv_sop);
        g_sop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sop = new Intent(MainActivity.this, Sop.class);
                startActivity(sop);
            }
        });

    }


}

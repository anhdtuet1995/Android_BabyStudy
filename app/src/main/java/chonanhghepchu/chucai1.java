package chonanhghepchu;

import com.example.my.project51.R;
import com.example.my.project51.choncauhoi;
import com.example.my.project51.chontrochoi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class chucai1 extends Activity {
	MediaPlayer mp3;
	MediaPlayer amr;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chonanhghepchu);
        ImageView image = (ImageView) findViewById(R.id.imageView1);
        image.setImageResource(R.drawable.b_cat);
        GridView g = (GridView) findViewById(R.id.myGrid);
		g.setAdapter(new ImageAdapter(this));
		g.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				if (+position == 0) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}

				if (+position == 1) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 2) {
					mp3 = MediaPlayer.create(chucai1.this, R.raw.chinhxac);
					mp3.start();
					Toast.makeText(getApplicationContext(),"Chính xác", Toast.LENGTH_SHORT).show();
				}
				if (+position == 3) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 4) {
					
				}
				if (+position == 5) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
			}
			});
		Button back=(Button) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(chucai1.this,chontrochoi.class);
				startActivity(i);
				finish();
				
			}
		});
		Button ketiep=(Button) findViewById(R.id.ketiep);
		ketiep.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(choncauhoi.c==2)
				{
					Intent myintent=new Intent(chucai1.this, chucai2.class);
					startActivityForResult(myintent, 1234);
					  finish(); 	
				}
				else if(choncauhoi.c==3)
				{
					Intent myintent=new Intent(chucai1.this, chucai3.class);
					startActivityForResult(myintent, 1234);
					  finish(); 	
				}
				else if(choncauhoi.c==4)
				{
					Intent myintent=new Intent(chucai1.this, chucai4.class);
					startActivityForResult(myintent, 1234);
					  finish(); 	
				}
				else if(choncauhoi.c==5)
				{
					Intent myintent=new Intent(chucai1.this, chucai5.class);
					startActivityForResult(myintent, 1234);
					  finish(); 	
				}
				
			}
		});
	}
		public class ImageAdapter extends BaseAdapter {
			public ImageAdapter(Context c) {
				mContext = c;
			}

			public int getCount() {
				return mThumbIds.length;
			}

			public Object getItem(int position) {
				return position;
			}

			public long getItemId(int position) {
				return position;
			}

			public View getView(int position, View convertView, ViewGroup parent) {
				ImageView imageView;
				if (convertView == null) {
					imageView = new ImageView(mContext);
					imageView.setLayoutParams(new GridView.LayoutParams(90, 90));
					imageView.setAdjustViewBounds(false);
					imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
					imageView.setPadding(1, 1, 1, 1);
				} else {
					imageView = (ImageView) convertView;
				}
				imageView.setImageResource(mThumbIds[position]);
				return imageView;
			}
			private Context mContext;
			private Integer[] mThumbIds = { R.drawable.b_goc1, R.drawable.d_goc,
					R.drawable.b_goc, R.drawable.d_goc1, R.drawable.u_goc, R.drawable.u_goc1 };
}
}
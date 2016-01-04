package timchucai;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;

import com.example.my.project51.R;
import com.example.my.project51.choncauhoi;
import com.example.my.project51.chontrochoi;

public class tim1 extends Activity {
	MediaPlayer mp3;
	MediaPlayer amr;
	Toolbar toolbar;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timchu);
		toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_left_arrow));
		toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(tim1.this,chontrochoi.class);
				startActivity(i);
				finish();
			}
		});
		toolbar.setTitle("Tìm chữ cái");
		mp3=MediaPlayer.create(tim1.this,R.raw.c);
        mp3.start();
        Button nghelai=(Button) findViewById(R.id.nghelai);
		nghelai.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

				mp3=MediaPlayer.create(tim1.this,R.raw.c);
		        mp3.start();

			}
		});
        GridView g = (GridView) findViewById(R.id.myGrid);
		g.setAdapter(new ImageAdapter(this));
		g.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
									int position, long id) {
				if (+position == 0) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 1) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 2) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 3) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 4) {

					mp3 = MediaPlayer.create(tim1.this, R.raw.chinhxac);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Chính xác!", Toast.LENGTH_SHORT).show();
					if (choncauhoi.c == 2) {
						Intent myintent = new Intent(tim1.this, tim2.class);
						startActivityForResult(myintent, 1234);
						finish();
					} else if (choncauhoi.c == 3) {
						Intent myintent = new Intent(tim1.this, tim3.class);
						startActivityForResult(myintent, 1234);
						finish();
					} else if (choncauhoi.c == 4) {
						Intent myintent = new Intent(tim1.this, tim4.class);
						startActivityForResult(myintent, 1234);
						finish();
					} else if (choncauhoi.c == 5) {
						Intent myintent = new Intent(tim1.this, tim5.class);
						startActivityForResult(myintent, 1234);
						finish();
					}
				}
				if (+position == 5) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 6) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 7) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 8) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 9) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 10) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 11) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 12) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 13) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 14) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 15) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 16) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 17) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 18) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 19) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 20) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 21) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 22) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 23) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 24) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 25) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 26) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 27) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 28) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 29) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 30) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 31) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 32) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 33) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 34) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 35) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 36) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 37) {
					mp3 = MediaPlayer.create(tim1.this, R.raw.sai);
					mp3.start();
					Toast.makeText(getApplicationContext(), "Sai", Toast.LENGTH_SHORT).show();
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
				imageView.setLayoutParams(new GridView.LayoutParams(80, 100));
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
		private Integer[] mThumbIds = { R.drawable.a, R.drawable.a1,
				R.drawable.a2, R.drawable.b, R.drawable.c, R.drawable.d,
				R.drawable.d1, R.drawable.e, R.drawable.e1, R.drawable.g,
				R.drawable.h, R.drawable.i, R.drawable.k, R.drawable.l,
				R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.o1,
				R.drawable.o2, R.drawable.p, R.drawable.q, R.drawable.r,
				R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.u1,
				R.drawable.v, R.drawable.x, R.drawable.y, R.drawable.t1,
				R.drawable.t2, R.drawable.t3, R.drawable.t4, R.drawable.t5,
				R.drawable.t6, R.drawable.t7, R.drawable.t8, R.drawable.t9 };
}
}

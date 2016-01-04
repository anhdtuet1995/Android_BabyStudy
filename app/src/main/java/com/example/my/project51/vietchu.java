package com.example.my.project51;

import android.gesture.GestureOverlayView;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class vietchu extends Activity {
	Button back, vietlai;
	GestureOverlayView gesture;
	Toolbar toolbar;
	Integer[] imageIDs = { R.drawable.a, R.drawable.a1,
			R.drawable.a2, R.drawable.b, R.drawable.c,
			R.drawable.d, R.drawable.d1, R.drawable.e,
			R.drawable.e1, R.drawable.g, R.drawable.h,
			R.drawable.i, R.drawable.k, R.drawable.l,
			R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.o1,
			R.drawable.o2, R.drawable.p, R.drawable.q, R.drawable.r,
			R.drawable.s, R.drawable.t, R.drawable.v, R.drawable.x,
			R.drawable.y, R.drawable.t1, R.drawable.t2, R.drawable.t3, 
			R.drawable.t4, R.drawable.t5, R.drawable.t6, R.drawable.t7,
			R.drawable.t8, R.drawable.t9 };
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vietchu);
		toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_left_arrow));
		toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(vietchu.this, GameS.class);
				startActivity(i);
				finish();
			}
		});
		toolbar.setTitle("Bé tập viết chữ");
		Gallery gallery = (Gallery) findViewById(R.id.gallery1);
		gallery.setAdapter(new ImageAdapter(getApplicationContext()));
	//	gallery.setAdapter(new ImageAdapter(getApplicationContext();
		gesture = (GestureOverlayView) findViewById(R.id.gestureOverlayView1);
		vietlai = (Button) findViewById(R.id.btn_vietlai);
		vietlai.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				gesture.cancelClearAnimation();
				gesture.clear(true);
			}
		});
	}


	public class ImageAdapter extends BaseAdapter {
		private Context context;
		private int itemBackground;

		public ImageAdapter(Context c) {
			context = c;
			// ---setting the style---
			TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
			itemBackground = a.getResourceId(
					R.styleable.Gallery1_android_galleryItemBackground, 0);
			a.recycle();
		}

		// ---returns the number of images---
		public int getCount() {
			return imageIDs.length;
		}

		// ---returns the ID of an item---
		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}
	

		// ---returns an ImageView view---
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView = new ImageView(context);
			imageView.setImageResource(imageIDs[position]);
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setLayoutParams(new Gallery.LayoutParams(150, 150));
			imageView.setBackgroundResource(itemBackground);
			return imageView;
		}
	}
}
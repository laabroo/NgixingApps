package com.laabroo.android.ngixingapps;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

@SuppressWarnings("rawtypes")
public class MyItemizedOverlay extends ItemizedOverlay {
	private ArrayList<OverlayItem> items = new ArrayList<OverlayItem>();
	Drawable marker;
	private Context mContext;

	public MyItemizedOverlay(Drawable defaultMarker) {
		super(defaultMarker);
		marker = defaultMarker;
	}

	@Override
	protected OverlayItem createItem(int i) {

		return (OverlayItem) items.get(i);
	}

	@Override
	public int size() {

		return items.size();
	}

	public void addItem(OverlayItem item) {
		items.add(item);
		populate();

	}

	public MyItemizedOverlay(Drawable drawable, Context context) {
		super(boundCenterBottom(drawable));
		mContext = context;
	}

	protected boolean onTap(int index) {
		OverlayItem item = items.get(index);
		AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
		builder.setTitle(item.getTitle());
		builder.setMessage(item.getSnippet());
		builder.setPositiveButton("Ok", new OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();

			}
		});

		builder.show();
		return true;

	}

}

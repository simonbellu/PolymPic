package com.knziha.polymer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

import com.knziha.polymer.Utils.CMN;
import com.knziha.polymer.widgets.Utils;

public class PDocShortCutActivity extends Activity {
	public static SparseArray<PDocShortCutActivity> blackSmithStack = new SparseArray<>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		CMN.Log("PDocShortCutActivity", getIntent(), getIntent().hasExtra("ASD"), getIntent().getData());
		
		Intent popup = new Intent(Intent.ACTION_VIEW);
		
		//popup.setData(Uri.fromFile(new File("/storage/emulated/0/myFolder/Gpu Pro 1.pdf")));
		
		popup.setClassName("com.knziha.polymer", "com.knziha.polymer.PDocViewerActivity");
		popup.setFlags(0);
		popup.putExtra("sin", true);
		popup.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		popup.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		popup.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		boolean bStatic = PDocViewerActivity.singleInstCout==0;
		
		popup.putExtras(getIntent().getExtras());
		
//		overridePendingTransition(0, 0);
		
		popup.putExtra("BST", getTaskId());
		blackSmithStack.put(getTaskId(), this);
		
		getApplicationContext().startActivity(popup);
		
		if(bStatic) {
			//overridePendingTransition(R.anim.alpha_in, 0); //
		}
		
		
		super.onCreate(savedInstanceState);
		
		if(Utils.littleCat) {
			finish();
		}
		
//		overridePendingTransition(0, 0);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		blackSmithStack.remove(getTaskId());
	}
	
}

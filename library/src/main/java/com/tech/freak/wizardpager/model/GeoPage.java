package com.tech.freak.wizardpager.model;

import android.support.v4.app.Fragment;
import com.tech.freak.wizardpager.ui.GeoFragment;

public class GeoPage extends TextPage {

	public GeoPage(ModelCallbacks callbacks,String key, String title) {
		super(callbacks, key, title);
	}

	@Override
	public Fragment createFragment() {
		return GeoFragment.create(getKey());
	}

	public GeoPage setValue(String value) {
		mData.putString(SIMPLE_DATA_KEY, value);
		return this;
	}
}

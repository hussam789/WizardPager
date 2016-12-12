package com.tech.freak.wizardpager.model;

import android.support.v4.app.Fragment;
import com.tech.freak.wizardpager.ui.NumberFragment;

public class NumberPage extends TextPage {

	public NumberPage(ModelCallbacks callbacks,String key, String title) {
		super(callbacks, key, title);
	}

	@Override
	public Fragment createFragment() {
		return NumberFragment.create(getKey());
	}

}

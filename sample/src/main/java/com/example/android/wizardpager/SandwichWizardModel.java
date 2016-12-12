/*
 * Copyright 2012 Roman Nurik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.wizardpager;

import android.content.Context;

import com.tech.freak.wizardpager.model.AbstractWizardModel;
import com.tech.freak.wizardpager.model.PageList;
import com.tech.freak.wizardpager.model.TextPage;

public class SandwichWizardModel extends AbstractWizardModel {
    public SandwichWizardModel(Context context) {
        super(context);
    }

    @Override
    protected PageList onNewRootPageList() {
//        Page thankYouPage = new TextPage(this, "Thank you!");
        return new PageList(new TextPage(this, "Welcome", "Welcome"));
//                ,new BranchPage(this,"Type", "Digital Tracking Type")
//                .addBranch("Vpn Only",
//                    new BranchPage(this, "install_vpn", "This app will install a VPN on your device, do you agree")
//                            .addBranch("Yes",
//                                    new SingleFixedChoicePage(this, "").setChoices("Yes",
//                                        "No").setValue("Yes")
//                                        .setRequired(true))
//                            .addBranch("No", thankYouPage)
//                .addBranch("Certificate + VPN",
//                    new SingleFixedChoicePage(this, "Salad type").setChoices(
//                            "Greek", "Caesar").setRequired(true),
//
//                    new SingleFixedChoicePage(this, "Dressing").setChoices(
//                            "No dressing", "Balsamic", "Oil & vinegar",
//                            "Thousand Island", "Italian").setValue("No dressing"),
//                    new NumberPage(this, "How Many Salads?").setRequired(true))
//                .setRequired(true),
//                new TextPage(this, "Comments").setRequired(true)
//
//                        .setRequired(true),
//
//                new CustomerInfoPage(this, "Your info").setRequired(true)));
    }
}

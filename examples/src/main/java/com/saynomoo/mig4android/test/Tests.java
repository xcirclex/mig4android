package com.saynomoo.mig4android.test;

import com.saynomoo.mig4android.ActivityListActivity;

public class Tests extends ActivityListActivity {
    Class[] activities = new Class[]{AbsolutePosition.class, LogicalPixels.class, NonRootMigLayout.class, TextWrap.class, TextWrap2.class, DynamicPreferredSize.class, WidthDeterminedFromSibling.class, GrowingListView.class, CanvasTest.class, PaddingTest.class, PaddingTest2.class};
    @Override
    public Class[] getActivities() {
        return activities;
    }
}

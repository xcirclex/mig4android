package com.saynomoo.mig4android.examples;

import com.saynomoo.mig4android.examples.test.Tests;

public class Examples extends ActivityListActivity{
    Class[] activities = new Class[]{QuickStart.class, Growing.class, BasicSizes.class, Tests.class, MigLayoutInListView.class, MigLayoutFromXml.class};
    @Override
    public Class[] getActivities() {
        return activities;
    }
}

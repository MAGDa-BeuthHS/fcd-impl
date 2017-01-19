/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class FCDImplIsDirtyTest {

    @Test
    public void isDirty() throws Exception {
        FloatingCarData data;
        data = new FloatingCarDataImpl(FCDTestData.ID, FCDTestData.LONGITUDE, FCDTestData.LATITUDE,
                FCDTestData.MAX_SPEED, FCDTestData.TIMESTAMP);
        assertTrue(data.isDirty());
        data = new FloatingCarDataImpl(FCDTestData.ID, FCDTestData.LONGITUDE, FCDTestData.LATITUDE,
                FCDTestData.MIN_SPEED, FCDTestData.TIMESTAMP);
        assertTrue(data.isDirty());
        data = new FloatingCarDataImpl("", FCDTestData.LONGITUDE, FCDTestData.LATITUDE, FCDTestData.SPEED,
                FCDTestData.TIMESTAMP);
        assertTrue(data.isDirty());
        data = new FloatingCarDataImpl(FCDTestData.ID, null, FCDTestData.LATITUDE, FCDTestData.SPEED,
                FCDTestData.TIMESTAMP);
        assertTrue(data.isDirty());
        data = new FloatingCarDataImpl(FCDTestData.ID, FCDTestData.LONGITUDE, null, FCDTestData.SPEED,
                FCDTestData.TIMESTAMP);
        assertTrue(data.isDirty());
        data = new FloatingCarDataImpl(FCDTestData.ID, FCDTestData.LONGITUDE, FCDTestData.LATITUDE, FCDTestData.SPEED,
                "");
        assertTrue(data.isDirty());
        data = new FloatingCarDataImpl(FCDTestData.ID, 180.1d, FCDTestData.LATITUDE, FCDTestData.SPEED,
                FCDTestData.TIMESTAMP);
        assertTrue(data.isDirty());
        data = new FloatingCarDataImpl(FCDTestData.ID, -180.1d, FCDTestData.LATITUDE, FCDTestData.SPEED,
                FCDTestData.TIMESTAMP);
        assertTrue(data.isDirty());
        data = new FloatingCarDataImpl(FCDTestData.ID, FCDTestData.LONGITUDE, 90.1d, FCDTestData.SPEED,
                FCDTestData.TIMESTAMP);
        assertTrue(data.isDirty());
        data = new FloatingCarDataImpl(FCDTestData.ID, FCDTestData.LONGITUDE, -90.1d, FCDTestData.SPEED,
                FCDTestData.TIMESTAMP);
        assertTrue(data.isDirty());
    }

}

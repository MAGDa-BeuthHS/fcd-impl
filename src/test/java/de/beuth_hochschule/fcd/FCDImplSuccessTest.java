/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class FCDImplSuccessTest {

    private final FloatingCarData data = new FloatingCarDataImpl(
            FCDTestData.ID,
            FCDTestData.LONGITUDE,
            FCDTestData.LATITUDE,
            FCDTestData.SPEED,
            FCDTestData.TIMESTAMP);

    @Test
    public void getId() throws Exception {
        assertEquals(FCDTestData.ID, data.getId());
    }

    @Test
    public void getLongitude() throws Exception {
        assertEquals(FCDTestData.LONGITUDE, data.getLongitude());
    }

    @Test
    public void getLatitude() throws Exception {
        assertEquals(FCDTestData.LATITUDE, data.getLatitude());
    }

    @Test
    public void getSpeed() throws Exception {
        assertEquals(FCDTestData.SPEED, data.getSpeed());
    }

    @Test
    public void getTimestamp() throws Exception {
        assertEquals(FCDTestData.TIMESTAMP, data.getTimestamp());
    }

    @Test
    public void isDirty() throws Exception {
        assertFalse(data.isDirty());
    }

}

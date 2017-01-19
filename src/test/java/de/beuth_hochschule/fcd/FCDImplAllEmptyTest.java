/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class FCDImplAllEmptyTest {

    private final FloatingCarData data = new FloatingCarDataImpl("", null, null, null, "");

    @Test
    public void getId() throws Exception {
        assertTrue(data.getId().isEmpty());
    }

    @Test
    public void getLongitude() throws Exception {
        assertNull(data.getLongitude());
    }

    @Test
    public void getLatitude() throws Exception {
        assertNull(data.getLatitude());
    }

    @Test
    public void getSpeed() throws Exception {
        assertNull(data.getSpeed());
    }

    @Test
    public void getTimestamp() throws Exception {
        assertTrue(data.getTimestamp().isEmpty());
    }

    @Test
    public void isDirty() throws Exception {
        assertTrue(data.isDirty());
    }

}

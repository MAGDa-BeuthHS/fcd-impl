/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class ExtFCDImplNullListTest {

    private final ExtendedFloatingCarData data = new ExtendedFloatingCarDataImpl(
            FCDTestData.ID,
            FCDTestData.SPEED,
            FCDTestData.TIMESTAMP,
            FCDTestData.LONGITUDE,
            FCDTestData.LATITUDE,
            null);

    @Test
    public void getExtendedData() throws Exception {
        String extData = data.getExtendedData();
        String expectedJson = "{\"unmapped\":null}";
        assertNotNull(extData);
        assertTrue(extData.length() > 0);
        assertEquals(expectedJson, extData);
    }

    @Test
    public void getUnmappedData() throws Exception {
        assertNull(data.getUnmappedData());
    }

    @Test
    public void isDirty() throws Exception {
        assertFalse(data.isDirty());
    }

}

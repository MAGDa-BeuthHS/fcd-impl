/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class ExtFCDImplEmptyListTest {

    private final ExtendedFloatingCarData data = new ExtendedFloatingCarDataImpl(
            FCDTestData.ID,
            FCDTestData.SPEED,
            FCDTestData.TIMESTAMP,
            FCDTestData.LONGITUDE,
            FCDTestData.LATITUDE,
            new ArrayList<String>());

    @Test
    public void getExtendedData() throws Exception {
        String extData = data.getExtendedData();
        String expectedJson = "{\"unmapped\":[ ]}";
        assertNotNull(extData);
        assertTrue(extData.length() > 0);
        assertEquals(expectedJson, extData);
    }

    @Test
    public void getUnmappedData() throws Exception {
        List<String> unmapped = data.getUnmappedData();
        assertNotNull(unmapped);
        assertTrue(unmapped.size() == 0);
    }

    @Test
    public void isDirty() throws Exception {
        assertFalse(data.isDirty());
    }

}

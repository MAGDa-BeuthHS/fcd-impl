/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class ExtFCDImplNonEmptyListTest {

    private final String UNMAPPED_STR = "Test";
    private final List<String> UNMAPPED_LIST = Arrays.asList(UNMAPPED_STR);
    private final ExtendedFloatingCarData data = new ExtendedFloatingCarDataImpl(
            FCDTestData.ID,
            FCDTestData.SPEED,
            FCDTestData.TIMESTAMP,
            FCDTestData.LONGITUDE,
            FCDTestData.LATITUDE,
            UNMAPPED_LIST);

    @Test
    public void getExtendedData() throws Exception {
        String extData = data.getExtendedData();
        String expectedJson = "{\"unmapped\":[\""+UNMAPPED_STR+"\"]}";
        assertNotNull(extData);
        assertTrue(extData.length() > 0);
        assertEquals(expectedJson, extData);
    }

    @Test
    public void getUnmappedData() throws Exception {
        List<String> unmapped = data.getUnmappedData();
        assertNotNull(unmapped);
        assertTrue(unmapped.size() == 1 );
        assertEquals(UNMAPPED_STR, unmapped.get(0));
    }

    @Test
    public void isDirty() throws Exception {
        assertFalse(data.isDirty());
    }

}

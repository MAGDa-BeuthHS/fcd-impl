/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd.taxi;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class TaxiFCDImplAllEmptyTest {

    private final TaxiFloatingCarData data = new TaxiFloatingCarDataImpl(
            "",
            "",
            "",
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null);

    @Test
    public void getTaxiId() throws Exception {
        assertTrue(data.getTaxiId().isEmpty());
    }

    @Test
    public void getWaitingState() throws Exception {
        assertNull(data.getWaitingState());
    }

    @Test
    public void getBusyState() throws Exception {
        assertNull(data.getBusyState());
    }

    @Test
    public void getDegree() throws Exception {
        assertNull(data.getDegree());
    }

    @Test
    public void getGpsState() throws Exception {
        assertNull(data.getGpsState());
    }

    @Test
    public void isDirty() throws Exception {
        assertTrue(data.isDirty());
    }

}

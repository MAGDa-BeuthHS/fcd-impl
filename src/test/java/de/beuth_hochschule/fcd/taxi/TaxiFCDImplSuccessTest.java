/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd.taxi;

import de.beuth_hochschule.fcd.FCDTestData;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class TaxiFCDImplSuccessTest {

    private final TaxiFloatingCarData data = new TaxiFloatingCarDataImpl(
            FCDTestData.ID,
            FCDTestData.TAXI_ID,
            FCDTestData.TIMESTAMP,
            FCDTestData.LONGITUDE,
            FCDTestData.LATITUDE,
            WaitingState.DRIVING,
            BusyState.FREE,
            FCDTestData.DEGREE,
            FCDTestData.SPEED,
            FCDTestData.GPS,
            null);

    @Test
    public void getTaxiId() throws Exception {
        Assert.assertEquals(FCDTestData.TAXI_ID, data.getTaxiId());
    }

    @Test
    public void getWaitingState() throws Exception {
        Assert.assertEquals(WaitingState.DRIVING, data.getWaitingState());
    }

    @Test
    public void getBusyState() throws Exception {
        Assert.assertEquals(BusyState.FREE, data.getBusyState());
    }

    @Test
    public void getGpsState() throws Exception {
        Assert.assertEquals(FCDTestData.GPS, data.getGpsState());
    }

    @Test
    public void getDegree() throws Exception {
        Assert.assertEquals(FCDTestData.DEGREE, data.getDegree());
    }

    @Test
    public void isDirty() throws Exception {
        assertFalse(data.isDirty());
    }

}

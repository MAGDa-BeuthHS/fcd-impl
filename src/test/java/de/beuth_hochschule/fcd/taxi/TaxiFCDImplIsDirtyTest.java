/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd.taxi;

import de.beuth_hochschule.fcd.FCDTestData;
import de.beuth_hochschule.fcd.FloatingCarData;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class TaxiFCDImplIsDirtyTest {

    @Test
    public void isDirty() throws Exception {
        FloatingCarData data;
        data = new TaxiFloatingCarDataImpl(FCDTestData.ID, "", FCDTestData.TIMESTAMP,
                FCDTestData.LONGITUDE, FCDTestData.LATITUDE, WaitingState.DRIVING, BusyState.FREE, FCDTestData.DEGREE,
                FCDTestData.SPEED, FCDTestData.GPS, null);
        assertTrue(data.isDirty());
        data = new TaxiFloatingCarDataImpl(FCDTestData.ID, FCDTestData.TAXI_ID, FCDTestData.TIMESTAMP,
                FCDTestData.LONGITUDE, FCDTestData.LATITUDE, null, BusyState.FREE, FCDTestData.DEGREE,
                FCDTestData.SPEED, FCDTestData.GPS, null);
        assertTrue(data.isDirty());
        data = new TaxiFloatingCarDataImpl(FCDTestData.ID, FCDTestData.TAXI_ID, FCDTestData.TIMESTAMP,
                FCDTestData.LONGITUDE, FCDTestData.LATITUDE, WaitingState.DRIVING, null, FCDTestData.DEGREE,
                FCDTestData.SPEED, FCDTestData.GPS, null);
        assertTrue(data.isDirty());
        data = new TaxiFloatingCarDataImpl(FCDTestData.ID, FCDTestData.TAXI_ID, FCDTestData.TIMESTAMP,
                FCDTestData.LONGITUDE, FCDTestData.LATITUDE, WaitingState.DRIVING, BusyState.FREE, null,
                FCDTestData.SPEED, FCDTestData.GPS, null);
        assertTrue(data.isDirty());
        data = new TaxiFloatingCarDataImpl(FCDTestData.ID, FCDTestData.TAXI_ID, FCDTestData.TIMESTAMP,
                FCDTestData.LONGITUDE, FCDTestData.LATITUDE, WaitingState.DRIVING, BusyState.FREE, FCDTestData.DEGREE,
                FCDTestData.SPEED, null, null);
        assertTrue(data.isDirty());
    }

}

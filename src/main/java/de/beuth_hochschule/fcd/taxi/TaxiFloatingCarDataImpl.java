/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd.taxi;

import com.google.gson.annotations.Expose;
import de.beuth_hochschule.fcd.ExtendedFloatingCarDataImpl;

import java.util.List;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 10.11.16
 */
public class TaxiFloatingCarDataImpl extends ExtendedFloatingCarDataImpl implements TaxiFloatingCarData {
    @Expose
    private final String taxiId;

    @Expose
    private final WaitingState waitingState;

    @Expose
    private final BusyState busyState;

    @Expose
    private final Integer gpsState;

    @Expose
    private final Double degree;

    public TaxiFloatingCarDataImpl(final String id,
                                   final String taxiId,
                                   final String timestamp,
                                   final Double longitude,
                                   final Double latitude,
                                   final WaitingState waitingState,
                                   final BusyState busyState,
                                   final Double degree,
                                   final Float speed,
                                   final Integer gpsState,
                                   final List<String> unmappedData) {
        super(id, speed, timestamp, longitude, latitude, unmappedData);
        this.taxiId = taxiId;
        this.waitingState = waitingState;
        this.busyState = busyState;
        this.degree = degree;
        this.gpsState = gpsState;

        if(taxiId == null || taxiId.isEmpty()
                || waitingState == null
                || busyState == null
                || degree == null
                || gpsState == null) {
            flagDirty();
        }
    }

    @Override
    public String getTaxiId() {
        return taxiId;
    }

    @Override
    public WaitingState getWaitingState() {
        return waitingState;
    }

    @Override
    public BusyState getBusyState() {
        return busyState;
    }

    @Override
    public Integer getGpsState() {
        return gpsState;
    }

    @Override
    public Double getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "TaxiFloatingCarDataImpl{" +
                "id=" + getId() +
                ", taxiId=" + taxiId +
                ", timestamp=" + getTimestamp() +
                ", longitude=" + getLongitude() +
                ", latitude=" + getLatitude() +
                ", waitingState=" + waitingState +
                ", busyState=" + busyState +
                ", degree=" + degree +
                ", speed=" + getSpeed() +
                ", gpsState=" + gpsState +
                ", extended=" + getExtendedData() +
                '}';
    }
}

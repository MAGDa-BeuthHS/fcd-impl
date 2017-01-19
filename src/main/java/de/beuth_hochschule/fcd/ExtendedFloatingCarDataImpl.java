/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 14.11.16
 */
public class ExtendedFloatingCarDataImpl extends FloatingCarDataImpl implements ExtendedFloatingCarData {

    private static final Gson GSON = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().serializeNulls().create();

    @Expose
    private final List<String> unmapped;

    public ExtendedFloatingCarDataImpl(final String id,
                                       final Float speed,
                                       final String timestamp,
                                       final Double longitude,
                                       final Double latitude,
                                       final List<String> unmapped) {
        super(id, longitude, latitude, speed, timestamp);
        this.unmapped = unmapped;
    }

    @Override
    public String getExtendedData() {
        return GSON.toJson(this);
    }

    @Override
    public List<String> getUnmappedData() {
        return unmapped;
    }

    @Override
    public String toString() {
        return "ExtendedFloatingCarDataImpl{" +
                "id=" + getId() +
                ", speed=" + getSpeed() +
                ", timestamp=" + getTimestamp() +
                ", longitude=" + getLongitude() +
                ", latitude=" + getLatitude() +
                ", extended=" + getExtendedData() +
                '}';
    }
}

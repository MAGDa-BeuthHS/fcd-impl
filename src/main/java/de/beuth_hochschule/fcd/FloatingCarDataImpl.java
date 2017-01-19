/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 14.11.16
 */
public class FloatingCarDataImpl implements FloatingCarData {

    private static final float MAX_SPEED_THRESHOLD = 400;
    private static final double MAX_LONGITUDE = 180;
    private static final double MAX_LATITUDE = 90;

    private final String id;

    private final Double longitude;

    private final Double latitude;

    private final Float speed;

    private final String timestamp;

    private boolean dirty = false;

    public FloatingCarDataImpl(final String id, final Double longitude, final Double latitude, final Float speed,
                               final String timestamp) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.speed = speed;
        this.timestamp = timestamp;

        if(id == null || id.isEmpty()
                || longitude == null || longitude > MAX_LONGITUDE || longitude < (-1 * MAX_LONGITUDE)
                || latitude == null || latitude > MAX_LATITUDE || latitude < (-1 * MAX_LATITUDE)
                || speed == null || speed > MAX_SPEED_THRESHOLD || speed <= 0f
                || timestamp == null || timestamp.isEmpty()) {
            flagDirty();
        }
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Double getLongitude() {
        return longitude;
    }

    @Override
    public Double getLatitude() {
        return latitude;
    }

    @Override
    public Float getSpeed() {
        return speed;
    }

    @Override
    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean isDirty() {
        return dirty;
    }

    protected void flagDirty() {
        dirty = true;
    }

    @Override
    public String toString() {
        return "FloatingCarDataImpl{" +
                "id=" + id +
                ", speed=" + speed +
                ", timestamp=" + timestamp +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

}

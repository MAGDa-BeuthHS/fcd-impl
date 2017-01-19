/*
 * Copyright (c) 2016. [j]karef GmbH
 */
package de.beuth_hochschule.fcd;

/**
 * @author Rene Jablonski <rene@vnull.de>
 * @date 16.12.16
 */
public class FCDTestData {

    /* floating car data */
    public static final String ID = "123456";
    public static final Float MAX_SPEED = 401.2f;
    public static final Float SPEED = 233.2f;
    public static final Float MIN_SPEED = -0.2f;
    public static final Double LONGITUDE = 54.3759d;
    public static final Double LATITUDE = 8.95359d;
    public static final String TIMESTAMP = "2016-12-24 18:00";

    /* taxi fcd */
    public static final String TAXI_ID = "093752";
    public static final Double DEGREE = 45.67d;
    public static final Integer GPS = 0;

    private FCDTestData() {}
}

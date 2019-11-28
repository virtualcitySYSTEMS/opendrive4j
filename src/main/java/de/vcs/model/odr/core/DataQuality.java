package de.vcs.model.odr.core;

import de.vcs.model.odr.ODRObject;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class DataQuality extends ODRObject {

    private Error error;
    private RawData rawData;

    public DataQuality() {
    }

    public DataQuality(Error error, RawData rawData) {
        this.error = error;
        this.rawData = rawData;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public RawData getRawData() {
        return rawData;
    }

    public void setRawData(RawData rawData) {
        this.rawData = rawData;
    }
}
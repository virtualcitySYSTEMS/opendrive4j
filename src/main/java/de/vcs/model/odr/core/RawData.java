package de.vcs.model.odr.core;

import de.vcs.model.odr.ODRObject;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:16:08
 */
public class RawData extends ODRObject {

    private String date;
    private String source;
    private String sourceComment;
    private String postProcessing;
    private String postProcessingComment;

    public RawData() {
    }

    public RawData(String date, String source, String sourceComment, String postProcessing,
            String postProcessingComment) {
        this.date = date;
        this.source = source;
        this.sourceComment = sourceComment;
        this.postProcessing = postProcessing;
        this.postProcessingComment = postProcessingComment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceComment() {
        return sourceComment;
    }

    public void setSourceComment(String sourceComment) {
        this.sourceComment = sourceComment;
    }

    public String getPostProcessing() {
        return postProcessing;
    }

    public void setPostProcessing(String postProcessing) {
        this.postProcessing = postProcessing;
    }

    public String getPostProcessingComment() {
        return postProcessingComment;
    }

    public void setPostProcessingComment(String postProcessingComment) {
        this.postProcessingComment = postProcessingComment;
    }
}
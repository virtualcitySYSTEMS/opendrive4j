package de.vcs.model.odr.geometry;

import de.vcs.model.odr.ODRObject;
import org.xmlobjects.gml.model.geometry.AbstractGeometry;

/**
 * @author rruhdorfer
 * @version 1.0
 * @created 20-Nov-2019 15:17:53
 */
public class ODRGeometry extends ODRObject {

    private AbstractParametricGeometry abstractParametricGeometry;
    private AbstractGeometry gmlGeometry;

    public ODRGeometry() {
    }

    public ODRGeometry(AbstractParametricGeometry abstractParametricGeometry,
            AbstractGeometry gmlGeometry) {
        this.abstractParametricGeometry = abstractParametricGeometry;
        this.gmlGeometry = gmlGeometry;
    }

    public AbstractParametricGeometry getAbstractParametricGeometry() {
        return abstractParametricGeometry;
    }

    public void setAbstractParametricGeometry(AbstractParametricGeometry abstractParametricGeometry) {
        this.abstractParametricGeometry = abstractParametricGeometry;
    }

    public AbstractGeometry getGmlGeometry() {
        return gmlGeometry;
    }

    public void setGmlGeometry(AbstractGeometry gmlGeometry) {
        this.gmlGeometry = gmlGeometry;
    }
}
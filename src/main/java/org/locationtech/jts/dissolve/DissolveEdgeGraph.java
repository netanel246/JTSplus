package org.locationtech.jts.dissolve;

import org.locationtech.jts.edgegraph.EdgeGraph;
import org.locationtech.jts.edgegraph.HalfEdge;
import org.locationtech.jts.geom.Coordinate;


/**
 * A graph containing {@link DissolveHalfEdge}s.
 * 
 * @author Martin Davis
 *
 */
class DissolveEdgeGraph extends EdgeGraph
{
  protected HalfEdge createEdge(Coordinate p0)
  {
    return new DissolveHalfEdge(p0);
  }
  

}

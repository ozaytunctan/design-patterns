package org.javaturk.dp.ch05.composite.graphic;

import java.util.Collection;

public interface CompositeGraphic{	
	
	public void addGraphic(Graphic graphic);
	
	public void removeGraphic(Graphic graphic);
	
	public Collection<Graphic> getGraphics();
	
	public void listGraphic();
}

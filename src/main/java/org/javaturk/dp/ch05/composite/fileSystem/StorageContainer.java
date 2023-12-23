
package org.javaturk.dp.ch05.composite.fileSystem;

import org.javaturk.dp.ch05.composite.fileSystem.iterator.DirectoryIterator;

import java.util.List;

public interface StorageContainer {
	
	public void add(Storage element);
	
	public void delete(Storage element);
	
	public void list();
	
	public List<Storage> elements();
	
	public DirectoryIterator iterator();

}

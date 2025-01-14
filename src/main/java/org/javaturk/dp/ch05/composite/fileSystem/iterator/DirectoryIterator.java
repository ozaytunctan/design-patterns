
package org.javaturk.dp.ch05.composite.fileSystem.iterator;

import org.javaturk.dp.ch05.composite.fileSystem.Directory;
import org.javaturk.dp.ch05.composite.fileSystem.Storage;

import java.util.Iterator;
import java.util.List;

public class DirectoryIterator implements StorageIterator {
	private Directory dir;
	private List<Storage> elements;
	private Iterator<Storage> iterator;
	
	public DirectoryIterator(Directory dir){
		this.dir = dir;
		elements = dir.elements();
		iterator = elements.iterator();
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Storage next() {
		return iterator.next();
	}
}

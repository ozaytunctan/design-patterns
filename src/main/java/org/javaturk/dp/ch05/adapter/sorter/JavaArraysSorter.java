
package org.javaturk.dp.ch05.adapter.sorter;

import org.javaturk.dp.ch05.adapter.sorter.contract.JavaArraysSorterI;

import java.util.Arrays;

public class JavaArraysSorter implements JavaArraysSorterI {
	
	public JavaArraysSorter(){
		System.out.println("\n*** JavaArraysSorter ***");
	}

	@Override
	public void sort(int[] array) {
		Arrays.sort(array);
	}
}

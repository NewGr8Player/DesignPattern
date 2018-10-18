package com.xavier.pattern.behavioral.b4;

import com.xavier.MainTestCase;
import com.xavier.pattern.behavioral.b4.abs.Iterator;
import com.xavier.pattern.behavioral.b4.impl.NameRepository;
import org.junit.Test;

public class IteratorPatternTest extends MainTestCase {

	@Test
	public void test() {
		NameRepository namesRepository = new NameRepository();
		Iterator iter = namesRepository.getIterator();
		while (iter.hasNext()) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}

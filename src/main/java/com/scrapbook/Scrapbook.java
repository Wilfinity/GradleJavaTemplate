package com.scrapbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scrapbook {

	private static Logger logger = LoggerFactory.getLogger(Scrapbook.class);

	public static void main(String[] args) {
		logger.debug(">> main()");

		logger.info("Hello World!");

		logger.debug("<< main()");
	}
}
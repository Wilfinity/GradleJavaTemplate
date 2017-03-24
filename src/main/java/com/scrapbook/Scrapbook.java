package com.scrapbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scrapbook {

	private static final Logger logger = LoggerFactory.getLogger(Scrapbook.class);

	private String message;

	public static void main(String[] args) {
		logger.debug(">> main()");

		Scrapbook scrapbook = new Scrapbook();
		scrapbook.setMessage("Hello World");

		logger.info("{}", scrapbook);

		logger.debug("<< main()");
	}

	public Scrapbook() {
	    logger.info("Scrapbook()");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Scrapbook[message='" + message + "']";
    }

}

package com.scrapbook;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class ScrapbookTest {

    public void testToString() {
        Scrapbook scrapbook = new Scrapbook();
        scrapbook.setMessage("test");
        assertEquals(scrapbook.toString(), "Scrapbook[message='test']");
    }

}

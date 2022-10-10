package com.nuna.testbase;

import com.nuna.pages.MainPage;

public class PageInitializer extends BaseClass{
	
	public static MainPage mainPage;
	
	public static void initialize() {
		// Initialize pages
		mainPage = new MainPage();
		
	}

}

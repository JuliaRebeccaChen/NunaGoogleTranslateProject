package com.nuna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nuna.testbase.BaseClass;

public class MainPage {

	@FindBy(id = "sdgBod")
	public WebElement googleTranslateImg;

	@FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[2]/button/span")
	public WebElement sourceLanguageDropdown;

	@FindBy(xpath = "//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[5]/button/div[3]")
	public WebElement resultLanguageDropdown;

	@FindBy(css = "textarea.er8xn")
	public WebElement sourceTextArea;

	@FindBy(css = "div.QFw9Te")
	public WebElement sourceText;

	@FindBy(css = "c-wiz.P6w8m")
	public WebElement resultTextArea;

	@FindBy(css = "div.J0lOec")
	public WebElement resultText;

	@FindBy(xpath = "//div[@id='ow25']/div/span/button/div[3]")
	public WebElement swapBtn;

	@FindBy(css = "div.DVHrxd")
	public WebElement clearSourceTextBtn;

	@FindBy(xpath = "//span[@class='ita-kd-img ita-kd-arrow ita-kd-icon-span']")
	public WebElement selectInputToolDropdown;

	public MainPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}

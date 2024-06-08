package ru.klimov.java.course.work_with_file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test {
    WebDriver webDriver = new ChromeDriver();

    @FindBy(xpath = "//div")
    WebElement testElement;

    public Test() {
        PageFactory.initElements(webDriver, this);
    }
}

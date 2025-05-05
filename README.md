# intern
*This is assignment video link* 
https://drive.google.com/file/d/1nfPCoFp2Ubw-qRY5j5QNy0mebstR63VN/view?usp=sharing

Selenium Automation Project – Intervue.io Navigation & Login
Project Overview
This project is a Selenium-based Java automation script that performs the following tasks on the Intervue.io website:

Navigates through top navigation menu items via mouse hover

Clicks the Login button and performs login

Interacts with the search bar

Navigates user profile dropdown menu

Logs out and closes the browser

Prerequisites
Before executing the script, ensure you have the following installed:

Java JDK – Version 8 or above
Download: https://www.oracle.com/java/technologies/javase-downloads.html



Eclipse IDE or IntelliJ IDEA

Google Chrome Browser

ChromeDriver – Compatible with your Chrome version
Download: https://sites.google.com/a/chromium.org/chromedriver/downloads
(Ensure it's added to your system PATH or specify path in your code)

Selenium Java Library – Version 4.x


selenium-java

Project Structure
CopyEdit
seleniumProject/
└── ntervueTest1.java
Setup Instructions
Clone or Create Project
Create a new Java project in your IDE and add the file ntervueTest1.java under the seleniumProject package.

Add Selenium Dependencies

Option 1: Using Maven
Add the following to your pom.xml:

xml
CopyEdit
<dependencies>
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.15.0</version>
  </dependency>
</dependencies>
Option 2: Manual JARs
Download and add Selenium JARs to your project’s build path.

Set ChromeDriver Path (if not in PATH)
Example:

java
CopyEdit
System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
Add this before WebDriver driver = new ChromeDriver(); in your code if needed.

Execution Instructions
Run the Java Program
In Eclipse or IntelliJ:

Right-click the file > Run As > Java Application

Or via terminal:

bash
CopyEdit
javac seleniumProject/ntervueTest1.java
java seleniumProject.ntervueTest1
Expected Outcome

Browser opens and navigates to Intervue.io

Script performs menu hovers

Logs in with provided credentials

Searches for a query

Navigates through user menu

Logs out and closes the browser

Note
Ensure the credentials and XPaths are valid. The website layout or authentication flow may change over time.

Avoid using hardcoded credentials in production.

Consider replacing Thread.sleep() with proper WebDriverWait for better reliability.

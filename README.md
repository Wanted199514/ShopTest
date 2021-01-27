Tools installation:

chromedriver;
Google Chrome 87.0.4280.141 version installed;
JDK 11.0.1;
Intellij IDEA 'Community' version;
Selenium Java » 3.141.59;
Git
TestNG
Tools setup:

pom.xml - the list of all libraries (dependencies) that are used in the project is stored here. Each library is identified as well as the project itself - a groupId, artifactId, version (GAV) troika.
.gitIgnore is used to specify in it files and folders that must be hidden from the git version control system.
How to run the current test script:
Choose 'RoomTest.java'
Click on menu bar 'Run'.
Click in drop down menu 'Run 'MainTest''.
To run tests in Chrome or newer you need to have a chromedriver. How to install 'chromedriver':
Go to https://chromedriver.storage.googleapis.com/index.html?path=2.44/;
Download 'chromedriver_win32.zip';
Copy archive content;
Paste archive content in C:\Windows\System32
Selenium is a tool for automating web browser actions. How to install 'Selenium Java » 3.141.59':
Go to https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59;
Copy Maven text;
Open pom.xml in Intellij IDEA;
In pom.xml before '</project>' write '<dependencies>';
Paste Maven text after '<dependencies>';
Write after Maven text '</dependencies>'.
Git is a version-control system for tracking changes in computer files and coordinating work on those files among multiple people. It is primarily used for source-code management in software development. How to install 'Git':
Go to https://git-scm.com/downloads;
Click 'Download 2.19.1 for Windows';
Download 'Git-2.19.1-64-bit.exe';
Run 'Git-2.19.1-64-bit.exe';
Always click 'next';
Click 'install'.
The Java Development Kit (JDK) is an implementation of either one of the Java Platform, Standard Edition, Java Platform, Enterprise Edition, or Java Platform, Micro Edition platforms released by Oracle Corporation in the form of a binary product aimed at Java developers on Solaris, Linux, macOS or Windows. How to install 'JDK 10.0.2':
Go to http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html;
Click 'Accept License Agreement';
Click 'jdk-11.0.1_windows-x64_bin.exe';
Download 'jdk-11.0.1_windows-x64_bin.exe';
Before download click 'jdk-10.0.2_windows-x64_bin.exe'
Install 'jdk-11.0.1_windows-x64_bin.exe'.
IntelliJ IDEA is a Java integrated development environment (IDE) for developing computer software. How to install 'IntelliJ IDEA':
Go to https://www.jetbrains.com/idea/download/#section=windows;
Click 'Download' for Community version;
Download 'ideaIC-2020.1.2.exe';
Run 'ideaIC-2020.1.2.exe';
Install 'IntelliJ IDEA'.
Google chrome (or simply Chrome) is a freeware web browser developed by Google LLC. How to install 'Google Chrome':
Go to https://www.google.com/intl/en_ALL/chrome/;
Click 'Download Chrome';
Download 'ChromeSetup.exe';
Run 'ChromeSetup.exe';
Install 'Google Chrome'.
TestNG - a testing framework for the JVM. How to install 'TestNG':
Go to https://mvnrepository.com/artifact/org.testng/testng/7.1.0;
Copy Maven text;
Open pom.xml in Intellij IDEA;
In pom.xml before '</dependencies>' paste Maven text.

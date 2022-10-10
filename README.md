# NunaGoogleTranslateProject

Google Translate function test

---

## Requirements

You will need to download Maven, Cucumber, Java, and dependencies mentioned in the POM.xml file.

### Maven

- #### Install Maven with Homebrew

```bash
  $ brew install maven
```

### POM.xml file

  <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.nuna</groupId>
  <artifactId>GoogleTraslateProject</artifactId>
  <version>0.0.1-SNAPSHOT</version>

	<properties>
		<maven.compiler.source>9</maven.compiler.source>
		<maven.compiler.target>9</maven.compiler.target>
	</properties>

	<dependencies>

		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.2.2</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.2.2</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.11.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.2.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>7.3.4</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>7.3.4</version>
			<scope>test</scope>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
		<dependency>
			<groupId>io.rest-assured</groupId>
			<artifactId>rest-assured</artifactId>
			<version>5.1.1</version>
			<scope>test</scope>
		</dependency>

	</dependencies>

	<build>
		<plugins>
			<!--		<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
			</plugin>	 		-->

			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M1</version>
				<configuration>
					<includes>**/*TestRunner.java</includes>
					<testFailureIgnore>true</testFailureIgnore>
				</configuration>
			</plugin>

			<plugin>
				<groupId>net.masterthought</groupId>
				<artifactId>maven-cucumber-reporting</artifactId>
				<version>5.7.0</version>
				<executions>
					<execution>
						<id>execution</id>
						<phase>test</phase>
						<goals>
							<goal>generate</goal>
						</goals>
						<configuration>
							<projectName>CucumberFrameworkCanerOz</projectName>
							<!-- output directory for the generated report -->
							<outputDirectory>${project.build.directory}</outputDirectory>
							<!-- optional, defaults to outputDirectory if not specified -->
							<inputDirectory>${project.build.directory}</inputDirectory>
							<jsonFiles>
								<!-- supports wildcard or name pattern -->
								<param>**/*.json</param>
							</jsonFiles>
						</configuration>
					</execution>
				</executions>
			</plugin>

		</plugins>
	</build>

</project>

---

## Run Test
- #### 1st way: run in IDE
- #### 2ne way: run with command line
```bash
  $ mvn clean
```
```bash
  $ mvn test
```

---

## Documentation

### Test Plan 
```bash
File path: GoogleTranslateProject/src/test/resources/testdata/TestPlan
```

![image](https://user-images.githubusercontent.com/100796463/194802997-34cb9060-97ab-4e50-aafb-cf1364d4d742.png)

### Test Case
```bash
File path: GoogleTranslateProject/src/test/resources/testdata/GoogleTranslate_TestCase.xlsx
```

### Data Provider
```bash
File path: GoogleTranslateProject/src/test/resources/testdata/DataProvider.xlsx
```

### Test Reports
```bash
File path: GoogleTranslateProject/target/cucumber-html-reports
```

### Test Reports
```bash
File path: GoogleTranslateProject/screenshot
```
![image](https://user-images.githubusercontent.com/100796463/194817919-93dbc44a-7803-4165-9cca-24987c15425c.png)

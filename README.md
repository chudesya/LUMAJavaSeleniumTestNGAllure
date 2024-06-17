# LUMAJavaSeleniumTestNGAllure
[![Build Java with Maven](https://github.com/chudesya/LUMAJavaSeleniumTestNGAllure/actions/workflows/build.yml/badge.svg)](https://github.com/chudesya/LUMAJavaSeleniumTestNGAllure/actions/workflows/build.yml)
<!DOCTYPE html>
<html lang="en">
<body>
<h2>Overview</h2>
<p>LUMAJavaSeleniumTestNGAllure is a project that integrates Selenium WebDriver with TestNG for automated testing, enhanced with Allure reporting. This setup allows for efficient test case management and comprehensive reporting, making it ideal for maintaining high-quality web applications.</p>

<h2>Features</h2>
<ul>
    <li><strong>Selenium WebDriver</strong>: For browser automation.</li>
    <li><strong>TestNG</strong>: For organizing and running test cases.</li>
    <li><strong>Allure</strong>: For generating detailed and visually appealing test reports.</li>
</ul>

<h2>Prerequisites</h2>
<ul>
    <li><strong>Java</strong>: Ensure you have JDK 1.8 or higher installed.</li>
    <li><strong>Maven</strong>: For dependency management and project building.</li>
    <li><strong>IDE</strong>: IntelliJ IDEA, Eclipse, or any other Java-compatible IDE.</li>
</ul>

<h2>Installation</h2>
<ol>
    <li>Clone the repository:
        <pre><code>git clone https://github.com/chudesya/LUMAJavaSeleniumTestNGAllure.git
cd LUMAJavaSeleniumTestNGAllure</code></pre>
    </li>
    <li>Install dependencies:
        <pre><code>mvn clean install</code></pre>
    </li>
</ol>

<h2>Running Tests</h2>
<p>Using TestNG:</p>
<pre><code>mvn test</code></pre>
<p>Using specific TestNG suite:</p>
<pre><code>mvn test -DsuiteXmlFile=testng.xml</code></pre>

<h2>Reporting</h2>
<p>Allure reports are generated in the <code>target/allure-results</code> directory. To generate and view the report, run:</p>
<pre><code>mvn allure:serve</code></pre>

<h2>Project Structure</h2>
<pre><code>LUMAJavaSeleniumTestNGAllure/
├── src/
│   ├── main/
│   │   └── java/
|   |         └── com/
|   |           └── lumatest/
|   |               └── model/
│   └── test/
│   |   └── java/
|   |       └── com/
|   |           └── lumatest/
|   |               ├── base/
|   |               ├── data/  
|   |               ├── test/
|   |               └── utils/
├── pom.xml
├── xmlSuits
└── README.md
</code></pre>
<ul>
    <li><strong>src/main/java</strong>: Contains application logic (if any).</li>
    <li><strong>src/test/java</strong>: Contains test cases.</li>
    <li><strong>pom.xml</strong>: Maven configuration file.</li>
    <li><strong>testng.xml</strong>: TestNG suite configuration file.</li>
</ul>

<h2>Contributing</h2>
<p>Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure your code follows the project's coding standards and includes appropriate tests.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License.</p>

<h2>Contact</h2>
<p>For any questions or feedback, please open an issue on the <a href="https://github.com/chudesya/LUMAJavaSeleniumTestNGAllure">GitHub repository</a>.</p>

</body>
</html>

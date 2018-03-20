1) create a maven project: define the maven archetype and prodie required paramters
mvn archetype:generate 
-DgroupId=com.packgeStyle.name 
-DartifactId=yourProjectName
-DarchetypeArtifactId=maven-archetype-webapp 
-DinteractiveMode=false

mvn archetype:generate -DgroupId=com.springSecurityTest -DartifactId=SpringSecurityTest
-DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

press ENTER

2) convert your project to eclipse web application
 cd projectDirectory
	mvn eclipse:eclipse -Dwtpversion-3.0
	
	
if you do not see the webapp folder and other webapp folder structure 
go to configure - faceted project - choose Dymanic web module 3.0

Please remember that adding “-Dwtpversion=2.0” is necessary,
otherwise using only “mvn eclipse:eclipse” will convert it to only normal java application, 
and you will not be able to run it as other eclipse web applications.

3) import the application/project into Eclipse as existing maven project

4) start adding your dependencies on pom.xml file
5) run mvn clean install 

6) more dependencies to add? run mvn compile after adding the dependencies

call me if you have any question or get stuck.



NOTE: ERRORS
 The desired archetype does not exist (org.apache.maven.archetypes:maven-archetpye-webapp:1.0) -
 
 -- you misspelled: maven-archetpye-webapp   <- maven-archetype-webapp 
 
 Confirm properties configuration:
groupId: com.springSecurityTest
artifactId: SpringSecurityTest
version: 1.0-SNAPSHOT
package: com.springSecurityTest
 Y: : y
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Old (1.x) Archetype: maven-archetype-quickstart:1.1
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: basedir, Value: C:\Users\mzaman\Documents\SpringSecurity
[INFO] Parameter: package, Value: com.springSecurityTest
[INFO] Parameter: groupId, Value: com.springSecurityTest
[INFO] Parameter: artifactId, Value: SpringSecurityTest
[INFO] Parameter: packageName, Value: com.springSecurityTest
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] project created from Old (1.x) Archetype in dir: C:\Users\mzaman\Documents\SpringSecurity\SpringSecurityTest
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 01:57 min
[INFO] Finished at: 2018-03-20T13:50:55-04:00
[INFO] Final Memory: 15M/196M



ERRORS:
1) Description	Resource	Path	Location	Type
Java compiler level does not match the version of the installed Java project facet.	SpringSecurityTest	
	add maven.plugin or maven.source and maven.target version in the pom's properties tag
	
	option1:
			add this to your pom'x properties element
		//<properties>
			<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
			<maven.compiler.source>1.8</maven.compiler.source>
			<maven.compiler.target>1.8</maven.compiler.target>
			<maven.compiler.failOnError>false</maven.compiler.failOnError> 
		//</properties>
		
	Option2:
		<build>
			<plugins>
				<plugin>
					<artifactId>maven-compiler-plugin</artifactId>
					<configuration>
						<source>1.8</source>
						<target>1.8</target>
					</configuration>
				</plugin>
			</plugins>
		</build> 
	
	

2) java.lang.ClassNotFoundException: org.springframework.web.context.ContextLoaderListener
	The Servlet container is not able to load the spring's ContextLoaderListener class. why? becasue it is not on the servers runtime classpath
	to solve this issue: do the following
	Open the project's properties (e.g., right-click on the project's name in the project explorer and select "Properties").
	1) Select "Deployment Assembly".
	2) Click the "Add..." button on the right margin.
	3) Select "Java Build Path Entries" from the menu of Directive Type and click "Next".
	4) Select "Maven Dependencies" from the Java Build Path Entries menu and click "Finish".
	5) You should see "Maven Dependencies" added to the Web Deployment Assembly definition.

	
3)ava.lang.NoSuchMethodException: org.apache.catalina.deploy.WebXml addServlet
	 add the follwing dependecy 

	<dependency>
		  <groupId>org.apache.tomcat</groupId>
		  <artifactId>tomcat-catalina</artifactId>
		  <version>7.0.47</version>
		  <scope>provided</scope>
	</dependency>
	
	The container ( here tomcat ) itself provides some dependencies ( like tomcat-catalina jar ) 
	when you deploy your app. So you don't need to include them in your application. 
	But the jars are needed for compilation. This is achieved by setting the scope as 'provided'
	
4) if you get springs. schema.tx issue <- web.xml is complaining about not finding the location for springs/schema/tx 
	all the schema and their namespae proerties are retrive from the jar file that maven installs
add the following in the dependecny
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-tx</artifactId>
    <version>4.1.0.RELEASE</version>
</dependency>
	
	

 
 
 


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
	mvn eclipse:eclipse -Dwtpversion-2.0
	
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

 
 
 


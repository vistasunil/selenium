node {
	stage ('SCM checkout'){
		git "https://github.com/vistasunil/selenium.git"
		}
	stage ('Build'){
		bat "xcopy /E /Y src SeleniumTest"
		bat "copy pom.xml SeleniumTest"
		bat "mvn clean install"
		bat "java -jar SeleniumTest-0.0.1-SNAPSHOT.jar"
	       
	}
}

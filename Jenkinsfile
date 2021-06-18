node {
	stage ('SCM checkout'){
		git "https://github.com/vistasunil/selenium.git"
		}
	stage ('Build'){
    	dir("SeleniumTest") {
	   bat "mvn clean install"
       }
       	dir("SeleniumTest/target") {
	   bat "java -jar SeleniumTest-0.0.1-SNAPSHOT.jar"
       }
		}
}

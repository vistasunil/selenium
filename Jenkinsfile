node {
	stage ('SCM checkout'){
		git "https://github.com/vistasunil/selenium.git"
		}
	stage ('Build'){
    	dir("SeleniumTest") {
	   sh "mvn clean install"
       }
       	dir("SeleniumTest/target") {
	   sh "java -jar SeleniumTest-0.0.1-SNAPSHOT.jar"
       }
		}
}

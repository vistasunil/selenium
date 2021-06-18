node {
	stage ('SCM checkout'){
		git "https://github.com/vistasunil/selenium.git"
		}
	stage ('Build'){		
		bat "mvn clean install"
		dir("target") {
		   bat "java -jar SeleniumTest-0.0.1-SNAPSHOT.jar"
	       }	       
	}
}

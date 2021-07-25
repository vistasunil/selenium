node ('slave2') {
	stage ('SCM checkout'){
		git "https://github.com/vistasunil/selenium.git"
		}
	stage ('Build'){		
		sh "mvn clean install"
		dir("target") {
		   sh "java -jar SeleniumTest-0.0.1-SNAPSHOT.jar"
	       }	       
	}
}

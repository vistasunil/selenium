node ('slave1') {
	stage ('SCM checkout'){
		git "https://github.com/vistasunil/selenium.git"
		}
	stage ('Build'){		
		sh "mvn clean install"
		dir("target") {
			sh "whoami"
		   sh "java -jar SeleniumTest-0.0.1-SNAPSHOT.jar"
	       }	       
	}
}

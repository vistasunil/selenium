node ('slave2') {
	stage ('SCM checkout'){
		git "https://github.com/vistasunil/selenium.git"
		}
	stage ('Test using python code'){
		sh "sudo apt install python3-pip -y"
		sh "pip3 install selenium"
		sh "python3 sel.py"
	}		
	stage ('Build'){
		sh "mvn clean install"
		dir("target") {
		   sh "java -jar SeleniumTest-0.0.1-SNAPSHOT.jar"
	       }	       
	}
}

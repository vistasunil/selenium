node {
	stage ('SCM checkout'){
		C:\Users\sunil.s.kumar\AppData\Local\GitHubDesktop\app-2.6.6\resources\app\git\cmd\git "https://github.com/vistasunil/selenium"
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

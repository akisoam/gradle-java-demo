pipeline {
	agent { label 'ubuntu' }   
    stages {
        stage('Build') {
            steps {
		    task wrapper(type: Wrapper) {
                            gradleVersion = '4.1'
}
				sh 'gradle clean build'
            }
		}
		
	}
}

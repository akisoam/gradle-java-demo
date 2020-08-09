pipeline {
    agent { label 'ubuntu' } 
    stages {
        stage('build') {
            steps {
               sh 'gradle clean build'
            }
        }
    }
}

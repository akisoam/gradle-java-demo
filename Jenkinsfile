pipeline {
    agent { label 'ubuntu' } 
    stages {
        stage('build') {
            steps {
               sh  'echo $GRADLE_HOME'
               sh 'gradle clean build'
            }
        }
    }
}

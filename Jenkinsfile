pipeline {
    agent { label 'ubuntu' } 
    stages {
        stage('build') {
            steps {
                echo $GRADLE_HOME
               sh 'gradle clean build'
            }
        }
    }
}

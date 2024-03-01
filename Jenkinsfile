pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            	git branch: 'main', url: 'https://github.com/sonam-niit/SPBootDockerJenkins.git'
            	sh 'mvn clean'
                echo 'Maven Buid Successful'
            }
        }
        stage('Package') {
            steps {
            	sh 'mvn package'
                echo 'Application Deployed Successfully'
            }
        }
    }
}
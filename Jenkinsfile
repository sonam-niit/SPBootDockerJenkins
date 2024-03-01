pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            	git 'https://github.com/sonam-niit/SPBootDockerJenkins.git'
            	sh './mvnw compile'
                echo 'Maven Buid Successful'
            }
        }
        stage('Test') {
            steps {
            	sh './mvnw test'
                echo 'TestCases Executed Successfully'
            }
        }
        stage('Package') {
            steps {
            	sh './mvnw package'
                echo 'Application Deployed Successfully'
            }
        }
    }
}
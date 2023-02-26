pipeline {
    agent any

    stages {
        stage('Clone repository') {
            steps {
                git 'https://github.com/your-repository.git'
            }
        }
        stage('Build JAR') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Execute docker-compose.yml') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }
}

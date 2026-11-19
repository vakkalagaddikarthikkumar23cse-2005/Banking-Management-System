
pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Getting Banking Management System source code'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the Banking Management System'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing the Banking Management System'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the application'
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application'
                sh 'mkdir -p deploy'
                sh 'cp target/*.jar deploy/'
            }
        }
    }

    post {
        success {
            echo 'Banking Management System CI/CD Pipeline Successful!'
        }

        failure {
            echo 'CI/CD Pipeline Failed!'
        }
    }
}

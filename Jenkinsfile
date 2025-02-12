pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Nayana192003/jenkins-method-2.git'
            }
        }
        stage('Clean') {
            steps {
                script {
                    bat 'mvn clean'
                }
            }
        }
        stage('Compile') {
            steps {
                script {
                    bat 'mvn compile'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    bat 'mvn test'
                }
            }
        }
    }
}

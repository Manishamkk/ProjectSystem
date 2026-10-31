
pipeline {

    agent any

    // Connect Jenkins Maven installation
    tools {
        maven 'maven'
    }

    stages {

        stage('Check Maven') {
            steps {
                echo 'Checking Maven installation'
                sh 'mvn -version'
            }
        }

        stage('Checkout') {
            steps {
                echo 'Checking source code'
                git branch: 'main',
                    url: 'https://github.com/Manishamkk/ProjectSystem.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building application'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running JUnit tests'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating JAR file'
                sh 'mvn package -DskipTests'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESSFUL!'
        }

        failure {
            echo 'BUILD FAILED!'
        }
    }
}

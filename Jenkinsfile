
pipeline {

    agent any

    tools {
        maven 'maven'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub'

                git branch: 'main',
                    url: 'https://github.com/Manishamkk/ProjectSystem.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building Spring Boot application'

                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running test cases'

                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging Spring Boot application'

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

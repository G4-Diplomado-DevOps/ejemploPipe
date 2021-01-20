pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "./mvnw clean"
            }
        }

        stage('test') {
            steps {
                sh "./mvnw compile"
            }
        }

        stage('test2') {
            steps {
                sh './mvnw test'
            }
        }
    }
}

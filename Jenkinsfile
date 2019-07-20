pipeline {
    agent any

    stages {
        stage('TestScript1') {
            when {
                expression { script == 'TestScript1' }
            }
            steps {
                sh './gradlew performance-test-script:runTestScript1'
            }
        }

        stage('TestScript2') {
            when {
                expression { script == 'TestScript2' }
            }
            steps {
                sh './gradlew performance-test-script:runTestScript2'
            }
        }
    }
}
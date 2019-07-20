pipeline {
    agent any

    stages {
        stage('TestScript1') {
            when {
                expression { myScript == 'TestScript1' }
            }
            steps {
                sh './gradlew performance-test-script:runTestScript1'
            }
        }

        stage('TestScript2') {
            when {
                expression { myScript == 'TestScript2' }
            }
            steps {
                sh './gradlew performance-test-script:runTestScript2'
            }
        }
    }
}
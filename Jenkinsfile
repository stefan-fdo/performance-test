pipeline {
    agent any

    parameters {
        choice(choices: ['TestScript1', 'TestScript2'], description: 'Script to Run', name: 'script')
        string(name: 'db-url', defaultValue: "postgresql-db-url", description: 'Database URL')
        string(name: 'db-schema', defaultValue: "postgresql-db-schema", description: 'Database Schema')
    }

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
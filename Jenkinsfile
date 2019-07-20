pipeline {
    agent any

    parameters {
        choice(choices: ['--Select Script--','TestScript1', 'TestScript2'], description: 'Script to Run', name: 'script')
        string(name: 'db-url', defaultValue: "postgresql-db-url", description: 'Database URL')
        string(name: 'db-schema', defaultValue: "postgresql-db-schema", description: 'Database Schema')
        password(name: 'db-password', defaultValue: '', description: 'Database Password')
    }

    stages {
        stage('TestScript1') {
            when {
                expression { params.script == 'TestScript1' }
            }
            steps {
                sh './gradlew performance-test-script:runTestScript1'
            }
        }

        stage('TestScript2') {
            when {
                expression { params.script == 'TestScript2' }
            }
            steps {
                sh './gradlew performance-test-script:runTestScript2'
            }
        }
    }
}
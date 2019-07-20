pipeline {
    agent any

    stages {
        stage ('Input') {
            steps {
                script {
                    myStage = input message: 'Select the script to run', parameters: [choice(choices: 'TestScript1\nTestScript2', description: 'Script', name: 'Script')]
                }
            }
        }

        stage('TestScript1') {
            when {
                expression { myScript == 'TestScript1' }
            }
            steps {
                sh './gradlew performance-test-script:runTestScript'
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
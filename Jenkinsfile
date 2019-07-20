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
                expression { myStage == 'TestScript1' }
            }
            steps {
                sh './gradlew performance-test-script:runTestScript'
            }
        }

        stage('TestScript2') {
            when {
                expression { myStage == 'TestScript2' }
            }
            steps {
                sh './gradlew performance-test-script:runTestScript2'
            }
        }
    }
}
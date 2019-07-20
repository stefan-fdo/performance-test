pipeline {
    agent none

    stages {
        stage ('Input') {
            agent none
            steps {
                script {
                    myStage = input message: 'Select the script to run', parameters: [choice(choices: 'TestScript1\nTestScript2', description: 'Script', name: 'Script')]
                }
                echo myStage
            }
        }

        stage('TestScript1') {
            when {
                expression { myStage == 'TestScript1' }
            }
            steps {
                echo "Running Stage1"
            }
        }

        stage('TestScript2') {
            when {
                expression { myStage == 'TestScript2' }
            }
            steps {
                echo "Running Stage2"
            }
        }
    }
}
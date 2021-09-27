pipeline{
    agent any
    options {
      timeout(300)
    }
    
    stages{
        stage('Sonar Analysis'){
                steps{
                    withSonarQubeEnv('sonar6') {
                        sh 'mvn sonar:sonar'
                    }
                    timeout(time: 1, unit: 'HOURS') {
                        script{
                          def qg = waitForQualityGate()
                          if (qg.status != 'OK') {
                              error "Pipeline aborted due to quality gate failure: ${qg.status}"
                          }
                        }
                   }
                }
            }
        stage('Mvn  Test and Build'){
            steps{
                
                    sh 'mvn clean package'
                }
            }
     }
}
 

pipeline{
    agent any
    options {
      timeout(300)
    }
    
    stages{
        stage('Sonar Analysis'){
                steps('tes'){
                    withSonarQubeEnv('sonar6') {
                        sh 'mvn sonar:sonar'
                    }
                }
            steps('tes'){
                timeout(time: 1, unit: 'HOURS') {
                        script{
                          def qg = waitForQualityGate()
                         print(qg)
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
 

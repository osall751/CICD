pipeline{
    agent any
    options {
      timeout(300)
    }
    stages{
        
        stage('Maven and Sonar'){
            
            parallel{
            stage('Sonar Analysis'){
                steps{
                    withSonarQubeEnv('sonar6') {
                        sh 'mvn sonar:sonar'
                    }
                    
                    timeout(time: 1, unit: 'HOURS') {
                        script{
                          def qg = waitForQualityGate()
                          
                        }
                  }
                }
            }
            
             stage('Mvn Build'){
                steps{
                    sh 'mvn clean package'
                }
            }
        }
        
      }
 }
    }

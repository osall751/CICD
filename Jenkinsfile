pipeline{
    agent any
    options {
      timeout(300)
    }
    
    stages{
            stage("Sonar Analysis"){
               steps{
               withSonarQubeEnv('sonar6') {
                        sh 'mvn sonar:sonar'
                    }
               }
            }
             stage("Quality Gate") {
              steps{
                        waitForQualityGate abortPipeline: true  
                } 
              }
        
        stage('Mvn  Test and Build'){
            steps{
                
                    sh 'mvn clean package'
                }
            }
     }
}
 

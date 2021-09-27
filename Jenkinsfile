pipeline{
    agent any
    options {
      timeout(300)
    }
    
    stages{
        
            stage('Sonar Analysis'){
               withSonarQubeEnv('sonar6') {
                        sh 'mvn sonar:sonar'
                    }
             }
        
             stage("Quality Gate") {
               waitForQualityGate abortPipeline: true                 
              }
                  
             stage('Mvn  Test and Build'){
                steps("test"){
                    sh 'mvn clean package'
                }
                 
                 steps("tt"){
                    sh 'mvn test'
                }
            }
     }
}
 

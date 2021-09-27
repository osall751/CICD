pipeline{
    agent any
    options {
      timeout(300)
    }
    
    stages{
            stage("Sonar Analysis"){
               withSonarQubeEnv('sonar6') {
                        sh 'mvn sonar:sonar'
                    }
             }
        
         
        stage('Mvn  Test and Build'){
                steps{
                    sh 'mvn clean package'
                }
                 
                 steps{
                    sh 'mvn test'
                }
            }
     }
}
 

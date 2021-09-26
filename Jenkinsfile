node
{
  
  stage('Clone'){
     git branch: 'master',
    credentialsId: 'dd2f6ce2-f3e4-4860-875c-ea0b90586349',
    url: 'git@github.com:idiattara/CICD.git'
  }
  
  
  stage('Test Uniataire'){
    sh 'mvn test'
  }
  
  stage('Package'){
                  sh 'mvn package'
  }
  

   stage("build & SonarQube analysis") {
            agent any
            steps {
              withSonarQubeEnv('My SonarQube Server') {
                sh 'mvn clean package sonar:sonar'
              }
            }
          }
          stage("Quality Gate") {
            steps {
              timeout(time: 1, unit: 'HOURS') {
                waitForQualityGate abortPipeline: true
              }
            } 
}

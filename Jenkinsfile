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
  
stage('SonarQube analysis') {
  
  withSonarQubeEnv('sonar6') { 
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
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

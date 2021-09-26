node
{
  stage('Clone'){
     git branch: 'master',
    credentialsId: 'dd2f6ce2-f3e4-4860-875c-ea0b90586349',
    url: 'git@github.com:idiattara/CICD.git'
    sh 'mvn test'
  }
  
  stage('Test Uniataire'){
    sh 'mvn test'
  }
  
  stage('Package'){
                  sh 'mvn package'
  }
  
  stage('SonarQube analysis') {
    def scannerHome = tool 'SonarScanner 4.0';
    withSonarQubeEnv('My SonarQube Server') { // If you have configured more than one global server connection, you can specify its name
      sh "${scannerHome}/bin/sonar-scanner"
    }
  }
}

node
{
  
  stage('SonarQube analysis') {
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
    }
  }
  
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
  
  
}

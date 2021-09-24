node
{
  stage('Clone'){
                git branch: 'master',
    credentialsId: 'dd2f6ce2-f3e4-4860-875c-ea0b90586349',
    url: 'ssh://git@https://github.com:idiattara/CICD.git'
  }
  stage('Test unitaires'){
                  sh 'mvn test'
  }
  
  stage('Package'){
                  sh 'mvn package'
  }
}

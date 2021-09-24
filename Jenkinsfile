node
{
  stage('Clone'){
                git 'clone git@github.com:idiattara/CICD.git'
  }
  stage('Test unitaires'){
                  sh 'mvn test'
  }
  
  stage('Package'){
                  sh 'mvn package'
  }
}

node
{
  stage('Clone'){
                git 'https://github.com/diattara/my-app'
  }
  stage('Test unitaires'){
                  sh 'mvn test'
  }
  
  stage('Package'){
                  sh 'mvn package'
  }
}

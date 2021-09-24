node
{
  stage('Clone'){
                git branch: 'master',
    credentialsId: '12345-1234-4696-af25-123455',
    url: 'ssh://git@bitbucket.org:company/repo.git'
  }
  stage('Test unitaires'){
                  sh 'mvn test'
  }
  
  stage('Package'){
                  sh 'mvn package'
  }
}

node
{
  stage('Clone'){
   
  ssh-agent $(ssh-add /root/.ssg/id_rsa; git clone git@github.com:idiattara/CICD.git)
  stage('Test unitaires'){
                  sh 'mvn test'
  }
  
  stage('Package'){
                  sh 'mvn package'
  }
}

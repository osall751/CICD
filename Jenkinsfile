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
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
    }
  
 
  stage("build & sonar analysis ") {
        agent any
            steps {
                withSonarQubeEnv('SonarTiss'){
                    // If you are using Windows then you should use "bat" step
                    // Since unit testing is out of the scope we skip them
                    sh "mvn -B clean deploy sonar:sonar"
                }
            }
        }

        stage ("Quality Gate ") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
  
}

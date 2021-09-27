pipeline{
    agent any
    options {
      timeout(300)
    }
    stages{
        
        stage('Sonar'){
            parallel{
            stage('Sonar Analysis'){
                steps{
                    withSonarQubeEnv('sonar6') {
                        sh 'mvn sonar:sonar'
                    }
                timeout(time: 1, unit: 'HOURS') {
                        stage("Quality Gate") {
                                    steps {
                                    waitForQualityGate abortPipeline: true
                                }
                        }
                    }
            }
            }
                }
            }
            
             stage('Mvn Build'){
                steps{
                    sh 'mvn clean package'
                }
            }
        }
        
      }
 

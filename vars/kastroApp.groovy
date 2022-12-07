def paypal(String repoUrl){
    pipeline{
        agent any
        stages{
            stage('1-build'){
                steps{
                    sh 'lsblk'
                }
            }
            stage('2-link shared lib'){
                steps{
                    git branch: 'main',
                          url: "${repoUrl}"
                }
            }
            stage('3-unit test'){
                steps{
                    sh 'lscpu'
                }
            }
        }
    }
}
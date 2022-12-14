def call(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Tools initialization") {
               steps {
                   sh 'free -m'
                   sh 'free -g'
               }
           }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("to-test-maven") {
               steps {
                   sh 'df -h'
               }
           }
       }
}
}
def call(String projectDir, String testProjectDir) {
    stage('Test') {
        sh "docker build -f ${testProjectDir}/Dockerfile -t todoapp-apitest ."
    }
}

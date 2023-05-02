def call(String projectDir, String testProjectDir) {
    stage('Restore') {
        dir(projectDir) {
            sh 'dotnet restore'
        }
        dir(testProjectDir) {
            sh 'dotnet restore'
        }
    }

    stage('Build') {
        dir(projectDir) {
            sh 'dotnet build --configuration Release'
        }
    }

    stage('Test') {
        dir(testProjectDir) {
            sh 'docker build -t todoapp-apitest .'
        }
    }
}

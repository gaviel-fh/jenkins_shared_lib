def call(Map stageParams) {
    stage('Checkout') {
        git branch: stageParams.branch, url: stageParams.url, clean: true
    }
}

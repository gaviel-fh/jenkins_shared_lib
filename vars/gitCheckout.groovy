def call(Map stageParams) {
    stage('Checkout') {
        checkout([
            $class: 'GitSCM',
            branches: [[name: "*/${stageParams.branch}"]],
            userRemoteConfigs: [[url: stageParams.url]],
            clean: true,
            extensions: [[$class: 'CleanBeforeCheckout']]
        ])
    }
}
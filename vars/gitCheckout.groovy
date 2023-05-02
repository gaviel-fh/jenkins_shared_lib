def call(Map stageParams) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: stageParams.branch]],
        usrRemoteConfigs: [[url: stageParams.url]],
    ])
}
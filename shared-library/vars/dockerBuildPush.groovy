def call(String dockerImageName, String dockerTag, String dockerRegistryCredentialsId) {
    withDockerRegistry(credentialsId: dockerRegistryCredentialsId, toolName: 'docker') {
        sh "docker build -t ${dockerImageName} ."
        sh "docker tag ${dockerImageName} ${dockerTag}"
        sh "docker push ${dockerTag}"
    }
}

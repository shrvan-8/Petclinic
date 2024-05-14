def call(String sonarProjectName, String sonarProjectKey) {
    withSonarQubeEnv('sonar-server') {
        sh """
            \$SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=${sonarProjectName} \
            -Dsonar.java.binaries=. \
            -Dsonar.projectKey=${sonarProjectKey}
        """
    }
}

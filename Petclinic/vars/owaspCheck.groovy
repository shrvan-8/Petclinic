def call() {
    dependencyCheck additionalArguments: '--scan ./ --format HTML ', odcInstallation: 'DP-Check'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}

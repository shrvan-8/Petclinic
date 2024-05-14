def call(String branch, String url) {
    git branch: branch, changelog: false, poll: false, url: url
}

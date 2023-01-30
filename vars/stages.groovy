def call(String stageName) {
    if ("${stageName}" == "Build") 
    {
        sh "mvn clean package"
    }

    else if ("${stageName}" == "SonarQube Report") 
    {
        sh "mvn clean sonar:sonar"
    }

    else if ("${stageName}" == "Upload To Nexus Artifacts") 
    {
        sh "mvn clean deploy"
    }
}
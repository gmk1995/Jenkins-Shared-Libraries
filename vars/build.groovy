def call (String mavenGoal) {

    if ("${mavenGoal}" == "Clean") 
    {
      sh "mvn clean"
    }

    else if ("${mavenGoal}" == "Compile")
    {
        sh "mvn compile"
    }

    else if ("${mavenGoal}" == "Test") 
    {
        sh "mvn test"
    }

    else if ("${mavenGoal}" == "Package")
    {
        sh "mvn package"
    }
    
    else if ("${mavenGoal}" == "Install") 
    {
        sh "mvn install"
    }

    else if ("${mavenGoal}" == "Deploy") 
    {
        sh "mvn deploy"
    }
}
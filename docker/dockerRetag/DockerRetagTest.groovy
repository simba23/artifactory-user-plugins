import spock.lang.Specification

import static org.jfrog.artifactory.client.ArtifactoryClient.create
//TODO INSERT REAL TEST
class DockerRetagTest extends Specification {
    def 'test name'() {
        setup:
        def baseurl = 'http://localhost:8088/artifactory'
        def artifactory = create(baseurl, 'admin', 'password')

        when:
        null

        then:
        false

        //cleanup:
    }
}

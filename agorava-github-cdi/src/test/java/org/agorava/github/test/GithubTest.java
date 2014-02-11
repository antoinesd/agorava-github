/*
 * Copyright 2014 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agorava.github.test;

/**@RunWith(Arquillian.class)
public class GithubTest {


    @Inject
@Github$ UserService userService;

    @Deployment
    public static Archive<?> createTestArchive() throws FileNotFoundException {

        WebArchive ret = ShrinkWrap
                .create(WebArchive.class, "test.war")
                .addPackages(true, "org.agorava")
                .addClass(GithubServiceProducer.class)
                .addAsLibraries(new File("../agorava-github-api/target/agorava-github-api.jar"));
        System.out.println(System.getProperty("arquillian"));
        if (("weld-ee-embedded-1.1".equals(System.getProperty("arquillian")) || System.getProperty("arquillian") == null)) {
            // Don't embed dependencies that are already in the CL in the embedded container from surefire
 *//*     ret.addAsLibraries(DependencyResolvers.use(MavenDependencyResolver.class).loadMetadataFromPom("pom.xml")
                    .artifact("org.jboss.solder:solder-impl").resolveAs(GenericArchive.class));
       *//* } else {
            ret.addAsLibraries(DependencyResolvers.use(MavenDependencyResolver.class).loadMetadataFromPom("pom.xml")
                    .artifact("org.jboss.solder:solder-impl").artifact("org.scribe:scribe")
                    .artifact("org.apache.commons:commons-lang3").artifact("org.codehaus.jackson:jackson-mapper-asl")
                    .artifact("com.google.guava:guava").resolveAsFiles());
        }
        return ret;
    }

    @Before
    public void init() {
        OAuthToken token = new OAuthTokenScribe("15b7db0c854e15b8b38e91d2476c1124a3289875", "");
        serviceHub.getSession().setAccessToken(token);
        serviceHub.getService().initAccessToken();
    }

    @Test
    public void authorizationUrlTest() {
        System.out.println("HERP");
        Assert.assertTrue(serviceHub.getService().getAuthorizationUrl().startsWith("http"));
    }
    
    @Test
    public void loginTest() {
        System.out.println("DERP");
        GithubProfile profile = userService.getUserProfile();
        System.out.println(profile.getLogin());
        Assert.assertEquals("justinwyer", profile.getLogin());
    }
}*/

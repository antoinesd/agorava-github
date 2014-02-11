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


import org.agorava.api.oauth.application.OAuthAppSettings;
import org.agorava.api.oauth.application.OAuthApplication;
import org.agorava.api.oauth.application.Param;
import org.agorava.github.Github;
import static org.agorava.api.oauth.application.OAuthAppSettingsBuilder.API_KEY;
import static org.agorava.api.oauth.application.OAuthAppSettingsBuilder.API_SECRET;
import static org.agorava.api.oauth.application.OAuthAppSettingsBuilder.CALLBACK;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * @author Justin Wyer
 */
public class GithubServiceProducer {

    @Github
    @ApplicationScoped
    @OAuthApplication(params = {@Param(name = API_KEY, value = "69ca173c7ff7ed10845e"),
            @Param(name = API_SECRET, value = "c0a77e9c2a695ef2d67d48eed20bfd4ef336bae8"),
            @Param(name = CALLBACK, value = "http://home.lifeasageek.com")})
    @Produces
    public OAuthAppSettings produceSettings;

}

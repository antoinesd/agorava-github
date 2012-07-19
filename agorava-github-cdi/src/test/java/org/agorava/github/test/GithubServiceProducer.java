/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agorava.github.test;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.agorava.core.api.SocialMediaApiHub;
import org.agorava.core.api.oauth.Param;
import org.agorava.core.oauth.OAuthApplication;
import org.agorava.github.Github;
import org.agorava.github.GithubServicesHub;

import static org.agorava.core.api.oauth.OAuthAppSettingsBuilder.*;

/**
 * @author Justin Wyer
 * 
 */
public class GithubServiceProducer {

    @Github
    @ApplicationScoped
    @OAuthApplication(params = {@Param (name = API_KEY, value = "69ca173c7ff7ed10845e"),
        @Param(name = API_SECRET, value = "c0a77e9c2a695ef2d67d48eed20bfd4ef336bae8"),
        @Param(name = CALLBACK, value = "http://home.lifeasageek.com")})
    @Produces
    public SocialMediaApiHub OAuthSettingsProducer(GithubServicesHub service) {
        return service;
    }

}

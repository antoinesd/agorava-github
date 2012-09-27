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
package org.agorava.github;

import org.agorava.core.api.oauth.OAuthService;
import org.agorava.core.cdi.AbstractSocialMediaApi;

import javax.inject.Inject;

/**
 * @author Justin Wyer
 */
public abstract class GithubBaseService extends AbstractSocialMediaApi {

    public static String API_ROOT = "https://api.github.com/";

    @Inject
    @Github
    private OAuthService service;

    @Override
    public String buildUri(String url) {
        return API_ROOT + url;
    }

    @Override
    public OAuthService getService() {
        return service;
    }
}

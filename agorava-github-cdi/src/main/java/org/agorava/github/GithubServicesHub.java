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

import org.agorava.core.api.event.OAuthComplete;
import org.agorava.core.api.event.SocialEvent.Status;
import org.agorava.core.cdi.AbstractSocialMediaApiHub;
import org.agorava.github.cdi.UserServiceImpl;
import org.jboss.solder.logging.Logger;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * @author Justin Wyer
 */
public class GithubServicesHub extends AbstractSocialMediaApiHub {

    private static final String MEDIA_NAME = "Github";

    @Inject
    Instance<GithubBaseService> services;

    @Inject
    Logger log;


    public void initMyProfile(@Observes @Github OAuthComplete oauthComplete) {
        log.debug("Initializing Github profile");
        if (oauthComplete.getStatus() == Status.SUCCESS)
            oauthComplete.getEventData().setUserProfile(services.select(UserServiceImpl.class).get().getUserProfile());
    }

    @Override
    public String getVerifierParamName() {
        return "code";
    }

    @Override
    public String getSocialMediaName() {
        return MEDIA_NAME;
    }

}

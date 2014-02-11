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
package org.agorava.github.cdi;

import org.agorava.github.Github;
import org.agorava.github.GithubBaseService;
import org.agorava.github.UserService;
import org.agorava.github.model.GithubProfile;

/**
 *
 * @author Antoine Sabot-Durand
 * @author Justin Wyer
 */

@Github
public class UserServiceImpl extends GithubBaseService implements UserService {

    @Override
    public GithubProfile getUserProfile() {
        return getService().get(buildAbsoluteUri("user"), GithubProfile.class);
    }

    @Override
    public GithubProfile getUserProfile(String login) {
        return getService().get(buildAbsoluteUri("users/" + login), GithubProfile.class);
    }
}

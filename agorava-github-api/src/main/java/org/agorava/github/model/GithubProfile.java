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
package org.agorava.github.model;

import java.io.Serializable;
import org.agorava.core.api.UserProfile;

/**
 * Model class containing a Github user's profile information.
 * 
 * @author Justin Wyer
 */
@SuppressWarnings("serial")
public class GithubProfile extends UserProfile implements Serializable {

    private final String login;
    private final String name;
    private final String avatar_url;

    public GithubProfile(String id, String login, String name, String avatar_url) {
        super(id);
        this.login = login;
        this.name = name;
        this.avatar_url = avatar_url;
    }

    /**
     * The user's Github login
     * 
     * @return the user's Github login
     */
    public String getLogin() {
        return login;
    }

   @Override
   public String getFullName() {
       return name;
   }

   @Override
   public String getProfileImageUrl() {
       return avatar_url;
   }
}

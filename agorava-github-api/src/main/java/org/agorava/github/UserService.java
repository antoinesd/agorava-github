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

import org.agorava.github.model.GithubProfile;

/**
 * Interface defining the operations for retrieving information about Github users.
 *
 * @author Justin Wyer
 */
public interface UserService {
	
	/**
	 * Retrieves the profile for the authenticated user.
	 * @return the user's profile information.
	 * @throws ApiException if there is an error while communicating with Github.
	 * @throws MissingAuthorizationException if GithubTemplate was not created with an access token.
	 */
	GithubProfile getUserProfile();
	
	/**
	 * Retrieves the profile for the specified user.
	 * @param login the Github login to retrieve profile data for.
	 * @return the user's profile information.
	 * @throws ApiException if there is an error while communicating with Github.
	 */
	GithubProfile getUserProfile(String login);
}

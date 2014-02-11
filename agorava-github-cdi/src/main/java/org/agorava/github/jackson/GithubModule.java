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
package org.agorava.github.jackson;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.agorava.github.Github;
import org.agorava.github.model.GithubProfile;

/**
 * Jackson module for setting up mixin annotations on Github model types. This enables the use of Jackson annotations without
 * directly annotating the model classes themselves.
 *
 * @author Justin Wyer
 */
@Github
public class GithubModule extends SimpleModule {

    public GithubModule() {
        super("GithubModule");
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(GithubProfile.class, GithubProfileMixin.class);
    }
}

/*
 * Copyright 2016 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.saml;

import com.stormpath.sdk.query.Criteria;


/**
 * A {@link SamlServiceProviderRegistration}-specific {@link Criteria} class, enabling a SamlServiceProviderRegistration-specific
 * <a href="http://en.wikipedia.org/wiki/Fluent_interface">fluent</a>query DSL. PhoneCriteria instances can be
 * constructed by using the {@link SamlServiceProviderRegistrations} utility class, for example:
 * <pre>
 * SamlServiceProviderRegistrations.where(SamlServiceProviderRegistrations.createdAt().eq("2016-01-01")...
 *
 * @since 1.2.0
 */
public interface SamlServiceProviderRegistrationCriteria extends Criteria<SamlServiceProviderRegistrationCriteria>,  SamlServiceProviderRegistrationOptions<SamlServiceProviderRegistrationCriteria>{
    //todo: saml do we need to add some search criteria here? see PhoneCriteria
}

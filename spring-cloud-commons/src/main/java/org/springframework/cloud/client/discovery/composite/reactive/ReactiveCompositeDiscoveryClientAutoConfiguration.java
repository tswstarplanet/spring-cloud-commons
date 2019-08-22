/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.client.discovery.composite.reactive;

import java.util.List;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.client.discovery.simple.SimpleDiscoveryClientAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Auto-configuration for reactive composite discovery client.
 *
 * @author Tim Ysewyn
 */
@Configuration
@AutoConfigureBefore(SimpleDiscoveryClientAutoConfiguration.class)
public class ReactiveCompositeDiscoveryClientAutoConfiguration {

	@Bean
	@Primary
	public ReactiveCompositeDiscoveryClient compositeDiscoveryClient(
			List<ReactiveDiscoveryClient> discoveryClients) {
		return new ReactiveCompositeDiscoveryClient(discoveryClients);
	}

}
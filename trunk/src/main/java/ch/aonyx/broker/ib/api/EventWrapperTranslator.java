/*
 * Copyright (C) 2012 Aonyx
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.aonyx.broker.ib.api;

import com.lmax.disruptor.EventTranslator;

/**
 * @author Christophe Marcourt
 * @since 1.0.0
 */
final class EventWrapperTranslator implements EventTranslator<EventWrapper> {

	private final Event event;

	EventWrapperTranslator(final Event event) {
		this.event = event;
	}

	@Override
	public EventWrapper translateTo(final EventWrapper eventWrapper, final long sequence) {
		eventWrapper.setWrappedEvent(event);
		return null;
	}

}

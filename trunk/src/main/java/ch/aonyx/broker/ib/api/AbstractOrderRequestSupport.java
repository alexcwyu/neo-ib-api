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

/**
 * @author Christophe Marcourt
 * @since 1.0.0
 */
public abstract class AbstractOrderRequestSupport extends AbstractRequest {

    protected AbstractOrderRequestSupport(final String id) {
        this(new OrderStringId(id));
    }

    protected AbstractOrderRequestSupport(final OrderId id) {
        super(id);
    }

    @Override
    public OrderId getId() {
        return (OrderId) super.getId();
    }

    protected int toInternalId(final OrderId id) {
        if (id != null) {
            return OrderIdInternalIdBinding.getInstance().getInternalId(id);
        }
        return 0;
    }
}

package com.craftmend.openaudiomc.generic.events.events;

import com.craftmend.openaudiomc.api.events.BaseEvent;
import com.craftmend.openaudiomc.generic.media.time.TimeService;
import lombok.Data;

@Data
public class TimeServiceUpdateEvent extends BaseEvent {
    private TimeService timeService;
}

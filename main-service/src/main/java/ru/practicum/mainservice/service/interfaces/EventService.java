package ru.practicum.mainservice.service.interfaces;

import org.springframework.data.domain.PageRequest;
import ru.practicum.mainservice.data.dto.event.EventResponseDto;
import ru.practicum.mainservice.data.dto.event.NewEventDto;
import ru.practicum.mainservice.data.dto.event.UpdateEventAdminRequest;
import ru.practicum.mainservice.data.dto.event.UpdateEventUserRequest;
import ru.practicum.mainservice.data.model.RequestParameters;

import java.util.List;

public interface EventService {
    EventResponseDto adminUpdateEvent(Long eventId, UpdateEventAdminRequest dto);

    List<EventResponseDto> adminSearchEvents(RequestParameters build);

    List<EventResponseDto> getUserEvents(final Long userId, final PageRequest of);

    EventResponseDto createEvent(Long userId, NewEventDto dto);

    EventResponseDto getEvent(final Long userId, final Long eventId);

    EventResponseDto userUpdateEvent(final UpdateEventUserRequest dto);

    List<EventResponseDto> userSearchEvents(RequestParameters build);

    EventResponseDto getEvent(final Long id);
}

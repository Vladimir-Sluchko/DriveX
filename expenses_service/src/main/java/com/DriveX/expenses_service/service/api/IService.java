package com.DriveX.expenses_service.service.api;


import com.DriveX.expenses_service.service.dto.pagination.PageDto;

import java.util.UUID;

public interface IService<C,R> {
    C create (C eventFilm);
    R get (UUID uuid);
    PageDto<R> getAll(int page, int size );
    C update (C eventFilm, UUID uuid, Long dtUpdate);
}

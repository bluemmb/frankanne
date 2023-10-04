package com.me.frankanne.frank.domain;

import com.me.frankanne.common.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Gift extends Entity {
    @NonNull
    UUID giftId;

    @NonNull
    String content;
}

package ru.netology.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class DeliveryInfo {
    private final String name;
    private final String city;
    private final String phone;

}

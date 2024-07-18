package me.dio.jewelry_store_api.repository;

import me.dio.jewelry_store_api.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

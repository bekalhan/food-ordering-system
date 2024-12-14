package com.food.ordering.system.saga;

//Saga dağıtılmış sistem yönetimi için bir tasarımdır
//Eğer saga stepindebir adım başarısız olursa işlem geri alınır(rollback)
public interface SagaStep<T> {
    void process(T data);
    void rollback(T data);
}

-- liquibase formatted sql

-- changeset mdtarasov:1
CREATE TABLE notification_task
(
    id          bigserial primary key,
    chat_id     bigserial,
    text        varchar,
    exec_date   timestamp
);
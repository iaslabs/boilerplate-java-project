CREATE TABLE SERVICES
(
    id           VARCHAR (36) primary key,
    serviceId    VARCHAR(10) NOT NULL,
    technicianId VARCHAR(10) NOT NULL,
    initDateTime TIMESTAMP WITH TIMEZONE_HOUR NOT NULL,
    endDateTime  TIMESTAMP WITH TIMEZONE_HOUR NOT NULL
);
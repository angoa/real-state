CREATE TABLE IF NOT EXISTS INMUEBLE (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    direccion VARCHAR(255),
    telefono VARCHAR(255),
    capacidad_aforo INT
);

INSERT INTO INMUEBLE (nombre, direccion, telefono, capacidad_aforo) VALUES
('Inmueble 1', 'Direccion 1', '555-1234', 100),
('Inmueble 2', 'Direccion 2', '555-5678', 200);

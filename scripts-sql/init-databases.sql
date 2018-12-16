CREATE USER 'arancha'@'localhost' IDENTIFIED BY '12345';
GRANT ALL PRIVILEGES ON *.* TO 'arancha'@'localhost';
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';
GRANT ALL PRIVILEGES ON *.* TO 'admin'@'localhost';
/* CREATE USER 'root'@'localhost' IDENTIFIED BY '';*/
GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost';
CREATE USER 'almacentesla'@'localhost' IDENTIFIED BY 'almacentesla';
GRANT ALL PRIVILEGES ON *.* TO 'almacentesla'@'localhost';
FLUSH PRIVILEGES;


CREATE DATABASE mtis_grupal_contratar_personal CHARACTER SET utf8 COLLATE utf8_bin;
CREATE DATABASE paneles_solares CHARACTER SET utf8 COLLATE utf8_bin;
CREATE DATABASE tesla_ficheros CHARACTER SET utf8 COLLATE utf8_bin;
CREATE DATABASE almacentesla CHARACTER SET utf8 COLLATE utf8_bin;
CREATE DATABASE mtispracticagrupo CHARACTER SET utf8 COLLATE utf8_bin;
CREATE DATABASE proceso_qa CHARACTER SET utf8 COLLATE utf8_bin;

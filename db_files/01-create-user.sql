CREATE USER 'ironman'@'localhost' IDENTIFIED BY 'ironman';

GRANT ALL PRIVILEGES ON * . * TO 'ironman'@'localhost';

ALTER USER 'ironman'@'localhost' IDENTIFIED WITH mysql_native_password BY 'StrongestAvenger';
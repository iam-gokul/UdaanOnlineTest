INSERT INTO asset(name,quantity,tasks) VALUES('Coffee Maker', 2 , 'cleaning');
INSERT INTO asset(name,quantity,tasks) VALUES('Stove', 1 , 'cleaning');

INSERT INTO task(name, asset ,frequency,workerId) VALUES('Cleaning','Coffee Maker', 'Daily' , '123');
INSERT INTO task(name, asset ,frequency,workerId) VALUES('Mobbing','2nd Floor', 'Weekly' , '124');

INSERT INTO admin(name, userId,password) VALUES('Gokul','112', 'password112');


INSERT INTO worker(name, userId,password) VALUES('Ramu','123', 'password123');
INSERT INTO worker(name, userId,password) VALUES('Laxman','124', 'password124');

COMMIT;
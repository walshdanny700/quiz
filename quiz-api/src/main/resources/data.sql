DROP TABLE IF EXISTS tags;

CREATE TABLE tags (
    id INT PRIMARY KEY,
    NAME VARCHAR(250) NOT NULL
);

INSERT INTO tags (ID, NAME) VALUES
(1, 'General Knowledge'),
(2, 'Sports');
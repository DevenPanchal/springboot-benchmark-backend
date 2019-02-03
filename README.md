This is a Spring boot application.

mvn install

Run as  a Java application/Spring boot Application.

It exposes a rest api using Swagger which can be accessed here : http://localhost:8080/swagger-ui.html#/news-controller

MySQL setup:

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `content` text,
  `author` varchar(50) DEFAULT NULL,
  `image` varchar(150) DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  `source` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


INSERT INTO `newsapi`.`news` (`id`, `title`, `content`, `author`, `image`, `date`, `source`) VALUES (2, "Govt declares help", "Govt decided to extend help to flood victims", "Sam", "lskjlkdj", "24/09/12", "ABC News")



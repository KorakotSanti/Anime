drop database if exists anime_db;
create database anime_db;
use anime_db;
create table animes(
	anime_id INT AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(100) not null,
	image_url VARCHAR(250),
	director VARCHAR(100) not null,
	studio VARCHAR(100) not null
);


insert into animes(anime_id, title, director, studio)
values
(1000, 'My Teen Romantic Comedy SNAFU', 'Ai Yoshimura', 'Brain''s Base'),
(1001, 'Naruto', 'Hayato Date', 'Studio Pierrot'),
(1002, 'Blue Exorcist', 'Tensai Okamura', 'A-1 Pictures'),
(1003, 'Dr. Stone', 'Shinya Iino', 'TMS Entertainment'),
(1004, 'The Irregular at Magic High School', 'Manabu Ono', 'Madhouse'),
(1005, 'ERASED', 'Tomohiko Itou', 'A-1 Pictures'),
(1006, 'Fullmetal Alchemist: Brotherhood', 'Yasuhiro Irie', 'Bones'),
(1007, 'Kaguya-sama: Love is War', 'Shinichi Omata', 'A-1 Pictures'),
(1008, 'Rent-a-Girlfriend', 'Kazuomi Koga', 'TMS Entertainment'),	
(1009, 'The Misfit of Demo King Academy', 'Shin Oonuma', 'Silver Link.'),
(1010, 'Uzaki-chan Wants to Hang Out!', 'Kazuya Miura', 'ENGI'),
(1011, 'Your Lie in April', 'Kyohei Ishiguro', 'A-1 Pictures'),
(1012, 'Haikyu!!', 'Susumu Mitsunaka', 'Production I.G'),
(1013, 'Vinland Saga', 'Shuuhei Yabuta', 'Wit Studio'),
(1014, 'Demon Slayer: Kimetsu no Yaiba', 'Haruo Sotozaki', 'ufotable'),
(1015, 'Gurren Lagann', 'Hiroyuki Imaishi', 'Gainax'),
(1016, 'The Disappearance of Haruhi Suzumiya', 'Tatsuya Ishihara', 'Kyoto Animation'),
(1017, 'The Promised Neverland', 'Mamoru Kanbe', 'CloverWorks'),
(1018, 'One Punch Man', 'Shingo Natsume', 'Madhouse'),
(1019, 'Violet Evergarden', 'Taichi Ishidate', 'Kyoto Animation'),
(1020, 'Death Note', 'Tetsurou Araki', 'Madhouse'),
(1021, 'Fate/stay night Movie: Heavens''s Feel - II. Lost Butterfly', 'Tomonori Sudou', 'ufotable'),
(1022, 'Bakuman', 'Kenichi Kasai', 'J.C.Staff'),
(1023, 'KonoSuba: God''s Blessing on This Wonderful World!', 'Takaomi Kanasaki', 'Studio Deen'),
(1024, 'Chihayafuru', 'Morio Asaka', 'Madhouse'),
(1025, 'One Piece', 'Tatsuya Nagamine', 'Toei Animation'),
(1026, 'The Disatrous Life of Saiki K.', 'Hiroaki Sakurai', 'J.C.Staff');
commit;

select * from animes;
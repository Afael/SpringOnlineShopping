CREATE TABLE category(

	id IDENTITY
	, name VARCHAR(30)
	, description VARCHAR(255)
	, image_url VARCHAR(50)
	, is_active BOOLEAN
	, CONSTRAINT PK_CATEGORY_ID PRIMARY KEY(id)
);
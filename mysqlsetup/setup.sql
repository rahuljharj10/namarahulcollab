-- step1: Create a new database named empdb
CREATE
DATABASE empdb;
--OR
CREATE
DATABASE IF NOT EXISTS empdb;

-- step2: Create the EMPLOYEE table
CREATE TABLE EMPLOYEE
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    first_name   VARCHAR(50) NOT NULL,
    last_name    VARCHAR(50),
    email        VARCHAR(100) UNIQUE,
    phone_number VARCHAR(15),
    hire_date    DATE        NOT NULL,
    job_title    VARCHAR(100),
    salary       DECIMAL(10, 2),
    is_active    BOOLEAN   DEFAULT TRUE,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- step3: Insert sample data into the EMPLOYEE table(15 VALUES ARE THERE)

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('James', 'Hernandez', 'jonathan46@nelson-martinez.org', '961-788-8901x50', '2021-04-01',
        'Government social research officer', 74326.37, False);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Lisa', 'Brown', 'qjohnson@moore.org', '+1-059-502-2679', '2020-09-01', 'Information systems manager', 55246.12,
        False);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Paige', 'Castillo', 'keithlinda@moore.com', '475.191.9492x94', '2016-09-13', 'Warden/ranger', 108058.29, True);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Ryan', 'Roberts', 'uhart@moore.com', '694.355.7727', '2018-05-21', 'Primary school teacher', 120248.69, True);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Stephanie', 'Smith', 'oeaton@gmail.com', '+1-846-746-9759', '2017-05-25', 'Fitness centre manager', 78973.31,
        False);
INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Emily', 'Davis', 'emily.davis@example.com', '9876543210', '2021-01-15', 'Software Engineer', 85000.00, TRUE);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Michael', 'Johnson', 'michael.johnson@example.com', '9123456780', '2020-11-22', 'Project Manager', 95000.00,
        TRUE);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Sarah', 'Lee', 'sarah.lee@example.com', '9988776655', '2019-06-30', 'Business Analyst', 72000.00, TRUE);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('David', 'Clark', 'david.clark@example.com', '8765432109', '2018-04-10', 'Database Administrator', 80000.00,
        TRUE);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Olivia', 'Martinez', 'olivia.martinez@example.com', '9654321876', '2022-02-18', 'UI/UX Designer', 68000.00,
        TRUE);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Daniel', 'Wilson', 'daniel.wilson@example.com', '9345678123', '2023-03-05', 'Quality Assurance', 70000.00,
        FALSE);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Sophia', 'Anderson', 'sophia.anderson@example.com', '9456123789', '2021-08-20', 'DevOps Engineer', 88000.00,
        TRUE);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('William', 'Thomas', 'william.thomas@example.com', '9123765489', '2017-12-01', 'Network Engineer', 79000.00,
        FALSE);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('Ava', 'Taylor', 'ava.taylor@example.com', '9345127698', '2016-07-12', 'HR Specialist', 62000.00, TRUE);

INSERT INTO EMPLOYEE
(first_name, last_name, email, phone_number, hire_date, job_title, salary, is_active)
VALUES ('James', 'White', 'james.white@example.com', '9988123456', '2020-10-17', 'Software Tester', 66000.00, TRUE);

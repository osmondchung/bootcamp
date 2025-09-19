create database practice;
use practice;

create table regions (
	region_id bigint primary key,
    region_name varchar(25)
);
create table countries(
	country_id varchar(2) primary key,
    country_name varchar(40),
    region_id bigint,
    FOREIGN KEY (region_id) REFERENCES regions(region_id)
);
create table locations (
	location_id bigint primary key,
    street_addresses varchar(25),
    postal_code varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id varchar(2),
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);
create table departments (
	department_id bigint primary key,
    department_name varchar(30),
    manager_id bigint,
    location_id bigint,
    FOREIGN KEY (location_id) REFERENCES locations(location_id)
);
create table jobs (
	job_id varchar(10) primary key,
    job_title varchar(35),
    min_salary bigint,
    max_salary bigint
);
create table employees (
	employee_id bigint primary key,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25),
    phone_number varchar(20),
    hire_date date,
    job_id varchar(10),
    FOREIGN KEY (job_id) REFERENCES jobs(job_id),
    salary bigint,
    commission_pct bigint,
    manager_id bigint,
    department_id bigint,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);
create table job_history (
	employee_id bigint,
	FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    start_date date,
	primary key (employee_id, start_date),
    end_date date,
    job_id varchar(10),
    FOREIGN KEY (job_id) REFERENCES jobs(job_id),
    department_id bigint,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);


-- 1. Regions
INSERT INTO regions (region_id, region_name) VALUES (1, 'Europe');
INSERT INTO regions (region_id, region_name) VALUES (2, 'Americas');
INSERT INTO regions (region_id, region_name) VALUES (3, 'Asia');
INSERT INTO regions (region_id, region_name) VALUES (4, 'Middle East');

-- 2. Countries
INSERT INTO countries (country_id, country_name, region_id) VALUES ('US', 'United States', 2);
INSERT INTO countries (country_id, country_name, region_id) VALUES ('UK', 'United Kingdom', 1);
INSERT INTO countries (country_id, country_name, region_id) VALUES ('JP', 'Japan', 3);
INSERT INTO countries (country_id, country_name, region_id) VALUES ('AE', 'United Arab Emirates', 4);

-- 3. Locations
INSERT INTO locations (location_id, street_addresses, postal_code, city, state_province, country_id) 
VALUES (100, '123 Main St', '10001', 'New York', 'NY', 'US');
INSERT INTO locations (location_id, street_addresses, postal_code, city, state_province, country_id) 
VALUES (101, '221B Baker St', 'NW1', 'London', NULL, 'UK');
INSERT INTO locations (location_id, street_addresses, postal_code, city, state_province, country_id) 
VALUES (102, 'Shinjuku 5-10', '160-0022', 'Tokyo', NULL, 'JP');
INSERT INTO locations (location_id, street_addresses, postal_code, city, state_province, country_id) 
VALUES (103, 'Sheikh Zayed Rd', '00000', 'Dubai', NULL, 'AE');

-- 4. Departments
INSERT INTO departments (department_id, department_name, manager_id, location_id) 
VALUES (10, 'Administration', NULL, 100);
INSERT INTO departments (department_id, department_name, manager_id, location_id) 
VALUES (20, 'Finance', NULL, 101);
INSERT INTO departments (department_id, department_name, manager_id, location_id) 
VALUES (30, 'IT', NULL, 102);
INSERT INTO departments (department_id, department_name, manager_id, location_id) 
VALUES (40, 'HR', NULL, 103);

-- 5. Jobs
INSERT INTO jobs (job_id, job_title, min_salary, max_salary) 
VALUES ('IT_PROG', 'Programmer', 4000, 9000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary) 
VALUES ('FI_MGR', 'Finance Manager', 8000, 15000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary) 
VALUES ('HR_REP', 'HR Representative', 3000, 7000);
INSERT INTO jobs (job_id, job_title, min_salary, max_salary) 
VALUES ('AD_VP', 'Administration VP', 10000, 20000);

-- 6. Employees
INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) 
VALUES (1001, 'John', 'Smith', 'jsmith', '123-456-7890', '2020-01-15', 'IT_PROG', 6000, NULL, NULL, 30);

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) 
VALUES (1002, 'Mary', 'Johnson', 'mjohnson', '123-456-7891', '2019-03-20', 'FI_MGR', 12000, NULL, NULL, 20);

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) 
VALUES (1003, 'Taro', 'Yamada', 'tyamada', '81-3-1111-2222', '2021-06-10', 'HR_REP', 5000, NULL, 1002, 40);

INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) 
VALUES (1004, 'Alice', 'Brown', 'abrown', '44-20-3333-4444', '2018-09-01', 'AD_VP', 18000, NULL, NULL, 10);

-- 7. Job History
INSERT INTO job_history (employee_id, start_date, end_date, job_id, department_id) 
VALUES (1001, '2018-01-01', '2020-01-14', 'HR_REP', 40);

INSERT INTO job_history (employee_id, start_date, end_date, job_id, department_id) 
VALUES (1002, '2017-01-01', '2019-03-19', 'IT_PROG', 30);

select * from employees;

-- Q3
select l.location_id, l.street_addresses, l.city, l.state_province, c.country_name
from locations l inner join countries c on l.country_id = c.country_id;

-- Q4
select first_name, last_name, department_id
from employees;

-- Q5
with temp as(
	select c.country_id, c.country_name, l.location_id
	from countries c inner join locations l on c.country_id = l.country_id
),temp2 as (
	select t1.country_id, t1.country_name, t1.location_id, d.department_id
    from temp t1 inner join departments d on t1.location_id = d.location_id
)
select e.first_name, e.last_name, e.job_id, e.department_id, t2.country_name
from temp2 t2 inner join employees e on t2.department_id = e.department_id
where country_name = 'Japan';

-- Q6
select e.employee_id, e.last_name, e.manager_id
from employees e;

-- Q7
select first_name, last_name, hire_date
from employees 
where hire_date > (select hire_date from employees where last_name = 'Johnson');

-- Q8
select department_name, count(*) as num_of_employees
from employees e inner join departments d on e.department_id = d.department_id
group by d.department_id;

-- Q9
with employees_jobs as (
	select e.employee_id, e.department_id, e.job_id, j.job_title
    from employees e inner join jobs j on e.job_id = j.job_id
)
select ej.employee_id, ej.job_title, count(*)
from employees_jobs ej inner join job_history jh on ej.employee_id = jh.employee_id
where jh.department_id = 30
group by ej.employee_id;

-- Q10
with temp as(
	select c.country_id, c.country_name, l.location_id, l.city
	from countries c inner join locations l on c.country_id = l.country_id
),temp2 as (
	select t1.country_id, t1.country_name, t1.location_id, d.department_id, d.department_name, t1.city
    from temp t1 inner join departments d on t1.location_id = d.location_id
)
select t2.department_name, e.first_name, e.last_name, t2.city, t2.country_name
from temp2 t2 inner join employees e on t2.department_id = e.department_id
where manager_id is null;

-- Q11
select d.department_name, avg(salary)
from employees e inner join departments d on e.department_id = d.department_id
group by d.department_name;



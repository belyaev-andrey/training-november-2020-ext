-- begin CLINIC_VISIT
alter table CLINIC_VISIT add column URGENT boolean ^
alter table CLINIC_VISIT add column DTYPE varchar(31) ^
update CLINIC_VISIT set DTYPE = 'enclinic_UrgentVisit' where DTYPE is null ^
-- end CLINIC_VISIT

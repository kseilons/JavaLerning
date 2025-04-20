
CREATE TABLE [TProc]
( 
	[ProcID]             varchar(15)  NOT NULL ,
	[ProcFullName]       varchar(100)  NULL ,
	[ProcFreq]           decimal(10,2)  NULL ,
	[ProcArch]           varchar(20)  NULL ,
	[ProcVendor]         varchar(20)  NULL ,
	CONSTRAINT [XPKПроцессор] PRIMARY KEY  CLUSTERED ([ProcID] ASC)
)
go

CREATE TABLE [RamType]
( 
	[RamType]            varchar(10)  NOT NULL ,
	[RamTypeFullName]    varchar(50)  NULL ,
	CONSTRAINT [XPKТип_RAM] PRIMARY KEY  CLUSTERED ([RamType] ASC)
)
go

CREATE TABLE [CompRole]
( 
	[CompRoleID]         integer  NOT NULL ,
	[CompRoleFullName]   varchar(50)  NULL ,
	CONSTRAINT [XPKРоль_компьютера] PRIMARY KEY  CLUSTERED ([CompRoleID] ASC)
)
go

CREATE TABLE [Comp]
( 
	[CompID]             integer  NOT NULL ,
	[ProcID]             varchar(15)  NOT NULL ,
	[RamType]            varchar(10)  NULL ,
	[CompName]           varchar(60)  NULL ,
	[ProcNumber]         tinyint  NULL ,
	[RamSizeGB]          decimal(6,2)  NULL ,
	[CompRoleID]         integer  NULL ,
	CONSTRAINT [XPKКомпьютер] PRIMARY KEY  CLUSTERED ([CompID] ASC),
	CONSTRAINT [R_1] FOREIGN KEY ([ProcID]) REFERENCES [TProc]([ProcID])
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT [R_14] FOREIGN KEY ([RamType]) REFERENCES [RamType]([RamType])
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT [R_18] FOREIGN KEY ([CompRoleID]) REFERENCES [CompRole]([CompRoleID])
		ON DELETE SET NULL
		ON UPDATE NO ACTION
)
go

CREATE TABLE [TUser]
( 
	[UserID]             integer  NOT NULL ,
	[UserLogin]          varchar(50)  NOT NULL ,
	[UserFirstName]      varchar(50)  NULL ,
	[UserLastName]       varchar(50)  NULL ,
	[UserSecondName]     varchar(50)  NULL ,
	CONSTRAINT [XPKПользователь] PRIMARY KEY  CLUSTERED ([UserID] ASC)
)
go

CREATE TABLE [Comp_User]
( 
	[CompID]             integer  NOT NULL ,
	[UserID]             integer  NOT NULL ,
	CONSTRAINT [XPKКомпьютер_Пользователь] PRIMARY KEY  CLUSTERED ([CompID] ASC,[UserID] ASC),
	CONSTRAINT [R_9] FOREIGN KEY ([CompID]) REFERENCES [Comp]([CompID])
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT [R_10] FOREIGN KEY ([UserID]) REFERENCES [TUser]([UserID])
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
)
go

CREATE VIEW [vCompLogin]([CompName],[UserLogin])
AS
SELECT DISTINCT [Comp].[CompName],[TUser].[UserLogin]
	FROM [Comp],[TUser],[Comp_User]
		WHERE TUser.UserID=Comp_User.UserID and Comp.CompID=Comp_User.CompID
go

CREATE TABLE [NetDevice]
( 
	[NetDeviceID]        integer  NOT NULL ,
	[NetDeviceName]      varchar(50)  NULL ,
	[NetDeviceType]      varchar(50)  NULL ,
	[NetDeviceModel]     varchar(50)  NULL ,
	[NetDeviceVendor]    varchar(50)  NULL ,
	[NetDevicePortNumber] tinyint  NULL ,
	CONSTRAINT [XPKСетевое_устройство] PRIMARY KEY  CLUSTERED ([NetDeviceID] ASC)
)
go

CREATE TABLE [NetInterface]
( 
	[NetInterfaceID]     integer  NOT NULL ,
	[CompID]             integer  NOT NULL ,
	[NetDeviceID]        integer  NULL ,
	[NetInterfaceMAC]    varchar(20)  NULL ,
	[NetInterfaceIP]     varchar(30)  NULL ,
	[NetInterfaceInfo]   varchar(100)  NULL ,
	CONSTRAINT [XPKСетевой_интерфейс] PRIMARY KEY  CLUSTERED ([NetInterfaceID] ASC,[CompID] ASC),
	CONSTRAINT [R_12] FOREIGN KEY ([CompID]) REFERENCES [Comp]([CompID])
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	CONSTRAINT [R_13] FOREIGN KEY ([NetDeviceID]) REFERENCES [NetDevice]([NetDeviceID])
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
)
go

CREATE TABLE [OS]
( 
	[OSName]             varchar(20)  NOT NULL ,
	[OSType]             varchar(20)  NULL ,
	[OSVendor]           varchar(50)  NULL ,
	[OSInfo]             varchar(200)  NULL ,
	CONSTRAINT [XPKОС] PRIMARY KEY  CLUSTERED ([OSName] ASC)
)
go

CREATE TABLE [Comp_OS]
( 
	[CompID]             integer  NOT NULL ,
	[OSName]             varchar(20)  NOT NULL ,
	CONSTRAINT [XPKКомпьютер_ОС] PRIMARY KEY  CLUSTERED ([CompID] ASC,[OSName] ASC),
	CONSTRAINT [R_6] FOREIGN KEY ([CompID]) REFERENCES [Comp]([CompID])
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT [R_7] FOREIGN KEY ([OSName]) REFERENCES [OS]([OSName])
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
)
go

CREATE TABLE [HDD]
( 
	[HDDModelID]         varchar(20)  NOT NULL ,
	[HDDModelFullName]   varchar(100)  NULL ,
	[HDDVendor]          varchar(100)  NULL ,
	[HDDSizeGB]          decimal(8,2)  NULL ,
	[HDDInterface]       varchar(20)  NULL ,
	CONSTRAINT [XPKЖесткий_диск] PRIMARY KEY  CLUSTERED ([HDDModelID] ASC)
)
go

CREATE TABLE [Comp_HDD]
( 
	[CompID]             integer  NOT NULL ,
	[HDDModelID]         varchar(20)  NOT NULL ,
	[HDDNumber]          integer  NOT NULL ,
	CONSTRAINT [XPKКомпьютер_Жесткий_диск] PRIMARY KEY  CLUSTERED ([CompID] ASC,[HDDModelID] ASC),
	CONSTRAINT [R_3] FOREIGN KEY ([CompID]) REFERENCES [Comp]([CompID])
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
	CONSTRAINT [R_4] FOREIGN KEY ([HDDModelID]) REFERENCES [HDD]([HDDModelID])
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
)
go

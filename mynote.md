api --> XXXController

service -- impl --> XXXServiceImpl 备用，不被用
        -- XXXService
        -- genericimpl --> XXXServiceImpl 真正被使用的

在数据库建表后运行代码自动生成：
dao -- model --> XXX/XXXExample
    --> XXXMapper
    
resources -- mappers --> XXXMapper.xml



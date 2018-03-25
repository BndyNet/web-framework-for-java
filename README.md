	
	 _______                   __                __    __              __     
	/       \                 /  |              /  \  /  |            /  |  
	$$$$$$$  | _______    ____$$ | __    __     $$  \ $$ |  ______   _$$ |_   
	$$ |__$$ |/       \  /    $$ |/  |  /  |    $$$  \$$ | /      \ / $$   |
	$$    $$< $$$$$$$  |/$$$$$$$ |$$ |  $$ |    $$$$  $$ |/$$$$$$  |$$$$$$/   
	$$$$$$$  |$$ |  $$ |$$ |  $$ |$$ |  $$ |    $$ $$ $$ |$$    $$ |  $$ | __ 
	$$ |__$$ |$$ |  $$ |$$ \__$$ |$$ \__$$ | __ $$ |$$$$ |$$$$$$$$/   $$ |/  | 
	$$    $$/ $$ |  $$ |$$    $$ |$$    $$ |/  |$$ | $$$ |$$       |  $$  $$/ 
	$$$$$$$/  $$/   $$/  $$$$$$$/  $$$$$$$ |$$/ $$/   $$/  $$$$$$$/    $$$$/  
	                              /  \__$$ |                                  
	                              $$    $$/                                   
	                               $$$$$$/                                    

# Web Framework - A Starter Project for Spring Boot

**NOTE** : Use **MySQL v5.7+**, if JDBC exception occurred, please drop all tables and let it recreate automatically.

**Home Page**
![](https://raw.githubusercontent.com/bndynet/web-framework-for-java/master/docs/img/home.png)

**Admin Page**
![](https://raw.githubusercontent.com/bndynet/web-framework-for-java/master/docs/img/admin-home.png)

## Features

- User Management
- Role Management
- Menu Management
- Application Management
- File Resource Management
- User Profile
- OAuth Endpoints
- International Support
- Skin Support
- **Content Management System**
	
## Getting Started

1. Change data source(MYSQL) url in application.yml and create your database without tables (will be generated automatically)
1. Install dependencies
1. `mvn spring-boot:run` to run application
1. Browse http://localhost:9090

## Development

- **src/main/java/net/bndy/wf/modules**: Java Modules (services and RESTful API)
- **src/main/java/net/bndy/wf/controller**: Controllers
- **src/main/resources/templates**: Thymeleaf Modules
- **src/main/resources/public/docs/api**: Auto-generated API Documentation (Swagger UI)
- **src/main/resources/static/apps/admin**: AngularJS Application for Admin Panel
    - **src/main/resources/static/apps/admin/modules**: AngularJS Modules
    - **src/main/resources/static/apps/admin/modules/example**: Style Examples 
    
**Implemented AngularJS Components**

ui-actions, ui-dialog, ui-html-editor, ui-input, ui-menu-tree, ui-no-data, ui-notifications, ui-page-content, ui-page-header, ui-search, ui-tree, ui-upload, ui-wait-on
    
**Recommend:**

- Non-Frontend

    You just use thymeleaf and not angularjs, you can define controllers in **src/main/java/net/bndy/wf/controller** and thymeleaf templates in **src/main/resources/templates**.

- AngularJS

    You can implement api in **src/main/java/net/bndy/wf/modules** and angularjs controllers in **src/main/resources/static/apps/admin/modules**. Each feature should include one html file and one js file.
    
- International (Languages)

    You can define both of backend languages and frontend languages in **src/main/resources/i18n/**. And you can use it in AngularJS modules directly. 

## OAuth Endpoints

1. **GET** /oauth/authorize?response_type=code&scope&client_id&redirect_uri

	Redirect to `redirect_uri?code=...`

1. **POST** /oauth/token?grant_type=authorization_code&client_id&client_secret&code&redirect_uri

	```json
	{
        "access_token": "",
        "token_type": "bearer",
        "refresh_token": "",
        "expires_in": 10000,
        "scope": "",
        "avatar": "",
        "username": "yourname"
	}
	```

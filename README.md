## Фреймворк Spring (семинары)

### Урок 7. Spring Security. Работа с JWT. Защита от основных видов атак.

Базовое задание:

Внимание ДЗ выполнять в версии SpringBoot:2.7.14(модули security и web)

Вам необходимо создать Spring Boot приложение, которое управляет доступом к ресурсам в зависимости от роли пользователя. 

У вас должно быть два типа пользователей: USER и ADMIN.

1. Создайте ресурс /private-data, доступный только для аутентифицированных пользователей с ролью ADMIN.
   
3. Создайте ресурс /public-data, доступный для всех аутентифицированных пользователей независимо от их роли.
   
5. Реализуйте форму входа для аутентификации пользователей с использованием стандартных средств Spring Security.
   
7. Если неаутентифицированный пользователь пытается получить доступ к /private-data, он должен быть перенаправлен на форму входа.

Скрины работы приложения:

![1](https://github.com/PavelLogeiko/Spring_HW07/blob/main/images/1.png)

![2](https://github.com/PavelLogeiko/Spring_HW07/blob/main/images/2.png)

![3](https://github.com/PavelLogeiko/Spring_HW07/blob/main/images/3.png)

![4](https://github.com/PavelLogeiko/Spring_HW07/blob/main/images/4.png)

![5](https://github.com/PavelLogeiko/Spring_HW07/blob/main/images/5.png)

![6](https://github.com/PavelLogeiko/Spring_HW07/blob/main/images/6.png)



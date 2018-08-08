run all 3 projects

browse into http://localhost:8080/resource/

enter username: **user** and password: **password** 

Every thing should be OK and you get a message 

_this is a secure call through the gateway into a resource server , it will only work with Finchley.RELEASE_

Stop All and change the gateway release to SR1

After logging in you will not be able to get the message and saying full authentication is required, 
I did the investigation and authorization header is being removed in SR1

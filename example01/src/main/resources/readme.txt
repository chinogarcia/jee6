REST:
http://localhost:7001/example02/resources/helloworld/Chino
http://localhost:7001/SayHelloWS/SayHelloWSService

JAX-WS
http://localhost:7001/example02/SayHelloWSService?wsdl
http://localhost:7001/example02/SayHelloWSService?xsd=1

http://localhost:7001/SayHelloWSEJB/SayHelloWSService?WSDL
http://localhost:7001/SayHelloWSEJB/SayHelloWSService?xsd=1

	java:global/example02/SayHelloRestEJB!ar.com.nextel.jee6.ws.facade.SayHelloRestEJB
	java:app/example02/SayHelloRestEJB!ar.com.nextel.jee6.ws.facade.SayHelloRestEJB
	java:module/SayHelloRestEJB!ar.com.nextel.jee6.ws.facade.SayHelloRestEJB
	java:global/example02/SayHelloRestEJB
	java:app/example02/SayHelloRestEJB
	java:module/SayHelloRestEJB
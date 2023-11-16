#Proyecto de pruebas y cargado en Github
#12/11/2023
#Viviana Gaviria Cely
Feature: yo como usuario valido Login
	@Regresion
		@HU001
	Scenario Outline: login exitoso
	Given abrir el navegador 
	When el usuario diligencia usuario <userName> diligencia password <password>

	Examples:
	|userName|password|
	|Admin |admin123|
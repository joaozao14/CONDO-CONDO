nome = input("nome: ")
altura = float(input("altura: "))

if altura >= 1.80:
    print(nome, "é alto")
else:
    print(nome,"não é alto")

while True:
    try:
        idade = int(input("idade: "))
        break
    except ValueError:
        print("Por favor, insira um número inteiro para a idade.")
print("isso ai")
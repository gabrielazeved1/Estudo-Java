a = "ola mundo"
# Aqui usamos a função print original do Python
print(a)

b = 10

# 1. Renomeamos a função para não sobrescrever a original
def verificar_tipo(variavel):
    # 2. Usamos isinstance() para verificar o tipo (forma recomendada)
    if isinstance(variavel, str):
        # 3. Agora o print() aqui dentro é a função original do Python
        print('É uma string')
    # Poderíamos usar "elif" para sermos mais específicos
    elif isinstance(variavel, int) or isinstance(variavel, float):
        print("É um número")
    else:
        print("É de outro tipo")

# Agora chamamos a nossa nova função
verificar_tipo(b)       # Vai imprimir "É um número"
verificar_tipo(a)       # Vai imprimir "É uma string"
verificar_tipo(10)      # Vai imprimir "É um número"
verificar_tipo("teste") # Vai imprimir "É uma string"
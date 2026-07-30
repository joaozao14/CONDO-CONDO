import bcrypt

senha = "Hf7@Qa92#LmP"

hash_senha = bcrypt.hashpw(
    senha.encode(),
    bcrypt.gensalt()
)

print(hash_senha.decode())


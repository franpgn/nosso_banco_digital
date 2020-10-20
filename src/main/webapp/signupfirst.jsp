<head>
    <meta charset='utf-8'>
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@600;700;800&display=swap" rel="stylesheet">
    <link rel='stylesheet' href="styles/pages/signupfirst.css">
    <title>Criando Conta</title>
</head>
<div id="page-signupfirst">
    <main>
        <div class="content-wrapper">
            <main>
                <h1>Nosso
                    Banco
                    Digital
                </h1>
            </main>
        </div>
        <form action="signupsecond" class="signupfirst-form">
            <fieldset>
                <div class="input-block">
                    <input type="text" placeholder="Nome" required name="name">
                </div>
                <div class="input-block">
                    <input type="text" placeholder="Sobrenome" required name="surname">
                </div>
                <div class="input-block">
                    <input type="email" placeholder="E-mail exemplo@email.com" required name="email">
                </div>
                <div class="input-block">
                    <input type="date" placeholder="Data" required name="date">
                </div>
                <div class="input-block">
                    <input type="text" placeholder="CPF" required name="cpf">
                </div>
                <button class="confirm-button" type="submit">
                    Confirmar
                </button>
            </fieldset>
        </form>
    </main>
</div>
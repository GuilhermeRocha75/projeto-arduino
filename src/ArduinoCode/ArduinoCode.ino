int statusLed = 0;
const int Led = 13;

void setup() {
    Serial.begin(9600);
    pinMode(Led, OUTPUT);
    digitalWrite(Led, LOW); // Garante que o LED esteja inicialmente desligado
}

void loop() {
    if (Serial.available() > 0) {
        char comando = Serial.read(); // Lê o byte recebido da porta serial

        if (comando == '0') { // Comparação corrigida para comparar com caracteres '0' e '1'
            digitalWrite(Led, LOW); // Desliga o LED
        } else if (comando == '1') {
            digitalWrite(Led, HIGH); // Liga o LED
        } else if (comando == 'A') {
            // Aqui você pode adicionar a lógica para ligar um motor ou outra ação
            Serial.write('B'); // Envia a confirmação de volta para o Java
        }
    }
}
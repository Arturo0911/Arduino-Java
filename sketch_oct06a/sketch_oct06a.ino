
const int Trigger = 3;
const int Echo = 2;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600); // initialize the comunication 
  pinMode(Trigger, OUTPUT); // Salida
  pinMode(Echo, INPUT); // Entrada
  digitalWrite(Trigger, LOW); // inicializamos el pin en 0

}

void loop() {
  // put your main code here, to run repeatedly:

  long t; // time
  long d; // distance


  digitalWrite(Trigger,HIGH);
  delayMicroseconds(1000); // Enviamos un pulso de 10us
  digitalWrite(Trigger, LOW);


  t = pulseIn(Echo, HIGH); // get width of 
  d = t/59; // time in seconds

  
  Serial.println(d);

  delay(1000);
  
}

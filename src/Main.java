void main() {
    double vize1=60.0;
    double vize2=70.0;
    double final1=75.0;

    double ort=(vize1 / 4) + (vize2 / 4) + (final1/2);

    System.out.println("Ortalamanız:"+ort);
if (ort>=85) {
    System.out.println("Geçtin ve takdir aldın.Tebrik ederim.");
} else if (ort>=75) {
    System.out.println("Geçtin ve teşekkür aldın.Tebrik ederim.");
} else if (ort>=50) {
    System.out.println("Geçtin.Tebrik ederim.");
} else {
    System.out.println("Kaldın.");
    }
}
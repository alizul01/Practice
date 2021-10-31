try (
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output2.txt")
        ) {
             // Membaca file
             int baca = in.read();
             
             while (baca != -1) {
                 out.write((char) baca);
                 baca = in.read();
             }
        }
# Measurement Tool

A simple Java console application that calculates various geometric measurements for different shapes.

## Features

This program allows users to calculate:

1. **Area of Parallelogram** - Calculates the area using base and height
2. **Volume of Cube** - Calculates the volume using side length
3. **Perimeter of Equilateral Triangle** - Calculates the perimeter using side length
4. **Exit** - Terminates the program

## How to Use

1. Compile the Java file:
   ```bash
   javac MeasurementTool.java
   ```

2. Run the program:
   ```bash
   java MeasurementTool
   ```

3. Follow the menu prompts:
   - Enter your choice (1-4)
   - Provide the required measurements when prompted
   - View the calculated result
   - Continue making calculations or exit with option 4

## Calculations Performed

### Area of Parallelogram
- Formula: `Area = base × height`
- Inputs: base, height

### Volume of Cube
- Formula: `Volume = side³`
- Inputs: side length

### Perimeter of Equilateral Triangle
- Formula: `Perimeter = 3 × side`
- Inputs: side length

## Requirements

- Java Runtime Environment (JRE) 8 or higher
- Java Development Kit (JDK) for compilation

## Code Structure

- **Main class**: `MeasurementTool`
- **Input handling**: Uses `Scanner` class for user input
- **Menu system**: Do-while loop with switch-case structure
- **Error handling**: Validates menu choices and provides appropriate feedback

## Example Usage

```
Choose a shape to perform operation:
1. Area of Parallelogram
2. Volume of Cube
3. Perimeter of Equilateral Triangle
4. Exit

Enter your choice: 1
Enter base: 5
Enter height: 3
Area of Parallelogram = 15.0
```

## Notes

- The program handles invalid menu choices gracefully
- User-friendly interface with clear prompts
- Proper resource management with scanner closure
- Continuous operation until user chooses to exit

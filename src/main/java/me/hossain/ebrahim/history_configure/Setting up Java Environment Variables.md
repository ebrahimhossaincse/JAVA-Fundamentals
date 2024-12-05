# Setting Up Java Environment Variables

After installing Java, you’ll need to configure environment variables so your system can recognize Java commands. Here’s how to do it based on your operating system:

---

## On Windows

### Step 1: Locate the Java Installation Directory
Find where you installed Java, typically in:  
`C:\Program Files\Java\jdk1.x.x`

---

### Step 2: Open Environment Variables
1. Right-click on **This PC** or **My Computer** and select **Properties**.
2. Click on **Advanced system settings**.
3. In the **System Properties** window, go to the **Advanced** tab and click **Environment Variables**.

---

### Step 3: Add JAVA_HOME
1. Click **New** under System variables.
2. Set:
    - **Variable name**: `JAVA_HOME`
    - **Variable value**: Path to your JDK installation (e.g., `C:\Program Files\Java\jdk1.x.x`).
3. Click **OK**.

---

### Step 4: Update the Path Variable
1. Find the **Path** variable in System variables and select it.
2. Click **Edit** and add:  
   `%JAVA_HOME%\bin`
3. Save the changes by clicking **OK**.

---

### Step 5: Verify the Configuration
Open a **new command prompt** and type:
```bash
java -version

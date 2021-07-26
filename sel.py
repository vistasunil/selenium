import os
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.chrome.options import Options

chrome_options = Options()
chrome_options.add_argument("--headless")
chrome_options.binary_location = '/usr/bin/google-chrome'

driver = webdriver.Chrome(executable_path=os.path.abspath("/usr/local/bin/chromedriver"), chrome_options=chrome_options)
driver.get("http://www.duo.com")
actualTitle = driver.title;
print(actualTitle)
driver.close()

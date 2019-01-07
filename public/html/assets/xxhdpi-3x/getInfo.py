from PIL import Image
import os, sys

def main():

    # if a cmd line arg has been passed in use as base path...
    if len(sys.argv) > 1:
        base_path = sys.argv[1]
    # else use current working dir...
    else:
        base_path = os.getcwd()

    # image file extensions to be included, add or remove as required...
    ext_list = ['.bmp', '.jpg', '.png']

    # walk directory structure
    for root, dirs, files in os.walk(base_path):
        for f in files:

            # check of file extension is in list specified above...
            if os.path.splitext(f)[1].lower() in ext_list:
                f_path = os.path.join(root, f)
                width, height = Image.open(f_path).size
                output = f_path + ' 1 1 1 ' + str(width) + ' ' + str(height) +'\r\n'
                print(output) 

if __name__ == '__main__':
    main()
# -*- coding: utf-8 -*-

import urllib.request

def getHTML(strURL):
    return str(urllib.request.urlopen(strURL).read())


def main():
    url = 'http://odin.fi-b.unam.mx/python/'
    html = getHTML(url)
    print(html)


main()
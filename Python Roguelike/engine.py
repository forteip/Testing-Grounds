import tcod as libtcod

def main():
    screen_width = 80
    screen_height = 50

    console = libtcod.Console(screen_width, screen_height)
    with libtcod.context.new(
        columns = console.width, rows = console.height) as context:

        while not libtcod.event.Quit():
            libtcod.console_set_default_foreground(0,libtcod.white)
            libtcod.console_put_char(0,1,1,'@', libtcod.BKGND_NONE)
            libtcod.console_flush()

            key = libtcod.event.get()

            if key.vk == libtcod.KEY_ESCAPE:
                return True
                                    

if __name__ == '__main__':
    main()

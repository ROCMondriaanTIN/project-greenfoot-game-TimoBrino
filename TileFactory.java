
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 1:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 2:
                tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 3:
                tile = new Tile("boxCoin_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 4:
                tile = new Tile("boxCoinAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 5:
                tile = new Tile("boxCoinAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 6:
                tile = new Tile("boxEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 7:
                tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("boxExplosive_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 9:
                tile = new Tile("boxExplosiveAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 10:
                tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 11:
                tile = new Tile("boxItem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 12:
                tile = new Tile("boxItemAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 13:
                tile = new Tile("boxItemAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 14:
                tile = new Tile("boxWarning.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 15:
                tile = new Tile("brickWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 16:
                tile = new Tile("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 17:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 18:
                tile = new Tile("castle.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 19:
                tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 20:
                tile = new Tile("castleCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 21:
                tile = new Tile("castleCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 22:
                tile = new Tile("castleCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 23:
                tile = new Tile("castleCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 24:
                tile = new Tile("castleCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 25:
                tile = new Tile("castleHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 26:
                tile = new Tile("castleHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 27:
                tile = new Tile("castleHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 28:
                tile = new Tile("castleHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 29:
                tile = new Tile("castleHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 30:
                tile = new Tile("castleHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 31:
                tile = new Tile("castleHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 32:
                tile = new Tile("castleHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 33:
                tile = new Tile("castleLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 34:
                tile = new Tile("castleLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 35:
                tile = new Tile("castleLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 36:
                tile = new Tile("castleMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 37:
                tile = new Tile("castleRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 38:
                tile = new Tile("dirt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 39:
                tile = new Tile("dirtCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 40:
                tile = new Tile("dirtCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 41:
                tile = new Tile("dirtCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 42:
                tile = new Tile("dirtCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 43:
                tile = new Tile("dirtCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 44:
                tile = new Tile("dirtCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 45:
                tile = new Tile("dirtHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 46:
                tile = new Tile("dirtHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 47:
                tile = new Tile("dirtHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 48:
                tile = new Tile("dirtHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 49:
                tile = new Tile("dirtHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 50:
                tile = new Tile("dirtHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 51:
                tile = new Tile("dirtHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 52:
                tile = new Tile("dirtHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 53:
                tile = new Tile("dirtLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 54:
                tile = new Tile("dirtLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 55:
                tile = new Tile("dirtLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 56:
                tile = new Tile("dirtMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 57:
                tile = new Tile("dirtRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 58:
                tile = new Tile("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.CLOSED);
                tile.isSolid = false;
                break;
            case 59:
                tile = new Tile("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.CLOSED);
                tile.isSolid = false;
                break;
            case 60:
                tile = new Tile("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.OPEN);
                tile.isSolid = false;
                break;
            case 61:
                tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.OPEN);
                tile.isSolid = false;
                break;
            case 62:
                tile = new Tile("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 63:
                tile = new Tile("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 64:
                tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 65:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 66:
                tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 67:
                tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 68:
                tile = new Tile("grassCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 69:
                tile = new Tile("grassCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 70:
                tile = new Tile("grassCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 71:
                tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 72:
                tile = new Tile("grassHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 73:
                tile = new Tile("grassHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 74:
                tile = new Tile("grassHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 75:
                tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 76:
                tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 77:
                tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 78:
                tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 79:
                tile = new Tile("grassLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 80:
                tile = new Tile("grassLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 81:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 82:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 83:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 84:
                tile = new Tile("hill_large.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                tile.getImage().scale(48, 146);
                break;
            case 85:
                tile = new Tile("hill_largeAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                tile.getImage().scale(48, 146);
                break;
            case 86:
                tile = new Tile("hill_small.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                tile.getImage().scale(48, 106);
                break;
            case 87:
                tile = new Tile("hill_smallAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                tile.getImage().scale(48, 106);
                break;
            case 88:
                tile = new Tile("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 89:
                tile = new Tile("ladder_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 90:
                tile = new Tile("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 91:
                tile = new Tile("liquidLavaTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 92:
                tile = new Tile("liquidLavaTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 93:
                tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.WATER);
                break;
            case 94:
                tile = new Tile("liquidWaterTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 95:
                tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 96:
                tile = new Tile("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 97:
                tile = new Tile("lock_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 98:
                tile = new Tile("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 99:
                tile = new Tile("lock_yellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 100:
                tile = new Tile("rockHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 101:
                tile = new Tile("rockHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 102:
                tile = new Tile("ropeAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 103:
                tile = new Tile("ropeHorizontal.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 104:
                tile = new Tile("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 105:
                tile = new Tile("sand.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 106:
                tile = new Tile("sandCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 107:
                tile = new Tile("sandCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 108:
                tile = new Tile("sandCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 109:
                tile = new Tile("sandCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 110:
                tile = new Tile("sandCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 111:
                tile = new Tile("sandCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 112:
                tile = new Tile("sandHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 113:
                tile = new Tile("sandHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 114:
                tile = new Tile("sandHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 115:
                tile = new Tile("sandHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 116:
                tile = new Tile("sandHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 117:
                tile = new Tile("sandHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 118:
                tile = new Tile("sandHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 119:
                tile = new Tile("sandHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 120:
                tile = new Tile("sandHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 121:
                tile = new Tile("sandLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 122:
                tile = new Tile("sandLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 123:
                tile = new Tile("sandMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 124:
                tile = new Tile("sandRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 125:
                tile = new Tile("sign.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 126:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 127:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 128:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 129:
                tile = new Tile("snow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 130:
                tile = new Tile("snowCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 131:
                tile = new Tile("snowCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 132:
                tile = new Tile("snowCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 133:
                tile = new Tile("snowCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 134:
                tile = new Tile("snowCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 135:
                tile = new Tile("snowCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 136:
                tile = new Tile("snowHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 137:
                tile = new Tile("snowHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 138:
                tile = new Tile("snowHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 139:
                tile = new Tile("snowHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 140:
                tile = new Tile("snowHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 141:
                tile = new Tile("snowHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 142:
                tile = new Tile("snowHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 143:
                tile = new Tile("snowHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 144:
                tile = new Tile("snowLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 145:
                tile = new Tile("snowLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 146:
                tile = new Tile("snowLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 147:
                tile = new Tile("snowMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 148:
                tile = new Tile("snowRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 149:
                tile = new Tile("stone.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 150:
                tile = new Tile("stoneCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 151:
                tile = new Tile("stoneCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 152:
                tile = new Tile("stoneCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 153:
                tile = new Tile("stoneCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 154:
                tile = new Tile("stoneCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 155:
                tile = new Tile("stoneCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 156:
                tile = new Tile("stoneHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 157:
                tile = new Tile("stoneHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 158:
                tile = new Tile("stoneHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 159:
                tile = new Tile("stoneHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 160:
                tile = new Tile("stoneHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 161:
                tile = new Tile("stoneHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 162:
                tile = new Tile("stoneLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 163:
                tile = new Tile("stoneLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 164:
                tile = new Tile("stoneLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 165:
                tile = new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 166:
                tile = new Tile("stoneRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 167:
                tile = new Tile("stoneWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 168:
                tile = new Tile("tochLit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 169:
                tile = new Tile("tochLit2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 170:
                tile = new Tile("torch.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 171:
                tile = new Tile("window.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 172:
                tile = new Tile("bomb.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 173:
                tile = new Tile("bombFlash.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 174:
                tile = new Tile("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 175:
                tile = new Tile("buttonBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 176:
                tile = new Tile("buttonBlue_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 177:
                tile = new Tile("buttonGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 178:
                tile = new Tile("buttonGreen_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 179:
                tile = new Tile("buttonRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 180:
                tile = new Tile("buttonRed_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 181:
                tile = new Tile("buttonYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 182:
                tile = new Tile("buttonYellow_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 183:
                tile = new Tile("cactus.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 184:
                tile = new Tile("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 185:
                tile = new Tile("cloud1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 186:
                tile = new Tile("cloud2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 187:
                tile = new Tile("cloud3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 188:
                tile = new Tile("coinBronze.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 189:
                tile = new Tile("coinGold.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GOLDCOIN);
                break;
            case 190:
                tile = new Tile("coinSilver.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.SILVERCOIN);
                break;
            case 191:
                tile = new Tile("fireball.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 192:
                tile = new Tile("flagBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 193:
                tile = new Tile("flagBlue2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 194:
                tile = new Tile("flagBlueHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 195:
                tile = new Tile("flagGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 196:
                tile = new Tile("flagGreen2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 197:
                tile = new Tile("flagGreenHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 198:
                tile = new Tile("flagRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 199:
                tile = new Tile("flagRed2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 200:
                tile = new Tile("flagRedHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 201:
                tile = new Tile("flagYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 202:
                tile = new Tile("flagYellow2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 203:
                tile = new Tile("flagYellowHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 204:
                tile = new Tile("gemBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GEM);
                break;
            case 205:
                tile = new Tile("gemGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 206:
                tile = new Tile("gemRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 207:
                tile = new Tile("gemYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 208:
                tile = new Tile("keyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = false;
                break;
            case 209:
                tile = new Tile("keyGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 210:
                tile = new Tile("keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 211:
                tile = new Tile("keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.KEY);
                break;
            case 212:
                tile = new Tile("mushroomBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 213:
                tile = new Tile("mushroomRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 214:
                tile = new Tile("particleBrick1a.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 215:
                tile = new Tile("particleBrick1b.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 216:
                tile = new Tile("particleBrick2a.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 217:
                tile = new Tile("particleBrick2b.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 218:
                tile = new Tile("plant.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 219:
                tile = new Tile("plantPurple.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 220:
                tile = new Tile("rock.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 221:
                tile = new Tile("snowhill.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 222:
                tile = new Tile("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 223:
                tile = new Tile("springboardDown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 224:
                tile = new Tile("springboardUp.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 225:
                tile = new Tile("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 226:
                tile = new Tile("switchLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 227:
                tile = new Tile("switchMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 228:
                tile = new Tile("switchRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 229:
                tile = new Tile("weight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 230:
                tile = new Tile("weightChained.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;

            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}

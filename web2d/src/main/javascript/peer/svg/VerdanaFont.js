/*
*    Copyright [2011] [wisemapping]
*
*   Licensed under WiseMapping Public License, Version 1.0 (the "License").
*   It is basically the Apache License, Version 2.0 (the "License") plus the
*   "powered by wisemapping" text requirement on every single page;
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the license at
*
*       http://www.wisemapping.org/license
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

web2d.peer.svg.VerdanaFont = function()
{
    web2d.peer.svg.Font.call(this);
    this._fontFamily="verdana";
};

objects.extend(web2d.peer.svg.VerdanaFont, web2d.peer.svg.Font);

web2d.peer.svg.VerdanaFont.prototype.getFontFamily=function ()
{
    return this._fontFamily;
};

web2d.peer.svg.VerdanaFont.prototype.getFont=function ()
{
    return web2d.Font.VERDANA;
};
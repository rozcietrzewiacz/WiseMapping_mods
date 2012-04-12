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

web2d.peer.utils.EventUtils =
{
    broadcastChangeEvent:function (elementPeer, type)
    {
        var listeners = elementPeer.getChangeEventListeners(type);
        if (core.Utils.isDefined(listeners))
        {
            for (var i = 0; i < listeners.length; i++)
            {
                var listener = listeners[i];
                listener.call(elementPeer, null);
            }
        }

        var children = elementPeer.getChildren();
        for (var i = 0; i < children.length; i++)
        {
            var child = children[i];
            web2d.peer.utils.EventUtils.broadcastChangeEvent(child, type);
        }
    }
};
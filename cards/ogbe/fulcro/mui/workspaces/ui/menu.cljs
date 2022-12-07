(ns ogbe.fulcro.mui.workspaces.ui.menu
  (:require
   [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
   [com.fulcrologic.fulcro.dom :as dom]
   [com.fulcrologic.fulcro.mutations :as m]
   [nubank.workspaces.core :as ws]
   [nubank.workspaces.model :as wsm]
   [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
   [ogbe.fulcro.mui.factories :as mui]
   [ogbe.fulcro.mui.icons :as i]))

(defsc Menu [this {:keys [anchor-el]}]
  {:query [:anchor-el :foo]
   :ident (fn [] [:card/id :Menu])
   :initial-state {:foo ""}}
  (let [handle-open #(m/set-value! this :anchor-el (.-currentTarget %))
        handle-close #(m/set-value! this :anchor-el nil)]
    (dom/div
     (mui/ui-button
      {:aria-controls (when anchor-el "basic-menu")
       :aria-expanded (if anchor-el "true" "false")
       :aria-haspopup "true"
       :id "basic-button"
       :onClick handle-open}
      "File")
     (mui/ui-menu
      {:anchorEl anchor-el
       :id "basic-menu"
       :MenuListProps {:aria-labelledby "basic-button"}
       :onClose handle-close
       :open (boolean anchor-el)}
      (mui/ui-menu-item
       {:onClick handle-close}
       "New")
      (mui/ui-menu-item
       {:onClick handle-close}
       (mui/ui-list-item-text {} "Open…")
       (mui/ui-typography
        {:color "textSecondary"
         :variant "body2"}
        "⌘O"))
      (mui/ui-menu-item
       {:onClick handle-close}
       (mui/ui-list-item-text {} "Save as…")
       (mui/ui-typography
        {:color "textSecondary"
         :variant "body2"}
        "⌘S"))
      (mui/ui-menu-item
       {:onClick handle-close}
       (mui/ui-list-item-text {} "Rename")
       (mui/ui-typography
        {:color "textSecondary"
         :variant "body2"}
        "⌘R"))
      (mui/ui-menu-item
       {:onClick handle-close}
       "Make a copy")
      (mui/ui-menu-item
       {:onClick handle-close}
       (mui/ui-list-item-icon
        {}
        (i/ui-icon-folder {}))
       (mui/ui-list-item-text {} "Move to folder"))
      (mui/ui-menu-item
       {:onClick handle-close}
       (mui/ui-list-item-icon
        {}
        (i/ui-icon-delete {}))
       (mui/ui-list-item-text {} "Move to trash"))
      (mui/ui-menu-item
       {:onClick handle-close}
       "Download as…")
      (mui/ui-menu-item
       {:onClick handle-close}
       "Publish to web")
      (mui/ui-menu-item
       {:onClick handle-close}
       "Email collaborators")))))

(ws/defcard menu
  {::wsm/card-height 3
   ::wsm/card-width 2}
  (ct.fulcro/fulcro-card
   {::ct.fulcro/root Menu}))

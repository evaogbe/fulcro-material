(ns ogbe.fulcro.mui.workspaces.ui.button
  (:require
   [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
   [nubank.workspaces.core :as ws]
   [nubank.workspaces.model :as wsm]
   [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
   [ogbe.fulcro.mui.factories :as mui]
   [ogbe.fulcro.mui.icons :as i]))

(defsc Buttons [_this _props]
  (mui/ui-stack
   {:alignItems "flex-start"
    :spacing 1}
   (mui/ui-button-group
    {:variant "contained"}
    (mui/ui-button {} "A")
    (mui/ui-button {} "B")
    (mui/ui-button {} "C"))
   (mui/ui-button {:variant "contained"} "A")
   (mui/ui-button
    {:startIcon (i/ui-icon-favorite {})
     :variant "outlined"}
    "Like")
   (mui/ui-button-group
    {:variant "contained"}
    (mui/ui-icon-button
     {}
     (i/ui-icon-format-align-left {}))
    (mui/ui-icon-button
     {}
     (i/ui-icon-format-align-center {}))
    (mui/ui-icon-button
     {}
     (i/ui-icon-format-align-right {}))
    (mui/ui-icon-button
     {}
     (i/ui-icon-format-align-justify {})))
   (mui/ui-button {:variant "contained"} "C")
   (mui/ui-button {:variant "contained"} "D")))

(ws/defcard buttons
  {::wsm/card-height 9
   ::wsm/card-width 2}
  (ct.fulcro/fulcro-card
   {::ct.fulcro/wrap-root? false
    ::ct.fulcro/root Buttons}))

(ns ogbe.fulcro.mui.workspaces.ui.form
  (:require
   [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
   [com.fulcrologic.fulcro.mutations :as m]
   [nubank.workspaces.core :as ws]
   [nubank.workspaces.model :as wsm]
   [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
   [ogbe.fulcro.mui.factories :as mui]))

(defsc Form [this {:keys [x y]}]
  {:query [:x :y]
   :ident (fn [] [:card/id :Form])
   :initial-state {:x ""
                   :y ""}}
  (mui/ui-stack
   {:spacing 1}
   (mui/ui-typography {} "x: " x)
   (mui/ui-typography {} "y: " y)
   (mui/ui-stack
    {:component "form"
     :spacing 1}
    (mui/ui-text-field
     {:error true
      :id "form-x"
      :label "X"
      :onChange #(m/set-string! this :x :event %)
      :value x})
    (mui/ui-text-field
     {:id "form-y"
      :label "Y"
      :onChange #(m/set-string! this :y :event %)
      :value y}))))

(ws/defcard form
  {::wsm/card-height 7
   ::wsm/card-width 2}
  (ct.fulcro/fulcro-card
   {::ct.fulcro/root Form}))

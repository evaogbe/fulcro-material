(ns ogbe.fulcro.mui.workspaces.ui.date-pickers
  (:require
   [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
   [com.fulcrologic.fulcro.mutations :as m]
   [nubank.workspaces.core :as ws]
   [nubank.workspaces.model :as wsm]
   [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
   [tick.core :as t]
   [tick.locale-en-us]
   [ogbe.fulcro.mui.factories :as mui]
   [ogbe.fulcro.mui.date-pickers :as dp]
   [ogbe.fulcro.mui.date-pickers.adapter-date-fns :refer [adapter-date-fns]]))

(defsc DatePickers [this {:keys [x y]}]
  {:query [:x :y]
   :ident (fn [] [:card/id :Form])
   :initial-state {:x (t/inst)
                   :y (t/inst)}}
  (dp/ui-localization-provider
   {:dateAdapter adapter-date-fns}
   (mui/ui-stack
    {:spacing 1}
    (mui/ui-typography {} "x: " (t/format :iso-local-date (t/date x)))
    (mui/ui-typography {} "y: " (t/format :iso-local-date-time (t/zoned-date-time y)))
    (mui/ui-stack
     {:component "form"
      :spacing 1}
     (dp/ui-date-picker
      {:label "X"
       :onChange #(m/set-value! this :x %)
       :renderInput #(mui/ui-text-field %)
       :value x})
     (dp/ui-date-time-picker
      {:label "Y"
       :onChange #(m/set-value! this :y %)
       :renderInput #(mui/ui-text-field %)
       :value y})))))

(ws/defcard date-pickers
  {::wsm/card-height 7
   ::wsm/card-width 2}
  (ct.fulcro/fulcro-card
   {::ct.fulcro/root DatePickers}))

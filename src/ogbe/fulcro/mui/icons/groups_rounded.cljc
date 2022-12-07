(ns ogbe.fulcro.mui.icons.groups-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GroupsRounded" :default GroupsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-groups-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GroupsRounded)))
(ns ogbe.fulcro.mui.icons.hub-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HubRounded" :default HubRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hub-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HubRounded)))
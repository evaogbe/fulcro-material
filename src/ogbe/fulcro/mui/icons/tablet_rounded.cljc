(ns ogbe.fulcro.mui.icons.tablet-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TabletRounded" :default TabletRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tablet-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabletRounded)))
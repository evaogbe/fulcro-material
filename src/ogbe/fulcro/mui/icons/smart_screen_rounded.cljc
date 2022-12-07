(ns ogbe.fulcro.mui.icons.smart-screen-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SmartScreenRounded" :default SmartScreenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-screen-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartScreenRounded)))
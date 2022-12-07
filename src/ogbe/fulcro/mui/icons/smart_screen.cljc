(ns ogbe.fulcro.mui.icons.smart-screen
  #?(:cljs (:require
            ["@mui/icons-material/SmartScreen" :default SmartScreen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smart-screen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmartScreen)))
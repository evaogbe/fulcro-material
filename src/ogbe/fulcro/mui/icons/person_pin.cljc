(ns ogbe.fulcro.mui.icons.person-pin
  #?(:cljs (:require
            ["@mui/icons-material/PersonPin" :default PersonPin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-pin
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonPin)))
(ns ogbe.fulcro.mui.icons.sick-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SickRounded" :default SickRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sick-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SickRounded)))
(ns ogbe.fulcro.mui.icons.soap-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SoapRounded" :default SoapRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-soap-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SoapRounded)))
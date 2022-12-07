(ns ogbe.fulcro.mui.icons.sos-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SosRounded" :default SosRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sos-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SosRounded)))
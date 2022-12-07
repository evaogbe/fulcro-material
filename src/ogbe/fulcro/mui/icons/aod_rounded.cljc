(ns ogbe.fulcro.mui.icons.aod-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AodRounded" :default AodRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-aod-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AodRounded)))
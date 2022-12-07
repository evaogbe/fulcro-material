(ns ogbe.fulcro.mui.icons.eject-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EjectRounded" :default EjectRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-eject-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EjectRounded)))
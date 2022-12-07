(ns ogbe.fulcro.mui.icons.outbound-rounded
  #?(:cljs (:require
            ["@mui/icons-material/OutboundRounded" :default OutboundRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbound-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutboundRounded)))
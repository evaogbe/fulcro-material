(ns ogbe.fulcro.mui.icons.outbound-sharp
  #?(:cljs (:require
            ["@mui/icons-material/OutboundSharp" :default OutboundSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbound-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutboundSharp)))